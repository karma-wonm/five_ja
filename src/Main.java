public class Main {
    public static void main(String[] args) {
        double weight = 60.3;
        double height = 1.79;
        BmiService service = new BmiService();
        System.out.println(service.calculate(weight, height));
    }
}