import java.util.*;
import java.math.*;

class Test1{
    public static void main(String []args){
	
	String a = new String("qwertyuioppoiuytrewq");
	long t0 = System.currentTimeMillis();
	for(int i =0; i< 10000; ++i){
	    a += "asdf";
	}
	long t1 = System.currentTimeMillis();
	System.out.println("immutable running time : " + (t1 - t0));


	StringBuffer c = new StringBuffer("qwertyuioppoiuytrewq");
	t0 = System.currentTimeMillis();
	for(int i =0; i< 10000; ++i){
	    c.append("asdf");
	}
	t1 = System.currentTimeMillis();
	System.out.println("immutable running time : " + (t1 - t0));
	
    }
}
    
