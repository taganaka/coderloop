/**
* c# solution for http://www.coderloop.com/puzzles/answerofeverything
* Francesco Laurita <taganaka@gmail.com>
*
**/

using System;
using System.IO;
namespace Coderloop.Mono.Examples {
    public class Answerofeverything {
        public static void Main(string[] args) {
            
            TextReader textReader = new StreamReader(args[0]);
            string input = null;
            int d;
            while(( input = textReader.ReadLine()) != null && (d = int.Parse(input)) != 42){
                Console.WriteLine(d);
            }
            
            textReader.Close();
        }
    }
}
