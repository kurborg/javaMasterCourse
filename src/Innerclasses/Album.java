import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    public String name;
    public String artist;
    public SongList songList;

    private class SongList{
        private ArrayList<Song> songs;

        public SongList(){
            songs = new ArrayList<Song>();
        }

        public boolean addSong(Song song){
            if (songs.contains(song)){
                return false;
            }
            songs.add(song);
            return true;
        }

        public Song findSong(String title){
            for(Song song: this.songs){
                if(song.getTitle().equals(title)){
                    return song;
                }
            }
            return null;
        }

        public Song findSong(int trackNum){
            int index = trackNum -1;
            if(index > 0 && index < songs.size()){
                return songs.get(index);
            }

            return null;
        }

    }

    public boolean addSong(String title, double duration){
        return this.songList.addSong(new Song(title, duration));
    }

    Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songList = new SongList();
    }

    public boolean addToPlaylist(int trackNum, LinkedList<Song> playlist){
        
        Song checkedSong = this.songList.findSong(trackNum);

        if(checkedSong!= null){
            playlist.add(checkedSong);
            return true;
        }

        System.out.println("This album does not have a track " + trackNum);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist){

        Song checkedSong = this.songList.findSong(title);

        if(checkedSong!= null){
            playlist.add(checkedSong);
            return true;
        }

        System.out.println("The song " + title + " is not in this album");
        return false;   
    }
}
