package model;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String idNumber;

    public Student(String name, int age, String gender, String idNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }
}
