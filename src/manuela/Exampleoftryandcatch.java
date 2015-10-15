
package manuela;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Exampleoftryandcatch {

	public static void main(String[] args) {
		try
		{
		Scanner hb=new Scanner(System.in);
		System.out.println("select one option, (1-3)"+"\n\t1.)Steak"+ "\n\t2.)mongoes"+"\n\t3.)orang");
		byte ch=hb.nextByte();
		}
catch(Exception e)
{
System.out.println("not correct");
	}

}
}