package com.gla.inheritance-polymorphism;

public class SmartHomeSystem {
    static class Device {
        String deviceId;
        String status;
        Device(String deviceId, String status) {
            this.deviceId = deviceId;
            this.status = status;
        }
        void displayStatus() {
            System.out.println("Device ID: " + deviceId);
            System.out.println("Status: " + status);
        }
    }
    static class Thermostat extends Device {
        double temperatureSetting;
        Thermostat(String deviceId, String status, double temperatureSetting) {
            super(deviceId, status);  // Call parent constructor
            this.temperatureSetting = temperatureSetting;
        }

        @Override
        void displayStatus() {
            super.displayStatus();  
            System.out.println("Temperature Setting: " + temperatureSetting + "°C");
        }
    }
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat("TH101", "ON", 24.5);
        System.out.println("----- Thermostat Status -----");
        t1.displayStatus();
    }
}
