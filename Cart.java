package Aims.project;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0 ;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if( qtyOrdered >= MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is already full");
		}
		else {
			itemOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been added");
			if( qtyOrdered == MAX_NUMBERS_ORDERED)
				System.out.println("The cart is almost full");
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for( int i = 0; i < qtyOrdered; i++) {
			if(itemOrdered[i] == disc) {
				for( int j = i + 1; j < qtyOrdered; j++) {
					itemOrdered[j-1] = itemOrdered[j];
				}
				qtyOrdered--;
				System.out.println("This disc has been moved");
				return;
			}
		}
		System.out.println("The disc is not in the cart");
	}
	public float totalCost() {
		float total = 0;
		for( int i = 0; i < qtyOrdered; i++) {
			total += itemOrdered[i].getCost();
		}
		return total;
	}
}
