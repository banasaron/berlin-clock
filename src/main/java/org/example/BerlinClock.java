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
    public String returnBerlinClock(){
        return returnSeconds()+" "+returnHours()+" "+returnMinutes();
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
        StringBuilder firstHoursString = new StringBuilder();
        StringBuilder secondHoursString = new StringBuilder();
        for(int i=0; i<firstHours; i++){
            firstHoursString.append("R");
        }
        for(int i=0; i<secondHours; i++){
            secondHoursString.append("R");
        }
        for(int i=0; i<4-firstHours; i++){
            firstHoursString.append("O");
        }
        for(int i=0; i<4-secondHours; i++){
            secondHoursString.append("O");
        }
        return firstHoursString+" "+secondHoursString;
    }
    private String returnMinutes(){
        int minutes = Integer.parseInt(this.minutes);
        int firstMinutes = 0;
        int secondMinutes = 0;
        while(minutes>12){
            firstMinutes++;
            minutes-=12;
        }
        secondMinutes = minutes%12;
        StringBuilder firstMinutesString = new StringBuilder();
        StringBuilder secondMinutesString = new StringBuilder();
        for(int i=0; i<firstMinutes; i++){
            if(i%3==0){
                firstMinutesString.append("Y");
            }else{
                firstMinutesString.append("R");
            }


        }
        for(int i=0; i<secondMinutes; i++){
            secondMinutesString.append("Y");
        }
        for(int i=0; i<12-firstMinutes; i++){
            firstMinutesString.append("O");
        }
        for(int i=0; i<4-secondMinutes; i++){
            secondMinutesString.append("O");
        }
        return firstMinutesString+" "+secondMinutesString;
    }

}
