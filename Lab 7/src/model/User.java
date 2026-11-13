package model;

import java.io.File;
import java.util.Date;

public class User {

    private int id;            // NEW: matches student_id in the database
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private String phone;
    private String email;
    private String continent;
    private String experience;
    private File photo;
    private Date dob;

    // NEW: empty constructor, used when building a User from a database row
    public User() {
    }

    // Your existing constructor, unchanged, so RegistrationJPanel still compiles
    public User(String firstName, String lastName, String gender, int age,
                String phone, String email, String continent, String experience,
                File photo, Date dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.continent = continent;
        this.experience = experience;
        this.photo = photo;
        this.dob = dob;
    }

    // NEW: id getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("MM/dd/yyyy");
        String dobStr = (dob != null) ? sdf.format(dob) : "N/A";
        return "First Name: " + firstName +
               "\nLast Name: " + lastName +
               "\nGender: " + gender +
               "\nAge: " + age +
               "\nDate of Birth: " + dobStr +
               "\nPhone: " + phone +
               "\nEmail: " + email +
               "\nContinent: " + continent +
               "\nExperience: " + experience;
    }
}