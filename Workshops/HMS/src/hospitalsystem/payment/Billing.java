package hospitalsystem.payment;

import hospitalsystem.insurance.HealthInsurancePlan;
import hospitalsystem.users.Patient;

public class Billing {

    public static double computePaymentAmount(Patient patient, double amount) {

        if (!patient.isUnsured()){
            return amount;
        }

        HealthInsurancePlan insurancePlan = patient.getInsurancePlan();

        double coverage = amount * insurancePlan.getCoveragePercent() / 100;
        double forPayment = amount - coverage;

        return forPayment;
    }
}
