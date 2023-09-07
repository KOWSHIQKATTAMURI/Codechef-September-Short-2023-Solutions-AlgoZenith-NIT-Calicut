#include<bits/stdc++.h>
using namespace std;

int main(){
	int t;
	cin >> t;
	while(t--){
	    int turns = 0;
      int x, h;
	    cin >> x >> h;
	    while(h > 0){
	        if(turns <= 4){
	            h -= x/2;
	            turns++;
	        }
	        else{
	            h -= x;
	            turns++;
	        }
	    }
	    cout << turns << endl;
	}
	return 0;
}
