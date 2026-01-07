package org.example;

public class BerlinClock {
    private String clock;
    private String seconds;
    private String minutes;
    private String hours;

    public BerlinClock(String clock) {
        this.clock = clock;
        String[] arr = this.clock.split(":");
        this.seconds = arr[2];
        this.minutes = arr[1];
        this.hours = arr[0];
    }
    private String returnSeconds(){
        return Integer.parseInt(this.seconds)%2==0 ? "Y" : "O";
    }
    private String returnHours(){
        int hours = Integer.parseInt(this.hours);
        int firstHours = 0;
        int secondHours = 0;
        while(hours>5){
            firstHours++;
            hours-=5;
        }
        secondHours = hours%5;
        String firstHoursString = 
    }

}
