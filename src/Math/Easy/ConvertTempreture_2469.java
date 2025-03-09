package Math.Easy;

import java.util.Arrays;

public class ConvertTempreture_2469 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ConvertTempreture_2469().convertTemperature(89.9)));
    }
    public double[] convertTemperature(double celsius) {
        return new double[] {celsius + 273.15,celsius * 1.80 + 32.00};
    }
}
