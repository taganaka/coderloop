//============================================================================
// Name        : buddiesgen.cpp
// Author      : Francesco Laurita
// Version     : 1
// Copyright   : Francesco Laurita
// Description : A dumb test case generator for http://www.coderloop.com/puzzles/buddies
//============================================================================

#include <iostream>
#include <stdlib.h>
#include <time.h>
using namespace std;

int main(int argc, char **argv) {

	srand(time(NULL));

	for (int i = 0; i < 10000; i++){
		int p = rand() % 90;
		int p1 = rand() % 90;
		cout << "Thu Dec 11 17:53:01 PST 2008\t";
		cout << p << "coderloop.com\t";
		cout << p1 << "coderloop.com" << endl;

	}
	return 0;
}
