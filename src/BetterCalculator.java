import java.util.Scanner;

public class BetterCalculator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Equation: (num1 x,/,-,+ num2) ");
        String equation = scanner.nextLine();
        String filteredEquation = equation.replaceAll(" ","");
        char[] operation;
        operation = filteredEquation.toCharArray();
        char variable1 = operation[0];
        char sign = operation[1];
        char variable2 = operation[2];
        int variable1num = Integer.parseInt(String.valueOf(variable1));
        int variable2num = Integer.parseInt(String.valueOf(variable2));
        if (sign == '+'){
            System.out.println(equation + " = " + (variable1num + variable2num));
        }
        if (sign == '-'){
            System.out.println(equation + " = " + (variable1num - variable2num));
        }
        if (sign == '/'){
            System.out.println(equation + " = " + (variable1num / variable2num));
        }
        if (sign == '*'){
            System.out.println(equation + " = " + (variable1num * variable2num));
        }























    }

}

