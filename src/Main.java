public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float BMI = service.calculate(82, 185);
        System.out.println(BMI);

    }
}