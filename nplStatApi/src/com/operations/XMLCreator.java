package com.operations;

import java.util.ArrayList;

public class XMLCreator {
    private ArrayList<DataNPL> listNLP = null;
    public String result = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";

    public XMLCreator(ArrayList<DataNPL> listNLP) {
        this.listNLP = listNLP;
    }

    public String getXML() {
        result += "<data>";
        for (DataNPL val : listNLP) {
            result += "<row>";
            result += "<column id=\"DATE_CALC\">" + val.getDateCalc() + "</column>";
            result += "<column id=\"RP\">" + val.getRp() + "</column>";
            result += "<column id=\"GRAPH_VALUE\">" + val.getGraphValue() + "</column>";
            result += "</row>";
        }
        result += "</data>";
        return result;
    }
}
