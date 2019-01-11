package hospitalsystem.users;

import hospitalsystem.users.enums.Gender;

public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private Gender gender;

    public User(int id, String firstName, String lastName, String email, Gender gender) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setGender(gender);
    }

    public int getId(){
        return this.id;
    }

    private void setId(int id) {
        this.checkId(id);
        this.id = id;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email) {
        this.checkForNull(email);
        this.email = email;
    }

    public String getFirstName(){
        return this.firstName;
    }

    private void setFirstName(String firstName) {
        checkString(firstName);
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    private void setLastName(String lastName) {
        checkString(lastName);
        this.lastName = lastName;
    }

    private void setGender(Gender gender) {
        checkForNull(gender);
        this.gender = gender;
    }

    public Gender getGender() {
        return this.gender;
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    private void checkForNull(Object ob){
        if(ob == null){
            throw new IllegalArgumentException();
        }
    }

    private void checkString(String str) {
        if(str == null || str.isEmpty()){
            throw new IllegalArgumentException();
        }
    }

    private void checkId(int id){
        if(id <= 0 ){
            throw new IllegalArgumentException("Invalid ID");
        }
    }
}
