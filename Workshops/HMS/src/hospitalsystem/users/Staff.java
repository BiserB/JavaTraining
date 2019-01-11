package hospitalsystem.users;

import hospitalsystem.users.enums.Gender;

public class Staff extends User {

    private int yearsOfExperience;
    private String description;
    private double salary;

    public Staff(int id, String firstName, String lastName, String email, Gender gender) {
        super(id, firstName, lastName, email, gender);

        setYearsOfExperience(yearsOfExperience);
        setDescription(description);
        setSalary(salary);
    }

    public int getYearsOfExperience() {
        return this.yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
