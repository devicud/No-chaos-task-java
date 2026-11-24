public class Sales {
    public static void main(String[] args) {
        double profitAnnually = (30000 - 5000);
        double fixedSales = (6.0 / 100 * 5000) + (8.0 / 100 * 5000);
        profitAnnually -= fixedSales;
        double sales = (10.0 / 100 * 10000);
        int salesCounter = 2;

        while (profitAnnually > 0) {
            profitAnnually -= sales;
            salesCounter += 1;
        }
        System.out.println(salesCounter + " sales");
    }
}
