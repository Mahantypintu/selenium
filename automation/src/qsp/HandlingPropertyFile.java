package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFile {
 public static void main(String[] args) throws IOException {
// java representative object to read and convert property file to java understandable file(file reader)
// It takes path of property file as an argument	 
	FileInputStream fis=new FileInputStream("./data/commondata.property");
	// to load and retrieve the property file
	Properties p=new Properties();
	// load the property file
	p.load(fis);
	//retrieve the property file
	String url=p.getProperty("url");
    String un=p.getProperty("username");
    String pw=p.getProperty("password");
    System.out.println(url);
    System.out.println(un);
    System.out.println(pw);
}
}
