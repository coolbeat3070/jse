package api01.lang.reflect;

import java.lang.reflect.Method;

public class ReflectionDemo {
	 public static void main(String args[])
     {
        try {
           Class c = Class.forName(args[0]);
           Method m[] = c.getDeclaredMethods();
           for (int i = 0; i < m.length; i++)
           System.out.println(m[i].toString());
        }
        catch (Throwable e) {
           System.err.println(e);
        }
     }
}
