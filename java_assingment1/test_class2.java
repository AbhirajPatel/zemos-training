package  abhiraj.assignment.singleton ;
public class test_class2{
	private static String string_var;
	/*- non static variable name cannot be referenced from a static context, that's why i made it to be a static variable */

    public static test_class2 initialisation ( String arg){
    	string_var = arg;
    	/* - a static method can have access only to static variables and static methods, static fields and methods are 
    	shared with all instances of the class and they are like globle type of thing for all instance of the class */
    	return new test_class2();
    }
    public void print_string(){
    	System.out.println(string_var);
    }

}