import java.util.*;

public class Calculator_3 {
    
    // Phương thức để in ra các thừa số nguyên tố của số nguyên n
    public void printPrimeFactors(int n) {
        if (n <= 1) {
            System.out.println("Khong co thua so nguyen to.");
            return;
        }
        
        // Sử dụng một danh sách để lưu các thừa số nguyên tố
        List<Integer> primeFactors = new ArrayList<>();
        
        // Kiểm tra lặp từ 2 đến căn bậc hai của n
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }
        
        // Nếu n còn lại và lớn hơn 1 thì n là thừa số nguyên tố
        if (n > 1) {
            primeFactors.add(n);
        }
        
        // In ra các thừa số nguyên tố
        System.out.print("Cac thua so nguyen to cua " + n + " la: ");
        for (int primeFactor : primeFactors) {
            System.out.print(primeFactor + " ");
        }
        System.out.println();
    }
    
    // Hàm main để kiểm tra

}
