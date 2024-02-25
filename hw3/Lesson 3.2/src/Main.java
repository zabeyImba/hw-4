import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("****\tКонвертор Валют (актуальный курс 13.11.23)\t****");
        System.out.println("\t\tВведите кол-во рублей:");
        int R = new Scanner(System.in).nextInt();
        double $ = R*(1/92.12);
        double E = R*(1/98.53);
        System.out.println($ + " "+"Долларов");
        System.out.println(E + " "+"Евро");
    }
}