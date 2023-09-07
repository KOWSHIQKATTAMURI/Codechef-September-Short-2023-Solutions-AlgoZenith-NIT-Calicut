#include <bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        int n, m;
        cin >> n >> m;
        set<long long> s;
        multiset<long long> ms;
        ms.insert(m - 0);
        s.insert(0);
        s.insert(m);
        for(int i = 0; i < n; i++){
            int a;
            cin >> a;
            s.insert(a);
            auto it = s.lower_bound(a);
            auto it2 = it, it3 = it;
            it2--;
            it3++;
            ms.erase(ms.find(*it3 - *it2));
            ms.insert(a - *(it2));
            ms.insert(*(it3) - a);
            cout << *ms.rbegin() << " ";
        }
        cout << endl;
    }
	return 0;
}
