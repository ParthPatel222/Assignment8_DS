import java.util.Scanner;

public class hashFunctions {
	//Linear Probing Hash Function using Division Method (HF1)
	public static void HF1(int key, int[][] table) {
		int index = (key % 50); //division hash function
		int i = 0;
		int probes = 0;
		while (true) { //loops until the key is inserted
			if (table[index][0] == 0) { //if the index is empty, insert key
				table[index][0] = key; //inserts key into table
				table[index][1] = i; //inserts the number of probes into the second column of table
				break;
			}
			else {
				index = (index + 1) % 50; //increments index
				probes ++;
			}
		}
		table[index][1] = probes;
	}

	public static void HF2(){
		//Quadratic Probing Hash Function using Division Method (HF2)

	}

	public static int sumProbes(int[][] table){
		int probes = 0;
		for(int i=0; i<50; i++){ //sums up all the probes
			probes += table[i][1]; //adds the probes located in the second column of table
		}
		return probes; //returns the sum of probes
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int[] keys = {1234, 8234, 7867, 1009, 5438, 4312, 3420, 9487, 5418, 5299,
				5078, 8239, 1208, 5098, 5195, 5329, 4543, 3344, 7698, 5412,
				5567, 5672, 7934, 1254, 6091, 8732, 3095, 1975, 3843, 5589,
				5439, 8907, 4097, 3096, 4310, 5298, 9156, 3895, 6673, 7871,
				5787, 9289, 4553, 7822, 8755, 3398, 6774, 8289, 7665, 5523};
		int[][] table = new int[50][2];
		int choice;

		do {
			System.out.println("--------------------MAIN MENU--------------------");
			System.out.println("""
					1. Run HF1 (Division method with Linear Probing)
					2. Run HF2 (Division method with Quadratic Probing)
					3. Run HF3 (Division method with Double Hashing)
					4. Run HF4 (Student Designed HF)
					5. Exit Program""");
			System.out.print("Enter your choice: ");
			choice = scan.nextInt();
			switch(choice){

				case 1: System.out.println("\nHash table resulted from HF1:\n");
					for(int i=1; i<keys.length; i++) { //insert keys into table
						HF1(keys[i], table); //calls HF1
					}
				//print index, key and probes table
				System.out.println("Index\tKey\t\tProbes");
				System.out.println("---------------------");
				for(int i=0; i<50; i++){
					System.out.println(i + "\t\t" + table[i][0] + "\t" + table[i][1]);
				}
				System.out.println("---------------------");
				System.out.println("Sum of probe values = " + sumProbes(table)+" probes\n");
					break;

				case 2:System.out.println("\nHash table resulted from HF2:\n");
					break;

				case 3:System.out.println("\nHash table resulted from HF3:\n");
					break;

				case 4:System.out.println("\nHash table resulted from HF4:\n");
					break;

				case 5: System.out.println("Exiting Program...");
					break;

				default: System.out.println("\nInvalid choice. Please try again.\n");
			}
		} while (choice != 5);
	}
}
