class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new  Stack();
        boolean isValid =true;

        for (char ch :s.toCharArray()){
            if (ch=='('){
                st.push(')');
            }
            else if (ch=='{'){
                st.push('}');
            }
            else if (ch=='['){
                st.push(']');
            }
            else{
                if (st.isEmpty()||ch!=st.pop()){
                 isValid=false;
                }
            }
        }
        isValid =isValid &&  st.isEmpty();
        return isValid;


        
    }
}