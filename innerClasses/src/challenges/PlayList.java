package challenges;

import java.util.*;

public class PlayList {
    public final static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album album = new Album("Album 1");
        album.addSong("Song 1", 3.20);
        album.addSong("Song 2", 2.35);
        album.addSong("Song 3", 1.28);
        album.addSong("Song 4", 3.50);

        // adding the album to array list
        albums.add(album);

        // create new album with old reference
        album = new Album("Album 2");
        album.addSong("Song1OfAlbum2", 4.0);
        album.addSong("Song2OfAlbum2", 5.21);
        album.addSong("Song3OfAlbum2", 2.10);
        album.addSong("Song4OfAlbum2", 3.15);
        album.addSong("Song5OfAlbum2", 2.15);

        albums.add(album);

        // Creating linked list playlist
        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlaylist("Song 1", playList);
        albums.get(0).addToPlaylist("Song 3", playList);
        albums.get(1).addToPlaylist("Song2OfAlbum2", playList);
        albums.get(1).addToPlaylist("Song4OfAlbum2", playList);

        play(playList);
    }

    public static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("There are no songs in your playlist");
        } else {
            System.out.println("Now playing: " + listIterator.next().toString());
        }

        printMenu();

        while (!quit) {
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("The playlist has finished");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("The playlist is at the beginning");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("Reached the start of the playlist");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("Reached the end of the playlist");
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
                    if (playlist.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next().toString());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous().toString());
                        }
                    }
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" + "1 - play next song\n" + "2 - play previous song\n"
                + "3 - replay song\n" + "4 - list songs in playlist\n" + "5 - print menu\n"
                + "6 - delete current song");
    }

    public static void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.listIterator();
        System.out.println("===============");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("===============");
    }
}
