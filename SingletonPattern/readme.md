# Singleton Pattern

### These classes illustrate how to create a Singleton Pattern

Definition: The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.

        1. Prevent any other class from creating a new instance on its own. To get an instance, you’ve got to go through the class itself.

        2. Provide a global access point to the instance: whenever you need an instance, just query the class and it will hand you back the single instance.
        
        3. Singleton is created in a lazy manner
        
The Singleton class in this example is the ContactManager class. This class was created in a way that prevents the user from instantiating multiple instances of the class

The user must use the static method getInstance() to return an instance of the class in order to use the class throughout the program

The tester class, which is the Main class, contains further explanations and features of a singleton