This application is an IFTTT Desktop Application which checks daily the games that the users are interested, and if the price is lower than price selected by the use, then the user is notified by mail with the games and prices that has been lowered.

The app was developed in Java and has these features:
•	It allows to have different accounts with different games selected.
•	The Graphic User Interface was developed using JavaFX.
•	The prices are checked via Internet in https://www.allkeyshop.com/blog/ using JSoup library.
•	The mails are sent using the Javax´s Mail library and SMTP protocol
•	The project was tested using TDD technique with Unit and Integration testing.

To install, it is only needed to clone and execute the Main.class located in “src/main/java/main” package.

It was built it using:
•	JavaFX – To develop the Graphic User Interface
•	Maven – Dependency Management
