package Dop_Star;

import java.util.Scanner;

/*
    Базовая ставка для клиента — 10% годовых. Срок кредитования — 12 месяцев. Максимальный
ежемесячный платеж — 50% от ЗП. Если возраст меньше 23, то добавляем 1% к ставке.Если
возраст меньше 30, то добавляем 0.5% к ставке. Если зарплата больше 80_000, уменьшаем
ставку на 0.7%.
    Нам нужно написать программу для предварительного одобрения/отказа заявки по кредиту.
Вводные данные: используйте переменные age = 25 для обозначения возраста,salary = 60_000
для обозначения зарплаты,wantedSum = 330_000 для обозначения желаемой суммы кредита.
Подсчитайте и выведите ответ, одобрен кредит или нет. На основании зарплаты подсчитайте
максимальный допустимый платеж. Если максимальный допустимый платеж по ЗП больше
стандартного платежа по кредиту согласно процентной ставке, то кредит одобрен, если меньше
— отказан.
Пример ответа в консоль: «Максимальный платеж при ЗП * равен * рублей. Платеж по кредиту
*** рублей. Одобрено/отказано».
 */
public class CreditBank {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Ваше Имя: ");
        String Name = in.nextLine();       // Имя клиента;
        System.out.print(Name + ", укажите Ваш возраст (количество полных лет): ");
        int age = in.nextInt();            // Возраст клиента;
        if (age < 18) {
            System.out.println(Name + ", поешьте 'Растишку' и заходите ;)))");
            System.exit(0);
        }
        System.out.print(Name + ", укажите Вашу среднюю ежемесячную заработную плату: ");
        float salary = in.nextFloat();     // заработная плата клиента в руб./мес.;
        System.out.print(Name + ", на какую сумму вы бы хотели подзалететь: ");
        int wantedSum = in.nextInt();      // Сумма желаемого кредита;

        float BaseStavka = 10f;            // Базовая ставка, %;
        float FinishStavka;                // Ставка с учётом поправки (+0.5 или +1 и -0.7);
        float MaxMonthPayment = salary/2;  // Максимальный ежемесячный платёж;
        float CreditMonthPayment;          // Ежемесячный платёж по кредиту;
        System.out.println("**********************************");

        if (age >=18 && age < 23) {
            FinishStavka = (10 + 1);
        } else { if (age >= 23 && age < 30) {
            FinishStavka = (float) (10 + 0.5);
        } else {
            FinishStavka = BaseStavka;
        }
        }
        if (salary > 80000) {
            FinishStavka = (float) (FinishStavka-0.7);
        }
        CreditMonthPayment = (float) ((wantedSum + wantedSum*FinishStavka/100)/12);
        String CreditMonthPay = String.format("%.2f", CreditMonthPayment);

        if (MaxMonthPayment > CreditMonthPayment) {
            System.out.println(Name + ", Вам одобрен кредит на сумму " + wantedSum + " руб.");
            System.out.println("Ежемесячный платёж по кредиту составит " + CreditMonthPay + " руб./мес.");
            System.out.println("Максимальный платёж при зарплате " + salary + " руб. равен " +
                                MaxMonthPayment + " руб./мес.");
        } else {
            System.out.println(Name + ", в кредите - отказано. Радуйтесь !!!");
        }
    }
}
