
import java.util.ArrayList;
//import java.util.List;
//import java.util.Vector;

import firstPackage.*;

public class Main {

	public static void main(String[] args) {
		Firstclass obj  = new Firstclass();
		obj.pointer();
		ArrayList<Integer> p = new ArrayList<Integer>();
		p.add(565);
		System.out.println(p.get(0));
		
		Car a = new Car();
		a.run();
	}

}
