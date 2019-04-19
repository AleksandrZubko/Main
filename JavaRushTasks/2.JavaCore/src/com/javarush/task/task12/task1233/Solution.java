package com.javarush.task.task12.task1233;

/* 
Изоморфы наступают
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Index of minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        //напишите тут ваш код
        else {
            int min = array[0];
            int minInd = 0;
            for (int i = 0; i < array.length-1; i ++){
                    if (min > array[i+1]){
                        min = array[i+1];
                        minInd = i+1;
                    }
            }
            return new Pair<Integer, Integer>(min, minInd);
        }
    }

    public static class Pair<X, Y> { //generic (обопщение), Угловые скобки указывают, что параметр может быть обобщён
        public X x;  //здесь подставляется тип, который передаётся параметром в класс
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
