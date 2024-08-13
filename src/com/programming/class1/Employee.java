package com.programming.class1;

public class Employee {
    int EmpAge, EmpId, EmpSalary;
    String EmpName;
    public int getEmpAge() {
        return EmpAge;
    }

    public int getEmpId() {
        return EmpId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public int getEmpSalary() {
        return EmpSalary;
    }

    public void setEmpAge(int empAge) {
        EmpAge = empAge;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public void setEmpSalary(int empSalary) {
        EmpSalary = empSalary;
    }

    // main function
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpName("Denaerys");
        emp.setEmpAge(23);
        emp.setEmpId(999);
        emp.setEmpSalary(100000);

        System.out.println("Name of Employee: "+ emp.getEmpName());
        System.out.println("Age of Employee: "+ emp.getEmpAge());
        System.out.println("ID of Employee: "+ emp.getEmpId());
        System.out.println("Salary of Employee: "+ emp.getEmpSalary());
    }
}
