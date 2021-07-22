package Sorts;

public class Insertion {
public static void main(String[] args) 
{
	int[] arr= {5,1,4,2,5,2,12,1};
	int n = arr.length;
    for (int i = 1; i < n; ++i) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
    for(int i=0;i<arr.length;i++) 
    {
    	System.out.println(arr[i]+"\n");
    }
}
}
