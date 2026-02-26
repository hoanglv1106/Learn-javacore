package week1.OOP_Inheritance_and_Abstraction;

public class MusicPlayer implements Playable {
    private String name;
    public MusicPlayer(){}
    @Override
    public void play() {
        System.out.println("Playing music...");
    }

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.play();
    }
}
