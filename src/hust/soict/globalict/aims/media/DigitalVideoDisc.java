package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Media implements Playable {
    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }
    @Override
    public void play() {
        System.out.println("Đang phát DVD: " + this.getTitle());
    }
}