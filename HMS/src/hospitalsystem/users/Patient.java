package hospitalsystem.users;

import hospitalsystem.users.enums.Gender;
import hospitalsystem.insurance.HealthInsurancePlan;

public class Patient extends User{

    private HealthInsurancePlan insurancePlan;

    public Patient(int id, String firstName, String lastName, String email, Gender gender, HealthInsurancePlan insurancePlan) {
        super(id, firstName, lastName, email, gender);

        this.setInsurancePlan(insurancePlan);
    }

    public boolean isUnsured(){
        return this.insurancePlan != null;
    }

    public HealthInsurancePlan getInsurancePlan(){

        return this.insurancePlan;
    }

    private void setInsurancePlan(HealthInsurancePlan insurancePlan) {
        if (insurancePlan == null){
            throw new IllegalArgumentException();
        }
        this.insurancePlan = insurancePlan;
    }
}
