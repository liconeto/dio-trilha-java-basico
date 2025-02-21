import clock.Clock;

public non-sealed class USClock extends Clock {

    private String periodIndicator;

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setAfterMidday() {
        this.periodIndicator = "AM";
    }

    public void setBeforeMidday() {
        this.periodIndicator = "PM";
    }

    public void setHour(int hour) {
        setAfterMidday();

        if((hour >= 12) && (hour <= 23)) {
            setBeforeMidday();
            this.hour = hour - 12;
        }else if (hour >= 24) {
            this.hour = 0; 
        }else {
            this.hour = hour;
        }      
    }
 

    @Override
    Clock convert( Clock clock){
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
                
        switch (clock) {
            case USClock usClock -> {
                this.hour = usClock.getHour();
                this.periodIndicator = usClock.getPeriodIndicator();
            }             
            case BRLClock brlClock -> this.setHour(brlClock.getHour());
        }
        return this;
    }

    @Override
    public String getTime(){
        return super.getTime() +" "+this.periodIndicator;
    }


  
}
