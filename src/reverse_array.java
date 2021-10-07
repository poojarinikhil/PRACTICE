public class reverse_array {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        int l= arr.length/2;
        int n=arr.length;
        for (int i=0;i<l;i++){
            int temp=arr[(n-i-1)];
            arr[(n-i-1)] =arr[i];
            arr[i]=temp;
        }
        for (int element : arr){
            System.out.print(element+" ");
        }
    }
}
 