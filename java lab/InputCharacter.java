  class InputCharacter
	{
	  public static void InputCharacter()
	  
	{
       char ch = '@';       //calling as character
    int ascii = ch;	       //integer taking
           if(ch>='a' && ch<='z')
			   System.out.println(ch + "is small albhabet");
		     else if(ch>='A' && ch<='Z')
				 System.out.println(ch + "is capital alphabet");
			     else if(ch>='0' && ch<='9')
					 System.out.println(ch + "is a digit");
				     else  
						 System.out.println(ch + "is a special character");
			
			 if(ascii==ch)
			        System.out.println(ascii + "is the ascii value");
	}
	         public static void main(String argu[])
			 
			 {
				 InputCharacter();
				 
			 }
			 
	}