public class AudioPlayer implements MediaPlayer {
    
    MediaAdapter mediaAdapter;

    public void play(String audioType, String filename){
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3. Song name: " + filename);
        }
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, filename);
        }

        else{
            System.out.println("Media type " + audioType + " is not supported");
        }
    }
}
