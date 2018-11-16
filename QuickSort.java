class QuickSort{
    public static void main(String[] args){
        int[] a;
        a=new int[]{1,3,6,8,2,4,2,6,9,2,1,6};
        int length=a.length;
        int left=0;
        int right=length-1;
        int[] afterSort;   
        Sort(a,left,right);
        for(int i=0;i<=right;i++){
            System.out.println(a[i]);
        };
    }
    public static void Sort(int[] arr, int left, int right){
        int start=left;
        int end=right;
        int tmp;
        int key=arr[start];
        if(start < end){
            return;
        }
        while(start!=end){
            // begin from start
            while(arr[start]<=key&&start<end){
                start++;
            }
            while(arr[end]>=key&&start<end){
                end--;
            }
            tmp=arr[start];
            arr[start]=arr[end];
            arr[end]=tmp;
        }
        arr[end]=key;
        Sort(arr,left,end);
        Sort(arr,start,right);
    }
            
}
