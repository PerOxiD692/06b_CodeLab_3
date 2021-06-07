public class Person {

    private String name;
	private String firstName;
	private int birthYear;

	public Person(String name, String firstName, int birthYear) {
        this.name = name;
        this.firstName = firstName;
        this.birthYear = birthYear;
    }

    /**
	 * Getter
	 * @return name  // Familienname MA
	 */
	public String getName() {
		return name;
	} //end getName
	
	/**
	 * Setter
	 * @param name // Familienname MA
	 */
	public void setName(String name) {
		this.name = name;
	} //end setName
	
	/**
	 * Getter
	 * @return fistName // Vorname MA
	 * 
	 */
	public String getFirstName() {
		return firstName;
	} //getFirstName
	
	/**
	 * Setter
	 * @param firstName // Vorname MA
	 * Vorname
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	} //end setFirstName
	
	/**
	 * Getter
	 * @return birthYear // Geburtsjahr MA
	 */
	public int getBirthYear() {
		return birthYear;
	} //end getBirthYear
	
	/**
	 * Setter
	 * @param birthYear // Geburtsjahr MA
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	} //end setBirthYear

}
