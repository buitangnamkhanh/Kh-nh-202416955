package hust.soict.globalict.aims.screen;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.DigitalVideoDisc;

public class TestCartScreen {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addMedia(new DigitalVideoDisc("The Lion King", "Animation", 19.95f));
        cart.addMedia(new DigitalVideoDisc("Star Wars", "Sci-Fi", 24.95f));
        cart.addMedia(new DigitalVideoDisc("Aladdin", "Animation", 18.99f));

        new CartScreen(cart);
    }
}