package folderSearch;

import java.io.File;

public class Tools {
    public boolean folderSearch (String path, String folderName) {
        File f = new File(path+folderName);
        if (f.isDirectory()) {
            f.lastModified();
            return true;
        } else {
            return false;
        }

    }
}
