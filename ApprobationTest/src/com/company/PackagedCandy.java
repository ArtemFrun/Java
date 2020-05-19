package com.company;

public class PackagedCandy implements IMarket{
    private String name;
    private int weightInGrams;
    private double pricePerKilogram;

    public PackagedCandy(String name, int weightInGrams, double pricePerKilogram) {
        this.name = name;
        this.weightInGrams = weightInGrams;
        this.pricePerKilogram = pricePerKilogram;
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

    public double getPricePerKilogram() {
        return pricePerKilogram;
    }

    public void setPricePerKilogram(double pricePerKilogram) {
        this.pricePerKilogram = pricePerKilogram;
    }

    @Override
    public String toString() {
        return "PackagedCandy{" +
                "name='" + name + '\'' +
                ", weight=" + weightInGrams +
                '}';
    }

    @Override
    public double getPrice() {
        return (pricePerKilogram*weightInGrams)/1000;
    }
}
