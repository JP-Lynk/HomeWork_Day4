public class Calculator_2 {
    
    public int calculateSumOfProduct(int n) {
        int totalSum = 0;
        StringBuilder expression = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            int product = 1;
            if (i > 1) {
                expression.append(" + ");
            }
            for (int j = 1; j <= i; j++) {
                product *= j;
                if (j == 1) {
                    expression.append(j);
                } else {
                    expression.append("*").append(j);
                }
            }
            totalSum += product;
        }

        // In ra biểu thức tính toán
        System.out.println("Bieu thuc co dang: " + expression.toString());
        return totalSum;
    }
}

