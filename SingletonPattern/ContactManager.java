import java.util.ArrayList;

public class ContactManager {
    // The ContactManager class will be implemented as a singleton

    // This class will list several Contacts objects

    private volatile static ContactManager uniqueInstance;
    // The Java volatile keyword guarantees visibility of changes to variables across threads.

    // Note that the variable is not static and does not need to be
    private ArrayList<Contact> contactList;

    private ContactManager(){
        contactList = new ArrayList<>();

    }

    public static ContactManager getInstance(){
        if (uniqueInstance == null){
            // Check for an instance and if there isn’t one, enter a synchronized block.
            synchronized (ContactManager.class){
                // Only synchronize the first time that the instance is created
                if (uniqueInstance == null){
                    // Once in the block, check again and if still null, create an instance.
                    // In the case that another thread created an instance at before
                    uniqueInstance = new ContactManager();
                }
            }
        }
        return uniqueInstance;
    }

    public void addContact(Contact contact){
        contactList.add(contact);
    }

    public Contact getContactByName(String name){
        for(Contact contact : contactList){
            if(contact.getName().equalsIgnoreCase(name)){
                return contact;
            }
        }
        return null;
    }

    public Contact getContactByEmail(String email){
        for(Contact contact : contactList){
            if(contact.getEmail().equalsIgnoreCase(email)){
                return contact;
            }
        }
        return null;
    }

    public String printContactList(){
        String output = "";
        for(Contact contact : contactList){
            output += "Name: " + contact.getName() + " - Email: " + contact.getEmail() + " \n";
        }

        return output;
    }

}
