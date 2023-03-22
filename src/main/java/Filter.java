import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Filter {
    private int f;

    public Filter(int f) {
        this.f = f;
    }
    public List<Integer> filterOut(List<Integer> list) {
        List<Integer> filteredList = new ArrayList<>();
        for (int num : list) {
            if (num >= f) {
                filteredList.add(num);
            } else {
                Logger.getInstance().log("Filtered out number: " + num);
            }
        }
        return filteredList;
    }
}





