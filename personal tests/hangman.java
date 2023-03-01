import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class hangman {
	public static boolean hasletter(char text[], char letter){
		int length = text.length;
		for (int i = 0; i < length; i++){
			if((text[i]) == letter){
				return true;
			}
		}
		return false;
	}
	
	public static boolean hasus(char text[]){
		int length = text.length;
		for (int i = 0; i < length; i++){
			if((text[i]) == '_'){
				return true;
			}
		}
		return false;
	}
	
	public static boolean difflength(char one[], char two[]){
		int onelength = one.length;
		int twolength = two.length;
		if(onelength == twolength){
			return false;
		}else{
			return true;
		}
	}
	
	public static char[] arrayappend(char oldarray[], char newchar){
		int length = oldarray.length;
		char newarray[] = new char[length + 1];
		for (int i=0; i<length; i++){
			newarray[i] = oldarray[i];
		}
		newarray[length] = newchar;
		return newarray;
	}
	
	public static String charrtostring(char chararray[]){
		String scon = ("");
		int length = chararray.length;
		for (int i=0; i<length; i++){
			scon = scon + chararray[i] + " ";
		}
		return scon;
	}
	
	public static String chans(char chararray[]){
		String scon = ("");
		int length = chararray.length;
		for (int i=0; i<length; i++){
			scon = scon + chararray[i];
		}
		return scon;
	}
	
	public static char[] usify(char guess[], char otherarray[]){
		int length = otherarray.length;
		char newarray[] = new char[length];
		for (int i=0; i<length; i++){
			newarray[i] = '_';
		}
		return newarray;
	}
	
	public static void space(){
		for(int i = 0; i<50; i++){
			System.out.println();
		}
		return;
	}
	
	public static char[] checkletters(char nextguess, char ans[], char ent[]){
		int length = ans.length;
		char newarray[] = new char[length];
		for (int i=0; i<length; i++){
			if(nextguess == ans[i] || ent[i] == ans[i]){
				newarray[i] = ans[i];
			} else{
				newarray[i] = '_';
			}
		}
		return newarray;
	}
	
	public static boolean wrong(char nextguess, char ans[], char ent[]){
		int length = ans.length;
		int correct = 0;
		char newarray[] = new char[length];
		for (int i=0; i<length; i++){
			if(nextguess == ans[i]){
				correct++;
			}
		}
		if(correct == 0){
			return true;
		} else { 
			return false;
		}
	}
	
	public static boolean invalid(char text[]){
		if(hasletter(text,'&') || hasletter(text,'+') || hasletter(text,'@') || hasletter(text,'!') || hasletter(text,'?')){
			return true;
		} else{
			return false;
		}
	}
	
	public static String randomword(){
		Random random = new Random();
		String[] words = {"croquet", "cockpit", "bungler", "pituitary", "fjord", "melancholy", "diphthong", "phlegm", "hockey", "rhythm", "awkward", "mnemonic", "peekaboo"};
		String ransel = words[random.nextInt(words.length)];
		return ransel;
	}
	
	public static void main (String[] args) {
		System.out.println("Welcome to Hangman!");
		char[] wletters;
		char[] undersc = {'_'};
		int numguess = 0;
		char[] guessletters = {'_'};
		String ustostring = ("");
		char[] guesslist = {' '};
		asking: do{
			Scanner newchar = new Scanner(System.in);
			System.out.print("Enter the word to guess (enter random for a random word): ");
			String input = newchar.nextLine();
			if(input.equals("random")){
				input = randomword();
			}
			wletters = input.toCharArray();
			if(invalid(wletters)){
				System.out.println("INVALID CHARACTER AHAHAHA");
			}
		} while (invalid(wletters));
				
		undersc = usify(undersc,wletters);
		undersc = checkletters(' ', wletters, undersc);
		undersc = checkletters('-', wletters, undersc);
		undersc = checkletters('_', wletters, undersc);
		
		space();
		
		guessloop: do{
			ustostring = charrtostring(undersc);
			Scanner newinput = new Scanner(System.in);
			System.out.println("==============================\nEnter a guess!" + "\nIncorrect guesses: " + numguess + "/5\nGuesses so far: "+ charrtostring(guesslist) + "\n" + ustostring + "\nGuess: ");
			String ngi = newinput.nextLine();
			if(ngi.length()==1){
				char nextguess = ngi.charAt(0);
				undersc = checkletters(nextguess, wletters, undersc);
				char ngi2 = ngi.charAt(0);
				guesslist = arrayappend(guesslist, ngi2);
				if(wrong(nextguess,wletters,undersc)){
					numguess++;
				}
			} else if (ngi.length()>1){
				if(ngi.equals(chans(wletters))){
					break guessloop;
				} else{
					numguess++;
				}
			}
		} while (hasus(undersc) && numguess<5);
		if(numguess<5){
			System.out.println("You got the word " + chans(wletters) + " with " + numguess + " incorrect guesses!");
		} else{
			System.out.println("You ran out of guesses! The word was " + chans(wletters) + ".");
		}
		
	}
}

