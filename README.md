# Library Management System

A modular Java application designed to streamline core library circulation operations, inventory management, and transaction tracking for small departmental libraries.

---

## Overview
The **Library Management System** offers a robust, lightweight solution for managing book inventories, patron borrowing workflows, and record persistence. Built following a layered software design pattern (Model, Repository, Service, Exception handling), the application isolates data storage mechanisms from core business logic. It relies on native Java Object Serialization for reliable disk-based state retention without requiring external relational database configurations.

---

## Features
* **Catalog Management**: Add, update, view, and remove books from the library inventory.
* **Circulation Workflows**: Process book checkouts and returns with automated stock updates.
* **State Persistence**: Save and reload catalog and transaction states across sessions via Java Object Serialization.
* **Custom Exception Handling**: Comprehensive runtime error checking for invalid IDs, missing records, and out-of-stock items.
* **CLI Interface**: Clean, interactive terminal interface for seamless operation.

---

## Technologies & Tools Used
* **Language**: Java (JDK 17 or higher)
* **Architecture**: Layered Software Architecture (Model-Repository-Service)
* **Persistence**: Java Object Serialization (`java.io.Serializable`) / Binary file
* **IDE/Tools**: Visual Studio Code / Command Line / Language Support for Java(TM) by Red Hat / Prettier - Code formatter
---

## Steps to Install & Run

### Prerequisites
* **Java Development Kit (JDK 17+)** installed on your system.
* **Git** installed (optional, for cloning).

### 1. Clone or Download the Repository
```bash
git clone [https://github.com/aarushi0710/LibraryManagementProject.git](https://github.com/aarushi0710/LibraryManagementProject.git)
cd LibraryManagementProject
```

### 2. Compile the Source Code
Navigate to the source directory and compile all Java classes:

```bash
javac -d bin src/**/*.java
```

### 3. Run the Application
Execute the main application class from the compiled output folder:

```bash
java -cp bin Main
```

### 4. Testing Instructions
To verify system functionality and file persistence:

* **1. Launch the Application**: Run java -cp bin Main.

* **2. Add a Book**: Select the option to add a book (e.g., Title: "Java Programming", ID: 101, Copies: 5).

* **3. Issue a Book**: Perform a borrowing transaction against Book ID 101 and verify that available copies decrease to 4.

* **4. Test Persistence**:

* **5. Exit the application.**

   * **Verify that library_data.txt is generated in the workspace root directory.

   * **Re-launch the application and view the catalog to confirm that Book ID 101 retains its updated stock.

   * **Error Checking: Attempt to check out an unlisted Book ID (e.g., 999) to confirm custom exception handling alerts.

### Display
Plaintext
========================================
       LIBRARY MANAGEMENT SYSTEM        
========================================
1. Add New Book
2. Display All Books
3. Issue Book
4. Return Book
5. Delete a Book
6. Load data from file directly
7. Exit
----------------------------------------
Enter your choice: