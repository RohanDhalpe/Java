public class linearSearch {

    public static int lserach(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
      return -1;
    }
    public static void main(String args[]){
           int arr[]={11,81,6,74,49,91,25,47};
           int key=49;
           int index=lserach(arr, key);
           if(index==-1){
            System.out.print("Key Not found");
           }else{
             System.out.print("Key found at "+index);
           }
    }
}
