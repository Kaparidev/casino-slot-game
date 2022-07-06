package casino.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bet_transactions")
public class Casino {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long playerId;
	
	@Column(name = "amount", nullable = false)
	public double amount;
	
	@Column(name = "balance")
	public double balance;
	
	@Column(name = "transactionType")
	public static String [] transactionType= {"WAGER","WIN"};
	
	@Column(name = "username")
	public String username;
	
	@Column(name = "Transactionsarray")
	public String [] Transactionsarray;
	
	public Casino() {
		
	}
	

	public Casino( String [] Transactionsarray) {
		super();
		this.Transactionsarray = Transactionsarray;
		
	}
	
	
	public Casino(double amount, double balance,String username) {
		
		super();
		this.amount=amount;
		this.balance = balance;
		this.username = username;
	}

	public Long getplayerId() {
		return playerId;
	}
	public void setplayerId(Long playerId) {
		this.playerId = playerId;
	}
	public double getamount() {
		return amount;
	}
	public void setamount(double amount) {
		this.amount = amount;
	}
	public double getbalance(Long id) {
		return balance;
	}
	public void setbalance(double balance) {
		this.balance = balance;
	}
	public String[] gettransactionType() {
		return transactionType;
	}
	public void settransactionType(String[] transactionType) {
		this.transactionType = transactionType;
	}

	public String getusername() {
		return username;
	}

	public void setusername(String username) {
		this.username = username;
	}

	public String[] setTransactionsarray(String[] Transactionsarray) {
		return Transactionsarray;
	}

	public void getTransactionsarray(String[] Transactionsarray) {
		this.Transactionsarray = Transactionsarray;
	}
	
}
