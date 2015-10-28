package game;

public class Arraytryout {

	public static void main(String[] args) {
		int[] Field;

		// allocates memory for 10 integers
		Field = new int[12];

		Field[0] =0;
		Field[1] =250;
		Field[2] =-200;
		Field[3] =-100;
		Field[4] =-20;
		Field[5] =180;
		Field[6] =0;
		Field[7] =-70;
		Field[8] =-60;
		Field[9] =-80; // + extra turn
		Field[10] =-90;
		Field[11] =650;

		System.out.println("Element at index 0: "
				+ Field[0]);
		System.out.println("Element at index 3: "
				+ Field[1]);
		System.out.println("Element at index 4: "
				+ Field[2]);
		System.out.println("Element at index 5: "
				+ Field[3]);
		System.out.println("Element at index 6: "
				+ Field[4]);
		System.out.println("Element at index 7: "
				+ Field[5]);
		System.out.println("Element at index 8: "
				+ Field[6]);
		System.out.println("Element at index 9: "
				+ Field[7]);
		System.out.println("Element at index 10: "
				+ Field[8]);
		System.out.println("Element at index 11: "
				+ Field[9]);
		System.out.println("Element at index 1: "
				+ Field[10]);
		System.out.println("Element at index 2: "
				+ Field[11]);
	}
}

