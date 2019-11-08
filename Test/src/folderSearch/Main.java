package folderSearch;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
       Tools t = new Tools();
        System.out.println(t.folderSearch("/home/DN230483ZAV2/Рабочий стол/", "tmp/"));

        String s = "scripts/Ontime/daily_16_00.bsh";

        int indexPoint = s.lastIndexOf(".");
        String folderName = s.substring(0, indexPoint).replace('/','!') + s.substring(indexPoint);
        System.out.println(folderName);

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(c.DAY_OF_WEEK));

        if (c.get(c.DAY_OF_WEEK) == 1) {
            //startScript("scripts/RGL/dogonyalkaOntaymovPosleBackapa/dogonyalkaOntaymovPosleBackapa.bsh");
        }

    }
}
