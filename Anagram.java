import java.util.*;

public class Anagram
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first centense: ");
		String a = scanner.nextLine();
		System.out.println("Enter second centense: ");
		String b = scanner.nextLine();
		
		ArrayList<String> firstArr= new ArrayList(Arrays.asList(a.split("")));
		ArrayList<String> secondArr= new ArrayList(Arrays.asList(b.split("")));

		firstArr.remove(" ");
		secondArr.remove(" ");

		Collections.sort(firstArr);
		Collections.sort(secondArr);

		System.out.println(firstArr.equals(secondArr));
	}
}
