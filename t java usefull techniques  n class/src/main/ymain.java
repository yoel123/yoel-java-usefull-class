package main;

import yclass.S;

public class ymain {

	public static void main(String[] args) {
		S.o("test S.o");
		
		//test table row
		String[] tbl = {"1","vsca","vwswfe"};
		S.o(S.table(tbl,10));
		
		S.o("\n");
		
		//test output full table
		String[][] tbl2 = 
		{
			{"id","name","age"},
			{"------","------","-----"},
			{"1","jon","25"},
			{"2","rose","22"},
			{"3","alen","33"},
			{"id","name","age"}
		};
		
		String the_tbl =S.table(tbl2,7);
		
		S.o(the_tbl);

	}

}
