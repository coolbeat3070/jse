package oop06.nestedClasses;

public class InnerClassAnonyHello {
	interface GreetingService {
        public void greet(String name);
    }
  
    public void sayHello() {
        
    	/*
    	 * 내부클래스 인터페이스 구현 방법 1
    	 * */
    	
        class EnglishGreetingServiceImpl implements GreetingService {
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        }
      
        GreetingService englishGreeting = new EnglishGreetingServiceImpl();
        
        /*
    	 * 내부클래스 인터페이스 구현 방법 2
    	 * */
        
        GreetingService koreanGreeting = new GreetingService() {
            public void greet(String name) {  
                System.out.println("안녕하세요 " + name);
            }
        };
        englishGreeting.greet("TOM");
        koreanGreeting.greet("김태희");
    }

    public static void main(String... args) {
        InnerClassAnonyHello greet = new InnerClassAnonyHello();
        greet.sayHello();
    }            
}
