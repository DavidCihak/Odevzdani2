package cz.spsejecna.cihak.greeting;

public class MyName {
	private String name = "Dawe";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void sayHello() { 
		System.out.println("Hi" + this.name);
	}

}
