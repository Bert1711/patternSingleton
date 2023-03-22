import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Logger {
    private static Logger instance = null;
    private int num = 1;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String msg) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("[" + formatter.format(dateTime) + " " + num + "] " + msg);
        num++;
    }
}