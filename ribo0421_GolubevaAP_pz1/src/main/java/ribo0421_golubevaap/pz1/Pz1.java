/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ribo0421_golubevaap.pz1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Pz1 {

    public static void main(String[] args) {
        //Вариант 3. Разработать программу по поиску четных и нечетных чисел в
//заданном диапазоне. Начальное и конечное значения диапазона должны быть
//трехзначными. Эти числа вводит пользователь с клавиатуры. Если
//пользователь ввел недопустимое значение числа, то необходимо отобразить
//сообщение об ошибке. При выполнении задания обязательно использовать
//цикл for.
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите начальное трёхзначное число");
        int start = scan.nextInt();
        System.out.println("Введите конечное трёхзначное число");
        int end = scan.nextInt();
        if (start<100 | start>999 | end<100 | end>999){
            System.out.println("Введено не трёхзначное число!");
            return;
        }
        if (start>end){
            System.out.println("Начальное число больше конечного!");
            return;
        }
        System.out.println("1-Найти чётные \n2-Найти нечётные \nВведите число");
        int inp = scan.nextInt();
        for (int i=start;i<=end;i++){
            if ((i%2)==0 & inp==1){
                System.out.println(i);
            }
            else if (inp==2){
                System.out.println(i); 
            }
        }
    }
}
