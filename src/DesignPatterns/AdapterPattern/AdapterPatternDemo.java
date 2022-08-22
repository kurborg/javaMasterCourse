public class AdapterPatternDemo {
    
    public static void main(String[] args){
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp4", "Ice and Fire");
        audioPlayer.play("vlc", "Old School Blues");
        audioPlayer.play("mp3", "Hate it or Love it");
        audioPlayer.play("Sonos", "Road");
    }
}
