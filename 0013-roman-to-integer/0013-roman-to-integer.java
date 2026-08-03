import java.util.*;
class Solution {
    public int romanToInt(String s) {
        Map <Character , Integer > map1=new HashMap<>();

        map1.put('I',1);
        map1.put('V',5);
        map1.put('X',10);
        map1.put('L',50);
        map1.put('C',100);
        map1.put('D',500);
        map1.put('M',1000);

        char chars []=s.toCharArray();
        int result =0;
        int i ,j;
        for (i=0,j=1;j<chars.length;i++,j++){
             if (map1.get(chars[i])>=map1.get(chars[j])){
                     result = result +map1.get(chars[i]);

             }
             else {
                result = result -map1.get(chars[i]);
             }
        }
        result = result +map1.get(chars[i]);
        return result;


        


    }
}