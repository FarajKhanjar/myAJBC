package AJBC_Bank1Project.AJBC_Bank_classes;

import java.time.LocalDate;

public class BankManager extends AccountOwner
{
	
	static Person[] usersToApprove;
	static int index = 0;
			
	public BankManager(String firstName, String lastName, int areaCode, float number, LocalDate bitrthDate,
			Account account, double monthlyIncome, Credentials credentials) 
	{
		super(firstName, lastName, areaCode, number, bitrthDate, account, monthlyIncome, credentials);
		this.usersToApprove = new AccountOwner[100];
	}
	

	public static void setUsersToApprove(Person usersToApprove) {
		BankManager.usersToApprove[index] = usersToApprove;
		index++;
	}


	private void setAndApproveAcc() {
		
	}
	private void addUserToApprove(AccountOwner accountOwner) {
		
	}
	private void produceReport(LocalDate start) {
		
	}

}