
public class House {
	
	public void portico() {
		System.out.println("portico");
	}
	
	public void hall() {
		
		System.out.println("hall");
	}	
	
	public void bedroom() {
		System.out.println("bedrom");
	}
	
	
	public void storeRoom() {
		
		System.out.println("store room");
	}
	
	public void kitchen() {
		System.out.println("kitchen");
	}
	
	public void guestRoom() {
		System.out.println("guestRoom");
	}
	
	public static void main(String[] args) {
		
		System.out.println("house");
		
		House h=new House();
		House h1=new House();
		House h2=new House();
		House h3=new House();
		House h4=new House();
	
		h.portico();
	}

}
