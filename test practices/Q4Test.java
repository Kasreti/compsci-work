import java.util.Stack;

public class Q4Test
{
    public static int[] clone(int[] a)
    {
        int[] copy = new int[a.length];
		for(int i=0; i<a.length; i++){
			 copy[i] = a[i];
		}
		return copy;
    }

    public static String[] clone(String[] a)
    {
        String[] copy = new String[a.length];
		for(int i=0; i<a.length; i++){
			copy[i] = a[i];
		}
		return copy;
    }

    public static void printArray(String[] array)
    {
		for(int i=0; i<array.length; i++){
			System.out.print(array[i] + " ");
		}
		return;
    }

    public static void printArray(int[] array)
    {
		for(int i=0; i<array.length; i++){
			System.out.print(array[i] + " ");
		}
		return;
    }

    public static void parallelPrint(String[] sa, int[] ia)
    {
		int strspace = strSpacing(sa);
		int numspace = numSpacing(ia);
		if(areParallel(sa, ia)){
			for(int i = 0; i < sa.length; i++){
				System.out.print(sa[i] + " ");
				space(strspace, sa[i]);
				space(numspace, ia[i]);
				System.out.println(ia[i]);
			}
		} else{
			System.out.println("Error- Arrays are not parallel");
		}
	return;
    }

    // true if arrays may be parallel, false otherwise
    public static boolean areParallel(String[] sa, int[] ia)
    {
        return sa.length == ia.length; // change...
    }

    public static void search(String[] sa, int[] ia, int goals)
    {
		if(areParallel(sa, ia)){
			for(int i = 0; i < sa.length; i++){
				if(ia[i] >= 120){
					System.out.println(sa[i] + " " + ia[i]);
				}
			}
		} else{
			System.out.println("Error- Arrays are not parallel");
		}
		return;
	}

    public static void selectionSort(String[] sa)
    {
		for(int i=0; i<sa.length; i++){
			String min = sa[i];
			for(int j=i+1; j<sa.length; j++){
				if(sa[i].compareTo(sa[j]) > 0){
					String temp = sa[i];
					sa[i] = sa[j];
					sa[j] = temp;
				}
			}
		}
		return;
    }

    public static void bubbleSort(int[] array)
    {
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array.length - 1 - i; j++){
				if(array[j] < array[j + 1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return;
    }

    public static void parallelSelectionSort(String[] sa, int[] ia)
    {
		for(int i=0; i<sa.length; i++){
			String min = sa[i];
			for(int j=i+1; j<sa.length; j++){
				if(sa[i].compareTo(sa[j]) > 0){
					String temp = sa[i];
					sa[i] = sa[j];
					sa[j] = temp;
					int tempi = ia[i];
					ia[i] = ia[j];
					ia[j] = tempi;
				}
			}
		}
		return;
    }

    public static void parallelBubbleSort(String[] sa, int[] ia)
    {
		for(int i = 0; i < ia.length; i++){
			for(int j = 0; j < ia.length - 1 - i; j++){
				if(ia[j] < ia[j + 1]){
					int temp = ia[j];
					ia[j] = ia[j+1];
					ia[j+1] = temp;
					String temps = sa[j];
					sa[j] = sa[j+1];
					sa[j+1] = temps;
				}
			}
		}
		return;
    }
    
    public static int strSpacing(String[] sa){
		int max = sa[0].length();
		for(int i=1; i<sa.length; i++){
			if(sa[i].length() > max){
				max = sa[i].length();
			}
		}
		return max + 1;				
	}
	
	public static int numSpacing(int[] ia){
		int[] sa = clone(ia);
		int counter = 0;
		int max;
		do{
			sa[0] = sa[0]/10;
			counter++;
		} while (sa[0] > 0);
		max = counter;
		for(int i=1; i<sa.length; i++){
			counter = 0;
			do{
				sa[i] = sa[i]/10;
				counter++;
			} while (sa[i] > 0);
			if(counter > max){
				max = counter;
			}
		}
		return max;				
	}
	
	public static void space(int max, String word){
		int length = word.length();
		for(int i=0; i<(max-length); i++){
			System.out.print(" ");
		}
		return;				
	}
	
	public static void space(int max, int num){
		int length = 0;
		do{
			num = num/10;
			length++;
		} while (num > 0);
		for(int i=0; i<(max-length); i++){
			System.out.print(" ");
		}
		return;				
	}


    public static void main(String[] args)
    {
        String[] bad = {"Cow", "Chicken", "Johnny", "Diddy", "Dexter"};
        String[] originalPlayers = {"Perpetua", "Maribel", "Homare", "Lotta", "Eugenie", "Vivianne", "Portia",
                "SunWen", "Patrizia", "Marta", "Julie", "Birgit", "Maysah", "Abby", "Christine"};
        int[] originalRecords = {80, 82, 83, 88, 88, 95, 101, 106, 110, 115, 116, 128, 130, 184, 190};
        String[] players1 = clone(originalPlayers); // clone = #1
        int[] records1 = clone(originalRecords);
        String[] players2 = clone(originalPlayers);
        int[] records2 = clone(originalRecords);
        String[] players3 = clone(originalPlayers);
        int[] records3 = clone(originalRecords);

        System.out.println("\nPrint player names array");
        printArray(players1); // 2
        System.out.println("\n\nPrint array of goals");
        printArray(records1); // 3
        System.out.print("\n\nCheck if the arrays are parallel: ");
        if( !areParallel(bad, records1) ) // 4 areParallel
        {
            System.out.println("Error-Arrays are not parallel");
        }
        System.out.println("\nPrint parallel arrays");
        parallelPrint(players1, records1); // 5
        System.out.println("\nPlayers with 120 goals or more by name (linear search)");
        search(players3, records3, 120); // 6
        System.out.println("\nSort players alphabetically with selection sort");
        selectionSort(players1); // 7
        printArray(players1);
        System.out.println("\n\nSort records by most goals using bubble sort");
        bubbleSort(records1); // 8
        printArray(records1);
        System.out.println("\n\nSort parallel arrays by most goals using bubble sort");
        parallelBubbleSort(players2, records2); // 9
        System.out.println("Top scorers");
        parallelPrint(players2, records2);
        System.out.println("\nSort parallel arrays by player names with selection sort");
        parallelSelectionSort(players3, records3); // 10
        System.out.println("Players by name");
        parallelPrint(players3, records3);
        // +: beautify the output
    }
}
