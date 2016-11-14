package classProject;

public class CodeRunner 
{
	public static void main(String[] args)
	{
		StringCoder code1 = new StringCoder("Crazy Banana");
		StringCoder code2 = new StringCoder("Funny Apple");
		StringCoder code3 = new StringCoder("This is a specail code");
		
		code1.noVowels();
		System.out.println("First Coded Word: " + code1.getCode());
		code2.onlyVowels();
		System.out.println("Second Coded Word: " + code2.getCode());
		code3.replaceWith('$');
		System.out.println("Third Coded Word: " + code3.getCode());
	}

}