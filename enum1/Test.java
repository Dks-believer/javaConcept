package enum1;

public class Test {

	enum Color {
		RED,
		GREEN,
		BLUE;
		}
	
		public static void main(String[] args)
		{
		// Calling values()
		Color arr[] = Color.values();
		
		for (Color col : arr) {
			
		// Calling ordinal() to find index of color
		System.out.println(col + " at index " + col.ordinal());
		}
		}
		
}
