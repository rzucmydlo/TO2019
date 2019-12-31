
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Profile {
    private String email;
    private String name;
    private Map<String, List<String>> contacts = new HashMap<>();

    public Profile(String name, String... contacts) {
        this.name = name;

        for (String contact : contacts) {
            String[] parts = contact.split(":");
            String contactType = "friend", contactName;
            if (parts.length == 1) {
                contactName = parts[0];
            }
            else {
                contactType = parts[0];
                contactName = parts[1];
            }
            if (!this.contacts.containsKey(contactType)) {
                this.contacts.put(contactType, new ArrayList<>());
            }
            this.contacts.get(contactType).add(contactName);
        }
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public List<String> getContacts(String contactType) {
        if (!this.contacts.containsKey(contactType)) {
            this.contacts.put(contactType, new ArrayList<>());
        }
        return contacts.get(contactType);
    }


}
