package MostAksed;

import java.util.Random;

public class GenerateRandomNumAndString {

	public static void main(String[] args) {
		
		//#1 - Random
		Random random = new Random();
		int num = random.nextInt(1000);
		System.out.println(num);
		
		//#2 - Math
		System.out.println(Math.random());
		
		//#3 - Apache commons-lang API
		//http://commons.apache.org/ - download commons-lag.jar & 
		//add this jar in the reference libraries
		/*String randNum = RandomStringUtils.randomNumeric(count);
		 * randNum = RandomStringUtils.randomAlphabetic(count);
		 */
	}
}
