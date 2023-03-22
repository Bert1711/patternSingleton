import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Logger.getInstance().log("Program started");

        System.out.println("Hello! Please enter the size of the list:");
        int N = scanner.nextInt();
        Logger.getInstance().log("Size of list entered: " + N);

        System.out.println("Please enter the upper bound of the elements:");
        int M = scanner.nextInt();
        Logger.getInstance().log("Upper bound of elements entered: " + M);

        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int num = random.nextInt(M+1);
            list.add(num);
            Logger.getInstance().log("Added number to list: " + num);
        }

        System.out.println("Please enter the filter value:");
        int f = scanner.nextInt();
        Logger.getInstance().log("Filter value entered: " + f);

        Filter filter = new Filter(f);
        List<Integer> filteredList = filter.filterOut(list);

        System.out.println("Filtered list: " + filteredList.toString());

        Logger.getInstance().log("Program finished");
    }
}
