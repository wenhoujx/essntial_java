import java.util.*;
import java.math.*;

// this script show the overhead of creating immutable object over and over again in a loop

class Test1{
    public static void main(String []args){
	
	String a = new String("qwertyuioppoiuytrewq");
	long t0 = System.currentTimeMillis();
	for(int i =0; i< 10000; ++i){
	    a += "asdf";
	}
	long t1 = System.currentTimeMillis();
	System.out.println("immutable running time : " + (t1 - t0));


	StringBuilder c = new StringBuilder("qwertyuioppoiuytrewq");
	t0 = System.currentTimeMillis();
	for(int i =0; i< 10000; ++i){
	    c.append("asdf");
	}
	t1 = System.currentTimeMillis();
	System.out.println("immutable running time : " + (t1 - t0));
	
    }
}
    
