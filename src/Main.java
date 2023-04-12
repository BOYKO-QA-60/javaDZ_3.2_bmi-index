public class Main {
    public static void main(String[] args) {
        BimService service = new BimService();
        int bmi = service.calculate(55, 1.64);
        System.out.println("Ваш ИМТ составляет: " + bmi);
    }
}