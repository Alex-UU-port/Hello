import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nДля выхода из программы введите \"0\"\n");
        while(true) {
            System.out.println("Введите любое имя(текст):");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            if (str.equals("0")) {
                break;
            } else {
                System.out.println("Привет, " + str);
            }
        }
    }
}