package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            Thread current = Thread.currentThread();
            if (countSeconds > 3){
                while (!current.isInterrupted()){
                    try {
                        if (countSeconds > 0){
                            System.out.print(countSeconds + " ");
                        }

                        Thread.sleep(500);
                        countSeconds --;
                        if (countSeconds == 0){
                            System.out.print("Прервано!");
                            current.interrupt();
                            return;
                        }
                        countSeconds ++;
                        Thread.sleep(500);
                        countSeconds --;

                    }catch (InterruptedException e){
                        System.out.print("Прервано!");
                        return;
                    }
                }
            }else {
                while (!current.isInterrupted()){
                    try {
                        if (countSeconds > 0){
                            System.out.print(countSeconds + " ");
                        }

                        Thread.sleep(500);
                        countSeconds --;
                        if (countSeconds == 0){
                            System.out.print("Марш!");
                            current.interrupt();
                            return;
                        }
                        countSeconds ++;
                        Thread.sleep(500);
                        countSeconds --;

                    }catch (InterruptedException e){
                        return;
                    }
                }
            }



        }
    }
}
