import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private ArrayList<Song> songList;
    private String name;
    private String artist;

    Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        songList = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        if(findSongTitle(title) == null){
            this.songList.add(new Song(title, duration));
            return true;
        }else{
            return false;
        }
    }

    private Song findSongTitle(String title){
        for(Song song: this.songList){
            if(song.getTitle().equals(title)){
                return song;
            }
        }

        return null;
    }

    public boolean addToPlaylist(int trackNum, LinkedList<Song> playlist){
        int index = trackNum - 1;

        if(index >= 0 && index < this.songList.size()){
            playlist.add(this.songList.get(index));
            return true;
        }

        System.out.println("This album does not have a track " + trackNum);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist){
        Song checkedSong = findSongTitle(title);

        if(checkedSong!= null){
            playlist.add(checkedSong);
            return true;
        }

        System.out.println("The song " + title + " is not in this album");
        return false;   
    }
}
