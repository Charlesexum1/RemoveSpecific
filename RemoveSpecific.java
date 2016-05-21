public class RemoveSpecific {
	
	private static int[] array = {0, 1, 1, 2, 1, 1, 1, 2, 4, 5};
	private static int[] dest;
	private static int[] destination;
	private static int destLength = array.length;
	
	private static int[] remSpec(int[] any, int spec) {
		findSpecific(spec, any);
		destination = new int[destLength];
		int count = 0;
		for (int q = 0; q < any.length; q++) {
			if (!(any[q] == spec)) {
				destination[count] = any[q];
				count++;
				}
			}
		return destination;	
		}
	
	private static void findSpecific(int specific, int[] anArray) {
		for (int x = 0; x < anArray.length; x++) {
			if (anArray[x] == specific) {
				destLength--;
				}
			}
		}
	private static void setDest() {
		dest = new int[destLength];
		}
	private static void removeSpecific(int s, int[] any) {
		int count = 0;
		for (int q = 0; q < array.length; q++) {
			if (!(array[q] == s)) {
				dest[count] = array[q];
				count++;
				}
			}
		}			
	
	public static void main(String[] args) {
		RemoveSpecific demo = new RemoveSpecific();
		demo.remSpec(array, 1);
		System.out.println(destination[1]);	
		}		
	}
