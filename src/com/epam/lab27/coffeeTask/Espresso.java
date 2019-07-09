package com.epam.lab27.coffeeTask;

public class Espresso extends Coffee {
    private String nameOfEspressoBean;
    private Double sugarQuantity;
    private Double milkQuantity;
    private Double priceOfEspresso;

    public Espresso() {
    }

    public Espresso(Double waterQuantity, String nameOfEspressoBean, Double sugarQuantity, Double milkQuantity, Double priceOfEspresso) {
        super(waterQuantity);
        this.nameOfEspressoBean = nameOfEspressoBean;
        this.sugarQuantity = sugarQuantity;
        this.milkQuantity = milkQuantity;
        this.priceOfEspresso = priceOfEspresso;
    }

    public String getNameOfEspressoBean() {
        return nameOfEspressoBean;
    }

    public void setNameOfEspressoBean(String nameOfEspressoBean) {
        this.nameOfEspressoBean = nameOfEspressoBean;
    }

    public Double getSugarQuantity() {
        return sugarQuantity;
    }

    public void setSugarQuantity(Double sugarQuantity) {
        this.sugarQuantity = sugarQuantity;
    }

    public Double getMilkQuantity() {
        return milkQuantity;
    }

    public void setMilkQuantity(Double milkQuantity) {
        this.milkQuantity = milkQuantity;
    }

    public Double getPriceOfEspresso() {
        return priceOfEspresso;
    }

    public void setPriceOfEspresso(Double priceOfEspresso) {
        this.priceOfEspresso = priceOfEspresso;
    }

    @Override
    public String toString() {
        return "Espresso{" +
                "nameOfEspressoBean:' " + nameOfEspressoBean + '\'' +
                ", waterQuantity=" + super.getWaterQuantity() +
                ", sugarQuantity: " + sugarQuantity +
                ", milkQuantity: " + milkQuantity +
                ", priceOfEspresso: " + priceOfEspresso +
                '}';
    }
}
