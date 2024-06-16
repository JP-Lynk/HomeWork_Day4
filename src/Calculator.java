import java.util.Scanner;

public class Calculator {
    public float calculateSum() {
        Scanner scanner = new Scanner(System.in);
        float total = 0;

        while (true) {
            System.out.print("Moi nhap vao so: ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("n")) {
                break;
            }
            try {
                float number = Float.parseFloat(userInput);
                total += number;
                System.out.println("Moi nhap ky tu 'n' neu muon ket thuc chuong trinh. Nhap bat ky de tiep tuc chuong trinh!!!");
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap dung dinh dang so");
            }
        }

        return total;
    }
}

