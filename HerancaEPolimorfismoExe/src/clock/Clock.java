package clock;

public sealed abstract  class Clock permits  BRLClock, USClock {

    protected int hour;
    protected int minute;
    protected int second;


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour >= 23){
            this.hour = 23;
            return;
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute >= 59){
            this.minute = 59;
            return;
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second >= 59){
            this.second = 59;
            return;
        }
        this.second = second;
    }

    private String format(int value){
        return value < 9 ? "0" + value : String.valueOf(value) ;
    }

    public String getTime(){
        return format(hour) +" : "+ format(minute) +" : "+ format(second) ;
    }

    abstract Clock convert(Clock clock);  

}
