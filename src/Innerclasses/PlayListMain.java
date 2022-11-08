import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class PlayListMain {

    private static ArrayList<Album> albums = new ArrayList<Album>();
    
    public static void main(String[] args) {

        Album album = new Album("Stormbringer", "Deep Purple");
       album.addSong("Stormbringer", 4.6);
       album.addSong("Love Don't mean a Thing", 3.6);
       album.addSong("Holy Man", 4.24);
       album.addSong("Hold On", 3.89);
       album.addSong("Lady Double Dealer", 2.64);
       album.addSong("You can't do it right", 3.21);

        albums.add(album); 

        album = new Album("For Those About to Rock", "ACDC");
       album.addSong("For Those About to Rock", 4.6);
       album.addSong("I Put the Finger on You", 3.6);
       album.addSong("Lets Go", 4.24);
       album.addSong("Inject the Venom", 3.89);
       album.addSong("SnowBalled", 2.64);
       album.addSong("Evil Walks", 3.21);

        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<>();
        albums.get(0).addToPlaylist("Holy Man", playlist);
        albums.get(0).addToPlaylist("Lady Double Dealer", playlist);
        albums.get(0).addToPlaylist(4, playlist);

        albums.get(1).addToPlaylist("Lets Go", playlist);
        albums.get(1).addToPlaylist(4, playlist);
        albums.get(1).addToPlaylist(0, playlist);
        albums.get(1).addToPlaylist("Evil Walks", playlist);
        albums.get(1).addToPlaylist(5, playlist);
        albums.get(1).addToPlaylist(7, playlist);

        play(playlist);

    }

    private static void play(LinkedList<Song> playlist){
        ListIterator<Song> listIterator = playlist.listIterator();
        Scanner scanner = new Scanner(System.in);
        
        boolean quit = false;
        boolean forward = true;

        if(playlist.size() == 0){
            System.out.println("No songs in playlist");
            return;
        } else{
            System.out.println("Now Playing: " + listIterator.next().toString());
        }

        printMenu();

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now Playing: " + listIterator.next().toString());
                    } else{
                        System.out.println("Reached end of playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }

                    if(listIterator.hasPrevious()){
                        System.out.println("Now Playing: " + listIterator.previous().toString());
                    } else{
                        System.out.println("Reached beginning of playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("At beginning of playlist");
                        }
                    } else {
                        if(listIterator.hasNext()){
                            System.out.println("Replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("At end of playlist");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.size() > 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next().toString());
                        } else if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous().toString());
                        }
                    }
                    break;

            }
        }
    }

    public static void printList(LinkedList<Song> playlist){

        Iterator<Song> iterator = playlist.iterator();
        System.out.println("============================");
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("============================");

    }

    public static void printMenu(){
        System.out.println("Menu Options: \n press");
        System.out.println("0 - Quit\n" + 
        "1 - Play next song\n" +
        "2 - Play previous song\n" +
        "3 - Replay current song\n" + 
        "4 - Print playlist\n" + 
        "5 - Print menu\n" +
        "6 - Delete current song");
    }
}
