import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("****\tПрограмма по преобразованию градусов из Цельсий в Фаренгейты\t****");
        System.out.println("\t\t\tВведите значения температуры в Цельсиях: ");
        // Формула преобразования из Цельсий в Фаренгейты: (F = C * 1.8 + 32)
        int f= new Scanner(System.in).nextInt();
        double C =f*1.8+32;
        System.out.println("Текущая температура в Фаренгейтах:" + C);
    }
}