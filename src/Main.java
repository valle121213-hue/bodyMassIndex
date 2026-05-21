//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double massKg = 66;
        double heightM = 1.65;
        int bmi = service.calculate(massKg, heightM);

        System.out.println(bmi);


    }
}