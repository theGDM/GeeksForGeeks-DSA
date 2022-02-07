class GFG {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t-- > 0){
		    String str = scn.next();
    		ArrayList<Character> s = new ArrayList<>();
    		for(int i = 0;i < str.length(); ++i){
    		    s.add(str.charAt(i));
    		}
    		//sorting the arraylist
    		Collections.sort(s);
    		
    		StringBuilder sb = new StringBuilder();
    		for(int i = 0; i < s.size(); ++i){
    		    sb.append(s.get(i));
    		}
    		
    		System.out.println(sb);
		}
	}
}
