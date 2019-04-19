package Test_1;
//комментарии для javadoc, можно использовать html теги
/**<b>For tests</b>
 * @author Alex
 * @version 100500
 */


public class Test_1 {
   public static void main(String[] args) {
        Test_6 t = new Test_6();
        System.out.println(t.getSum(3, 4));
    }
}

//Комментарии к классам, Test_6 - имя класса. Вносится перед определением класса
/**
 objects Test_6 return sum two number
 */
class Test_6{
    //Комментарии к полям
    /**
     * Сумма
     */
    public int sum;
    //Комментарии к методам
    /**
     * @param a Первое число
     * @param b Второе число
     * @return sum Сумма двух чисел
     * @since version 100500
     * @see Test_6#sum
     */
    public int getSum(int a, int b){
        sum = a + b;
        return sum;
    }
}


