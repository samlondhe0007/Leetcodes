class Solution {
    public int[] replaceElements(int[] arr) {
        int newarr[]= new int [arr.length];
        for (int i=0;i<arr.length-1;i++){
            int max=-1;
            for(int j=i+1;j<arr.length;j++){
            if (arr[j]>max){
                max=arr[j];
                newarr[i]=max;
          
            }
          } 

        }
         newarr[arr.length - 1] = -1;
        return newarr;
        
    }
}