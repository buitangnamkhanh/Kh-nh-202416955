package hust.soict.dsai.aims.media;

public class Track implements Playable {
    private String title; // Tên track [cite: 127]
    private int length; // Thời lượng track [cite: 127]

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() { return title; }
    public int getLength() { return length; }

    @Override
    public void play() {
        if (this.length > 0) { // Kiểm tra thời lượng hợp lệ [cite: 53]
            System.out.println("Đang phát track: " + this.title); // [cite: 51]
            System.out.println("Thời lượng track: " + this.length + " phút"); // [cite: 51]
        } else {
            System.out.println("Thông báo: Track '" + this.title + "' không thể phát do độ dài không hợp lệ!"); // [cite: 53]
        }
    }

    // Yêu cầu 10: Hai track bằng nhau nếu trùng cả tiêu đề và thời lượng [cite: 212, 214]
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Track)) return false;
        Track track = (Track) obj;
        return this.title != null && this.title.equals(track.title) && this.length == track.length;
    }
}