package Tugas04;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<MusicPlaylist> playerList = new LinkedList<MusicPlaylist>();

        Scanner input = new Scanner(System.in);
        boolean keluaran = true;

        while (keluaran) {
            DoublyLinkedList.pilihan();
            switch (input.nextInt()) {
                case 1:
                    System.out.println("Masukkan judul lagu :");
                    String judulLagu = input.next();
                    System.out.println("Masukkan nama penyanyi :");
                    String namaPenyanyi = input.next();

                    playerList.addLast(new MusicPlaylist(judulLagu, namaPenyanyi));

                    break;
                case 2:
                    System.out.println("1.Hapus lagu terakhir");
                    System.out.println("2.Hapus berdasarkan judul");

                    if (input.nextInt() == 1) {
                        playerList.removeLast();
                    }
                    else {
                        System.out.println("Masukan judul :");
                        DoublyLinkedList.removeWithJudul(playerList, input.next());
                    }

                    break;
                case 3:
                    DoublyLinkedList.print(playerList);
                    System.out.println();

                    break;
                default:
                    keluaran = false;
                    break;
            }
        }
    }
}