class Sol{
    int closing (String s, int pos){
        // your code here  
        int count = 0;
        for(int i = pos + 1;i < s.length(); ++i){
            if(s.charAt(i) == '['){
                ++count;
            }else if(s.charAt(i) == ']' && count > 0){
                --count;
            }else if(s.charAt(i) == ']' && count == 0){
                return i;
            }
        }
        return -1;//just a dummy return, we know we will not reach here anyway
    }
}
