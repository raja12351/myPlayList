// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Albums album1 = new Albums("Gloria" , "Sam smith");
        album1.addSongs(new Songs("Unholy","Sam Smith",3));
        album1.addSongs(new Songs("Perfect","Sam Smith",2));
        album1.addSongs(new Songs("Gloria","Sam Smith",4));

        Albums album2 = new Albums("Honestly Nevermind" , "Drake");
        album2.addSongs(new Songs("Her Loss","Drake",3));
        album2.addSongs(new Songs("Views","Drake",3));
        album2.addSongs(new Songs("Take Care","Drake",2));

        PlayList myPlayList = new PlayList("myPlayTime");
        myPlayList.addSongFromAlbum(album1 , "Unholy");
        myPlayList.addSongFromAlbum(album1 , "Perfect");
        myPlayList.addSongFromAlbum(album2 , "Her Loss");
        myPlayList.addSongFromAlbum(album2 , "Take Care");

        System.out.println(myPlayList.currentSong());
        System.out.println(myPlayList.playNext());
        System.out.println(myPlayList.playNext());
        System.out.println(myPlayList.currentSong());
        System.out.println(myPlayList.playPrevious());
        System.out.println(myPlayList.playNext());
    }
}