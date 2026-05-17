package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.Collections;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>(); // Lưu danh sách đa hình [cite: 179, 186]

    public void addMedia(Media media) { // [cite: 192]
        if (!itemsOrdered.contains(media)) {
            itemsOrdered.add(media);
            System.out.println("Đã gom mặt hàng '" + media.getTitle() + "' vào giỏ hàng.");
        } else {
            System.out.println("Sản phẩm này đã nằm trong giỏ hàng từ trước rồi!");
        }
    }

    public void removeMedia(Media media) { // [cite: 192]
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("Đã bỏ mặt hàng '" + media.getTitle() + "' ra khỏi giỏ hàng.");
        } else {
            System.out.println("Không thể xóa do sản phẩm không có trong giỏ hàng.");
        }
    }

    public float totalCost() { // [cite: 193]
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    public void sortByTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST); // Gọi bộ so sánh Title-Cost [cite: 260, 261]
    }

    public void sortByCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE); // Gọi bộ so sánh Cost-Title [cite: 260, 262]
    }

    public void printCart() {
        System.out.println("*********************** DANH SÁCH GIỎ HÀNG ***********************");
        for (Media m : itemsOrdered) {
            System.out.println(m.toString()); // Đa hình toString hoạt động tại đây [cite: 224, 236]
        }
        System.out.println("Tổng hóa đơn thanh toán hiện tại: " + totalCost() + " $");
        System.out.println("******************************************************************");
    }

    public void clear() {
        itemsOrdered.clear(); // Làm trống giỏ hàng sau khi đặt mua [cite: 339]
    }
}