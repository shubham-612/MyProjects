package StringBuilder;


public class RemoveDuplicate {

	public static void main(String[] args) {
	    String str = "ssooum";
	    
	    char[] arr = str.toCharArray();
	    StringBuilder result = new StringBuilder();

	    for (int i = 0; i < arr.length; i++) {
	        if (i == 0 || arr[i] != arr[i - 1]) {
	            result.append(arr[i]);
	        }
	    }
	    
	    System.out.println(result);
	}


}
