public class BmiService {
    public int calculate (double massKg, double heightM) {

        double bmid = massKg / (heightM * heightM);

        int bmi = (int) bmid;

        return bmi;

    }
}
