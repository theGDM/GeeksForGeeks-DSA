// Given two strings a and b. The task is to find if the string 'b' can be obtained by rotating another string 'a' by exactly 2 places.

// Example 1:

// Input:
// a = amazon
// b = azonam
// Output: 1
// Explanation: amazon can be rotated anti
// clockwise by two places, which will make
// it as azonam.
// Example 2:

// Input:
// a = geeksforgeeks
// b = geeksgeeksfor
// Output: 0
// Explanation: If we rotate geeksforgeeks by
// two place in any direction , we won't get
// geeksgeeksfor.

class Solution{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2){
        //str1 is rotated 2 place clockwise
        String a = str1.substring(2, str1.length()) + str1.substring(0, 2);
        //str1 is rotated 2 place anti-clockwise
        String b = str1.substring(str1.length() - 2, str1.length()) + str1.substring(0, str1.length() - 2);
        // System.out.println(a + " " + b);
        if(a.equals(str2)){
            return true;
        }else if(b.equals(str2)){
            return true;
        }else{
            return false;
        }
    }
}
