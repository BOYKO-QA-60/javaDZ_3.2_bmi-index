public class BimService {
    public int calculate(int weight, double height) {
        double bmi;
        bmi = (weight / (height * height));
        return (int) bmi;
    }
}