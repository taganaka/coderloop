/**
* c++ solution for http://www.coderloop.com/puzzles/answerofeverything
* Francesco Laurita <taganaka@gmail.com>
*
**/

#include <iostream>
#include <string>
#include <sstream>
#include <fstream>

using namespace std;
int main(int argc, char **argv) {

    std::ifstream ifile(argv[1]);
    if (!ifile) {
        cerr << "Error opening file!" << endl;
        return 1;
    }
	
    int d;
    while(ifile >> d){
        if (d != 42)
            cout << d << endl;
        else
            break;
    }

    ifile.close();
	
	return 0;
}
