public class Main {
    public static void main(String[] args) {
        // Объявляем переменные для хранения начального счета и суммы пополнения
        int balance = 100; // Начальный счет клиента
        int amount = 1100; // Сумма пополнения

        // Проверяем, превысила ли сумма пополнения порог 1000 рублей
        if (amount > 1000) {
            // Рассчитываем количество бонусных рублей
            int bonus = (amount / 100);

            // Увеличиваем начальный счет на сумму пополнения и добавляем бонусы
            int finalBalance = balance + amount + bonus;

            // Выводим результат на экран
            System.out.println("Итоговый счет: " + finalBalance + " рублей");
            System.out.println("Количество бонусных рублей: " + bonus + " рублей");
        } else {
            // Если сумма пополнения не превышает 1000 рублей, бонусы не начисляются
            int finalBalance = balance + amount;

            // Выводим результат на экран
            System.out.println("Итоговый счет: " + finalBalance + " рублей");
            System.out.println("Количество бонусных рублей: 0 рублей");
        }
    }
}
