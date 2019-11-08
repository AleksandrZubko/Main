package testAnnotate;

import java.lang.annotation.Inherited;

@Inherited //помечает аннотацию, которая будет унаследована потомком класса, отмеченного такой аннотацией

    //аннотация определяется описанием с ключевым словом interface
@interface PublicAnnotate { }

@interface PrivateAnnotate { }

@PublicAnnotate
@PrivateAnnotate

public class ParentClass {

}

//Класс ChildClass унаследует от родительского класса только аннотацию PublicAnnotate
class ChildClass extends ParentClass {

}
