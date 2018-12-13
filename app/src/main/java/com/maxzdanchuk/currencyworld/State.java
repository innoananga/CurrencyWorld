package com.maxzdanchuk.currencyworld;

public class State {

    // Название
    private String name;
    // Ресурс флага
    private int flagResource;

    public State(String name, int flag){
        this.name = name;
        this.flagResource = flag;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlagResource() {
        return this.flagResource;
    }

    public void setFlagResource(int flagResource) {
        this.flagResource = flagResource;
    }

}
