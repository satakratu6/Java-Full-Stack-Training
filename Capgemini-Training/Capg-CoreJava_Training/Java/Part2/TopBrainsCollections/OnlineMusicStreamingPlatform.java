import java.util.*;

class Song {

    private String title;

    Song(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public int hashCode(){
        return Objects.hash(title.toLowerCase());
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Song)) return false;
        Song s = (Song)o;
        return title.equalsIgnoreCase(s.title);
    }

    public String toString(){
        return title;
    }
}

class Playlist {

    private String name;
    private Set<Song> songs;

    Playlist(String name){
        this.name = name;
        songs = new LinkedHashSet<>();
    }

    public void addSong(Song song){
        if(songs.add(song)){
            System.out.println(song + " added to " + name + " playlist.");
        }else{
            System.out.println(song + " is already in the playlist!");
        }
    }

    public void removeSong(Song song){
        if(songs.remove(song)){
            System.out.println(song + " removed from " + name + " playlist.");
        }else{
            System.out.println(song + " not found in playlist.");
        }
    }

    public void checkSong(Song song){
        if(songs.contains(song)){
            System.out.println(song + " exists in the playlist.");
        }else{
            System.out.println(song + " does not exist in the playlist.");
        }
    }

    public void displayPlaylist(){
        System.out.println("Playlist: " + name);
        for(Song s : songs){
            System.out.println(" - " + s);
        }
    }
}

public class OnlineMusicStreamingPlatform {

    public static void main(String[] args){

        Playlist playlist = new Playlist("My Favorites");

        Song s1 = new Song("Shape of You");
        Song s2 = new Song("Blinding Lights");
        Song s3 = new Song("Shape of You");

        playlist.addSong(s1);
        playlist.addSong(s2);
        playlist.addSong(s3);

        playlist.displayPlaylist();

        playlist.removeSong(s2);

        playlist.displayPlaylist();
    }
}
