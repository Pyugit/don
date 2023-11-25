package string;

import java.util.*;
//import java.util.ArrayList;
//import java.util.Collections;

public class sr1 {

	public static void main(String[] args) {
		 
ArrayList var = new ArrayList();
var.add('z');
var.add('j');
var.add('a');
var.add('u');
var.add('j');
var.add('a');

System.out.println(var);
Collections.sort(var);
System.out.println(var);
Collections.sort(var, Collections.reverseOrder());
System.out.println(var);
	}

}
