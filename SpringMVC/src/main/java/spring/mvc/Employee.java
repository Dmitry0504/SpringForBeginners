package spring.mvc;

import spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, max = 25, message = "Name must have 2 - 25 symbols!")
    private String name;
 //   @NotEmpty(message = "Surname is required field")
    @NotBlank(message = "Surname is required field")
    private String surname;
    @Min(value = 500, message = "Must be greater than 499!")
    @Max(value = 1000, message = "Must be less than 1001!")
    private int salary;
    private String department;
    private String carBrand;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}"
            , message = "Please use pattern XXX-XX-XX")
    private String phoneNumber;
    @CheckEmail(value = "abc.com", message = "email must ends with abc.com")
    private String email;

    private Map<String, String> departments;
    private Map<String, String> carBrands;
    private Map<String, String> languageList;
    private String[] languages;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Mercedes-Benz", "MB");
        carBrands.put("Audi", "Audi");

        languageList = new HashMap<>();
        languageList.put("English", "EN");
        languageList.put("Deutch", "DE");
        languageList.put("French", "FR");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
