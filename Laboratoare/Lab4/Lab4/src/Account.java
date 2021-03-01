

	public class Account {
		String nume;
		double sum;
		double interest;
		
		protected Account(String nume, double sum, double interest) {
			this.nume = nume;
			this.sum = sum;
			this.interest = interest;
		}
		
		static class Transaction {
			
			public void withdraw(Account a, double nr) {
				a.sum = a.sum - nr - (a.interest / 100 * nr);
			}
			
			public void deposit(Account a, double nr) {
				a.sum = a.sum + nr + (a.interest / 100 * nr);
			}
			
		}
		
		public void displaySum() {
			System.out.println("Sum = " + sum + " lei");
		}
		
		public static void main(String[] args) {
			Account account = new Account("Ana", 2000, 10);
			Account.Transaction transaction = new Account.Transaction();
			transaction.withdraw(account, 20);
			transaction.deposit(account, 59);
			transaction.withdraw(account, 92);
			account.displaySum();
			Account account2 = new Account("Ana", 2000, 10) {
				public void displaySum() {
					System.out.println("Sum = " + sum / 4.5 + " euro");
				}
			};
			account2.displaySum();
		}
	}


