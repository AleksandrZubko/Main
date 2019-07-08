package createXML;

public class ValidatorParam {

    public boolean checkDate (String dt) {
        String dtFin = null;
        if (dt.length() == 8){
            dtFin = dt;
        } else if (dt.length() == 10) {
            if (!dt.substring(4,5).equals("-") || !dt.substring(7,8).equals("-")){
                return false;
            } else {
                dtFin = dt.substring(0,4) + dt.substring(5,7) + dt.substring(8);
            }
        }
        for (int i = 0; i < dtFin.length(); i ++) {
            char c = dtFin.charAt(i);
            if (!Character.isDigit(c)){
                return false;
            }
        }
        if (Integer.parseInt(dtFin.substring(4,6)) > 12){
            return false;
        } else if (Integer.parseInt(dtFin.substring(6,8)) > 31) {
            return false;
        }

        return true;
    }
}
