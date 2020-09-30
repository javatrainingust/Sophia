package com.exercise1.service;

import com.exerciseProject1.Util.InterestCal;
import com.exerciseProject1.modal.Account;
import com.exerciseProject1.modal.CurrentAccount;
import com.exerciseProject1.modal.FDAccount;
import com.exerciseProject1.modal.LoanAccount;
import com.exerciseProject1.modal.SBAccount;

public class GenericService {
	
	public static void main(String args[]) {
		
		InterestCal cal= new InterestCal();
		
		 SBAccount SB= new SBAccount();
		  
		  SB.setAccountnumber(7634259);
		  SB.setName("Doss");
		  SB.setAmount(47);
		  SB.CalculateInterest(1,cal);
		  
	      FDAccount FD= new FDAccount();
	      
	      FD.setAccountnumber(23455667);
	      FD.setName("Elsy");
	      FD.setAmount(2000);
	      FD.setTenure(4);
	      FD.updateFDAccounttype("yes");
	      FD.loanOutBalance(FD.getAmount());
	      FD.CalculateInterest(FD.getAmount());
	      
	      CurrentAccount CA= new CurrentAccount();
	      
	      CA.setAccountnumber(23097767);
	      CA.setName("Shan");
	      CA.setAmount(2000);
	      CA.setOverDraftLimit(CA.getOverDraftLimit()*3);
	      System.out.println("OverDraftLimit"+CA.getOverDraftLimit());
	      CA.loanOutBalance(FD.getAmount());
	      
	      LoanAccount LA= new LoanAccount();
	      
	      LA.setAccountnumber(73557767);
	      LA.setName("Soundss");
	      LA.setAmount(1000);
	      LA.loanOutBalance(LA.getAmount());
	      LA.setTenure(8);
	      LA.EmiCalulate(CA.getAmount()); 
	      System.out.println("EmiCalulate"+LA.getAmount());
	      
	      Account[] ac= {new Account(),SB,FD,CA,LA};
	      
	      for(Account account :ac){
				
				account.CalculateInterest(1,cal);
				
				if(account instanceof SBAccount){
					
					SBAccount sb = (SBAccount)account;
					
					sb.CalculateInterest(3,cal); 
	}
	      }
	}
}


