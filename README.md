# oibsip_taskno.1
# 𝐀𝐈𝐂𝐓𝐄 𝐎𝐈𝐁-𝐒𝐈𝐏 𝐍𝐨𝐯𝐞𝐦𝐛𝐞𝐫 - 𝐏𝟏 𝐏𝐑𝐎𝐉𝐄𝐂𝐓 𝐒𝐔𝐁𝐌𝐈𝐒𝐒𝐈𝐎𝐍 𝐅𝐎𝐑𝐌 - Task 01

The Online Reservation System is a comprehensive Java-based application designed to simplify the ticket reservation process for users. It features a secure login system, allowing only authorized users to access the platform. Once logged in, users can view available train schedules, reserve tickets by providing essential details like journey date, class type, and destinations, and even cancel reservations using their unique PNR information. The system utilizes a central database for storing user credentials and reservation details, ensuring quick and seamless access to data. With a user-friendly interface, this project is ideal for demonstrating core Java concepts such as object-oriented programming, data handling, and real-world application development, while also highlighting the practical use of collections and basic I/O operations.

Files And Their Detailed Description - 

User.java
Manages user authentication by validating login credentials. It uses a static map to simulate a database of usernames and passwords.

Train.java
Represents train details such as train number and train name. This class is used to define and manage train data in the system.

ReservationSystem.java
Handles core reservation functionalities, including displaying available trains, booking tickets, and canceling reservations. It stores reservations in a list and interacts with the Train class for train data.

Login.java
Facilitates user login by collecting credentials from the user and verifying them using the User class. It ensures only authorized users can access the system.

Main.java
Serves as the entry point for the application. It combines all other components to create a user-friendly menu-driven interface, allowing users to log in, view trains, reserve tickets, cancel reservations, or exit the application.

Future Enhancements
 Use a database (like MySQL) for storing user, train, and reservation data.
 Include validation checks (e.g., ensure train number exists).
 Add unique PNR generation for each reservation.
 Improve the user interface (e.g., using Java Swing or JavaFX).
