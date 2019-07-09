package com.epam.lab27.coffeeTask;

public class Americano extends Coffee {
    private String nameOfAmericanoBean;
    private Double sugarQuantity;
    private Double milkQuantity;
    private Double priceOfAmericano;

    public Americano(Double waterQuantity, String nameOfAmericanoBean, Double sugarQuantity, Double milkQuantity, Double priceOfAmericano) {
        super(waterQuantity);
        this.nameOfAmericanoBean = nameOfAmericanoBean;
        this.sugarQuantity = sugarQuantity;
        this.milkQuantity = milkQuantity;
        this.priceOfAmericano = priceOfAmericano;

    }

    public Americano() {
    }

    public String getNameOfAmericanoBean() {
        return nameOfAmericanoBean;
    }

    public void setNameOfAmericanoBean(String nameOfAmericanoBean) {
        this.nameOfAmericanoBean = nameOfAmericanoBean;
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

    public Double getPriceOfAmericano() {
        return priceOfAmericano;
    }

    public void setPriceOfAmericano(Double priceOfAmericano) {
        this.priceOfAmericano = priceOfAmericano;
    }

    @Override
    public String toString() {
        return "Americano{" +
                "nameOfAmericanoBean:' " + nameOfAmericanoBean + '\'' +
                ", waterQuantity=" + super.getWaterQuantity() +
                ", sugarQuantity: " + sugarQuantity +
                ", milkQuantity: " + milkQuantity +
                ", priceOfAmericano: " + priceOfAmericano +
                '}';
    }

}
