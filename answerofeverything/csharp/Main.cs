using System;
using System.IO;
namespace Coderloop.Mono.Examples {
	public class Answerofeverything {
		public static void Main(string[] args) {
            
            TextReader textReader = new StreamReader(args[0]);
            string input = null;
            int d;
            while(( input = textReader.ReadLine()) != null){
                d = int.Parse(input);
                if (d != 42)
                    Console.WriteLine(input);
                else
                    break;
            }
            textReader.Close();
		}
	}
}
