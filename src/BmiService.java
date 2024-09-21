public class BmiService {
    public int calculate(double growhtMetre, int weightKg) {

        double bmiIndex;

        double sqaureGrowhtMetre = growhtMetre * growhtMetre;

        bmiIndex = (weightKg / sqaureGrowhtMetre);

        return (int) bmiIndex;
    }
}
