package de.tilman_neumann.util.Testing;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import de.tilman_neumann.util.StringUtil;

class StringUnitTest {

	@Test
	void repeatTest1() 
	{
		//AAA
		String s= "";
		int n=2;
		String result = StringUtil.repeat(s, n);
		assertEquals("", result);
	}
	@Test
	void repeatTest2() 
	{
		//AAA
		String s= "";
		int n=-2;
		String result = StringUtil.repeat(s, n);
		assertEquals(null, result);
	}
	@Test
	void repeatTest3() 
	{
		//AAA
		String s= "";
		int n=0;
		String result = StringUtil.repeat(s, n);
		assertEquals(null, result);
	}
	
	
	@Test
	void repeatTest4() 
	{
		//AAA
		String s= null;
		int n=2;
		String result = StringUtil.repeat(s, n);
		assertEquals(null, result);
	}
	@Test
	void repeatTest5() 
	{
		//AAA
		String s= null;
		int n=-2;
		String result = StringUtil.repeat(s, n);
		assertEquals(null, result);
	}
	@Test
	void repeatTest6() 
	{
		//AAA
		String s= null;
		int n=0;
		String result = StringUtil.repeat(s, n);
		assertEquals(null, result);
	}
	@Test
	void repeatTest7() 
	{
		//AAA
		String s= "abcd";
		int n=2;
		String result = StringUtil.repeat(s, n);
		assertEquals("abcdabcd", result);
	}
	@Test
	void repeatTest8() 
	{
		//AAA
		String s= "abcd";
		int n=-2;
		String result = StringUtil.repeat(s, n);
		assertEquals(null, result);
	}
	@Test
	void repeatTest9() 
	{
		//AAA
		String s= "abcd";
		int n=0;
		String result = StringUtil.repeat(s, n);
		assertEquals(null, result);
	}
	//-------------------------------------------------------------
	@Test
	void formatLeftTest1() 
	{
		//AAA
		String s= "";
		String mask="12345";
		String result = StringUtil.formatLeft(s, mask);
		assertEquals("12345", result);
	}
	@Test
	void formatLeftTest2() 
	{
		//AAA
		String s= "";
		String mask=null;
		String result = StringUtil.formatLeft(s, mask);
		assertEquals("", result);
	}
	@Test
	void formatLeftTest3() 
	{
		//AAA
		String s= "abcd";
		String mask="";
		String result = StringUtil.formatLeft(s, mask);
		assertEquals("abcd", result);
	}
	@Test
	void formatLeftTest4() 
	{
		//AAA
		String s= "";
		String mask="";
		String result = StringUtil.formatLeft(s, mask);
		assertEquals("", result);
	}
	@Test
	void formatLeftTest5() 
	{
		//AAA
		String s=null;
		String mask=null;
		String result = StringUtil.formatLeft(s, mask);
		assertEquals("", result);
	}
	@Test
	void formatLeftTest6() 
	{
		//AAA
		String s=null;
		String mask="";
		String result = StringUtil.formatLeft(s, mask);
		assertEquals("", result);
	}
	@Test
	void formatLeftTest7() 
	{
		//AAA
		String s= null;
		String mask="12345";
		String result = StringUtil.formatLeft(s, mask);
		assertEquals("12345", result);
	}
	@Test
	void formatLeftTest8() 
	{
		//AAA
		String s= "abcd";
		String mask=null;
		String result = StringUtil.formatLeft(s, mask);
		assertEquals("abcd", result);
	}
	@Test
	void formatLeftTest9() 
	{
		//AAA
		String s= "abcd";
		String mask="1234";
		String result = StringUtil.formatLeft(s, mask);
		assertEquals("abcd", result);
	}
	@Test
	void formatLeftTest10() 
	{
		//AAA
		String s= "abcd";
		String mask="123";
		String result = StringUtil.formatLeft(s, mask);
		assertEquals("abcd", result);
	}
	@Test
	void formatLeftTest11() 
	{
		//AAA
		String s= "abcd";
		String mask="12345";
		String result = StringUtil.formatLeft(s, mask);
		assertEquals("abcd5", result);
	}
	//-------------------------------------------------------------
	@Test
	void formatRightTest1() 
	{
		//AAA
		String s= "";
		String mask="12345";
		String result = StringUtil.formatRight(s, mask);
		assertEquals("12345", result);
	}
	@Test
	void formatRightTest2() 
	{
		//AAA
		String s= "";
		String mask=null;
		String result = StringUtil.formatRight(s, mask);
		assertEquals("", result);
	}
	@Test
	void formatRightTest3() 
	{
		//AAA
		String s= "abcde";
		String mask="";
		String result = StringUtil.formatRight(s, mask);
		assertEquals("abcde", result);
	}
	@Test
	void formatRightTest4() 
	{
		//AAA
		String s= "";
		String mask="";
		String result = StringUtil.formatRight(s, mask);
		assertEquals("", result);
	}
	@Test
	void formatRightTest5() 
	{
		//AAA
		String s=null;
		String mask=null;
		String result = StringUtil.formatRight(s, mask);
		assertEquals("", result);
	}
	@Test
	void formatRightTest6() 
	{
		//AAA
		String s=null;
		String mask="";
		String result = StringUtil.formatRight(s, mask);
		assertEquals("", result);
	}
	@Test
	void formatRightTest7() 
	{
		//AAA
		String s= null;
		String mask="12345";
		String result = StringUtil.formatRight(s, mask);
		assertEquals("12345", result);
	}
	@Test
	void formatRightTest8() 
	{
		//AAA
		String s= "abcde";
		String mask=null;
		String result = StringUtil.formatRight(s, mask);
		assertEquals("abcde", result);
	}
	@Test
	void formatRightTest9() 
	{
		//AAA
		String s= "abcde";
		String mask="12345";
		String result = StringUtil.formatRight(s, mask);
		assertEquals("abcde", result);
	}
	@Test
	void formatRightTest10() 
	{
		//AAA
		String s= "abcde";
		String mask="123";
		String result = StringUtil.formatRight(s, mask);
		assertEquals("abcde", result);
	}
	@Test
	void formatRightTest11() 
	{
		//AAA
		String s= "abcde";
		String mask="123456";
		String result = StringUtil.formatRight(s, mask);
		assertEquals("1abcde", result);
	}
	


}
