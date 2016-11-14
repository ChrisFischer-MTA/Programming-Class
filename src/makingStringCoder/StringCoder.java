package classProject;

public class StringCoder {
	private String word;
	private String code;
	private int length;

	public StringCoder(String param) {
		word = param;
		code = "";
		length = word.length();
	}
	public int getLength() {
		return length;
	}
	public String getCode() {
		return code;
	}
	public String noVowels(){
		String retu="";
		char tmp;
		for(int i = 0; i < word.length(); i++){
			tmp = word.toLowerCase().charAt(i);
			if(tmp == 'a' || tmp == 'e' || tmp == 'i' || tmp == 'o' || tmp == 'u'){
				
			}else{
				retu+=tmp;
			}
		}
		return retu;
	}
	public String onlyVowels(){
		String retu="";
		char tmp;
		for(int i = 0; i < word.length(); i++){
			tmp = word.toLowerCase().charAt(i);
			if(tmp == 'a' || tmp == 'e' || tmp == 'i' || tmp == 'o' || tmp == 'u'){
				retu+=tmp;
			}else{
				
			}
		}
		return retu;
	}
	public void replaceWith(char leter){
		this.word = "";
		for(int i = 0; i < word.length(); i++){
			word+=leter;
		}
			
	}
}
