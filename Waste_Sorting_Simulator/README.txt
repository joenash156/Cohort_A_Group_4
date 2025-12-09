WASTE SORTING SIMULATOR
GROUP_4 FINAL PROJECT
JAVA (OBJECT-ORIENTED PROGRAMMING)

DESCRIPTION (Brief)
-------------------
The Waste Sorting Simulator is a Java-based system designed to model the automated sorting of waste using Object-Oriented Programming. It is made of up multiple classes and a driver program to test in the command line as well as a GUI interface.


PROJECT FILES & FOLDERS STRUCTURE
---------------------------------
Waster_Sorting_Simulator/

├── bin/

│     └── *.class

│    

├── lib/

│     └── *.jar

│

├── src/

│     └── Metal.java
      └── Organic.java
│     └── Paper.java
      └── Plastic.java
│     └── Simulator.java
      └── Statistics.java
│     └── Waste.java
      └── WasteBin.java
│     └── WasteCategory.java
      └── WasteFactory.java
│     └── WasteSorter.java
      └── WasteSorterGUI.java
│

├── UML/

│     ├── WasteSortingSimulatorUML.png

│

├── README.txt  

│

├── Project_Design_Document.pdf

│

└── Group_4_Statements_of_Contribution.pdf


How to compile the Waste Sorting Simulator from the command line
----------------------------------------------------------------
1. Open the terminal, thus either the Command Prompt or Windows Powershell on Windows or Terminal on Mac.

2. Navigate to the the project root folder.
On Windows: cd '.\Waster_Sorting_Simulator'
On Mac: cd ./Waster_Sorting_Simulator

3. Compile all the Java files into the bin folder
javac -d bin src/*.java

How to run the Waste Sorting Simulator(compiled) in the command line
--------------------------------------------------------------------
1. Open the terminal, thus either the Command Prompt or Windows Powershell on Windows or Terminal on Mac.

2. Navigate to the the project root folder.
On Windows: cd '.\Waster_Sorting_Simulator'
On Mac: cd ./Waster_Sorting_Simulator

3. Run the command:
java -cp bin Simulator (Make sure all the classes are compiled before this works.)

HOw to run the Waste Sorting Simulator to get GUI
-------------------------------------------------
1. Open the terminal, thus either the Command Prompt or Windows Powershell on Windows or Terminal on Mac.

2. Navigate to the the project root folder.
On Windows: cd '.\Waster_Sorting_Simulator'
On Mac: cd ./Waster_Sorting_Simulator

3. Run the command:
.\run_gui.bat


DEPENDENCIES
------------
Java Development Kit (JDK) version 8 or higher installed.
jcommon-1.0.24.jar installed
jfreechart-1.5.4.jar installed


Authors
-------
Tanaka Petro Dongo
Belinda Hede
Joshua Adjei
Monia Nijimbere