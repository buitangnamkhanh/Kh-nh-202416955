package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    public DigitalVideoDisc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost, length, director);
    }

    @Override
    public void play() {
        if (this.getLength() > 0) { // Kiểm tra thời lượng đĩa [cite: 53]
            System.out.println("Playing DVD: " + this.getTitle()); // [cite: 52, 158]
            System.out.println("DVD length: " + this.getLength()); // [cite: 52, 159]
        } else {
            System.out.println("Thông báo: DVD '" + this.getTitle() + "' không thể phát!"); // [cite: 53]
        }
    }

    @Override
    public String toString() {
        return "DVD - ID: " + getId() + " - " + getTitle() + " - Thể loại: " + getCategory() + " - Đạo diễn: " + getDirector() + " - Thời lượng: " + getLength() + " phút - Giá: " + getCost() + " $";
    }
}