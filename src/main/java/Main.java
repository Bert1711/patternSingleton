import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        Scanner scanner = new Scanner(System.in);
        logger.log("Просим пользователя ввести входные данные для списка ");
        System.out.println("Введите размер списка:");
        int n = scanner.nextInt();
        logger.log("Установлен размер списка: " + n);
        System.out.println("Введите верхнюю границу для значений:");
        int m = scanner.nextInt();
        logger.log("Установлена верхняя граница для значения: " + m);
        logger.log("Создаём и наполняем список");
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        System.out.print("Вот случайный список:");
        for (int i = 0; i < n; i++) {
            int num = random.nextInt(m +1);
            list.add(num);
            System.out.print(num+" ");
        }
        System.out.println();
        logger.log("Просим пользователя ввести входные данные для фильтрации");

        System.out.println("Введите порог для фильтра:");
        int f = scanner.nextInt();
        logger.log("Установлен порог для фильтра: " + f);
        Filter filter = new Filter(f);
        logger.log("Запускаем фильтрацию");
        List<Integer> filteredList = filter.filterOut(list);

        System.out.println("Отфильтрованный список: " + filteredList.toString());

        logger.log("Завершаем программу");
    }
}
