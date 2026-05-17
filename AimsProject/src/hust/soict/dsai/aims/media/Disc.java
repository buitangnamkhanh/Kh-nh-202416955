package hust.soict.dsai.aims.media;

public class Disc extends Media {
    private int length; // Chiều dài đĩa
    private String director; // Đạo diễn đĩa

    public Disc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost); // Kế thừa thuộc tính từ lớp cha [cite: 122]
        this.length = length;
        this.director = director;
    }

    public int getLength() { return length; }
    public String getDirector() { return director; }
}