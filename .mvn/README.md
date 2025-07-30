# Snap Game

A simple Snap game that allows two players to take turns drawing cards from a randomly shuffled deck. Gameplay continues until a card matches the one previously drawn. When a "Snap" occurs, the current player has 2 seconds to type **Snap** and win the round. If they fail, the other player wins.

---

## How to Play & Rules

- Clone the repository to your computer
- Navigate to the `src` directory
- Compile and run the game
- Press `[ENTER]` to begin
- Each player takes turns drawing a card using `[ENTER]`
- If a Snap occurs, the player must type **Snap** within 2 seconds to win
- If the timer runs out, the other player wins

---

## General Code Log & Issues Tackled

- Created `CardGame` & `Card` classes
- Added `Suits` & `Ranks` enums
- Implemented methods to sort the deck by suit and value
- Developed a `playGame()` method
- Added `Snap` class + Main method
- Created a `SecondPlayer` class
- Added `Timer` class and “Play Again” function

---

## Future Potential Implementations

- Improve UI with sounds and visual enhancements
- Extend logic to support multiple card games based on deck type
- Add additional game modes such as single-player and multiplayer

---

**Thanks for playing!**
