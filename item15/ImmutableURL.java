import java.util.*;
import java.math.*;

// why it is a good idea to make immutable class final
// The class MutableURL can be passed like a ImmutableURL, and do some damage.

// thoughts: should it be the user's job to check if the argument is actually the right class?
// use inputargument.getClass() == ImmutableClass.class

// is it also because it is rare that we need to extend a immutable class?



//missing final keyword 
class ImmutableURL{
    // immutable class 
    private final String url; 
    public ImmutableURL(String url){
	this.url = url;
    }
    public String geturl(){
	return url;
    }
	
    public static void main(String []args){
	ImmutableURL immu = new ImmutableURL("www.google.com");
	MutableURL mu = new MutableURL("www.google.com");
	GOTOURL g1 = new GOTOURL(immu);
	GOTOURL g2 = new GOTOURL(mu);
    }

}

class GOTOURL{
    public GOTOURL(ImmutableURL iu){
	if (!(iu instanceof ImmutableURL)){
	    System.out.println("not a instance");
	}
	System.out.println("testing : " + iu.geturl());
	System.out.println("going to url : " + iu.geturl());
	System.out.println("\n");
    }
}

class MutableURL extends ImmutableURL{
    private String newurl = "";
    private int count = 0;
    public MutableURL(String url){
	super(url);
	newurl = "www.evilmaster.com"; 
    }
    public String geturl(){
	if(count == 0){
	    count ++;
	    return super.geturl();
	}else{
	    // I am going to return something evil on the second time
	    return newurl;
	}
    }
}

	
	
	
    
    
    
