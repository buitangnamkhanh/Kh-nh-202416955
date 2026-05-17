package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>(); // [cite: 195]

    public void addMedia(Media media) { // [cite: 196]
        if (!itemsInStore.contains(media)) {
            itemsInStore.add(media);
            System.out.println("Hệ thống cửa hàng đã nhập kho mặt hàng: " + media.getTitle());
        }
    }

    public void removeMedia(Media media) { // [cite: 196]
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("Hệ thống cửa hàng đã xuất kho mặt hàng: " + media.getTitle());
        }
    }

    public void printStore() {
        System.out.println("==================== KHO HÀNG CỬA HÀNG AIMS ====================");
        for (Media m : itemsInStore) {
            System.out.println(m.toString());
        }
        System.out.println("===============================================================");
    }

    public Media searchByTitle(String title) {
        for (Media m : itemsInStore) {
            if (m.getTitle().equalsIgnoreCase(title)) {
                return m;
            }
        }
        return null;
    }
}