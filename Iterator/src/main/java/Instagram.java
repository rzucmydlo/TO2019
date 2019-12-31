
import java.util.ArrayList;
import java.util.List;

public class Instagram implements SocialNetwork {
    private List<Profile> contacts;

    public Instagram(List<Profile> cache) {
        if (cache != null) {
            this.contacts = cache;
        } else {
            this.contacts = new ArrayList<>();
        }
    }

    public Profile requestContactInfoFromInstagramAPI(String profileName) {

        System.out.println("Instagram: Loading profile '" + profileName + "' over the network...");

        return findContact(profileName);
    }

    public List<String> requestRelatedContactsFromInstagramAPI(String profileName, String contactType) {

        System.out.println("Instagram: Loading '" + contactType + "' list of '" + profileName + "' over the network...");

        Profile profile = findContact(profileName);
        if (profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }

    private Profile findContact(String profileName) {
        for (Profile profile : contacts) {
            if (profile.getName().equals(profileName)) {
                return profile;
            }
        }
        return null;
    }


    public Iterator createFriendsIterator(String profileName) {
        return new InstagramIterator(this, "friends", profileName);
    }

    public Iterator createCoworkersIterator(String profileName) {
        return new InstagramIterator(this, "coworkers", profileName);
    }
}
