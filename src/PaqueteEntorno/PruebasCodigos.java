package PaqueteEntorno;


import javax.swing.JOptionPane;

public class PruebasCodigos {

	public static void main(String[] args) {
		String mail = JOptionPane.showInputDialog("Introduce mail;");
		
		
		JOptionPane.showMessageDialog(null , controlMail(mail),"Informacion", 1,null);
		
	
	}
	
	public static String controlMail(String mail) {
		
		boolean control=true;
		while(control) {
			int cont = 1 , cont2 =1;
			
			if(mail.length()>3) 
			{
				for(int i = 0 ; i < mail.length();i++) {
					if(mail.charAt(i)=='@') cont++;
					else if (mail.charAt(i)=='.') cont2++;
					
				}
				
			}if(cont==1 && cont2==1) {
				control = false;
			}else mail= JOptionPane.showInputDialog("Dame otro email");			
			
			}
		return "EL mail introducido es correcto";
	}

}
