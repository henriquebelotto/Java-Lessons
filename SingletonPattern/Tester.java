public class Tester {

    public static void main (String[] args){
//        Definition: The Singleton Pattern ensures a class has only one
//        instance, and provides a global point of access to it.

//        1. Prevent any other class from creating a new instance
//        on its own. To get an instance, you’ve got to go
//        through the class itself.

//        2. Provide a global access point to the instance: whenever you
//        need an instance, just query the class and it will hand you back
//        the single instance.

//        3. Singleton is created in a lazy manner

        // Getting the singleton
        ContactManager contactManager = ContactManager.getInstance();

        // It is NOT possible to initialize like this, since the constructor is private
        //ContactManager contactManager = new ContactManager();

        contactManager.addContact(new Contact("John", "john@gmail.com"));
        contactManager.addContact(new Contact("Mike", "Mike@gmail.com"));
        contactManager.addContact(new Contact("Anna", "Anna@gmail.com"));
        contactManager.addContact(new Contact("Tony", "Tony@gmail.com"));

        System.out.println("Printing the first object of the ContactManager");
        System.out.println(contactManager.printContactList());

        // Creating a "Second" contactManager
        ContactManager contactManager2 = ContactManager.getInstance();
        // searching for an contact that was added in another contactManager object
        System.out.println(contactManager2.getContactByName("John"));
        contactManager2.addContact(new Contact("Sophia", "sophia@gmail.com"));

        System.out.println("Printing the list from the second contactManager object after adding another contact");
        System.out.println(contactManager2.printContactList());


        // Searching for the contact in one contactManager object that was added in another contactManager object
        System.out.println(contactManager.getContactByEmail("sophia@gmail.com"));

        System.out.println("Printing the list from the first contactManager object after adding another contact");
        System.out.println(contactManager2.printContactList());
    }
}
