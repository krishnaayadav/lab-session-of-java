  /*
PROGRAM: java program to check the input is vowel or constant
@author: krishna yadav
@date: 18 august 2022 
*/    
	  class InputVowel
	{
	  public static void InputVowel()
	  
	{
       char vowel = 'o';       //calling as character
    int ascii = vowel;	       //integer taking
           if(vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u')	
			   System.out.println(vowel + "is vowel");
		    else
				System.out.println(vowel + "is consonant");
		   
		   if(ascii == 'a' || ascii == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u')
			        System.out.println(ascii);
	}
	         public static void main(String argu[])
			 
			 {
				 InputVowel();
				 
			 }
			 
	}