package studio6;

public class Main {
   public static int[] toReversed(int[] array) {
		// FIXME create a helper method that can recursively reverse the given array
		int[] reversed = toReversedHelper(array, (array.length/2)-1);
		return reversed;
		
	}
	public static int[] toReversedHelper(int[] array, int index){
		if (index == -1){
			return array;
		}
		int temp = array[index];
		array[index] = array[array.length - index-1];
		array[array.length - index-1] = temp;
		return toReversedHelper(array, index-1);
	}

    public static void main(String[] args) {
        int[] array = {};
        int[] newArray = toReversed(array);
        for (int i : newArray) {
            System.out.println(i);
        }
       // System.out.println(toReversed(array));
    }
}
