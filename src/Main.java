public class Main {
    public static void main(String[] args) {
        // Объявляем переменные для хранения начального счета и суммы пополнения
        int Balance = 600; // Начальный счет клиента
        int Amount = 5000; // Сумма пополнения

        // Проверяем, превысила ли сумма пополнения порог 1000 рублей
        if (Amount > 1000) {
            // Рассчитываем количество бонусных рублей
            int bonus = (Amount / 100) - 10;

            // Увеличиваем начальный счет на сумму пополнения и добавляем бонусы
            int finalBalance = Balance + Amount + bonus;

            // Выводим результат на экран
            System.out.println("Итоговый счет: " + finalBalance + " рублей");
            System.out.println("Количество бонусных рублей: " + bonus + " рублей");
        } else {
            // Если сумма пополнения не превышает 1000 рублей, бонусы не начисляются
            int finalBalance = Balance + Amount;

            // Выводим результат на экран
            System.out.println("Итоговый счет: " + finalBalance + " рублей");
            System.out.println("Количество бонусных рублей: 0 рублей");
        }
    }
}
