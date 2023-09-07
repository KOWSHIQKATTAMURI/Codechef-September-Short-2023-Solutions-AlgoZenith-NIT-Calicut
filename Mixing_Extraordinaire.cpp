#include<bits/stdc++.h>
using namespace std;

int main(){
	int t;
	cin >> t;
	while(t--){
	    int n;
	    cin >> n;
	    vector<int> arr(n);
	    for(int i = 0; i < n; i++){
	        cin >> arr[i];
	    }
	    long long total = 0;
	    for(int i = 0; i < n - 1; i++){
	        for(int j = i + 1; j < n; j++){
	            total += (long long) (arr[i]*arr[j]);
	        }
	    }
	    cout << total << endl;
	}
	return 0;
}
