public class MA_Accounting extends Mitarbeiter{

    public MA_Accounting(String name, String firstName, int birthYear, String workID, String department, String role,
            int hiredYear) {
        super(name, firstName, birthYear, workID, department, role, hiredYear);
    }

    /**
	 * Methode zur Fallunterscheidung
	 * @param flag // zB #manufacturing
	 */
	public void doYourWork(String flag) {
		
        	if (flag == "#accounting") {
                this.checkAccount();
            } else {
                this.doSomething();
            }

		} //end doYourWork		

    /**
	 *  Ausgabe --> accounting
	 */
	private void checkAccount() {
		System.out.println("Hi, I'm " + super.getFirstName() + " " + super.getName() + " and I'm checking a customer's account!");		
	} //end checkAccount

	} //end Class