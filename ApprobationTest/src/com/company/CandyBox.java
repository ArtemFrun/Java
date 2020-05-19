package com.company;

public class CandyBox implements IMarket{
    private String name;
    private int weightInGrams;
    private Boolean holidayBox;
    private double price;

    public CandyBox(String name, int weightInGrams, Boolean holidayBox, double price) {
        this.name = name;
        this.weightInGrams = weightInGrams;
        this.holidayBox = holidayBox;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(int weight) {
        this.weightInGrams = weight;
    }

    public Boolean getHolidayBox() {
        return holidayBox;
    }

    public void setHolidayBox(Boolean holidayBox) {
        this.holidayBox = holidayBox;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CandyBox{" +
                "name='" + name + '\'' +
                ", weight=" + weightInGrams +
                ", holidayBox=" + holidayBox +
                '}';
    }

    @Override
    public double getPrice() {
        return price;
    }
}
