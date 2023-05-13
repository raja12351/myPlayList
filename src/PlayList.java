import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

public class PlayList {
    private String title;
    private List<Songs> songs;
    private boolean wasNext = false;
    private ListIterator<Songs> itr;

    public PlayList(String title) {
        this.title = title;
        this.songs = new ArrayList<>();
        itr = songs.listIterator();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Songs> getSongs() {
        return songs;
    }
    public String addSongFromAlbum(Albums album , String songName){
        Optional<Songs> songInAlbum = album.searchSongs(songName);
        if(songInAlbum.isEmpty()){
            return "Song is not found in album";
        }
        this.songs.add(songInAlbum.get());
        itr = songs.listIterator();
        return "Song added successfully";
    }
    public String playNext(){
        if(!wasNext){
            wasNext = true;
            itr.next();
        }
        if(itr.hasNext()){
            wasNext = true;
            Songs song = itr.next();
            return "Next song is" + song;
        }
        return "No more songs here!";
    }
    public String playPrevious(){
        if(wasNext){
            wasNext = false;
            itr.previous();
        }
        if(itr.hasPrevious()){
            wasNext = false;
            Songs song = itr.previous();
            return "Previous song is" + song;
        }
        return "No more songs here!";
    }
    public String currentSong(){
        if(wasNext){
            wasNext = false;
            return "current song is" + itr.previous();
        }
        wasNext = true;
        return "current song is "+itr.next();
    }
}
