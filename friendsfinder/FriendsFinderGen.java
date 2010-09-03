
import java.util.Random;

public class FriendsFinderGen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		if (args.length == 0){
			System.err.println("usage: java FriendsFinderGen <number>");
			System.exit(1);
		}
		
		int number = Integer.parseInt(args[0]);
		
		long seed = System.currentTimeMillis();
		
		Random r = new Random(seed);
		
		for (int i = 1; i<=number; i++){
			System.out.print(i + " ");
			System.out.print(r.nextDouble() * r.nextInt(500));
			System.out.print(" ");
			System.out.print(r.nextDouble() * r.nextInt(500));
			System.out.print("\n");
		}
	}

}

