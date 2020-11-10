package challenges;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private final String name;
    private final SongList songList = new SongList();

    public Album(String name) {
        this.name = name;
    }

    private class SongList {
        public final List<Song> songs = new ArrayList<>();

        private Song findSong(String title) {
            for (Song track : songs) {
                if (track.getTitle().equals(title)) {
                    return track;
                }
            }
            return null;
        }

        public void add(Song song) {
            if (songs.contains(song)) {
                System.out.println("This song already exists in the album.");
            } else {
                songs.add(song);
            }
        }
    }

    public void addSong(String title, double duration) {
        songList.add(new Song(title, duration));
    }

    public void addToPlaylist(String title, LinkedList<Song> playList) {
        Song checkedSong = songList.findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
        } else {
            System.out.println(title + " is not in the album");
        }
    }
}
