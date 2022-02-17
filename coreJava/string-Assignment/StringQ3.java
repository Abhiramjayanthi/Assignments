
public class StringQ3 {

	public static void main(String[] args) {
		String str1 = "Java String pool refers to collection of Strings which are stored in heap memory";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.replace("a", "$"));
		System.out.println(str1.contains("contain"));
		System.out.println(str1=="java string pool refers to collection of Strings which are stored in heap memory");
		System.out.println(str1.toLowerCase().equals("java string pool refers to collection of strings which are stored in heap memory"));
	}

}
