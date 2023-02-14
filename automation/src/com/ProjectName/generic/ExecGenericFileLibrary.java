package com.ProjectName.generic;

import java.io.IOException;

public class ExecGenericFileLibrary {
  public static void main(String[] args) throws IOException {
	GenericFileLibrary gf= new GenericFileLibrary();
	System.out.println(gf.getPropertyData("url"));
	System.out.println(gf.getExcelData("sheet2", 2, 1));
	gf.setExcelData("Create Customer", 1, 4, "skipped");
}
}
