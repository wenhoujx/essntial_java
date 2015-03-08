import java.util.*;
// this script is to test if we add an object into set,
// we are adding the reference, instead of a copy of the object,
// therefore it is more desirable to add immutable object into set or map 
    
class MutableSet{
    public int i = 0;
    public MutableSet(int i){
	this.i = i;
    }
    @Override public String toString(){
	return Integer.toString(i);
    }
    public static void main(String [] args){
	Set<MutableSet> a = new HashSet<MutableSet>();
	MutableSet x = new MutableSet(10);
	System.out.println(x); 
	a.add(x);
	System.out.println("items in the set"); 
	for(MutableSet m: a){
	    System.out.println(m);
	}
	x.i = 20;
	System.out.println("change 10 to 20");
	System.out.println("items in the set"); 
	for(MutableSet m: a){
	    System.out.println(m);
	}
	
	
	
	
    }
}
