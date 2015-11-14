package namepack;

import java.util.ArrayList;

public class PrintName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String realName="L Manoranjan Das";
		ArrayList<String> nm=new ArrayList();
		
		String revName="";
		for(int i=realName.length()-1;i>=0;i--)
		{
			
			revName=revName+realName.charAt(i);
			
		}
		
		System.out.println("The reverse name is " +revName);
	}

}
