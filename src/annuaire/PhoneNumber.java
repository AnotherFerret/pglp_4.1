package annuaire;

public class PhoneNumber {

	String phone; 
	
	public PhoneNumber(String phone)
	{
		if(phone.length() < 10)
		{
			//exception à gérer
			this.phone = "0000000000";
		}
		else
		{
			this.phone = phone;
		}
	}
}
