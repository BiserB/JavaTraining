package hospitalsystem;

import hospitalsystem.users.enums.Gender;
import hospitalsystem.insurance.*;
import hospitalsystem.payment.Billing;
import hospitalsystem.users.Patient;

import java.util.ArrayList;

public class Startup {

    private static ArrayList<HealthInsurancePlan> plans = new ArrayList<>();
    private static ArrayList<Patient> patients = new ArrayList<>();

    public static void main(String[] args) {

        enterSampleData();

        Patient patient = patients.get(0);
        String fullName = patient.getFullName();

        double amount = Billing.computePaymentAmount(patient, 100);

        System.out.println("Patient: " + fullName);
        System.out.println("For checkout: " + amount);
    }

    public static void enterSampleData() {

        plans.add(new BronzePlan("Alianz"));

        patients.add(new Patient(1, "Foo", "Bar", "foo@mail.bg", Gender.Male, plans.get(0)));

    }
}
