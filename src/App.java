import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float num1 =0;
        float num2 =0;
        int op =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1 = sc.nextFloat();
        System.out.println("Enter the second number: ");
        num2 = sc.nextFloat();
        System.out.println("Enter the number of the operation: [1 for add, 2 for subtract, 3 for multiply, 4 for divide]");
        op = sc.nextInt();

        operations op1 = new operations(num1, num2);
        float result =0;

        switch(op){
            case 1:
                result = op1.add(num1, num2);
                break;
            case 2:
                result = op1.subtract(num1, num2);
                break;
            case 3:
                result = op1.multiply(num1, num2);
                break;
            case 4:
                result = op1.divide(num1, num2);
                break;
        }
        System.out.println("The result is: " +result);
        sc.close();
    }
}
