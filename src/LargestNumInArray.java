
public class LargestNumInArray {
    public static void main(String[] args) {

        int [] arr = new int [] {25, 11, 72, 275, 69};
        int max = arr[0];

        for (int i=0; i< arr.length;i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        System.out.println("Largest element in our array is:" + max);
    }
}
