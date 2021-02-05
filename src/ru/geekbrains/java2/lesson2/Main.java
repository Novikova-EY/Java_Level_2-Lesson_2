package ru.geekbrains.java2.lesson2;

public class Main {

    public static void main(String[] args) {
        String[][] array = {
                {"11", "12", "13", "14"},
                {"21", "22", "23", "24"},
                {"31", "32", "ff", "34"},
                {"41", "42", "43", "44"}
        };
        inputArray(array);
    }

    public static void inputArray(String[][] array) {
        try {
            int sum = 0;
            String[][] array44 = new String[4][4];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    try {
                        array44[i][j] = array[i][j];
                        sum = sum + Integer.parseInt(array44[i][j]);
                    } catch (NumberFormatException exc1) {
                        System.out.println("Неверный формат числа ячейки ["+ (i + 1) +","+ (j + 1) + "]");
                        return;
                    }
                }
            }
            System.out.println("Сумма всех элементов массива = " + sum);
        } catch (ArrayIndexOutOfBoundsException exc2) {
            System.out.println("Задан массив больше чем 4х4!");
        }
    }
}
