public class BmiService {
    public float calculate(float mass, float high) {
        float BMI = mass / (high * high);
        return BMI;

    }
}
