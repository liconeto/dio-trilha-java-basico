
import clock.Clock;

public class Main {
    public static void main(String[] args) throws Exception {
        Clock brlclock = new BRLClock;
        brlclock.setSecond(0);
        brlclock.setMinute(0);
        brlclock.setHour(25);

        System.out.println(brlclock.getTime());

        System.out.println(new USClock().convert(brlclock).getTime());
    }
}
