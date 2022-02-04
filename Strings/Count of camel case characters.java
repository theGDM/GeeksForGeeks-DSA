class Sol{
    int countCamelCase (String s){
        // your code here  
        int count = 0;
        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                ++count;
            }
        }
        return count;
    }
}
