package academy.mindswap;

import static academy.mindswap.Messages.*;

public class MorningRadio {

    private int maxOfSongsPerDay = 10;
    private int numberOfSongsPlayed;
    private Weekday dayOfWeek;
    private HostType hostType;

    public void turnOn(HostType host, Weekday day){
        numberOfSongsPlayed = 0;
        dayOfWeek = day;
        hostType = host;
    }

    public void live(){

        if(hostType == HostType.TALKER){
            maxOfSongsPerDay /= 2;
        }

        while(numberOfSongsPlayed < maxOfSongsPerDay){
            if(numberOfSongsPlayed % 2 == 0 && numberOfSongsPlayed != 0){
                commercialBreak();
            }
            playSong(dayOfWeek);
        }

        turnOff();
    }
    private void playSong(Weekday day){

        numberOfSongsPlayed++;

        switch(day) {
            case MONDAY -> System.out.println(SONG_FOR_MONDAY);
            case TUESDAY -> System.out.println(SONG_FOR_TUESDAY);
            case WEDNESDAY -> System.out.println(SONG_FOR_WEDNESDAY);
            case THURSDAY -> System.out.println(SONG_FOR_THURSDAY);
            case FRIDAY -> System.out.println(SONG_FOR_FRIDAY);
            case SATURDAY -> System.out.println(SONG_FOR_SATURDAY);
            default -> System.out.println(SONG_FOR_SUNDAY);
        }
    }

    private void turnOff(){
        System.out.println("That's it for today, thank you for listening!");
    }

    private void commercialBreak(){
        System.out.println("Sorry, we have to stop for a commercial break");
    }

}
