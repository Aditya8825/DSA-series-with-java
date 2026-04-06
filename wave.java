public class wave {
    public static void main(String[] args) {
        int  [][]arr={
            {2,3,4},
            {4,5,6},
            {5,4,3}
        };
      int rows=arr.length;
  int cols =arr.length;


  for(int j=0; j<cols; j++){
    //even column
    if(j % 2==0){
         for( int i=0; i<rows; i++){
            System.out.println(arr[i][j]+" ");
         }
    }
    //odd column
     else{
        for(int i=rows-1; i>=0; i--){
            System.out.println(arr[i][j]+" ");
        }
     }
  }
        }
    }
