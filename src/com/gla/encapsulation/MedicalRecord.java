package com.gla.encapsulation;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// Abstract Class
abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;   
    public Patient(String patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    // Encapsulation (Getters only)
    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    protected String getDiagnosis() {   // Restricted access
        return diagnosis;
    }

    public void getPatientDetails() {
        System.out.println("ID: " + patientId +
                           ", Name: " + name +
                           ", Age: " + age);
    }

    public abstract double calculateBill();
}

class InPatient extends Patient implements MedicalRecord {

    private int daysAdmitted;
    private String medicalHistory = "";

    public InPatient(String id, String name, int age, String diagnosis, int days) {
        super(id, name, age, diagnosis);
        this.daysAdmitted = days;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * 2000;  // 2000 per day
    }

    @Override
    public void addRecord(String record) {
        medicalHistory += record + "\n";
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History:\n" + medicalHistory);
    }
}

class OutPatient extends Patient implements MedicalRecord {

    private String medicalHistory = "";

    public OutPatient(String id, String name, int age, String diagnosis) {
        super(id, name, age, diagnosis);
    }

    @Override
    public double calculateBill() {
        return 500;  // fixed consultation fee
    }

    @Override
    public void addRecord(String record) {
        medicalHistory += record + "\n";
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History:\n" + medicalHistory);
    }
}
public class HospitalPatientManagement {
    public static void main(String[] args) {

        Patient p1 = new InPatient("P101", "Pankaj", 21, "Fever", 3);
        Patient p2 = new OutPatient("P102", "Naveen", 25, "Cold");

        Patient[] patients = {p1, p2};

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());

            MedicalRecord mr = (MedicalRecord) p;  // Polymorphism
            mr.addRecord("Initial diagnosis recorded.");
            mr.viewRecords();

            System.out.println("----------------------");
        }
    }
}
