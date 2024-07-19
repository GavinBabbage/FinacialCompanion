# Financial Companion Application

Welcome to the Finance Companion Application! This Java-based command line tool is designed to be a comprehensive aid for anyone looking to understand key finance concepts and perform essential calculations. Whether you're a finance student, professional, or enthusiast, this application will help you grasp the fundamentals of financial ratio analysis, the time value of money, and bond valuations.

## Features

- **Financial Ratio Analysis:**
  - Compute and interpret liquidity ratios, profitability ratios, solvency ratios, and efficiency ratios.
  - Gain insights into a company's financial health through detailed ratio breakdowns.

- **Time Value of Money (TVM):**
  - Calculate present and future values of investments.
  - Understand and compute annuities, perpetuities, and other TVM-related concepts.

- **Bond Valuations:**
  - Evaluate bond prices, yields (YTM), duration, and convexity.
  - Analyze different types of bonds and their respective valuation methods.

## Why Use This Application?

- **Educational Tool:** Ideal for finance students who want a hands-on approach to learning complex finance calculations.
- **Practical Utility:** Useful for professionals needing quick financial computations without the overhead of complex software.
- **User-Friendly:** Command line interface that is straightforward and easy to navigate.

## Getting Started

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/GavinBabbage/finance-companion-app.git
   cd finance-companion-app
   ```

2. Compile the application using `make`:

   ```bash
   make
   ```

   This command will compile all necessary Java files.

### Requirements

- Java 8 or higher

### Usage

#### Running the Application

- To start the application, run:

  ```bash
  java Main.Driver
  ```

  Follow the prompts to select calculations and input values.

#### Available Commands

- The application supports the following commands (enter any of these during runtime):

  - **Financial Ratios:** Command phrases related to financial ratio analysis, e.g., `roe`, `roa -all`.
  - **Time Value of Money:** Phrases for TVM calculations, such as `pv`, `fv`.
  - **Bond Valuations:** Use command such as `bond price`, `ytm` for bond related calculations.
  - **Other Utilities:** Commands like `glossary`, `cmds`, `exit` for accessing glossary, help, and exiting the application.

#### Example

1. Start the application:

   ```bash
   java Main.Driver
   ```

2. Enter a command from the list and follow the prompts to input necessary values and view results.

### Contributing

Contributions are welcome! If you have suggestions for improvements or new features, feel free to fork the repository and submit a pull request. Please ensure your contributions adhere to the project's coding standards and conventions.

### License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
