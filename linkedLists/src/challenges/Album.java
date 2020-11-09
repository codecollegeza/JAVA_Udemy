package challenges;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private final String name;
    private final ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    private Song findSong(String title) {
        for (Song track : songs) {
            if (track.getTitle().equals(title)) {
                return track;
            }
        }
        return null;
    }

    public void addSong(String title, double duration) {
        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
        } else {
            System.out.println("A song with that name already exists in the album.");
        }
    }

    public void addToPlaylist(String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
        } else {
            System.out.println(title + " is not in the album");
        }
    }
}
