package com.github.perscholas;

/**
 * Created by leon on 6/10/2020.
 */
// TODO - Ensure an `AbstractEmployee` implements the `EmployeeInterface`
// TODO - Ensure an `AbstractEmployee` is abstract
abstract public class AbstractEmployee implements EmployeeInterface {
    private Long id;
    private String name;
    private String address;
    private Long phoneNumber;
    private Double basicSalary;
    private Double specialAllowance;
    private Double healthReimbursementAccount;

    // TODO - Ensure that each of the arguments passed through the constructor are assigned to a respective instance variable
    private AbstractEmployee(Long id, String name, String address, Long phoneNumber, Double basicSalary, Double specialAllowance, Double healthReimbursementAccount) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.basicSalary = basicSalary;
        this.specialAllowance = specialAllowance;
        this.healthReimbursementAccount = healthReimbursementAccount;
    }

    // TODO - Ensure that each of the arguments passed through the constructor are assigned to a respective instance variable
    public AbstractEmployee(Long id, String name, String address, Long phoneNumber, Double basicSalary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.basicSalary = basicSalary;
    }

    public AbstractEmployee() {
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public Long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public Double getBasicSalary() {
        return basicSalary;
    }

    @Override
    public Double getHealthReimbursementAccount() {
        return healthReimbursementAccount;
    }

    @Override
    public Double getSpecialAllowance() {
        return specialAllowance;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public void setHealthReimbursementAccount(Double healthReimbursementAccount) {
        this.healthReimbursementAccount = healthReimbursementAccount;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void setSpecialAllowance(Double specialAllowance) {
        this.specialAllowance = specialAllowance;
    }

    @Override
    public Double calculateSalary() {
        return null;
    }
}
