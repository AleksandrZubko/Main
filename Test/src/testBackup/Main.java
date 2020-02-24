package testBackup;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String path = "/home/DN230483ZAV2/libJava/";
        java.util.List listResult = new ArrayList();
        BackupFiles t = new BackupFiles();
        listResult = t.getDirectory(path);
        for(Object s: listResult) {
            System.out.println(s);
        }

    }
}
