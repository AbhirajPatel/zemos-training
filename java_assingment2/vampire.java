import java.util.Arrays;
public class vampire{

	public static int No_of_digit(int x){  // - to check the no of digit in any integer
		int flag_var=1;
		while(x/10 != 0 )
		{
			flag_var++;
			x= x/10;
		}
		return flag_var;
	}
	public static String sort(String args) { // to sord the string variable
    
        String original = args;
        char[] chars = original.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted;
        
    }
	
	
	public static void main (String[] args) {
		
		int int_vam_var = 10;
		int count_var=1;
		int lowest_vam_var = 10;
		
		int dummy_x = 0; // factor testing
		int dummy_y = 0; // second factor testing
		int no_of_digit_in_vam;   // no of digit in vampire no
		String str_vam;
		String testing_string;
		while(count_var < 101)
		{
           //System.out.println("hello testing " + count_var + "\n");
           if(No_of_digit(int_vam_var) % 2 != 0)
           		{
           			lowest_vam_var = lowest_vam_var*100;
           			int_vam_var = lowest_vam_var;
           		}

           	no_of_digit_in_vam=No_of_digit(int_vam_var);
           	
           	for(dummy_x =(int)Math.sqrt(int_vam_var);dummy_x < lowest_vam_var ; dummy_x++)
           	{
              
              if(no_of_digit_in_vam%2 != 0)
              {
                break;
              }
           		
           		if(int_vam_var % dummy_x == 0){
           		
           			dummy_y = int_vam_var/dummy_x;
                 
           		if((dummy_x % 10 == 0) && (dummy_y % 10 == 0))
                {continue ; }
           		
           		testing_string = sort(Integer.toString(dummy_x) + Integer.toString(dummy_y));

           		str_vam = sort(Integer.toString(int_vam_var));
               
           		if(str_vam.equals(testing_string)){
           	   	
           			System.out.println("count: " +count_var + "\t vampir:\t" + int_vam_var + "\t x= \t" + dummy_x + "\t y=\t "+ dummy_y);
                int_vam_var++;
           			count_var++;
           			break;
           		}
           	}
           		}
           	      
           	int_vam_var++;
		}
	}
}