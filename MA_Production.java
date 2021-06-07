public class MA_Production extends Mitarbeiter {

    public MA_Production(String name, String firstName, int birthYear, String workID, String department, String role,
            int hiredYear) {
        super(name, firstName, birthYear, workID, department, role, hiredYear);
    }

    /**
	 * Methode zur Fallunterscheidung
	 * @param flag // zB #manufacturing
	 */
	public void doYourWork(String flag) {
		
        if (flag == "#manufacturing") {
            this.assembleCar();
        } else {
            super.doSomething();
        }	
		
	} //end doYourWork

    /**
	 *  Ausgabe --> production
	 */
	private void assembleCar() {
		System.out.println("Hi, I'm " + super.getFirstName() + " " + super.getName() + " and I'm assembling a car!");		
	}

} //end Class
