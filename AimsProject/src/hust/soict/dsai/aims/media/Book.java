package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>(); // Danh sách tác giả [cite: 65, 72]

    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost); // Gọi hàm khởi tạo của lớp cha Media
    }

    // Thêm tác giả vào danh sách nếu chưa tồn tại [cite: 80, 81]
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println("Đã thêm tác giả: " + authorName);
        } else {
            System.out.println("Tác giả này đã có mặt trong danh sách!");
        }
    }

    // Xóa tác giả khỏi danh sách nếu có tồn tại [cite: 80, 82]
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Đã xóa tác giả: " + authorName);
        } else {
            System.out.println("Không tìm thấy tác giả này để xóa!");
        }
    }

    @Override
    public String toString() {
        return "Sách - ID: " + getId() + " - " + getTitle() + " - Thể loại: " + getCategory() + " - Tác giả: " + authors.toString() + " - Giá: " + getCost() + " $";
    }
}