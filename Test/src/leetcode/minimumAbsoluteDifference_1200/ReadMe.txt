Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.

Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows

    a, b are from arr
    a < b
    b - a equals to the minimum absolute difference of any two elements in arr

Учитывая массив различных целых чисел arr, найдите все пары элементов с минимальной абсолютной разностью любых двух элементов.

Возвращает список пар в порядке возрастания (относительно пар), каждая пара [a, b] следует

     а, б от arr
     а <б
     b - a равно минимальной абсолютной разности любых двух элементов в массив

Example 1:

Input: arr = [4,2,1,3]
Output: [[1,2],[2,3],[3,4]]
Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.
Объяснение: Минимальная абсолютная разница равна 1. Перечислите все пары с разностью, равной 1, в порядке возрастания.

Example 2:

Input: arr = [1,3,6,10,15]
Output: [[1,3]]

Example 3:

Input: arr = [3,8,-10,23,19,-4,-14,27]
Output: [[-14,-10],[19,23],[23,27]]



Constraints:

    2 <= arr.length <= 10^5
    -10^6 <= arr[i] <= 10^6

