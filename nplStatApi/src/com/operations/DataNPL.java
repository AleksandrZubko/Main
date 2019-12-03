package com.operations;


public class DataNPL {
    private String dateCalc;
    private String rp;
    private String graphValue;


    public DataNPL(String dateCalc, String rp, String graphValue) {
        this.dateCalc = dateCalc;
        this.rp = rp;
        this.graphValue = graphValue;

    }

    public String getDateCalc() {
        return dateCalc;
    }

    public String getRp() {
        return rp;
    }

    public String getGraphValue() {
        return graphValue;
    }
}

