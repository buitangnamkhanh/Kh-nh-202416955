package hust.soict.dsai.aims.media;

import java.util.Scanner;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Nạp trước dữ liệu ảo vào kho hàng để test tính năng
        DigitalVideoDisc dvd = new DigitalVideoDisc(1, "The Matrix", "Sci-Fi", 24.95f, 136, "Lana Wachowski");
        Book book = new Book(2, "Java OOP", "Education", 45.0f);
        book.addAuthor("James Gosling");
        CompactDisc cd = new CompactDisc(3, "Chill Lo-fi", "Music", 15.0f, 0, "HUST Director", "Sơn Tùng M-TP");
        cd.addTrack(new Track("Chạy Ngay Đi", 4));
        cd.addTrack(new Track("Hãy Trao Cho Anh", 5));

        store.addMedia(dvd);
        store.addMedia(book);
        store.addMedia(cd);

        int choice;
        do {
            showMenu(); // Hiển thị menu chính [cite: 276]
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng thừa
            switch (choice) {
                case 1:
                    store.printStore();
                    storeMenuHandler();
                    break;
                case 2:
                    System.out.println("Chức năng cập nhật cửa hàng đang được phát triển!");
                    break;
                case 3:
                    cart.printCart();
                    cartMenuHandler();
                    break;
                case 0:
                    System.out.println("Hẹn gặp lại quý khách!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại!");
            }
        } while (choice != 0);
    }

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3: ");
    }

    public static void storeMenuHandler() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3-4: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.print("Nhập chính xác tựa đề sản phẩm muốn xem chi tiết: ");
            String title = scanner.nextLine();
            Media m = store.searchByTitle(title);
            if (m != null) {
                System.out.println(m.toString());
                if (m instanceof Playable) {
                    System.out.println("1. Add to cart\n2. Play\n0. Back");
                    int subChoice = scanner.nextInt();
                    if (subChoice == 1) cart.addMedia(m);
                    if (subChoice == 2) ((Playable) m).play();
                }
            } else {
                System.out.println("Sản phẩm không có hàng trong kho!");
            }
        } else if (choice == 2) {
            System.out.print("Nhập tên sản phẩm để gom vào giỏ: ");
            String title = scanner.nextLine();
            Media m = store.searchByTitle(title);
            if (m != null) cart.addMedia(m);
        } else if (choice == 3) {
            System.out.print("Nhập tên đĩa nhạc/phim muốn phát: ");
            String title = scanner.nextLine();
            Media m = store.searchByTitle(title);
            if (m instanceof Playable) {
                ((Playable) m).play();
            } else {
                System.out.println("Mặt hàng này là sách hoặc không hỗ trợ tính năng phát nhạc!");
            }
        }
    }

    public static void cartMenuHandler() {
        System.out.println("Options: ");
        System.out.println("1. Filter medias in cart\n2. Sort medias in cart\n3. Remove media from cart\n4. Play a media\n5. Place order\n0. Back");
        System.out.print("Please choose a number: 0-1-2-3-4-5: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 2) {
            System.out.println("1. Sắp xếp theo Tiêu đề -> Giá\n2. Sắp xếp theo Giá -> Tiêu đề");
            int type = scanner.nextInt();
            if (type == 1) cart.sortByTitle();
            if (type == 2) cart.sortByCost();
            cart.printCart();
        } else if (choice == 5) {
            System.out.println("Thông báo: Đơn hàng của bạn đã được khởi tạo thành công trên hệ thống AIMS!"); // [cite: 339]
            cart.clear(); // Xóa sạch giỏ hàng [cite: 339]
        }
    }
}