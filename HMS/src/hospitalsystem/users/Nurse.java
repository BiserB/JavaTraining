package hospitalsystem.users;

import hospitalsystem.users.enums.Gender;

public class Nurse extends Staff{

    private int departmentId;

    public Nurse(int id, String firstName, String lastName, String email, Gender gender) {
        super(id, firstName, lastName, email, gender);
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
}
