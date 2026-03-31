Space Mission Control System
A Java Console Application Demonstrating Core Data Structures
Overview
Space Mission Control System is a console-based Java application built to manage various aspects of a space mission. Designed as a practical implementation of fundamental data structures, this project handles crew management, mission scheduling, and emergency resolution through custom-built classes without relying on Java's built-in collections framework for its core logic.

This project is perfect for demonstrating an understanding of Data Structures and Algorithms (DSA) including Linked Lists, Queues, Stacks, and Sorting algorithms.

Features
** Crew Management (Linked List):** Add space crew members, dynamically maintaining them in a custom Linked List.
** File I/O:** Persist the astronaut crew to a crew.txt file and load them automatically when the system boots.
** Experience Sorting (Selection Sort):** Sort the astronaut squad based on their years of experience to prioritize veteran pilots.
** Mission Scheduling (Queue):** Schedule upcoming space missions using a First-In-First-Out (FIFO) array-based Queue logic.
** Emergency Protocol (Stack):** Log critical anomalies and resolve them in a Last-In-First-Out (LIFO) Stack logic. Emergencies are securely appended to an emergency.txt ledger.
Data Structures Implemented
Custom Linked List (CrewList.java, AstronautNode.java) — Used to store the crew roster dynamically.
Circular/Linear Queue (MissionQueue.java) — Hand-coded queue array to dispatch missions in chronological order.
Stack (EmergencyStack.java) — Hand-coded stack array to manage and resolve the most recent emergencies first.
Selection Sort algorithm — Integrated into the Linked List to sort nodes by integer data (experience).
📁 File Structure
DSProject/
│
├── src/
│   ├── Main.java           # Entry point; contains the main application menu loop.
│   ├── Astronaut.java      # Data model for an individual astronaut.
│   ├── AstronautNode.java  # Node structure for the Linked List.
│   ├── CrewList.java       # Linked List manager handling CRUD and File I/O.
│   ├── MissionQueue.java   # Queue implementation for missions.
│   └── EmergencyStack.java # Stack implementation for emergencies.
│
├── crew.txt                # Auto-generated database file storing crew data.
├── emergency.txt           # Auto-generated log file tracking emergencies.
└── README.md               # Project documentation.
(Note: Depending on your exact filename, the main application file might be named project1.java instead of Main.java)

Getting Started
Prerequisites
Java Development Kit (JDK 8 or higher) installed on your machine.
A terminal or command prompt.
Compilation & Execution
Clone the repository (if downloaded from GitHub):

git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name/src
Compile the Java files:

javac *.java
Run the Application:

java Main
(If your main file is project1.java, run java project1 instead).

Usage
Once the application is running, you will be presented with the following interactive menu:

===== SPACE MISSION CONTROL =====
1. Add Astronaut
2. Display Crew
3. Sort Crew
4. Add Mission
5. Launch Mission
6. Show Missions
7. Add Emergency
8. Resolve Emergency
9. Show Emergencies
10. Save Crew
0. Exit
Input the corresponding number and press Enter to navigate the system!

📜 License
This project is created for educational purposes. Feel free to use, modify, and distribute it!
