package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media m1, Media m2) {
        int costCompare = Float.compare(m2.getCost(), m1.getCost()); // Giá giảm dần trước
        if (costCompare != 0) {
            return costCompare;
        }
        return m1.getTitle().compareTo(m2.getTitle()); // Trùng giá thì xếp theo Alphabet
    }
}