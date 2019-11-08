package testAnnotate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Аннотация @Target указывает, что именно мы можем пометить этой аннотацией, это может быть поле, метод, тип и т.д.
@Target(value= ElementType.METHOD)

//Аннотация @Retention позволяет указать жизненный цикл аннотации: будет она присутствовать только в исходном коде,
// в скомпилированном файле, или она будет также видна и в процессе выполнения
@Retention(value= RetentionPolicy.RUNTIME)

//аннотация определяется описанием с ключевым словом interface
public @interface StartObject {
}
