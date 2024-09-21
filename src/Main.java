public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double growthMetre = 1.87;

        int wieghtKG = 98;

        double bmiIndex = service.calculate(growthMetre, wieghtKG); // должно получиться 28
        System.out.println(bmiIndex);
    }
}