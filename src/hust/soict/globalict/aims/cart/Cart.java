package hust.soict.globalict.aims.cart;

import hust.soict.globalict.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
    // Đã dùng sẵn ObservableList cho JavaFX
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();

    public ObservableList<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    public void addMedia(Media media) {
        if (!itemsOrdered.contains(media)) itemsOrdered.add(media);
    }

    public void removeMedia(Media media) {
        itemsOrdered.remove(media);
    }
}