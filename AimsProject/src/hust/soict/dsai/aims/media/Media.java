package hust.soict.dsai.aims.media;

import java.util.Comparator;

public abstract class Media {
    private int id; // Thuộc tính id chung [cite: 102]
    private String title; // Thuộc tính title chung [cite: 102]
    private String category; // Thuộc tính category chung [cite: 102]
    private float cost; // Thuộc tính cost chung [cite: 102]

    // Khai báo hai bộ so sánh Comparator làm hằng số của lớp [cite: 254, 256, 258]
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public float getCost() { return cost; }

    // Ghi đè hàm equals để so sánh các đối tượng Media theo tiêu đề [cite: 204, 212, 213]
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Media)) return false; // Kiểm tra tránh lỗi ép kiểu [cite: 217]
        Media media = (Media) obj; // Ép kiểu tham số truyền vào [cite: 215, 216]
        return this.title != null && this.title.equals(media.getTitle());
    }
}
