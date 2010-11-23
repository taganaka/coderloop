/**
* Java solution for http://www.coderloop.com/puzzles/answerofeverything
* Francesco Laurita <taganaka@gmail.com>
*
**/


import java.io.File;
import java.util.Scanner;

public class Answerofeverything {

    public static void main(String[] args) throws Exception{

        if (args.length == 0){
            System.out.println("Unable to open file");
            System.exit(1);
        }

        Scanner scanner = new Scanner(new File(args[0]));

        while (scanner.hasNext()){
            int d = scanner.nextInt();
            if (d != 42){
                System.out.println(d);
            }else{
                break;
            }
        }
        
        scanner.close();
    
    }
}
