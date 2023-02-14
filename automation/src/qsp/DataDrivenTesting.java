package qsp;

import java.util.ArrayList;
import java.util.HashMap;

public class DataDrivenTesting {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("https://demo.actitime.com/");
	al.add("admin");
	al.add("admin@actitime.com");
	al.add("manager");
	System.out.println(al.get(2));
	
	HashMap<String,String> hm=new HashMap<String,String>();
	hm.put("url", "https://demo.actitime.com/");
	hm.put("un", "admin");
	hm.put("email", "admin@actitime.com");
	hm.put("pw", "manager");
	System.out.println(hm.get("pw"));
}
}
