public class MA_Advertising extends Mitarbeiter{


    public MA_Advertising(String name, String firstName, int birthYear, String workID, String department, String role,
            int hiredYear) {
        super(name, firstName, birthYear, workID, department, role, hiredYear);
    }

    /**
	 * Methode zur Fallunterscheidung
	 * @param flag // zB #manufacturing
	 */
	public void doYourWork(String flag) {
		
        if (flag == "#advertising") {
            this.postingOnSocialMedia();
        } else {
            super.doSomething();
        }
		
	} //end doYourWork
    
    /**
	 *  Ausgabe --> advertising
	 */
	
	private void postingOnSocialMedia() {
		System.out.println("Hi, I'm " + super.getFirstName() + " " + super.getName() + " and I'm posting a phothograph on IG!");		
	} //end postingOnSocialMedia

} //end Class
