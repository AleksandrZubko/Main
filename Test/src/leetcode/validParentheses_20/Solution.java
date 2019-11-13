package leetcode.validParentheses_20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    // Hash table that takes care of the mappings.
    private HashMap<Character, Character> mappings;

    // Initialize hash map with mappings. This simply makes the code easier to read.
    public Solution() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    public boolean isValid(String s) {

        // Инициализируйте стек, который будет использоваться в алгоритме.
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Если текущий символ является закрывающей скобкой
            if (this.mappings.containsKey(c)) {

                // Получить верхний элемент стека. Если стек пуст, установите фиктивное значение '#'
                char topElement = stack.empty() ? '#' : stack.pop();

                // Если отображение для этой скобки не соответствует верхнему элементу стека, верните false.
                if (topElement != this.mappings.get(c)) {
                    return false;
                }
            } else {
                // Если это была открывающая скобка, добавим в стек.
                stack.push(c);
            }
        }

        // Если стек все еще содержит элементы, то это недопустимое выражение.
        return stack.isEmpty();
    }
}
