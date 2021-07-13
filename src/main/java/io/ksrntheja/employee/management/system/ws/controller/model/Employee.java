package io.ksrntheja.employee.management.system.ws.controller.model;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

    private int empNo;
    private String eName;
    private String job;
    private LocalDate hireDate;
    private int sal;
    private int deptNo;
    private int mgr;
    private int comm;

    public int getEmpNo() {
        return empNo;
    }

    public Employee(int empNo, String eName, String job, LocalDate hireDate, int sal, int deptNo, int mgr, int comm) {
        this.empNo = empNo;
        this.eName = eName;
        this.job = job;
        this.hireDate = hireDate;
        this.sal = sal;
        this.deptNo = deptNo;
        this.mgr = mgr;
        this.comm = comm;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public int getComm() {
        return comm;
    }

    public void setComm(int comm) {
        this.comm = comm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empNo == employee.empNo && sal == employee.sal && deptNo == employee.deptNo &&
                eName.equals(employee.eName) && job.equals(employee.job) && hireDate.equals(employee.hireDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNo, eName, job, hireDate, sal, deptNo);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", eName='" + eName + '\'' +
                ", job='" + job + '\'' +
                ", hireDate=" + hireDate +
                ", sal=" + sal +
                ", deptNo=" + deptNo +
                ", mgr=" + mgr +
                ", comm=" + comm +
                '}';
    }
}
