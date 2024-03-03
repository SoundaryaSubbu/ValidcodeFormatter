
fun formatJavaCode(input: String): String {
    val lines = input.split('\n')
    val output = StringBuilder()
    var tabCount = 0
    var inForLoop = false

    for (line in lines) {
        var formattedLine = line.trim()

        if (formattedLine.isNotEmpty()) {
            if (formattedLine.contains("{")) {
                output.append("\t".repeat(tabCount))
                output.append(formattedLine.substringBefore("{").trim())
                output.append(" {\n")
                tabCount++
                inForLoop = formattedLine.contains("for")
            } else if (formattedLine.contains("}")) {
                tabCount--
                output.append("\t".repeat(tabCount))
                output.append("}\n")
            } else if (formattedLine.endsWith(";")) {
                val parts = formattedLine.split(";").map { it.trim() }
                for (i in parts.indices) {
                    output.append("\t".repeat(tabCount))
                    output.append(parts[i])
                    if (i < parts.size - 1) {
                        output.append(";\n")
                    } else {
                        output.append("\n")
                    }
                }
            } else if (formattedLine.endsWith(":")) {
                output.append(formattedLine)
                if (!formattedLine.endsWith("{") && !inForLoop) {
                    output.append("\n")
                }
            } else {
                output.append("\t".repeat(tabCount))
                output.append(formattedLine)
                output.append("\n")
            }
        } else {
            output.append("\n")
        }
    }

    return output.toString()
}

fun main() {
    val input = """
       import java.util.Scanner;
       public class Test
{private String TEST = "test";public static void main(String args[]) {
int row, i, j, space = 1;System.out.print("Enter the number of rows you want to print: ");
Scanner sc = new Scanner(System.in);row = sc.nextInt();
space = row - 1;for (j = 1; j<= row; j++)
{for (i = 1; i<= space; i++){System.out.print(" ");}space--;for (i = 1; i <= 2 * j - 1; i++) {
System.out.print("*");}
System.out.println("");
}
space = 1;for (j = 1; j<= row - 1; j++)
{for (i = 1; i<= space; i++) {System.out.print(" ");}space++;for (i = 1; i<= 2 * (row - j) - 1;
i++) {System.out.print("*");
}System.out.println("");}}}
    """.trimIndent()

    val formattedCode = formatJavaCode(input)
    println(formattedCode)
}
