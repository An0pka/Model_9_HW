import java.util.Scanner;

public class Calculator {
    public void result (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number:");
        double first = scanner.nextDouble();
        System.out.println("enter second number:");
        double second = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("enter operand:");
        String operand = scanner.nextLine();
        if(operand.equals("+")){
            System.out.println("result = " + Math.round(first + second));
        }if(operand.equals("-")){
            System.out.println("result = " + Math.round(first - second));
        }if(operand.equals("*")){
            System.out.println("result = " + Math.round(first * second));
        }if(operand.equals("/")){
            System.out.println("result = " + Math.round(first / second));
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.result();
    }
}
