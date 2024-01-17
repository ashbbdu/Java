#include <iostream>
using namespace std;

int main () {
      int n = 4;
        int m = 5;

        for(int row =0 ; row < n ; row++) {
            for(int col = 0 ; col < m ; col++) {
               cout << "* ";
            }
           cout << endl;
        }

            // star pattern

        int stars = 5;

        for(int row = 0 ; row < stars  ; row++) {
            // gaps
            for(int col = 0 ; col < stars - row ; col++) {
                cout << " ";
            }
            // stars
            for(int col = 0 ; col < row + 1 ; col++) {
                cout <<  "* ";
            }
        cout << endl;
        }


        // Inverted pattern


}