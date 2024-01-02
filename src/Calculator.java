import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("First Number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter your Sign ( x , / , + , - ) ");
        String sign = scanner.next();

        System.out.println("Second Number: ");
        int secondNumber = scanner.nextInt();

        int total = 0;

            if (sign.contains("+")){
                total = firstNumber + secondNumber;
        }
            if (sign.contains("-")){
                total = firstNumber - secondNumber;
        }
            if (sign.contains("/")){
                total = firstNumber / secondNumber;
        }
            if (sign.contains("*")){
                total = firstNumber * secondNumber;

        }

        System.out.println("Your answer is " + total);


















    }


}

