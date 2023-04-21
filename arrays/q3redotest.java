
public class q3redotest
{
	// global variables and constants
    final static int MAXSIZE = 10;
    static int population = 0;

    public static boolean isFull(String[] a)
    {
		// your code! (remember to change the line below as well!)
        return (population==MAXSIZE);
    }

    public static boolean isEmpty(String[] a)
    {
		// your code! (remember to change the line below as well!)
        return (population==0);
    }

    public static void printArray(String[] a)
    {
        // your code!
        for(int i=0; i<MAXSIZE; i++){
			if(a[i] != null){
				System.out.print(i + ":" + a[i] + "  ");
			}
		}
		System.out.println("[ population: " + population + " ]");
		return;
    }

    public static void printWholeArray(String[] a)
    {
		// your code!
        for(int i=0; i<MAXSIZE; i++){
			System.out.print(i + ":" + a[i] + "  ");
		}
		System.out.println("[ length: " + MAXSIZE + " ]");
		return;
    }

    public static String[] clone(String[] a)
    {
        // your code! (remember to change the line below as well!)
        String[] copy = new String[MAXSIZE];
		for(int i=0; i<MAXSIZE; i++){
			copy[i] = a[i];
		}
		return copy;
    }

    public static void add(String[] a, String data)
    {
        // your code!
        if(isFull(a)){
			System.out.println("Error adding " + data);
			return;
		} else{
			a[population] = data;
			population++;
			return;
		}
    }

    public static int search(String[] a, String data)
    {
        // your code! (remember to change the line below as well!)
        for(int i=0; i<MAXSIZE; i++){
			if(data.equalsIgnoreCase(a[i])){
				return i;
			}
		}
		return -1;
    }

    public static void swap(String[] a, int index1, int index2)
    {
		// your code!
		if(index1 >= MAXSIZE || index2 >= MAXSIZE || index1 < 0 || index2 < 0){
			System.out.println("Error in index value(s)");
		} else{
			String temp = "";
			temp = a[index1];
			a[index1] = a[index2];
			a[index2] = temp;
		}
		return;
    }

    public static void replace(String[] a, String original, String replacement)
    {
        // your code!
        int index = search(a, original);
        if(index==-1){
			System.out.println(original + " not found.");
		} else{
			a[index] = replacement;
		}
		return;
    }

    public static void remove(String[] a, String data)
    {
		// your code!
		int index = search(a, data);
		if(index==-1){
			System.out.println(data + " not found.");
		} else{
			a[index] = null;
			population--;
		}
		return;
    }

    public static void insert(String[] a, String data, int index)
    {
		// your code!
		if(isFull(a) || index>=MAXSIZE || index<0){
			System.out.println("Error in index value(s)");
		} else{
			String temp = a[index];
			a[index] = data;
			for(int i=0; i<MAXSIZE; i++){
				if(a[i] == null){
					a[i] = temp;
					break;
				}
			}
		}
		return;
    }

	// Do not modify the code below this line--------------------------------------------------------------------------
    public static void main(String[] args)
    {
        String[] arr = new String[MAXSIZE];
        printWholeArray(arr);
        printArray(arr);
        System.out.println(isFull(arr));
        System.out.println(isEmpty(arr));
        add(arr, "apple");
        add(arr, "banana");
        add(arr, "cherry");
        add(arr, "dragonfruit");
        add(arr, "elderberry");
        add(arr, "fig");
        add(arr, "gooseberry");
        add(arr, "imbe");
        add(arr, "jujube");
        add(arr, "kiwi");
        add(arr, "longan");
        printArray(arr);
        System.out.println(search(arr, "banana"));
        System.out.println(search(arr, "grape"));
        String[] full = clone(arr);
        System.out.println(arr.equals(full));
        remove(arr, "dragonfruit");
        remove(arr, "gooseberry");
        remove(arr, "watermelon");  
		swap(arr, 0, 5);
        swap(arr, 3, 10);
        swap(arr, -3, 1);
        printArray(arr);
        replace(arr, "apple", "papaya");
        printWholeArray(arr);
        replace(arr, "watermelon", "apple");
        insert(arr, "plum", 0);
        printWholeArray(arr);
		insert(arr, "mango", 11);
    }


    //===========================================================
    // IBIO Standard Input and Output
    //  These methods must be copied into your program(s).
    //===========================================================

    static void output(String info)
    {
        System.out.println(info);
    }

    static void output(char info)
    {
        System.out.println(info);
    }

    static void output(byte info)
    {
        System.out.println(info);
    }

    static void output(int info)
    {
        System.out.println(info);
    }

    static void output(long info)
    {
        System.out.println(info);
    }

    static void output(double info)
    {
        System.out.println(info);
    }

    static void output(boolean info)
    {
        System.out.println(info);
    }

    static String input(String prompt)
    {
        String inputLine = "";
        System.out.print(prompt);
        try
        {
            inputLine = (new java.io.BufferedReader(
                    new java.io.InputStreamReader(System.in))).readLine();
        } catch (Exception e)
        {
            String err = e.toString();
            System.out.println(err);
            inputLine = "";
        }
        return inputLine;
    }

    static String inputString(String prompt)
    {
        return input(prompt);
    }

    static String input()
    {
        return input("");
    }

    static int inputInt()
    {
        return inputInt("");
    }

    static double inputDouble()
    {
        return inputDouble("");
    }

    static char inputChar(String prompt)
    {
        char result = (char) 0;
        try
        {
            result = input(prompt).charAt(0);
        } catch (Exception e)
        {
            result = (char) 0;
        }
        return result;
    }

    static byte inputByte(String prompt)
    {
        byte result = 0;
        try
        {
            result = Byte.valueOf(input(prompt).trim()).byteValue();
        } catch (Exception e)
        {
            result = 0;
        }
        return result;
    }

    static int inputInt(String prompt)
    {
        int result = 0;
        try
        {
            result = Integer.valueOf(
                    input(prompt).trim()).intValue();
        } catch (Exception e)
        {
            result = 0;
        }
        return result;
    }

    static long inputLong(String prompt)
    {
        long result = 0;
        try
        {
            result = Long.valueOf(input(prompt).trim()).longValue();
        } catch (Exception e)
        {
            result = 0;
        }
        return result;
    }

    static double inputDouble(String prompt)
    {
        double result = 0;
        try
        {
            result = Double.valueOf(
                    input(prompt).trim()).doubleValue();
        } catch (Exception e)
        {
            result = 0;
        }
        return result;
    }

    static boolean inputBoolean(String prompt)
    {
        boolean result = false;
        try
        {
            result = Boolean.valueOf(
                    input(prompt).trim()).booleanValue();
        } catch (Exception e)
        {
            result = false;
        }
        return result;
    }
	//=========== end IBIO ===========================================//

}
