package Lab1;

import java.util.Scanner;

public class Lab1 {
    static int a,b,result,fib,choice;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1.Calculator");
            System.out.println("2.Factorial");
            System.out.println("3.Fibonacci");
            System.out.println("4.Root");
            System.out.println("5.Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            System.out.println("Your choice:: "+ choice);
            switch (choice) {

            case 1:
                System.out.println("Calci Menu");
                System.out.println("1.Add");
                System.out.println("2.Sub");
                System.out.println("3.Mul");
                System.out.println("4.Div");
                System.out.println("5.Exit");
                int calci_choice = scanner.nextInt();
                switch (calci_choice) {
                    case 1:
                        System.out.println("Add");
                        System.out.println("Enter the two numbers");
                        a = scanner.nextInt();
                        b = scanner.nextInt();
                        result = a + b;
                        System.out.println("The sum of " + a + " and " + b + " is :" + result);
                        break;
                    case 2:
                        System.out.println("Sub");
                        System.out.println("Enter the two numbers");
                        a = scanner.nextInt();
                        b = scanner.nextInt();
                        result = a - b;
                        System.out.println("The sub of " + a + " and " + b + " is :" + result);
                        break;
                    case 3:
                        System.out.println("Mul");
                        System.out.println("Enter the two numbers");
                        a = scanner.nextInt();
                        b = scanner.nextInt();
                        result = a * b;
                        System.out.println("The multiplication of " + a + " and " + b + " is :" + result);
                        break;
                    case 4:
                        System.out.println("Div");
                        System.out.println("Enter the two numbers");
                        a = scanner.nextInt();
                        b = scanner.nextInt();
                        result = a / b;
                        if (b <= 0) {
                            System.out.println("Infinity");
                        } else {
                            System.out.println("The multiplication of " + a + " and " + b + " is :" + result);
                        }
                        break;
                    case 5:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid input");
                }
                break;
            case 2:
                System.out.println("Factorial");
                System.out.println("Enter the number ");
                a = scanner.nextInt();
                if (a < 0) {
                    System.out.println("NULL");
                }
                else if (a == 0)
                {
                    System.out.println("Factorial of 0 is : 1");
                }
                else
                {
                    result = 1;
                    while (a != 0)
                    {
                        result = result * a;
                        a--;

                    }
                    System.out.println("The factorial of " + a + "is :" + result);
                }
                break;
            case 3:
                System.out.println("Fibonacci");
                b = 1;
                System.out.println("Enter number");
                fib = scanner.nextInt();
                for (int i = 0; i < fib; i++) {
                    int num3 = a + b;
                    a = b;
                    b = num3;
                    result=num3;
                    System.out.println(result);
                }
                System.out.println("The Fibonacci of "+fib+" is: "+result);
                break;
            case 4:
                System.out.println("Root");
                System.out.println("Menu");
                System.out.println("1.Square");
                System.out.println("2.Cube");
                System.out.println("3.Quad");
                System.out.println("4.Exit");
                int root_choice = scanner.nextInt();
                switch (root_choice) {
                    case 1:
                        System.out.println("Square");
                        a = scanner.nextInt();
                        result = a * a;
                        System.out.println("The square of " + a + " is :" + result);
                        break;
                    case 2:
                        System.out.println("Cube");
                        a = scanner.nextInt();
                        double res = a * a * a;
                        System.out.println("The cube of " + a + " is :" + res);
                        break;
                    case 3:
                        System.out.println("Quad");
                        a = scanner.nextInt();
                        double resQ = a * a * a * a;
                        System.out.println("The cube of " + a + " is :" + resQ);
                        break;
                    default:
                        System.out.println("Invalid");
                }
                break;
            case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid");
            }
        }while (choice!=5);
    }

}
