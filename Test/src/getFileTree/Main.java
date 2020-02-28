package getFileTree;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "/home/DN230483ZAV2/Books/";
        Solution s = new Solution();
        List<String> list = s.getFileTree(path);
        for (String st: list) {
            System.out.println(st);
        }

    }
}
class Solution {
    public List<String> getFileTree(String root) throws IOException {
        File rootDir = new File(root);
        List<String> result = new ArrayList<>();
        Queue<File> fileTree = new PriorityQueue<>();

        Collections.addAll(fileTree, rootDir.listFiles());

        while (!fileTree.isEmpty()) {
            File currentFile = fileTree.remove();
            if (currentFile.isDirectory()) {
                Collections.addAll(fileTree, currentFile.listFiles());
            } else {
                result.add(currentFile.getAbsolutePath());
            }
        }
        return result;
    }
}
