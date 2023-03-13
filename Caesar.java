public class Caesar {
	//instance variables
	private String input;
	private String output;
	private int shift;
	private char a;
	private char b;
	private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private int len;
	private int c;
	
	public Caesar(String i, int s){
		this.input = i;
		this.shift = s;
	}
	
	//decrypt
	public String decryptInput (String in){
		output = "";
		len = alphabet.length();
		in.equals(in.toUpperCase());
		for (int i = 0; i < in.length(); i++){
			a = in.charAt(i);
			for (int l = 0; l < len; l++){
				b = alphabet.charAt(l);
				if (a == b){
					if (alphabet.indexOf(b) + shift >= len){
						c = len - (alphabet.indexOf(b) + shift);
						output = output + alphabet.charAt(c * -1);
					}
					else {
						output = output + alphabet.charAt(alphabet.indexOf(b) + shift);
					}
				}
			}
		}
		return output;
	}
	
}
