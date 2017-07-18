package abhiraj.assignment.main ;
import abhiraj.assignment.data.test_class1; // importing the class1
import abhiraj.assignment.singleton.test_class2; // importing the class2. 

 public class main_class{
    
 	
 	public static void main (String arg[]){
 		
 		test_class1 instance1 = new test_class1();
 		instance1.print_var();
 		instance1.print_local_var();

 		test_class2 instance2 = new test_class2();
 		
 		instance2.print_string(); /* this will print null as we have not initialised the string, the default initialisation 
 		will be printed on screen, inorder to initailis we have to call the initaiisaton method of second class. */
 	}
 }