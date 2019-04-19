package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        String nameGrandfa1 = "Витя";
        boolean sexGrandfa1 = true;
        int ageGrandfa1 = 70;

        String nameGrandfa2 = "Ваня";
        boolean sexGrandfa2 = true;
        int ageGrandfa2 = 71;

        String nameGrandma1 = "Анна";
        boolean sexGrandma1 = false;
        int ageGrandma1 = 68;

        String nameGrandma2 = "Нина";
        boolean sexGrandma2 = false;
        int ageGrandma2 = 69;

        String nameFather = "Валик";
        boolean sexFather = true;
        int ageFather = 46;

        String nameMother = "Надя";
        boolean sexMother = false;
        int ageMother = 45;

        String nameChild1 = "Саша";
        boolean sexChild1 = true;
        int ageChild1 = 25;

        String nameChild2 = "Света";
        boolean sexChild2 = false;
        int ageChild2 = 24;

        String nameChild3 = "Анжела";
        boolean sexChild3 = false;
        int ageChild3 = 23;

        Human Grandfa1 = new Human(nameGrandfa1, sexGrandfa1, ageGrandfa1, null, null);
        Human Grandfa2 = new Human(nameGrandfa2, sexGrandfa2, ageGrandfa2, null, null);
        Human Grandma1 = new Human(nameGrandma1, sexGrandma1, ageGrandma1, null, null);
        Human Grandma2 = new Human(nameGrandma2, sexGrandma2, ageGrandma2, null, null);
        Human Father = new Human(nameFather, sexFather, ageFather, Grandfa1, Grandma1);
        Human Mother = new Human(nameMother, sexMother, ageMother, Grandfa2, Grandma2);
        Human Child1 = new Human(nameChild1, sexChild1, ageChild1, Father, Mother);
        Human Child2 = new Human(nameChild2, sexChild2, ageChild2, Father, Mother);
        Human Child3 = new Human(nameChild3, sexChild3, ageChild3, Father, Mother);

        System.out.println(Grandfa1);
        System.out.println(Grandma1);
        System.out.println(Grandfa2);
        System.out.println(Grandma2);
        System.out.println(Father);
        System.out.println(Mother);
        System.out.println(Child1);
        System.out.println(Child2);
        System.out.println(Child3);
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        Human (String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
