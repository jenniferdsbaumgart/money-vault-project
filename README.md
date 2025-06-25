
# My Piggy Bank

This is a simple Java project that simulates a piggy bank where you can add, remove, and convert values in different currencies. Each currency is represented by a specific class that extends the abstract class Moeda. This is an enhanced version of the project developed for the OOP - Object-Oriented Programming course in the Systems Analysis and Development programme at UNINTER. It also utilises knowledge gained from the Software Developer course at Senac.

## Features

- Add monetary value in supported currencies (Dollar, Euro, Pound, Real).
- Remove monetary value from supported currencies.
- List the stored values in each currency in the piggy bank.
- Convert currency values to Real.

## Project Structure

The project is structured as follows:

- **`src/`**: Contains the Java source code of the project.
  - **`meu_cofrinho/`**: The main package of the project.
    - **`Main.java`**: The entry point of the program.
    - **`Menu.java`**: Implementation of the main menu and piggy bank operations.
    - **`Cofrinho.java`**: Class that manages the currencies in the piggy bank.
    - **`Moeda.java`**: Abstract base class for the different currencies.
    - **`Dolar.java`, `Euro.java`, `Libra.java`, `Real.java`**: Specific classes for each currency.
- **`README.md`**: This file, containing information about the project and usage instructions.
- **`.gitignore`**:  Git configuration file to ignore specific files and directories.

## Contributions

Contributions are welcome! Feel free to open a Pull Request with improvements, bug fixes, or new features.
