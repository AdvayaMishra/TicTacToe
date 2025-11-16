🎮 Tic-Tac-Toe (Java)

A simple Java console-based Tic-Tac-Toe game with a 3×3 grid, two-player turns, input validation, win/draw detection, and modular code. Players enter positions 1–9, and the game checks rows, columns, and diagonals to determine the winner or a draw.

🧩 How the Game Works

The board is stored as a char array of 9 cells.

Players take turns placing X and O.

Input is taken using 1–9 (mapped to board positions).

Invalid moves are rejected with a retry message.

After each turn, the game checks all winning combinations.

Game ends when:

A player wins 🎉

All 9 moves are played → Draw

📌 Features

✔ Two-player mode

✔ Input validation

✔ Win & draw detection

✔ Clean console board display

✔ Easy-to-understand code structure

▶️ Run the Game
javac TicTacToe.java
java TicTacToe

📂 Code Structure

printBoard() → Displays the 3×3 grid

checkWinner() → Checks all winning patterns

main() → Handles turns, input, logic, and game flow

💡 Code (for reference)

🚀 Future Improvements

Add AI for Player vs Computer

Add replay/score system

Add GUI using Swing/JavaFX

Add sound or animations
