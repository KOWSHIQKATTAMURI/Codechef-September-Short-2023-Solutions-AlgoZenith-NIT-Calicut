#include <bits/stdc++.h>
using namespace std;

int main(){
	int t;
	cin >> t;
	while(t--) {
	    int n;
	    cin >> n;
	    vector<int> arr(n, 0);
	    vector<int> brr(n, 0);
	    for(int i = 0 ; i < n; i++){
        cin >> arr[i];
      }
	    for(int i = 0; i < n; i++){
        cin >> brr[i];
      }
	    vector<int> prefix(n);
	    vector<int> suffix(n);
	    prefix[0] = arr[0];
	    suffix[n - 1] = arr[n - 1];
	    for(int i = 1; i < n; i++){
	        prefix[i] = __gcd(prefix[i - 1], arr[i]);
	    }
	    for(int i = n - 2; i >= 0; i--) {
	        suffix[i] = __gcd(suffix[i + 1], arr[i]);
	    }
	    int mx = prefix[n - 1];
	    for(int i = 0; i < n; i++){
	        if(i == 0){
	            int temp = __gcd(suffix[i + 1], brr[i]);
	            mx = max(mx, temp);
	        }else if(i == n-1) {
	            int temp = __gcd(prefix[i - 1], brr[i]);
	            mx = max(mx, temp); 
	        }else{
	            int left = __gcd(prefix[i - 1], suffix[i + 1]);
	            int right = __gcd(left, brr[i]);
	            mx = max(mx, right);
	        }
	    }
	    cout<< mx <<endl;
	}
	return 0;
}
