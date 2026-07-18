import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable{

    private final LocalTime alarmTime;
    private final String path;
    private final Scanner kb;



    AlarmClock(LocalTime alarmTime , String path , Scanner kb){
        this.alarmTime = alarmTime;
        this.path = path;
        this.kb = kb;
    }

    @Override
    public void run(){

        while (LocalTime.now().isBefore(alarmTime)){
            try {
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();


                int hours = now.getHour();
                int minutes = now.getMinute();
                int seconds = now.getSecond();
                System.out.printf("\r%02d:%02d:%02d" , now.getHour(), now.getMinute(), now.getSecond());

            }
            catch (InterruptedException e) {
                System.out.println("Thread was Interrupted");;
            }
        }
        System.out.println("\n*Alarm noise*");
        playsound(path);
    }
    private void playsound(String path){
        File audioFile = new File(path);


        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            System.out.print("Press *ENTER* to stop the alarm: ");
            kb.nextLine();
            clip.close();
            kb.close();
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("Audio file format is not supported");

        }
        catch (LineUnavailableException e){
            System.out.println("Audio is unavailable");

        }
        catch (IOException e){
            System.out.println("Error reading audio file");
        }
    }
}
