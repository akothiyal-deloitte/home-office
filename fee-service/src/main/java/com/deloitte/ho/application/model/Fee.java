package com.deloitte.ho.application.model;

/**
 * Created by akothiyal on 19/04/2017.
 */
public class Fee {

    private Double amount;
    private String currency;

    public Fee(){}

    public Fee(Double amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Fee{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
