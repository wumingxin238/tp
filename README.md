[![CI Status](https://github.com/se-edu/addressbook-level3/workflows/Java%20CI/badge.svg)](https://github.com/se-edu/addressbook-level3/actions)
[![codecov](https://codecov.io/github/AY2526S2-CS2103-F11-2/tp/graph/badge.svg?token=EWW9WYZODP)](https://codecov.io/github/AY2526S2-CS2103-F11-2/tp)

![Ui](docs/images/Ui.png)

* This is **a sample project for Software Engineering (SE) students**.<br>
  Example usages:
  * as a starting point of a course project (as opposed to writing everything from scratch)
  * as a case study
* The project simulates an ongoing software project for a desktop application (called _AddressBook_) used for managing contact details.
  * It is **written in OOP fashion**. It provides a **reasonably well-written** code base **bigger** (around 6 KLoC) than what students usually write in beginner-level SE modules, without being overwhelmingly big.
  * It comes with a **reasonable level of user and developer documentation**.
* It is named `AddressBook Level 3` (`AB3` for short) because it was initially created as a part of a series of `AddressBook` projects (`Level 1`, `Level 2`, `Level 3` ...).
* For the detailed documentation of this project, see the **[Address Book Product Website](https://se-education.org/addressbook-level3)**.
* This project is a **part of the se-education.org** initiative. If you would like to contribute code to this project, see [se-education.org](https://se-education.org/#contributing-to-se-edu) for more info.


* Product name: CampusBridge
* Value proposition:Students at NUS need to organize and access contact information for their professors, teaching assistants, and peers across different modules and faculties. These students frequently communicate via multiple platforms and require a centralized, easy-to-use system to save, search, and manage academic contacts efficiently.
* This project is developed by Team F11-2 for CS2103T (AY25/26 Sem 2).

Version 1.0

How to start:
Open a command terminal, cd into the folder you put the jar file in, and use the java -jar addressbook.jar command to run the application.

Feature list:
Type the command in the command box and press Enter to execute it. e.g. typing help and pressing Enter will open the help window.

Some example commands you can try:

list : Lists all contacts.

add n/John Doe p/98765432 e/johnd@example.com a/John street, block 123, #01-01 : Adds a contact named John Doe to the Address Book.

delete 3 : Deletes the 3rd contact shown in the current list.

clear : Deletes all contacts.

exit : Exits the app.

Known issues
1. When using multiple screens, if you move the application to a secondary screen, and later switch to using only the primary screen, the GUI will open off-screen. The remedy is to delete the preferences.json file created by the application before running the application again.
2. If you minimize the Help Window and then run the help command (or use the Help menu, or the keyboard shortcut F1) again, the original Help Window will remain minimized, and no new Help Window will appear. The remedy is to manually restore the minimized Help Window.