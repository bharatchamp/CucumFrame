package test;

import org.testng.annotations.Test;

import pages.FormFillup_Page;

public class FormFillup_Test {

	FormFillup_Page formobj = new FormFillup_Page();
	
	@Test(priority = 1, enabled =true)
	public void formFillup() {
		
		formobj.formFillup();
	}
	
}
