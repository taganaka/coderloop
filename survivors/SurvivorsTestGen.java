import java.util.Random;

public class SurvivorsTestGen {

	public static void main(String[] args) {
		
		if (args.length == 0){
			System.err.println("Usage: java SurvivorsTestGen <number of itemes>");
			System.exit(1);
		}	
		int num = Integer.parseInt(args[0]);
		
		Random r = new Random(System.currentTimeMillis());
		
		int min = Math.abs(r.nextInt(100000));
		
		System.out.println(min);
		
		for (int i = 0; i <= num; i++){
			System.out.print("SKU"+ i +" ");
			System.out.print( Math.abs(r.nextInt(20000 - 1000 +1) + 1000) + " ");
			System.out.print( Math.abs(r.nextInt(20000 - 1000 +1) + 1000));
			System.out.println();
		}

	}

}

