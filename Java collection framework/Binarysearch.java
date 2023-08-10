public class Binarysearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int s = 0;
        int e = arr.length -1;
        int target =6;
        while(s<=e){
            int mid = e +(s-e)/2;
            if (arr[mid] == target ){
                System.out.println(mid);
                break;
            }
            else if(arr[mid]<target){
                s = mid +1;
            }
            else{
                e= mid -1;
            }
        }
    }
}
