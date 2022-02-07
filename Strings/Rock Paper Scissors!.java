class Solution{
    String gameResult(String s){
        if(s.equals("RR") || s.equals("SS") || s.equals("PP")){
            return "DRAW";
        }else if(s.equals("RS") || s.equals("SP") || s.equals("PR")){
            return "A";
        }else if(s.equals("SR") || s.equals("PS") || s.equals("RP")){
            return "B";
        }
        return "";
    }
}
