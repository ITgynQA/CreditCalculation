public class CreditPaymentService {

    public double calculate(int kredit, double procent, int srok) {

        double x = procent / 100 / 12;
        double y = Math.pow((1 + x), srok);

        double result = kredit * (x + (x / (y - 1)));

        return result = (int) result;


    }

}




