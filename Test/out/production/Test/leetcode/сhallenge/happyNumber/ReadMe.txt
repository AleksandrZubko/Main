Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer,
replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay),
or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Напишите алгоритм, чтобы определить, является ли число «счастливым».

Счастливое число - это число, определяемое следующим процессом: начиная с любого положительного целого числа,
замените число на сумму квадратов его цифр и повторяйте процесс до тех пор, пока число не станет равным 1 (где оно останется),
или он бесконечно повторяется в цикле, который не включает 1. Те числа, для которых этот процесс заканчивается в 1, являются счастливыми числами.

Example:

Input: 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
