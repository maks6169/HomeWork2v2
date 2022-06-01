package ru.geekbrains.java2;

public class ArraySum {

    public int sum(String[][] arr) {
        if (arr.length != 4) throw new MyArraySizeException("Нужен массив 4 на 4");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException("Нужен массив 4 на 4");
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("В массиве есть не числовое значение в ячейке [%d] [%d] равное [%s] ", i + 1, j + 1, arr[i][j]));
                }
            }
        }
        System.out.println("Сумма = " + sum);
        return sum;
    }
}
