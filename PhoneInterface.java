import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

interface Camera {
    void clickPicture();

    void recordVideo();
}

interface Music {
    void playMusic(String song);

    void stopMusic();

    void addMusic(String song);
}

interface GPS {
    void turnOn();

    void turnOff();
}

interface Games {
    void showGames();

    void selectGame(String game);
}

interface Gallery {
    void showPicture(int picture);

    void deletePicture(int picture);
}

interface CellPhone {
    void callNumber(Long number);

    void addNumber(Long number);

    void pickUpCall();

    void hangUp();

    long[] phoneDiary = { 9977210610L, 9302520973L };

    public static int calcLength() {
        int length = 0;
        for (long num : CellPhone.phoneDiary) {
            length++;
        }
        return length;
    }
}

class SmartPhone implements Camera, Music, GPS, Games, Gallery, CellPhone {
    public void clickPicture() {
        System.out.println("Taking a picture...");
    }

    public void recordVideo() {
        System.out.println("Recording a video...");
    }

    public void playMusic(String song) {
        System.out.println("Playing " + song);
    }

    public void stopMusic() {
        System.out.println("Stopped the current music");
    }

    public void addMusic(String song) {
        System.out.println("Added " + song + " to the queue");
    }

    public void turnOn() {
        System.out.println("Turning on GPS");
    }

    public void turnOff() {
        System.out.println("Turning off GPS");
    }

    public void showGames() {
        String[] games = { "Valorant", "OSU", "CS:GO", "PUBG", "Overwatch" };
        for (String game : games) {
            System.out.print(game + " ");
        }
        System.out.println("");
    }

    public void selectGame(String game) {
        System.out.println("Now starting " + game.toUpperCase());
    }

    public void showPicture(int pos) {
        System.out.println("Showing picture number " + pos);
    }

    public void deletePicture(int pos) {
        System.out.println("Deleting picture number " + pos);
    }

    public void callNumber(Long number) {
        System.out.println("Calling number " + number + "...");
    }

    public void addNumber(Long number) {
        System.out.println("Adding number " + number + "...");
        int len = CellPhone.calcLength();
        CellPhone.phoneDiary[len] = number;
    }

    public void pickUpCall() {
        System.out.println("Picking up call...");
    }

    public void hangUp() {
        System.out.println("Hanging up...");
    }
}

public class PhoneInterface {
    public static void main(String[] args) {
        SmartPhone samsung = new SmartPhone();
        samsung.clickPicture();
        samsung.playMusic("Greatest Strength");
        samsung.turnOff();
        samsung.showGames();
        samsung.showPicture(3);
        samsung.callNumber(9977210610L);

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    }
}