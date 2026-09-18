# Problem Statement Document

## 1. Problem Statement
Educational institutions and small departmental resource centers often face administrative bottlenecks when tracking physical book inventories using traditional paper-based ledgers or complex enterprise software. Manual systems lead to records mismatch, unorganized book issuing, lost inventory, and inefficient circulation tracking. On the other hand, enterprise-level systems demand continuous database server maintenance, internet connectivity, multi-user authentication configurations, and complex installation setups—making them impractical for localized operational needs.

There is a clear requirement for a lightweight, desktop-based utility that enables library administrators to easily manage catalog entries, issue and return books, track availability status in real time, and persist data across sessions locally without relying on external database services.

## 2. Scope of the Project
The Simple Library Management System is a modular, console-driven Java application engineered to streamline essential library operations.

### In-Scope Functionalities:
- **Inventory Management**: Adding new book records into the system with unique identifiers (ID) and titles.
- **Catalog Inspection**: Querying and rendering the full list of books along with real-time status indicators (`Available` vs. `Issued`).
- **Circulation Control**: Real-time processing of book issuance and returns, with built-in validation to prevent issuing already checked-out books or returning unissued/non-existent titles.
- **Data Persistence**: Native Java Object Serialization (`java.io.Serializable`) that automatically saves library state to `library_data.txt` upon exit and reloads it on launch.

### Out-of-Scope:
- Multi-user role management (Admin vs. Student logins).
- Network-based server architecture or SQL database connectivity.
- Fine calculation or payment gateway integration for overdue books.

## 3. Target Users
- **Primary Users**: Small school/college department librarians, administrator, resource center coordinators, and private collection managers.
- **Secondary Users**: Students or internal staff interacting with console prompts during self-service kiosk testing.

## 4. High-Level Features
- **Standalone Terminal Interface**: Zero external GUI or web dependencies required.
- **Automated Lifecycle Management**: Automatic loading of saved records at application initialization and silent saving upon termination.
- **State Validation Logic**: Defensive input validation ensuring book states transition safely between available and issued.
- **Zero Database Footprint**: Runs completely on standard Java SE Runtime without requiring MySQL/Oracle database drivers.
