package Inkapsulation;
/*
#### Задача 1: Банковский счет
Создайте класс `BankAccount`, который инкапсулирует баланс счета.
 Баланс не должен быть доступен для прямого изменения извне,
 а изменяться только с помощью методов `deposit` (для внесения средств)
 и `withdraw` (для снятия средств).

 */
public class BankAccount {
    private double Balance;
    public void withdraw(double minus){
        Balance=Balance-minus;

    }
    public void deposit(double add){
        Balance=Balance+add;

    }

}
