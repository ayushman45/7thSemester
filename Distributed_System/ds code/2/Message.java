
import java.io.Serializable;

public class Message implements Serializable {
int no;
 Message(int i)

{
	this.no=i;
}
public int getdata()
{
	System.out.println(no);
	return no;
}
}
