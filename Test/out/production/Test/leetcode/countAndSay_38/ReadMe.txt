The count-and-say sequence is the sequence of integers with the first five terms as following:

1.     1
2.     11
3.     21
4.     1211
5.     111221

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.

Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence. You can do so recursively, in other words from the previous member read off the digits, counting the number of digits in groups of the same digit.

Note: Each term of the sequence of integers will be represented as a string.

Последовательность подсчета и произнесения - это последовательность целых чисел с первыми пятью слагаемыми:

1. 1
2. 11
3. 21
4. 1211
5. 111221

1 читается как «один 1» или 11.
11 читается как «два 1» или 21.
21 читается как «один 2, затем один 1» или 1211.

Дано целое число n, где 1 ≤ n ≤ 30, сгенерировать n-й член последовательности подсчета и произнесения. Вы можете сделать это рекурсивно, другими словами, предыдущий участник считывает цифры,
считая количество цифр в группах из одной и той же цифры.

Примечание. Каждый член последовательности целых чисел будет представлен в виде строки.


Example 1:

Input: 1
Output: "1"
Explanation: This is the base case.

Example 2:

Input: 4
Output: "1211"
Explanation: For n = 3 the term was "21" in which we have two groups "2" and "1", "2" can be read as "12" which means frequency = 1 and value = 2,
the same way "1" is read as "11", so the answer is the concatenation of "12" and "11" which is "1211".

Пояснение: для n = 3 термин был «21», в котором у нас есть две группы «2» и «1», «2» можно читать как «12», что означает частоту = 1 и значение = 2,
так же, как «1» читается как «11», так что ответом является объединение «12» и «11», что означает «1211».