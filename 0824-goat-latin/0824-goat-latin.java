class Solution {
    public String toGoatLatin(String sentence) {
        String arr[]=sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i=0;i<arr.length;i++){
                String word =arr[i];  

            char first =  word.charAt(0);   

            if (!(first == 'a' || first == 'e' ||
                  first == 'i' || first == 'o' ||
                  first == 'u' ||
                  first == 'A' || first == 'E' ||
                  first == 'I' || first == 'O' ||
                  first == 'U')) {
                word = word.substring(1)+word.charAt(0);
                  }

                  result.append(word);

                  result.append("ma");

                  for (int j=0;j<=i;j++){
                    result.append("a");

                  }

                  if (i<arr.length-1){
                    result.append(" ");

                  }

            } 
            
            return result.toString();
        
    }
}