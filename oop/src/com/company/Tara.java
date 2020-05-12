package com.company;

public class Tara extends Box{

    private String color;
    private String material;
    private int weightInGrams;
    private Boolean returnable;

    public Tara() {
    }

    public Tara(String color, String material, int weightInGrams, Boolean returnable) {
        this.color = color;
        this.material = material;
        this.weightInGrams = weightInGrams;
        this.returnable = returnable;
    }

    public Tara(int length, int width, int height, String color, String material, int weightInGrams, Boolean returnable) {
        super(length, width, height);
        this.color = color;
        this.material = material;
        this.weightInGrams = weightInGrams;
        this.returnable = returnable;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public Boolean getReturnable() {
        return returnable;
    }

    public void setReturnable(Boolean returnable) {
        this.returnable = returnable;
    }

    public void setLength(int length)
    {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Tara{" + super.toString() +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", weightInGrams=" + weightInGrams +
                ", returnable=" + returnable +
                '}';
    }
}
