import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Chạy tính tổng các số từ Calculator
        Calculator calculator = new Calculator();
        System.out.println("Tinh tong cac so. Nhap 'n' de ket thuc.");
        float sum = calculator.calculateSum();
        System.out.println("Tong la: " + sum );

        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        // Chạy tính tổng của tích từ Calculator_2
        System.out.print("Moi nhap vao so n: ");
        int n = scanner.nextInt();

        Calculator_2 calculator_2 = new Calculator_2();
        int sumOfProduct = calculator_2.calculateSumOfProduct(n);
        System.out.printf("Tong cua tich la %d\n", sumOfProduct);
        System.out.println("--------------------------------------------------------------------------------------------------------------------");

        System.out.print("Moi nhap vao so z: ");
        int z = scanner.nextInt();
        Calculator_3 calculator_3 = new Calculator_3();
        
        calculator_3.printPrimeFactors(z);
    }
}
