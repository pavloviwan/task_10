/**Задание №10:
 * Ввод/вывод данных для матрицы
   Произведите ввод данных с клавиатуры в матрицу,
   а после этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3.
   Размерность матрицы задается пользователем.
   */

import java.io.IOException;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] agrs) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк матрицы: ");
        int m = scanner.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println("Строка " + (i + 1) + ": ");
            for (int j = 0; j < n; j++) matrix[i][j] = scanner.nextInt();
        }
        System.out.println("Итоговая матрица: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }
        System.out.println("Результат:");
        for (int i = 0; i < n; i++) System.out.print(matrix[0][i] * 3 + "\t");
    }
}