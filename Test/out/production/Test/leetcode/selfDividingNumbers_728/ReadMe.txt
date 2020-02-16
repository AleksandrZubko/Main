 A self-dividing number is a number that is divisible by every digit it contains.
For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
Also, a self-dividing number is not allowed to contain the digit zero.
Given a lower and upper number bound, output a list of every possible self dividing number,
including the bounds if possible.

Саморазделенное число - это число, которое делится на каждую содержащуюся в нем цифру.
Например, 128 - это число с собственным делением, потому что 128% 1 == 0, 128% 2 == 0 и 128% 8 == 0.
Также недопустимо, чтобы саморазделенное число содержало цифру ноль.
Учитывая нижнюю и верхнюю границу числа, выведите список всех возможных саморазделенных чисел,
включая границы, если это возможно.

Example 1:

Input:
left = 1, right = 22
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]

Note:
The boundaries of each input argument are 1 <= left <= right <= 10000.