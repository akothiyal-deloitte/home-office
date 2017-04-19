package com.deloitte.ho.application.model;

/**
 * Created by akothiyal on 19/04/2017.
 */
public class Circumstance {

    private String tenureInUk;
    private String nino;

    public Circumstance(){}

    public Circumstance(String tenureInUk, String nino){
        this.tenureInUk = tenureInUk;
        this.nino = nino;
    }

    public String getTenureInUk() {
        return tenureInUk;
    }

    public void setTenureInUk(String tenureInUk) {
        this.tenureInUk = tenureInUk;
    }

    public String getNino() {
        return nino;
    }

    public void setNino(String nino) {
        this.nino = nino;
    }
}
