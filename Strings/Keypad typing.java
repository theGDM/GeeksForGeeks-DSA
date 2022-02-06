public static String printNumber(String s, int n) {
    StringBuilder ans = new StringBuilder();
    for(int i = 0;i < s.length(); ++i){
        if(s.charAt(i) >= 'a' && s.charAt(i) <= 'c'){
            ans.append(2);
        }else if(s.charAt(i) >= 'd' && s.charAt(i) <= 'f'){
            ans.append(3);
        }else if(s.charAt(i) >= 'g' && s.charAt(i) <= 'i'){
            ans.append(4);
        }else if(s.charAt(i) >= 'j' && s.charAt(i) <= 'l'){
            ans.append(5);
        }else if(s.charAt(i) >= 'm' && s.charAt(i) <= 'o'){
            ans.append(6);
        }else if(s.charAt(i) >= 'p' && s.charAt(i) <= 's'){
            ans.append(7);
        }else if(s.charAt(i) >= 't' && s.charAt(i) <= 'v'){
            ans.append(8);
        }else{
            ans.append(9);
        }
    }
    return ans.toString();
}
