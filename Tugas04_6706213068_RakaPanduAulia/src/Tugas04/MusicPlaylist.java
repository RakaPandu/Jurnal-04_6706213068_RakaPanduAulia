package Tugas04;

public class MusicPlaylist {
    private String judulLagu;
    private String namaPenyanyi;

    public MusicPlaylist(String judulLagu,String namaPenyanyi){
        this.judulLagu = judulLagu;
        this.namaPenyanyi = namaPenyanyi;
    }

    public String getJudulLagu() {
        return judulLagu;
    }
    @Override
    public String toString() {
        return judulLagu + " (" + namaPenyanyi + ")";
    }
}
