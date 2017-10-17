
public class MaPremiereClasse {
	
	public static void main(String[] args) {
		
		String msg1 = "Tu as ";
		String msg2 = " ans";
		int age = 18;
		
		String[] msg  = {msg1, msg2};
		for(int i = 0 ; i < msg.length ; i++)
		//for (String var : msg)
		{
		if( i== 0)
			System.out.print(msg1);
		else
			System.out.print(age + msg2 );
			//System.out.print(msg[0]+ age + msg[1]);
		    //System.out.print(var);
		}
		
	}
}
	

