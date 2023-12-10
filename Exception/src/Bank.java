
public class Bank {
	public void acceptCustomer() {
		Customer customer=new Customer();
		try {
			customer.takeInput();
			customer.verify();
		} catch (Exception e1) {
			System.out.println("Pls try again....");
			try {
				customer.takeInput();
				customer.verify();
			}
			catch (Exception e2) {
				System.out.println("Pls try again....");
				try {
					customer.takeInput();
					customer.verify();
				}
				catch (Exception e) {
					System.out.println("Your Account has been Blocked Contact Bank Manager...");
				}
			}
		}
	}
}
