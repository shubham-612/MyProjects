package StringBuilder;

public class Occuranceofcharacter {

	public static void main(String[] args) {
        String str = "ssosummm";
        char[] arr = str.toCharArray();
        boolean[] printed = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (printed[i]==false) { 
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        printed[j] = true; 
                    }
                }
                System.out.println(arr[i] + " occurs " + count);
            }
        }
    }

}
