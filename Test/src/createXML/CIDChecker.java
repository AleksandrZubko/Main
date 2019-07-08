package createXML;

public class CIDChecker {
    public static boolean isBase64(String cid){
        String sidMod = cid.substring(0,6);
        for (int i = 0; i < sidMod.length(); i ++) {
            char c = sidMod.charAt(i);
            if (Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
}
