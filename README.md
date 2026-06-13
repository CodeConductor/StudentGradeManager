# Student Grade Manager

A simple console-based Java application for managing student records and grades, with persistent file storage.

## Features

- Add students by name
- Record multiple grades per student
- View all students with their calculated average grade
- Automatically saves and loads data between sessions

## Project Structure

```
StudentGradeManager/
├── src/
│   ├── Main.java          # Entry point; displays menu and handles user input
│   ├── Student.java       # Represents a student with a name and list of grades
│   ├── GradeManager.java  # Manages the collection of students (add, lookup, list)
│   └── FileHandler.java   # Handles saving and loading student data to/from file
├── studentData.txt        # Persistent storage file (auto-created on first save)
└── StudentGradeManager.iml
```

## How It Works

On startup, the app loads any previously saved data from `studentData.txt`. You are then presented with a menu:

```
---- Student Grade Manager ----
1. Add student
2. Add grade
3. View all students
4. Exit
Choose an option:
```

- **Option 1** — Enter a student name to register them. Duplicate names are rejected.
- **Option 2** — Enter a student name and a numeric grade to record it.
- **Option 3** — Lists all students and their average grade.
- **Option 4** — Exits the app and saves all data to `studentData.txt`.

> Student names are stored in lowercase to avoid duplicate entries from casing differences.

## Data Format

Student data is stored in `studentData.txt`, one student per line:

```
alice,85.0,90.5,78.0
bob,72.0,88.0
```

Each line contains the student's name followed by their grades, separated by commas.

## Requirements

- Java 14 or later (uses switch expressions)

## Running the Project

1. Open the project in IntelliJ IDEA (or any Java IDE).
2. Ensure `studentData.txt` exists in the project root (it will be created automatically after the first session).
3. Run `Main.java`.
