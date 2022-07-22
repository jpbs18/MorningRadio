package academy.mindswap;

public class Main {

    public static void main(String[] args) {
        MorningRadio radio = new MorningRadio();

        radio.turnOn(HostType.LISTENER, Weekday.SUNDAY);
        radio.live();

        System.out.println("-------------------");

        radio.turnOn(HostType.TALKER, Weekday.TUESDAY);
        radio.live();


    }
}
