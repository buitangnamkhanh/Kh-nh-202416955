package hust.soict.globalict.aims.screen;

import hust.soict.globalict.aims.store.Store;
import hust.soict.globalict.aims.media.DigitalVideoDisc;

public class TestStoreScreen {
    public static void main(String[] args) {
        Store store = new Store();

        // Thêm vài đĩa DVD vào kho để hiển thị lên màn hình
        store.addMedia(new DigitalVideoDisc("The Lion King", "Animation", 19.95f));
        store.addMedia(new DigitalVideoDisc("Star Wars", "Sci-Fi", 24.95f));
        store.addMedia(new DigitalVideoDisc("Aladdin", "Animation", 18.99f));
        store.addMedia(new DigitalVideoDisc("Harry Potter", "Fantasy", 20.00f));

        // Khởi chạy màn hình cửa hàng
        new StoreScreen(store);
    }
}