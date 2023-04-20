import java.util.Hashtable;
import java.util.Scanner;

public class hashFunctions {
	//Linear Probing Hash Function using Division Method (HF1)
	public static int HF1(int key){
		return key % 50;
	}


	/*public static int HF2(int key, int i){
		return (key % 50 + i*i) % 50;
	}

	public static int HF3(int key, int i){
		return (key % 50 + i*(1 + (key % 49))) % 50;
	}

	public static int HF4(int key, int i){
	 return 0;
	}
	 */
	public static int sumProbes(int[][] table){
		int probes = 0;
		for(int i=0; i<50; i++){
			probes += table[i][1];
		}
		return probes;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		Hashtable<Integer, Integer> Table = new Hashtable<Integer, Integer>();

		int[] keys = {1234, 8234, 7867, 1009, 5438, 4312, 3420, 9487, 5418, 5299,
				5078, 8239, 1208, 5098, 5195, 5329, 4543, 3344, 7698, 5412,
				5567, 5672, 7934, 1254, 6091, 8732, 3095, 1975, 3843, 5589,
				5439, 8907, 4097, 3096, 4310, 5298, 9156, 3895, 6673, 7871,
				5787, 9289, 4553, 7822, 8755, 3398, 6774, 8289, 7665, 5523};
		int[][] table = new int[50][2];
		int probes = 0;
		int choice;

		do {
			System.out.println("--------------------MAIN MENU--------------------");
			System.out.println("1. Run HF1 (Division method with Linear Probing)\n"+
					"2. Run HF2 (Division method with Quadratic Probing)\n"+
					"3. Run HF3 (Division method with Double Hashing)\n"+
					"4. Run HF4 (Student Designed HF)\n"+
					"5. Exit Program");
			System.out.print("Enter your choice: ");
			choice = scan.nextInt();
			switch(choice){
				case 1: System.out.println("Hash table resulted from HF1:\n");

					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5: System.out.println("Exiting Program...");
					break;
				default: System.out.println("Invalid choice. Please try again.");
					break;
			}
		} while (choice == 0);
	}
}
