package oop02.nestedClasses;
/*
Local 내부 클래스에서는 외부 클래스의 멤버를 접근하는데 있어서
제한이 따른다. 우선 외부 클래스의 멤버변수는 접근할 수 있다.
하지만 메서드 내에 있는 지역변수는 접근할 수 없다.
* */
// System.out.println("지역변수 b" + b);
// 이렇게 코딩하면 b에서 에러메시지가 뜬다.
public class LocalClassDemo {
	 static String regularExpression = "[^0-9]";
	  
	    public static void validatePhoneNumber(
	        String phoneNumber1, String phoneNumber2) {
	      
	        final int numberLength = 10;
	        
	        // Valid in JDK 8 and later:
	       
	        // int numberLength = 10;
	       
	        class PhoneNumber {
	            
	            String formattedPhoneNumber = null;

	            PhoneNumber(String phoneNumber){
	                // numberLength = 7;
	                String currentNumber = phoneNumber.replaceAll(
	                  regularExpression, "");
	                if (currentNumber.length() == numberLength)
	                    formattedPhoneNumber = currentNumber;
	                else
	                    formattedPhoneNumber = null;
	            }

	            public String getNumber() {
	                return formattedPhoneNumber;
	            }
	            
	            // Valid in JDK 8 and later:

//	            public void printOriginalNumbers() {
//	                System.out.println("Original numbers are " + phoneNumber1 +
//	                    " and " + phoneNumber2);
//	            }
	        }

	        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
	        PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);
	        
	        // Valid in JDK 8 and later:

//	        myNumber1.printOriginalNumbers();

	        if (myNumber1.getNumber() == null) 
	            System.out.println("First number is invalid");
	        else
	            System.out.println("First number is " + myNumber1.getNumber());
	        if (myNumber2.getNumber() == null)
	            System.out.println("Second number is invalid");
	        else
	            System.out.println("Second number is " + myNumber2.getNumber());

	    }

	    public static void main(String... args) {
	        validatePhoneNumber("123-456-7890", "456-7890");
	    }
}
