package hospitalsystem.users;

import hospitalsystem.users.enums.Gender;

public class Doctor extends Staff {

    private String specialization;

    public Doctor(int id, String firstName, String lastName, String email, Gender gender) {
        super(id, firstName, lastName, email, gender);
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public void setSpecialization(String specialization) {
        checkString(specialization);
        this.specialization = specialization;
    }

    private void checkString(String str) {
        if(str == null || str.isEmpty()){
            throw new IllegalArgumentException();
        }
    }
}
