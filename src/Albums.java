import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Albums {
    private String title;
    private String artist;
    private List<Songs> songs;

    public Albums(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public Albums(String title, String artist, List<Songs> songs) {
        this.title = title;
        this.artist = artist;
        this.songs = songs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<Songs> getSongs() {
        return songs;
    }
    private boolean findSong(Songs songToFind){
        for(Songs song : songs){
            if(song.getName().equals(songToFind.getName()) && song.getArtist().equals(songToFind.getArtist())){
                return true;
            }
        }
        return false;
    }
    public boolean findSong(String songName){
        for(Songs song : songs){
            if(song.getName().equals(songName) && song.getArtist().equals(songName)){
                return true;
            }
        }
        return false;
    }
    public String addSongs(Songs song){
        if(this.findSong(song)){
            return "Song already exists!";
        }
        songs.add(song);
        return "Songs Added!";
    }
    public Optional<Songs> searchSongs(String songName){
        for(Songs song : songs){
            if(song.getName().equals(songName)){
                return Optional.of(song);
            }
        }
        return Optional.empty();
    }
}
