class GFG {
    String longest(String names[], int n) {
        int maxLength = Integer.MIN_VALUE;
        int idx = 0;
        for(int i = 0;i < names.length; ++i){
            int currLength = names[i].length();
            if(currLength > maxLength){
                maxLength = currLength;
                idx = i;
            }
        }
        return names[idx];
    }
}
