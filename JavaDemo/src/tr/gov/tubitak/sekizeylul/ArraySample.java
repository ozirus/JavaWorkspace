package tr.gov.tubitak.sekizeylul;

import java.util.Arrays;
import java.util.Dictionary;

import tr.gov.tubitak.demo.School;

public class ArraySample {

	public static void main(String[] args) {
		String[] stringArray = new String[3];
		stringArray[0] = "omer yildiz";
		stringArray[1] = "ahmet yildiz";
		
		School school = new School();
		
		School[] schools = new School[3];
		
		System.out.println(""+stringArray[1]);
		Integer[] sortArray = new Integer[]{1,8,2,4,8,3};
		Arrays.sort(sortArray);
		for(int i : sortArray)
		{
			System.out.println(i);
		}
	}

}
