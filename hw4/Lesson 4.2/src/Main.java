import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("****\tКалькулятор для расчета суммы, разности и частого\t****");
        System.out.println("****\t\t\tВыберите категорию исчисления\t\t\t\t****");
        System.out.println("****\t\t\t\t\t1 --- Сумма\t\t\t\t\t\t\t****");
        System.out.println("****\t\t\t\t\t2 --- Разность\t\t\t\t\t\t****");
        System.out.println("****\t\t\t\t\t3 --- Частное\t\t\t\t\t\t****");
        int button = new Scanner(System.in).nextInt();
        if(button == 1){
            System.out.println("****\t\t\t\t\tКатегория: \"Сумма\t\t\t\t\t****");
            System.out.println("****\t\t\t\tВведите первое число:\t\t\t\t\t****");
            int firstNumber = new Scanner(System.in).nextInt();
            System.out.println("****\t\t\t\tВведите второе число:\t\t\t\t\t****");
            int secondNumber = new Scanner(System.in).nextInt();
            System.out.println("****\t\t\t\t\t\tРезультат:\t\t\t\t\t\t****");
            System.out.println(firstNumber + " " + "+" + " " +  secondNumber + " " + "=" + " " + (firstNumber+secondNumber));

        } else if(button>3||button<1) {
            System.out.println("****\t\t\t\tВы ввели неверную категорию!\t\t\t\t\t****\n****\t\tПерезапустите приложение и введите верную категорию\t\t****");
        }

        if(button == 2){
            System.out.println("****\t\t\t\tКатегория: \"Разность\"\t\t\t\t\t****");
            System.out.println("****\t\t\t\tВведите первое число:\t\t\t\t\t****");
            int firstNumber = new Scanner(System.in).nextInt();
            System.out.println("****\t\t\t\tВведите второе число:\t\t\t\t\t****");
            int secondNumber = new Scanner(System.in).nextInt();
            System.out.println("****\t\t\t\t\t\tРезультат:\t\t\t\t\t\t****");
            System.out.println(firstNumber + " " + "-" + " " +  secondNumber + " " + "=" + " " + (firstNumber-secondNumber));
        }
        if(button == 3){
            System.out.println("****\t\t\t\tКатегория: \"Частное\"\t\t\t\t\t****");
            System.out.println("****\t\t\t\tВведите первое число:\t\t\t\t\t****");
            int firstNumber = new Scanner(System.in).nextInt();
            System.out.println("****\t\t\t\tВведите второе число:\t\t\t\t\t****");
            int secondNumber = new Scanner(System.in).nextInt();
            System.out.println("****\t\t\t\t\t\tРезультат:\t\t\t\t\t\t****");
            System.out.println(firstNumber + " " + "/" + " " +  secondNumber + " " + "=" + " " + (firstNumber/secondNumber));
        }
    }
}