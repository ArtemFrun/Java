package com.company;

public class WorkerFullTime implements IAccounting{

    private String name;
    private int monthlyFee;

    public WorkerFullTime() {
    }

    public WorkerFullTime(String name, int monthlyFee) {
        this.name = name;
        this.monthlyFee = monthlyFee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(int monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    @Override
    public String toString() {
        return "WorkerFullTime{" +
                "name='" + name + '\'' +
                ", monthlyFee=" + monthlyFee +
                '}';
    }

    @Override
    public double getSalary() {
        return this.getMonthlyFee();
    }
}
