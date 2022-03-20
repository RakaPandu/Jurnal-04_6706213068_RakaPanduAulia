package Tugas04;

import java.util.LinkedList;
import java.util.ListIterator;

public class DoublyLinkedList {
    static void removeWithJudul(LinkedList<MusicPlaylist> playerList, String remove) {
        playerList.remove (0); //udah bingung gimana caranya biar bisa milih dari judul lagu
    }
    public static void pilihan() {
        System.out.println("Menu :");
        System.out.println("1. Masukan Lagu");
        System.out.println("2. Hapus lagu");
        System.out.println("3. Playlist");
        System.out.println("4. Hentikan Program");
    }
    public static void print(LinkedList playerLists) {
        ListIterator<Object> iterator = playerLists.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            if (iterator.hasNext()) {
                System.out.print(" | ");
            }
        }
    }
}
