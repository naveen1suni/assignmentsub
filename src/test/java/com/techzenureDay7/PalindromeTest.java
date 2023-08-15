package com.techzenureDay7;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class PalindromeTest {
        private String s;
	    private boolean expected;
	    
	    
		public PalindromeTest(String s, boolean expected) {
			super();
			this.s = s;
			this.expected = expected;
		}
		@Parameters
		public static Collection<Object[]> getData()
		{
			List<Object[]> params=Arrays.asList(new Object[][] {
				{"eye",true},
				{"java",false},
				{"malayalam",true},
				{"madam",true},
				{"techzenure",false}
			});
			return params;	
		}


		@Test
		public void test() {
			Palindrome p=new Palindrome();
			boolean actual=p.checkPlindrome(s);
			assertEquals(expected,actual);
		}

	}