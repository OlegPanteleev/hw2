package hw2;

import java.util.Arrays;
import java.util.Random;

public class class1 {

    public static void main(String[] args) { //  главный метод  Main

        System.out.println("Task 1: "); // вывод номера задачи
        int [] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};  // создал массив  arr1 и проинициализировал значения его элементов
        for (int i = 0; i < arr1.length; i++) { // создал цикл for
            if (arr1[i] == 1) { // если значение элемента массива arr1 равно 1
                arr1[i] = 0; // тогда значению элемента массива arr1 присваиваем значение 0
            } else { // иначе значение элемента массива arr1 присваиваем значение 1
                arr1[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr1)); // вывод в консоль
        System.out.println(); // переход на следующую строку

        System.out.println("Task 2: "); // вывод номера задачи
        int [] arr2 = new int [8]; // создал массив arr2 с количеством элементов равное 8-ми
        int arrElement = 3; // создал вспомогательную переменную arrElement
        for (int i = 0; i < arr2.length; i++) { // создал цикл for
            arr2[i] = arrElement * i; /* очередному элементу массива arr2 присвоил значение переменной arrElement
            умноженную на i
            */
            System.out.println("arr2[" + i + "] = " + arr2[i]); // вывод в консоль
        }
        System.out.println(); // переход на следующую строку

        System.out.println("Task 3: "); // вывод номера задачи
        int [] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // создал массив arr3 и проинициализировал значения его элементов
        for (int i = 0; i < arr3.length; i++) { // создал цикл for
            if (arr3[i] < 6) { // если очередной элемент массив arr3 меньше 6-ти
                arr3[i] *= 3; // тогда его значение ужножем на 3
            }
        }
        System.out.println(Arrays.toString(arr3)); // вывод в консоль
        System.out.println(); // переход на следующую строку

        System.out.println("Task 4: "); // вывод номера задачи
        int [][] arr4 = new int[5][5]; // создал двумерный массив arr4 с количеством элементов 5 и 5
        for (int i = 0; i < arr4.length; i++){ // создал цикл for
            for (int j = 0; j < arr4[i].length; j++){ // создал цикл for внутри первого цикла for
                if (i == j || i + j == arr4.length - 1){ /* если очередной элемент i равен очередному элемннту j
                и сумму очередных элементов i и j равна длинне массива arr4 с вычетом 1 */
                    arr4[i][j] = 1; // элементам i и j двумерного массива arr4 присваиваем значение 1
                }
                System.out.print((arr4[i][j]) + " "); // вывод в консоль
            }
            System.out.println(); // переход на следующую строку
        }
        System.out.println(); // разделитель между третьей и четвертой задачей

        System.out.println("Task 5: "); // вывод номера задачи
        int [] arr5 = new int [7]; // создал массив arr2 с количеством элементов равное 7-ми
        Random random1 = new Random(); // создал переменную random1
        for (int i = 0; i < arr5.length; i++){ // создал цикл for
            arr5[i] = random1.nextInt(100); /* очередному элементу массива arr5 присваиваю значение переменной
            random1, которое равно от 0 до 99*/
            }
        System.out.println(Arrays.toString(arr5)); // вывод в консоль
        //System.out.println(); // переход на следующую строку

        int searchMax = 0; // создал переменную searchMax и присвоил ей значение 0
        int max = arr5[searchMax]; // создал переменную max и присвоил ей значение arr5[searchMax]
        for (int i = 0; i < arr4.length; i++){ // создал цикл for
            if (arr5[i] > max){ // если значение очередного элемента массива arr5 больше переменной max
                max = arr5[i]; // переменной max присваиваем значение очередного элемента массива arr5
            }
        }
        int searchMin = 0; // создал переменную searchMin и присвоил ей значение 0
        int min = arr5[searchMin]; // создал переменную min и присвоил ей значение arr5[searchMin]
        for (int i = 0; i < arr4.length; i++) { // создал цикл for
            if (arr5[i] < min) { // // если значение очередного элемента массива arr5 меньше переменной min
                min = arr5[i]; // переменной min присваиваем значение очередного элемента массива arr5
            }
        }
        System.out.printf("Максимальное число массива arr5: %d\n", max); // вывод в консоль
        System.out.printf("Минимальное число массива arr5: %d\n", min); // вывод в консоль
        System.out.println(); // переход на следующую строку







        }
    }
