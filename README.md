🎯 GuessTheNumber – Random Number Guessing Game (CLI & GUI)
Task 2 project for the SkillCraft Technology Software Development Internship.

📝 Project Description
GuessTheNumber is a classic random number guessing game implemented in Java with:

A console (CLI) version for direct terminal use.

An interactive GUI version built using Java Swing.

The game generates a random number between 1 and 100. The user must guess the number, with hints ("Too High" / "Too Low") and input validation provided. Both versions track the number of attempts and validate user input.

🎯 Features
🔢 Generates a random number between 1 and 100

🖥️ Console version (text-based): User guesses by entering input until correct

🎨 GUI version (Java Swing): User interacts with a graphical window

📊 Attempts counter for each session

⚠️ Input validation (handles non-numeric and out-of-range guesses with messages)

💡 Instant feedback: "Too High" / "Too Low" hints

🚀 How to Run
Console Version
text
javac GuessTheNumberConsole.java
java GuessTheNumberConsole
Follow the prompts to guess numbers until you find the correct one.

The program reports if your guess is too high or too low and counts your attempts.

GUI Version
text
javac GuessTheNumberGUI.java
java GuessTheNumberGUI
Launches a window where you can enter guesses interactively.

Input errors and attempt tracking handled within the interface.

📸 Screenshots
Console:

![Console Screenshot](screenshots/Console.png)

GUI: 

![GUI Screenshot](screenshots/GuiFirstLook.png)
![GUI Screenshot](screenshots/GuiShowingCorrectAttempts.png)
![GUI Screenshot](screenshots/GuiShowingCorrectGuess.png)

📂 Project Structure
text
SCT_SD_2/
├── GuessTheNumberConsole.java      # Console version
├── GuessTheNumberGUI.java   # GUI version
├── README.md                # Project documentation (this file)
└── screenshots/                  # Output screenshots
🌱 Skills Demonstrated
Java programming basics: random numbers, loops, conditions

Swing GUI: component design, event-handling, input validation

User-driven application logic and error handling

Using Git & GitHub for version control and documentation
