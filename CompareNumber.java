package Dop_Star;

import java.util.Scanner;
/*
Даны три числа: int one; int two; int free;
С помощью условного оператора и конструкции else напишите программу, которая вычисляет, какое из трех чисел большее,
а также принимает во внимание возможное равенство чисел в разных комбинациях и выводит результат в консоль.
 */
public class CompareNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число - ");
        int one = in.nextInt();
        System.out.print("Ввелите второе число - ");
        int two = in.nextInt();
        System.out.print("Введите третье число - ");
        int three = in.nextInt();

        if (one == two && one == three) {
            System.out.println("Все три числа равны. Max = " + one);
        }
        if (one == two && one > three) {
            System.out.println("Max число 1 и 2 - " + one);
        } else { if (one == two && one < three)
            System.out.println("Max число 3 - " + three);
        }
        if (one == three && one > two) {
            System.out.println("Max число 1 и 3 - " + one);
        } else { if (one == three && one < two)
            System.out.println("Max число 2 - " + two);
        }
        if (two == three && two > one) {
            System.out.println("Max число 2 и 3 - " + two);
        } else { if (two == three && two <one)
            System.out.println("Max число 1 - " + one);
        }
        if (one > two && one > three && two != three) {
            System.out.println("Max число 1 - " + one);
        } else {
            if (one > two && one < three) {
                System.out.println("Max число 3 - " + three);
            }
        }
        if (two > one && two > three && one != three) {
            System.out.println("Max число 2 - " + two);
        } else { if (two > one && two < three ) {
            System.out.println("Max число 3 - " + three);
        }
        }
    }
}
