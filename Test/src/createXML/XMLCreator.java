package createXML;

import java.util.ArrayList;

public class XMLCreator {
    private ArrayList<DataNPL> listNLP = null;
    public String result = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
    public XMLCreator(ArrayList<DataNPL> listNLP) {
        this.listNLP = listNLP;
    }

    public String getXML (){
        result += "<data>";
        for (DataNPL val:listNLP) {
            result += "<row>";
            result += "<column id=\"DATE_CALC\">" + val.getDateCalc() + "</column>";
            result += "<column id=\"RP\">" + val.getRp() + "</column>";
            result += "<column id=\"MSB_ALL\">" + val.getMsbAll() + "</column>";
            result += "<column id=\"MSB_PROBL\">" + val.getMsbProbl() + "</column>";
            result += "<column id=\"MSB_NPL\">" + val.getMsbNpl() + "</column>";
            result += "<column id=\"CORP_ALL\">" + val.getCorpAll() + "</column>";
            result += "<column id=\"CORP_PROBL\">" + val.getCorpProbl() + "</column>";
            result += "<column id=\"CORP_NPL\">" + val.getCorpNpl() + "</column>";
            result += "</row>";
        }
        result += "</data>";
        return result;
    }
}
