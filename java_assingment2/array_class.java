class array_clas{
	private String string_var;
    private int int_var;
    array_clas(String string_args){
    	this.string_var = string_args; 
    	System.out.println("arg: \t" + string_args);
    }
    public static void main(String[] args) {
    	array_clas ary[] = new array_clas[10];

          /*  if we run the programme till this then, the initialisation message form the will not be printed 
          as only reference is created and object is not created so constructor will not be called */
    	for(int i= 0; i < 10 ; i++)
    	{
    		ary[i] = new array_clas("Abhiraj");  // now for each loop constructor message will be printed. 
    	}

    }
}