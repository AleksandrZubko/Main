package createXML;

public class DataNPL {
    private String dateCalc;
    private String rp;
    private String msbAll;
    private String msbProbl;
    private String msbNpl;
    private String corpAll;
    private String corpProbl;
    private String corpNpl;

    public DataNPL(String dateCalc, String rp, String msbAll, String msbProbl, String msbNpl, String corpAll, String corpProbl, String corpNpl) {
        this.dateCalc = dateCalc;
        this.rp = rp;
        this.msbAll = msbAll;
        this.msbProbl = msbProbl;
        this.msbNpl = msbNpl;
        this.corpAll = corpAll;
        this.corpProbl = corpProbl;
        this.corpNpl = corpNpl;
    }

    public String getDateCalc() {
        return dateCalc;
    }

    public String getRp() {
        return rp;
    }

    public String getMsbAll() {
        return msbAll;
    }

    public String getMsbProbl() {
        return msbProbl;
    }

    public String getMsbNpl() {
        return msbNpl;
    }

    public String getCorpAll() {
        return corpAll;
    }

    public String getCorpProbl() {
        return corpProbl;
    }

    public String getCorpNpl() {
        return corpNpl;
    }

}
