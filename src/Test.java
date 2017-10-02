
public class Test {
public static void main (String args[]){
	int ins=11;
	myArray ds = new myArray();
	
	ds.insert(1);
	ds.insert(2);
	ds.insert(4);
	ds.insert(6);
	ds.insert(5);
	ds.insert(7);
	ds.insert(3);
		
	
	ds.display();
	//ds.delete(1);
	//ds.display();
	//ds.search(15);
	//ds.selectionSort();
	long t1=System.nanoTime();
	ds.bubble();
	long t2=System.nanoTime();
	System.out.print(t2-t1);
	ds.display();
}
}
