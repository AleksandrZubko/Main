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
    /**
     * Поиск файлов в указанной директории без рекурсии
     * @param root Директроия, в которой искать файлы
     * @return List<String> с абсолютными путями к файлам
     * @throws IOException Queue.remove() и File вызывает Exception
     */
    public List<String> getFileTree(String root) throws IOException {
        File rootDir = new File(root);
        List<String> result = new ArrayList<>();

        //Интерфейс Queue расширяет Collection
        Queue<File> fileTree = new PriorityQueue<>();  //PriorityQueue – это класс очереди с приоритетами, Элементу с наименьшим значением присваивается наибольший приоритет

        //получить коллекцию на базе массива
        Collections.addAll(fileTree, rootDir.listFiles());  //Метод Collections.addAll принимает на входе объект Collection и массив. Вместо массива также можно указать элементы через запятую

        while (!fileTree.isEmpty()) {
            File currentFile = fileTree.remove();  //удаляет элемент из головы очереди, возвращая его. Инициирует исключение NoSuchElementException, если очередь пуста
            if (currentFile.isDirectory()) {
                Collections.addAll(fileTree, currentFile.listFiles());
            } else {
                result.add(currentFile.getAbsolutePath());
            }
        }
        return result;
    }
}
