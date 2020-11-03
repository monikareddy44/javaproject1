package threads;
import java.io.FileOutputStream;
import java.io.IOException;



public class Demo1 {
	
	public static void main (String args[] )
	{
byte b[]=new byte[100];
FileOutputStream fount=null;

FileOutputStream fout = null;
try
{
	System.in.read(b);
	 fout=new FileOutputStream("text3.txt");
	fout.write(b);
	
	
}
catch (IOException e)
{
	e.printStackTrace();
}
finally
{
	try {
		fout.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
}
