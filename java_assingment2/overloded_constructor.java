class construct_clas{

	private int int_var;
	
	private double double_var;

	construct_clas(){

		int_var = 1;
		
		double_var = 1.0001;
	}

	construct_clas ( int int_arg , double double_arg){   // constructor overloading
		
		this.int_var = int_arg;
		
		this.double_var = double_arg;

		new construct_clas();
	}
	public void print_element(){

		System.out.println("int_var=\t" + this.int_var + "\tdouble_var=\t" + this.double_var);
	}

	  public static void main(String[] args) {

	  	   construct_clas construct_class_instance = new construct_clas(1, 1.11); 
	  	  
	  	   construct_class_instance.print_element();   // to check whether first constructor is called inside second on.
	 
	 }
}