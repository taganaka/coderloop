/**
* C solution for http://www.coderloop.com/puzzles/answerofeverything
* Francesco Laurita <taganaka@gmail.com>
*
**/

#include <stdio.h>
#include <stdlib.h>

int main(int argc, char **argv){

    FILE *fp;
    int d;
    
    fp = fopen(argv[1],"r");
    if (!fp){
        puts("Unable to open file");
        return EXIT_FAILURE;
    }
    
    while ( fscanf(fp,"%d",&d) == 1 && d != 42){
            printf("%d\n",d);
    }
    
    fclose(fp);
    return EXIT_SUCCESS;
}
