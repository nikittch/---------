import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите число для вычисления факториала: ");
        int number = scanner.nextInt();
        
        if (number < 0) {
            System.out.println("Факториал отрицательного числа не определен.");
        } else {
            long factorial = 1;
            int i = 1;
            
            while (i <= number) {
                factorial *= i; 
                i++;
            }
            
            System.out.println("Факториал числа " + number + " равен " + factorial);
        }
        
        scanner.close();
    }
}