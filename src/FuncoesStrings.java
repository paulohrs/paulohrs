
public class FuncoesStrings {
	
	public static void main(String[] args) {
		
		String original = " - abcde FGHIJ ABC abc DEFG -";
		
		String s01 = original.toLowerCase();
		System.out.println(s01);
		
		String s02 = original.toUpperCase();
		System.out.println(s02);
		
		String s03 = original.trim();
		System.out.println("Trim" + s03);
		
		String s04 = original.substring(8);
		System.out.println(s04);
		
		String s05 = original.substring(2, 9);
		System.out.println(s05);
		
		String s06 = original.replace('a', 'x');
		System.out.println(s06);
		
		String s07 = original.replace("abc", "xln");
		System.out.println(s07);
		
		int s08 = original.indexOf("bc");
		System.out.println(s08);
		
		int s09 = original.lastIndexOf("bc");
		System.out.println(s09);
		
	}

}
