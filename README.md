# ValidcodeFormatter
This Kotlin program is designed to format Java code according to specific formatting rules. It provides a simple way to ensure consistency in code style and readability.

Pre-Requisites:
you need to have Java Runtime Environment(JRE),Kotlin compiler to be installed on your system.You need a text editor or an integrated development environment (IDE) to edit the Kotlin code and provide the input Java code to be formatted.
The main code is in **Main.kt** file 

## Features

- Adds a new line after every valid line ending with a semicolon (`;`), except for lines within a `for` loop.
- Adds a new line after every colon (`:``). It omits a new line if followed by a switch case.
- Adds a new line after every opening curly brace `{`.
- Adds a tab space after every opening curly brace `{`.
- Adds a new line before every closing curly brace `}`.
- Reduces a tab space before every closing curly brace `}`.
- Keeps the same tab space in every line except for cases mentioned above (`{`, `}`).

## Usage

To use the Java code formatter:

1. Run the Kotlin program and provide the Java code as input.
2. The program will format the input Java code according to the specified rules.
3. Copy the formatted code and use it in your project.

## Example

Suppose you have the following Java code:
import java.util.Scanner;public class Test
{
    int row, i, j, space = 1;System.out.print("Enter the number of rows you want to print: ");
    Scanner sc = new Scanner(System.in);row = sc.nextInt();
    space = row - 1;for (j = 1; j<= row; j++)
    {
    }
    space = 1;for (j = 1; j<= row - 1; j++)
    {
        i++; j++;
    }
}
After formatting using this program, it will look like:
import java.util.Scanner;
public class Test {
    int row, i, j, space = 1;
    System.out.print("Enter the number of rows you want to print: ");
    Scanner sc = new Scanner(System.in);
    row = sc.nextInt();
    space = row - 1;
    for (j = 1; j<= row; j++) {
    }
    space = 1;
    for (j = 1; j<= row - 1; j++) {
        i++;
        j++;
    }
}
