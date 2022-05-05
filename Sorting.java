class Sorting{
	static void insertionSort(int a1[],int n){
		int k=a1[4];
		for(int i=n-1;i>=0;i--){
			if(a1[i-1]<k){
				a1[i]=k;
				System.out.println();
				for(int x:a1){
					System.out.print(x+" ");
				}
				return;
			}
			else{
				a1[i]=a1[i-1];
				System.out.println();
				for(int x:a1){
					System.out.print(x+" ");
				}
			}
		}
	}
	public static void main(String[] args){
		int[] a1={2,4,6,8,3};
		int n=a1.length;
		insertionSort(a1,n);
	}
}