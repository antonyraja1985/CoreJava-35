package singleinheritance;

//sub class
//child class
public class Jit extends AnnaUniversity,TnGoverment{
	
    public	Jit(){
		System.out.println("constructor calling");
	}
	
	public void result() {
		System.out.println("result published");
	}
	
	public static void main(String[] args) {
		
		Jit jit=new Jit();
		jit.result();
		jit.notification();
		System.out.println(jit.UniverName);
	}

}
