package Test_2;

/**
 * Created by it170692gda on 01.03.17.
 */
public class Point {
    private int x;
    private int y;
    private int color = 10;

    public void draw(){     //метод
        //тело
    }
    public Point(int c){    //конструктор
        color = c;
    }

    public Point(){         //перезагруженный конструктор

    }

    public void draw(int x, int y){ //перезагруженный метод
        //тело
    }

    public int getColor() {     //метод, который возвращает
        return color;
    }

    public void draw(long x, long y){   //перезагруженный метод

    }
}
