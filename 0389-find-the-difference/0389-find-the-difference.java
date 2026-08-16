class Solution {
    public char findTheDifference(String s, String t) {

    List <Character> l1 = new ArrayList();

    char x=' ';

    char arr[]=s.toCharArray();

    for (int i=0;i<arr.length;i++ ){
        l1.add(arr[i]);
    }  

    for (int i=0;i<t.length();i++){
        if (!l1.contains(t.charAt(i))){
            x=t.charAt(i);
        }
        else{
             l1.remove((Character) t.charAt(i)); 
        }
    }
    return x;   
    }
}