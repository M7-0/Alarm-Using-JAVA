import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // JAVA ALARM CLOCK:
        Scanner kb = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String path = "C:\\Users\\mohdk\\IdeaProjects\\NormalJava\\Alarm\\mus.wav";

        while (alarmTime == null) {
            try {
                System.out.print("Enter the alarm time (HH:MM:SS): ");
                String inputTime = kb.nextLine();
                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for " + alarmTime);

            } catch (DateTimeParseException e) {
                System.out.println("Invalid format. use a correct format of (HH:MM:SS)");

            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime,path , kb);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();



    }
}
