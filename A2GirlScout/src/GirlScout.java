import java.util.Scanner;

/**
 * 
 * @author tkanchanawanchai
 *
 */
public class GirlScout {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numGirlScouts=0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number of girl scouts");
		numGirlScouts = keyboard.nextInt();
		int [] numBox = new int[numGirlScouts];
		int [] category = new int[5];
		for(int i=1; i<=numGirlScouts; i++) {
			System.out.println("Boxes of cookies for girl #"+i);
			numBox[i] = keyboard.nextInt();
			if((numBox[i]>=0)&&(numBox[i]<=10)) {
				category[0]++; 
			} else if(numBox[i]<=20){ 
				category[1]++;
			}else if(numBox[i]<=30){ 
				category[2]++;
			}else if(numBox[i]<=40){ 
				category[3]++;
			}else if(numBox[i]>=41){ 
				category[4]++;
			}	
		}

	}
}
