#include<bits/stdc++.h>
using namespace std;

int partition(vector<int> &array, int s, int e){

    int pivot = array[e];
    int i = s - 1;
    for(int j=s; j<e; j++){
        if(array[j]<pivot){
            i++;
            swap(array[i], array[j]);
        }
    }
    swap(array[i+1], array[e]);
    return i+1;
}

void quicksort(vector<int> &array, int s, int e){
    if(s>=e){
        return;
    }

    int p = partition(array, s, e);
    quicksort(array, s, p-1);
    quicksort(array, p+1, e);
}

int main()
{
    //8,3,1,6,1,9,2,4,5,7
    vector<int> array = {8,3,1,6,1,9,2,4,5,7};
    int n = array.size();
    int s = 0;
    int e = n-1;

    quicksort(array, s, e);
    cout<<"sorted array by quicksort is : ";
    for(int x: array)
    {
        cout<<x<<" ";
    }
}