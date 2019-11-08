package TestsForWork;

public class Tmp {
    public static void main(String[] args) {
        String in = "scripts/WEB/limitQueues/p48.bsh";
        String res = "\"scripts/WEB/LimitsSvcTimings/main.bsh, scripts/WEB/limitQueues/p48.bsh, scripts/WEB/limitQueues/odb.bsh\"";

        res = res.substring(1, res.length()-1);
        String[] resArr = res.split(", ");
        System.out.println(resArr.length);
        for (String s:
             resArr) {
            if(in.toUpperCase().equals(s.toUpperCase())){
                System.out.println(true);
                System.out.println(s);
                break;
            }
            System.out.println(s);
        }

    }
}
