class count{
  public static void main(String[] args) {
    int[] arr = { 5,4,5,3,2,5,0,1,0,0,3,8,4,3,3,2,1,1,5};
    int aux [] = new int[arr.length];
    int count [] = new int[9];

    for ( int i = 0; i < arr.length; i++) {
       count[arr[i]]++;
    }
    for(int i = 1; i < count.length; i++){
      count[i] = count[i] + count[i-1];
    }
    // for(int i = 0; i < count.length; i++){
    //   System.out.print(count[i]+" ");
    // }


    for(int i = arr.length-1; i>=0; i--){
       aux[ count[arr[i]] - 1] = arr[i] ;
       count[arr[i]]--;

    }
    for(int i = 0; i < aux.length; i++){
      System.out.print(aux[i]+" ");
    }
  }
}