public class Hello {
	public static void main(String[] args){
		String hi = "Hi, ";
		String mom = "mom.";

		String answer1 = hi + mom;
		StringBuilder sb = new StringBuilder(hi);
		sb.append(mom);
		String answer2 = sb.toString();		

		System.out.println(answer1);
		System.out.println(answer2);
	}
}
