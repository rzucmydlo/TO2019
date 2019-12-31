
import java.util.ArrayList;
import java.util.List;

public class InstagramIterator implements Iterator {
    private Instagram instagram;
    private String type;
    private String email;
    private String name;
    private int currentPosition = 0;
    private List<String> names = new ArrayList<>();
    private List<Profile> contacts = new ArrayList<>();

    public InstagramIterator(Instagram instagram, String type, String name) {
        this.instagram = instagram;
        this.type = type;
        this.name = name;
    }

    private void lazyLoad() {
        if (names.size() == 0) {
            List<String> profiles = instagram.requestRelatedContactsFromInstagramAPI(this.name, this.type);
            for (String profile : profiles) {
                this.names.add(profile);
                this.contacts.add(null);
            }
        }
    }

    public boolean hasNext() {
        lazyLoad();
        return currentPosition < names.size();
    }

    public Profile getNext() {
        if (!hasNext()) {
            return null;
        }

        String friendName = names.get(currentPosition);
        Profile friendContact = contacts.get(currentPosition);
        if (friendContact == null) {
            friendContact = instagram.requestContactInfoFromInstagramAPI(friendName);
            contacts.set(currentPosition, friendContact);
        }
        currentPosition++;
        return friendContact;
    }

    public void reset() {
        currentPosition = 0;
    }
}

