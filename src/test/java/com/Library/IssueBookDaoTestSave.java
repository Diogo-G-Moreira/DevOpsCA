package com.Library;

import static org.junit.Assert.*;



public class IssueBookDaoTestSave {

	

	public void IssueBookDaoTestSave(){
		IssueBookDao issueOp = new IssueBookDao();
		int test;
		assertEquals(1,test = issueOp.save("B@1",333, "Test", "testContact"));
		int id = 0;
		id = issueOp.select("Test");
		assertEquals(1,test = issueOp.delete(id));
//save(String bookcallno,int studentid,String studentname,String studentcontact){
	
}
	
	
	
}

