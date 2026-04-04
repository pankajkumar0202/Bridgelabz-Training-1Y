package com.gla.Wrapper-Classess;
import java.util.ArrayList;
public class PriceExample {
    public static void main(String[] args) {
        double[] prices = {10.5, 20.0, 35.75, 5.5};
        ArrayList<Double> list = new ArrayList<>();
        for (double p : prices) {
            list.add(p); 
        }
        double max = list.get(0);
        double sum = 0;
        for (double i : list) {
            if (i > max) {
                max = i;
            }
            sum += i;
        }
        double avg = sum / list.size();
        System.out.println("Highest price = " + max);
        System.out.println("Average price = " + avg);
    }
}
