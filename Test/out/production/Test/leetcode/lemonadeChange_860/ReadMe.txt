At a lemonade stand, each lemonade costs $5.

Customers are standing in a queue to buy from you, and order one at a time (in the order specified by bills).

Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill.  You must provide the correct change to each customer, so that the net transaction is that the customer pays $5.

Note that you don't have any change in hand at first.

Return true if and only if you can provide every customer with correct change.



Example 1:

Input: [5,5,5,10,20]
Output: true
Explanation:
From the first 3 customers, we collect three $5 bills in order.
From the fourth customer, we collect a $10 bill and give back a $5.
From the fifth customer, we give a $10 bill and a $5 bill.
Since all customers got correct change, we output true.

Example 2:

Input: [5,5,10]
Output: true

Example 3:

Input: [10,10]
Output: false

Example 4:

Input: [5,5,10,10,20]
Output: false
Explanation:
From the first two customers in order, we collect two $5 bills.
For the next two customers in order, we collect a $10 bill and give back a $5 bill.
For the last customer, we can't give change of $15 back because we only have two $10 bills.
Since not every customer received correct change, the answer is false.



Note:

    0 <= bills.length <= 10000
    bills[i] will be either 5, 10, or 20.

На стенде с лимоном каждый лимонад стоит 5 долларов.

Клиенты стоят в очереди, чтобы покупать у вас, и заказывать по одному (в порядке, указанном в счетах).

Каждый покупатель покупает только один лимонад и оплачивает счет на 5, 10 или 20 долларов. Вы должны предоставить правильное изменение каждому клиенту,
чтобы чистая транзакция заключалась в том, что клиент платит 5 долларов США.

Обратите внимание, что у вас нет никаких изменений в руке на первых порах.

Верните true, если и только если вы можете предоставить каждому клиенту правильные изменения.



Пример 1:

Вход: [5,5,5,10,20]
Вывод: правда
Объяснение:
С первых трех клиентов мы получаем три счета по 5 долларов.
От четвертого клиента мы получаем счет в 10 долларов и возвращаем 5 долларов.
От пятого клиента мы даем счет в 10 долларов и 5 долларов.
Поскольку все клиенты получили правильные изменения, мы выводим true.

Пример 2:

Вход: [5,5,10]
Вывод: правда

Пример 3:

Вход: [10,10]
Выход: ложь

Пример 4:

Вход: [5,5,10,10,20]
Выход: ложь
Объяснение:
С первых двух заказчиков мы получаем два счета по 5 долларов.
Для следующих двух заказчиков мы собираем счет на 10 долларов и возвращаем счет на 5 долларов.
Последнему клиенту мы не можем вернуть сдачу в размере 15 долларов, потому что у нас всего два счета по 10 долларов.
Поскольку не каждый клиент получил правильное изменение, ответ неверен.



Заметка:

    0 <= bills.length <= 10000
    счета [я] будет 5, 10 или 20.