package testBackup;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class BackupFiles {


     static List getDirectory(String path)
    {
        File f = new File(path);
        File[] fls = f.listFiles();
        java.util.List localList = new ArrayList();

        if (fls.length > 0)
        {
            for (int i = 0; i < fls.length; i++)
            {
                if (fls[i].isDirectory())
                {
                    localList.add(fls[i].getPath());
                    localList.addAll(getDirectory(fls[i].getPath()));
                }
            }
        }

        return localList;
    }
}
