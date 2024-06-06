package ru.volzhanin;

public class EuclideanAlgorithm {
    // Метод для нахождения наибольшего общего делителя
    public static int gcd(int a, int b) {
        // Применяем алгоритм Евклида
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        // На этом этапе 'a' содержит НОД
        return a;
    }

    public static int test(int a, int b){
        return gcd(a, b);
    }
}
