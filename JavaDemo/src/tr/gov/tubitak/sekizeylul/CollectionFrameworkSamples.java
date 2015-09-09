package tr.gov.tubitak.sekizeylul;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

public class CollectionFrameworkSamples {
	public static void cizgiCek(){
		String result;
		result = "------------------------------------------";
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		String a = "abc";
		ArrayList deneme = new ArrayList();
		deneme.add("�mer y�ld�z");
		deneme.add("�akir");
		deneme.add("sami");
		deneme.add("kadir bolat");
		deneme.add(3, new String("AHMET YILDIZ"));
		deneme.add("zahide yeti�");
		
		ArrayList numbers = new ArrayList();
		
		for (int i = 10; i > 0; i--) {
			numbers.add(i);
		}
		
		Collator collator = Collator.getInstance(new Locale("tr", "TR"));
		Collections.sort(deneme,collator);
		
//		Collections.sort(deneme);
		for(Object o : deneme)
		{
			System.out.println(o);
		}
//		listeyi dola��rken silmek i�in iterator uygundur
		Iterator it = deneme.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			System.out.println(obj);
		}
		
//		for(Object o : numbers)
//		{
//			System.out.println(o);
//		}
////		listeyi dola��rken silmek i�in iterator uygundur
//		Iterator it = numbers.iterator();
//		
//		cizgiCek();
//		while(it.hasNext())
//		{
//			Object obj = it.next();
//			System.out.println(obj);
//		}
		
	}
}
