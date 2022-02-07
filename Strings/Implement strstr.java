class GfG{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x){
       for(int i = 0;i < s.length(); ++i){
           if(s.charAt(i) == x.charAt(0)){
               int j = i, k = 0, c = 0;
               while(j < s.length() && k < x.length()){
                  if(s.charAt(j) == x.charAt(k)){
                      ++c;
                  }
                  ++j;
                  ++k;
               }
               if(c == x.length()) return i;
           }
       }
       return -1;
    }
}
//we have to perform the same procedure when we get the same character in input string as the first charcater of matching string.
//then we need to check from that matched index, within the limit of x ki length aur s ki length.
//ex : lrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwk|h|(this is where j < s.length() saves us from out of index)opkmcoq hnwnkuewhsqmgbbuqcljjivswmdkqtbxixmvtrrbljptnsn
