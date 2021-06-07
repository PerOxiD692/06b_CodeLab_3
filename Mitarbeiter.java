/**
 *
 * Implementierung Mitarbeiter (MA)
 * Die Klasse implementiert das Verhalten von MA in
 * accounting, production und advertising
 * 
 * @author P.Schmidt
 *
 */

public class Mitarbeiter extends Person{
	
	public String workID;
	public String department;
	public String role;
	public int hiredYear;

	public Mitarbeiter(String name, String firstName, int birthYear, String workID, String department, String role, int hiredYear) {
		super(name, firstName, birthYear);
		this.workID = workID;
		this.department = department;
		this.role = role;
		this.hiredYear = hiredYear;
	}

	/**
	 * Konstruktor Klasse
	 * 
	 * @param name 			: Familienname des MA
	 * @param firstName 	: Vorname des MA 
	 * @param birthYear 	: Geburtsjahr MA
	 * @param workID		: MA-Nr, intern
	 * @param department	: Abteilung
	 * @param role			: Job
	 */


	/**
	 * Getter
	 */
	public int gethiredYear() {
		return hiredYear;
	} //end gethiredYear
	
	/**
	 * Setter
	 */
	public void sethiredYear(int hiredYear) {
		this.hiredYear = hiredYear;
	} //end sethiredYear

	/**
	 *  Ausgabe1 // Verhalten Luch
	 */
	protected void hasLunch() {
		System.out.println("Hi, I'm " + getFirstName() + " " + getName() + " and I'm having lunch!");		
	} //end hasLunch


	/**
	 *  Ausgabe2 //  Verhalten Arbeitsbeginn
	 */

	protected void startsWork() {
		System.out.println("Hi, I'm " + getFirstName() + " " + getName() + " and I'm starting my work!");		
	} //end startsWork

	/**
	 *  Ausgabe --> Default
	 */
	protected void doSomething() {
		System.out.println("Hi, I'm doing something.");		
	} //end doSomething

	/**
	 *  Ausgabe // Betriebszugehörigkeit
	 */
	protected void saySeniority() {
		System.out.println("Hi, I'm " + getFirstName() + " " + getName() + " and I'm " + Service.rechner(this.hiredYear) + " years in this Company now.");		
	} //end saySeniority


} // end Class
