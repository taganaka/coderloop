
import java.util.Random;

public class FriendsFinderGen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		if (args.length == 0){
			System.err.println("usage: java FriendsFinderGen <number> [seed] [range]");
			System.exit(1);
		}
		
		int number = Integer.parseInt(args[0]);
		
		long seed;
		if (args.length >= 2){
		    seed = Long.parseLong(args[1]);
		}else{
		    seed = System.currentTimeMillis();
		}
		
		int high, low;
		if (args.length >= 3){
		    high = Integer.parseInt(args[2]);
		    low = high * -1;   
		}else{
		    high = 500;
		    low  = -500;
		}
		
		
		
		Random r = new Random(seed);
		
		for (int i = 1; i<=number; i++){
			System.out.print(i + " ");
			System.out.printf("%.2f",r.nextDouble() * r.nextInt(high - low +1) + low);
			System.out.print(" ");
			System.out.printf("%.2f",r.nextDouble() * r.nextInt(high - low +1) + low);
			System.out.print("\n");
		}
	}

}

