package com.epam.lab27.coffeeTask;

public class Cappucino extends Coffee {
    private String nameOfCappucinoBean;
    private Double sugarQuantity;
    private Double milkQuantity;
    private Double priceOfCappucino;

    public Cappucino() {
    }

    public Cappucino(Double waterQuantity, String nameOfCappucinoBean, Double sugarQuantity, Double milkQuantity, Double priceOfCappucino) {
        super(waterQuantity);
        this.nameOfCappucinoBean = nameOfCappucinoBean;
        this.sugarQuantity = sugarQuantity;
        this.milkQuantity = milkQuantity;
        this.priceOfCappucino = priceOfCappucino;
    }

    public String getNameOfCappucinoBean() {
        return nameOfCappucinoBean;
    }

    public void setNameOfCappucinoBean(String nameOfCappucinoBean) {
        this.nameOfCappucinoBean = nameOfCappucinoBean;
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

    public Double getPriceOfCappucino() {
        return priceOfCappucino;
    }

    public void setPriceOfCappucino(Double priceOfCappucino) {
        this.priceOfCappucino = priceOfCappucino;
    }

    @Override
    public String toString() {
        return "Cappucino{" +
                "nameOfCappucinoBean:' " + nameOfCappucinoBean + '\'' +
                ", waterQuantity=" + super.getWaterQuantity() +
                ", sugarQuantity: " + sugarQuantity +
                ", milkQuantity: " + milkQuantity +
                ", priceOfCappucino: " + priceOfCappucino +
                '}';
    }
}
