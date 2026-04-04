package com.gla.Wrapper-Classess;
import java.util.ArrayList;
public class SensorLogger {
    public static void addReading(ArrayList<Double> list, double value) {
        list.add(value);  
    }
   public static void addReadingObj(ArrayList<Double> list, Double value) {
        list.add(value); 
    }
   public static void main(String[] args) {
        ArrayList<Double> readings = new ArrayList<>();
        addReading(readings, 25.5);    
        addReadingObj(readings, 30.2); 
        addReading(readings, 28.0);
        double sum = 0;
        for (Double i : readings) {
            sum += i;   
        }
        System.out.println("Readings: " + readings);
        System.out.println("Average = " + (sum / readings.size()));
    }
}
