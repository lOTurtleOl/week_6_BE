package war_assignment;

public class Card {

	private int value;
	private String name;
	
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
		
	}

	public int getValue() {
		if (value < 1 || value > 13) {
	        throw new IllegalArgumentException("Value must be between 1 and 13.");
	    } else {
	    	return value;
	    }
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void describe() {
		  System.out.println(value + " of " + name);
	}

}
