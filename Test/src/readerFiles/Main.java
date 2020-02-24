package readerFiles;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String sqlPath = "/home/DN230483ZAV2/Рабочий стол/всёТут/rtdm_main.request_log.response.out.sql";
        ReaderFiles reader = new ReaderFiles();
        System.out.println(reader.fileToString(sqlPath));
    }
}

class ReaderFiles {
    public String fileToString (String pathFile) {
        String res = "";
        StringBuilder resSB =new StringBuilder();
        try {
            FileReader r = new FileReader(pathFile);
            Scanner scan = new Scanner(r);
            while (scan.hasNext()) {
                resSB.append(scan.next() + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        res = resSB.toString();
        resSB.delete(0, resSB.length());
        return res;
    }
}
