import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int counter = 100000;
            @Override
            public void run() {
                if (counter>0){
                    System.out.println(counter+" Seconds");
                    counter--;
                } else {
                    System.out.println("rah");
                    timer.cancel();
                }

            }
        };

//        timer.schedule(task, 2000);]


//        Calendar date = Calendar.getInstance();
//        date.set(Calendar.YEAR, 2023);
//        date.set(Calendar.MONTH, 9);
//        date.set(Calendar.DAY_OF_MONTH, 11);
//        date.set(Calendar.HOUR_OF_DAY, 15);
//        date.set(Calendar.MINUTE, 11);

//        timer.schedule(task, date.getTime());
        timer.scheduleAtFixedRate(task, 0, 1000);




    }

}
