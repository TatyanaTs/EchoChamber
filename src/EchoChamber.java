import java.util.ArrayList;
import java.util.Scanner;

public class EchoChamber {
    static ArrayList<String> stringIn = new ArrayList<>();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String line;
        while (!(line = in.nextLine()).isEmpty()) {
            stringIn.add(line); //добавим в список введенную строку
        }
        for (Object o : stringIn) {
            System.out.println(o); //вывод объектов
        }
    }
}
