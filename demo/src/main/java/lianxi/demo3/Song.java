package lianxi.demo3;

public class Song {
    String title;
    public Song(String t){
        title =t;
    }
    public  void play(){
        SoundPlayer player =new SoundPlayer();
        player.playSound(title);
    }


    private class SoundPlayer {
        void playSound(String title){
            Thread thread =new Thread();
            thread.start();

        }
    }

}
