package Homework.From_31_07_23;

import java.util.Random;
import java.util.Scanner;

public class Questionnaire {
//    Задание:
//    Написать опросник, который спрашивает пользователя суммы двух случайно сгенерированных чисел до тех пор,
//    пока пользователь не введёт правильный ответ.
//1) Создать класс Main, метод main.
//            2) Создать цикл на усмотрение(while, do-while, for).
//            3) На каждой итерации генерировать два случайных int-числа, опрашивать пользователя, и если он
//            ведёт правильное значение, выходить из цикла.
//    На каждой итерации пользователю должно выводиться сообщение следующего содержания:
//            "Ваш ответ: {ответ_пользователя} . Правильный ответ: {правильный ответ на сумму случайных чисел}"
//    По завершению цикла(пользователь ввёл правильный ответ) пользователю должно вывестись сообщение следующего содержания:
//            "Ура! Опросник завершён! Вы победили!"

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int num1;
        int num2;
        int userAnswer;
        int correctAnswer;


        num1 = random.nextInt(1, 100) + 1;
        num2 = random.nextInt(1, 100) + 1;
        correctAnswer = num1 + num2;


        System.out.println("Добро пожаловать в опросник!");
        System.out.println("Число: " + (int) num1);
        System.out.println("к этому числу прибавить: " + (int) num2);


        do {
            System.out.print("Ваш ответ: ");
            userAnswer = sc.nextInt();

            System.out.println("Ваш ответ: " + userAnswer + ". Правильный ответ на сумму случайных чисел: " + correctAnswer);
        } while (userAnswer != correctAnswer);

        System.out.println("Ура! Опросник завершён! Вы победили!");


    }
}










