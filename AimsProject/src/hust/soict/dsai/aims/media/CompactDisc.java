package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist; // Ca sĩ [cite: 42, 133]
    private ArrayList<Track> tracks = new ArrayList<Track>(); // Bộ sưu tập bài hát [cite: 42, 134]

    public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist) {
        super(id, title, category, cost, length, director);
        this.artist = artist;
    }

    public String getArtist() { return artist; } // [cite: 135]

    // Thêm bài hát vào danh sách nếu chưa có trùng lặp [cite: 137, 138]
    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Đã thêm bài hát '" + track.getTitle() + "' vào đĩa CD.");
        } else {
            System.out.println("Bài hát '" + track.getTitle() + "' đã tồn tại trên hệ thống đĩa này!");
        }
    }

    // Xóa bài hát khỏi danh sách [cite: 137, 139]
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Đã xóa bài hát '" + track.getTitle() + "' khỏi đĩa CD.");
        } else {
            System.out.println("Không tồn tại bài hát này trong danh sách đĩa nhạc!");
        }
    }

    // Tổng thời lượng CD bằng tổng thời lượng các track con [cite: 44, 140, 141]
    @Override
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    @Override
    public void play() {
        if (this.getLength() > 0) {
            System.out.println("Đang phát đĩa CD nhạc: " + this.getTitle() + " - Nghệ sĩ: " + this.artist); // [cite: 50, 163]
            System.out.println("Tổng thời lượng toàn đĩa CD: " + this.getLength() + " phút");
            for (Track track : tracks) {
                track.play(); // Lần lượt chạy từng bài hát trong danh sách [cite: 50, 164]
            }
        } else {
            System.out.println("Thông báo: Không thể phát đĩa CD này vì không có bài hát nào hợp lệ!"); // [cite: 53]
        }
    }

    @Override
    public String toString() {
        return "CD - ID: " + getId() + " - " + getTitle() + " - Thể loại: " + getCategory() + " - Nghệ sĩ: " + artist + " - Số bài hát: " + tracks.size() + " - Giá: " + getCost() + " $";
    }
}