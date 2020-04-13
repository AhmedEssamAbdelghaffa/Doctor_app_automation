package Doctor;

import java.util.ArrayList;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<String> arlist = new ArrayList<String>( );
		arlist.add("011");
		arlist.add("012");
		arlist.add("015");
		arlist.add("010");
		
		Random random = new Random();
		String prefix = arlist.get(random.nextInt(arlist.size()));
		
		String number =  Integer.toString(10000000 + random.nextInt(90000000));
		
		String phone = prefix + number;
		
        System.out.println(phone);
    }
}
