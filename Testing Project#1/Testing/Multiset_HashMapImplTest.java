package de.tilman_neumann.util.Testing;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.jupiter.api.Test;

import de.tilman_neumann.util.Multiset;
import de.tilman_neumann.util.Multiset_HashMapImpl;

class Multiset_HashMapImplTest {

	//add(T entry)
	@Test
	public void addTestEmptyString()
	{
		//AAA
		Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
		Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
		int x;
		
		x = hash.add("");
		ex.add("");
		Multiset_HashMapImpl n=hash;
		
		assertEquals(ex, n);
		assertEquals(0, x);
	}
	@Test
	public void addTestString()
	{
		//AAA
		Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
		Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
		int x;
		
		x = hash.add("123");
		ex.add("123");
		Multiset_HashMapImpl n=hash;
		
		assertEquals(ex, n);
		assertEquals(0, x);
	}
	@Test
	public void addTestInteger()
	{
		//AAA
		Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
		Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
		int x;
		
		x = hash.add(2);
		ex.add(2);
		Multiset_HashMapImpl n=hash;
		
		assertEquals(ex, n);
		assertEquals(0, x);
	}
	//msh aked
	@Test
	public void addTestNull()
	{
		//AAA
		Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
		Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
		int x;
		
		x = hash.add(null);
		ex.add(null);
		Multiset_HashMapImpl n=hash;
		
		assertEquals(ex, n);
		assertEquals(0, x);
	}
	@Test
	public void addTestDouble()
	{
		//AAA
		Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
		Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
		int x;
		
		x = hash.add(1.2);
		ex.add(1.2);
		Multiset_HashMapImpl n=hash;
		
		assertEquals(ex, n);
		assertEquals(0, x);
	}
//-----------------------------------------------------------------------
	//add(T entry, int mult)
	@Test
	public void addTestStringWithPosition()
	{
		//AAA
		Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
		Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
		int x;
		
		x = hash.add("123",2);
		ex.add("123",2);
		Multiset_HashMapImpl n=hash;
		
		assertEquals(0, x);
		assertEquals(ex, n);
	}
	@Test
	public void addTestStringWithPositionnegative()
	{
		//AAA
		Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
		Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
		int x;
		
		x = hash.add("123",-2);
		ex.add("123",-2);
		Multiset_HashMapImpl n=hash;
		
		assertEquals(0, x);
		assertEquals(ex, n);
	}
	@Test
	public void addTestStringWithPositionzero()
	{
		//AAA
		Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
		Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
		int x;
		
		x = hash.add("123",0);
		ex.add("123",0);
		Multiset_HashMapImpl n=hash;
		
		assertEquals(0, x);
		assertEquals(ex, n);
	}
	@Test
	public void addTestIntegerWithPosition()
	{
		//AAA
		Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
		Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
		int x;
		
		x = hash.add(2,2);
		ex.add(2,2);
		Multiset_HashMapImpl n=hash;
		
		assertEquals(0, x);
		assertEquals(ex, n);
	}
	@Test
	public void addTestEmptyStringWithPosition()
	{
		//AAA
		Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
		Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
		int x;
		
		x = hash.add("",2);
		ex.add("",2);
		Multiset_HashMapImpl n=hash;
		
		assertEquals(0, x);
		assertEquals(ex, n);
	}
	//msh aked
	@Test
	public void addTestNullWithPosition()
	{
		//AAA
		Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
		Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
		int x;
		
		x = hash.add(null,2);
		ex.add(null,2);
		Multiset_HashMapImpl n=hash;
		
		assertEquals(0, x);
		assertEquals(ex, n);
	}
	@Test
	public void addTestDoubleWithPosition()
	{
		//AAA
		Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
		Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
		int x;
		
		x = hash.add(1.2,2);
		ex.add(1.2,2);
		Multiset_HashMapImpl n=hash;
		
		assertEquals(0, x);
		assertEquals(ex, n);
	}
	//-----------------------------------------------------------
	//addAll(Multiset<T> other)
		@Test
		public void addAllTestEmptyStringMultiset()
		{
			//AAA
			Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
			Multiset_HashMapImpl input = new  Multiset_HashMapImpl();
			Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
			
			input.add("");
			input.add("");
			
			Mockery mockingContext;
			mockingContext = new Mockery();
			Multiset mockedObject = mockingContext.mock(Multiset.class);
			mockingContext.checking(new Expectations(){
			{
				oneOf(mockedObject).add(input);
				will(returnValue(1));
			}
			});
			
			hash.addAll(input);
			ex.add("");
			ex.add("");
			Multiset_HashMapImpl n=hash;
			
			assertEquals(ex, n);
		}
		@Test
		public void addAllTestStringMultiset()
		{
			//AAA
			Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
			Multiset_HashMapImpl input = new  Multiset_HashMapImpl();
			Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
			
			input.add("12");
			input.add("123");
			input.add("124");
			input.add("125");
			
			Mockery mockingContext;
			mockingContext = new Mockery();
			Multiset mockedObject = mockingContext.mock(Multiset.class);
			mockingContext.checking(new Expectations(){
			{
				oneOf(mockedObject).add(input);
				will(returnValue(1));
			}
			});
			
			hash.addAll(input);
			ex.add("12");
			ex.add("123");
			ex.add("124");
			ex.add("125");
			Multiset_HashMapImpl n=hash;
			
			assertEquals(ex, n);
		}
		@Test
		public void addAllTestIntegerMultiset()
		{
			//AAA
			Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
			Multiset_HashMapImpl input = new  Multiset_HashMapImpl();
			Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
			
			input.add(1);
			input.add(2);
			input.add(3);
			input.add(4);
			
			Mockery mockingContext;
			mockingContext = new Mockery();
			Multiset mockedObject = mockingContext.mock(Multiset.class);
			mockingContext.checking(new Expectations(){
			{
				oneOf(mockedObject).add(input);
				will(returnValue(1));
			}
			});
			
			hash.addAll(input);
			ex.add(1);
			ex.add(2);
			ex.add(3);
			ex.add(4);
			Multiset_HashMapImpl n=hash;
			
			assertEquals(ex, n);
		}
		//msh aked
		@Test
		public void addAllTestNullMultiset()
		{
			//AAA
			Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
			Multiset_HashMapImpl input = new  Multiset_HashMapImpl();
			Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
			
			input.add(null);
			input.add(null);
			
			Mockery mockingContext;
			mockingContext = new Mockery();
			Multiset mockedObject = mockingContext.mock(Multiset.class);
			mockingContext.checking(new Expectations(){
			{
				oneOf(mockedObject).add(input);
				will(returnValue(1));
			}
			});
			
			hash.addAll(input);
			ex.add(null);
			ex.add(null);
			Multiset_HashMapImpl n=hash;
			
			assertEquals(ex, n);
		}
		@Test
		public void addAllTestDoubleMultiset()
		{
			//AAA
			Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
			Multiset_HashMapImpl input = new  Multiset_HashMapImpl();
			Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
			
			input.add(1.2);
			input.add(2.2);
			input.add(3.2);
			input.add(4.2);
			
			Mockery mockingContext;
			mockingContext = new Mockery();
			Multiset mockedObject = mockingContext.mock(Multiset.class);
			mockingContext.checking(new Expectations(){
			{
				oneOf(mockedObject).add(input);
				will(returnValue(1));
			}
			});
			
			hash.addAll(input);
			ex.add(1.2);
			ex.add(2.2);
			ex.add(3.2);
			ex.add(4.2);
			Multiset_HashMapImpl n=hash;
			
			assertEquals(ex, n);
		}
		@Test
		public void addAllTestMultiset()
		{
			//AAA
			Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
			Multiset_HashMapImpl input = new  Multiset_HashMapImpl();
			Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
			
			input.add("12");
			input.add("");
			input.add(1);
			input.add(2.2);
			
			Mockery mockingContext;
			mockingContext = new Mockery();
			Multiset mockedObject = mockingContext.mock(Multiset.class);
			mockingContext.checking(new Expectations(){
			{
				oneOf(mockedObject).add(input);
				will(returnValue(1));
			}
			});
			
			hash.addAll(input);
			ex.add("12");
			ex.add("");
			ex.add(1);
			ex.add(2.2);
			Multiset_HashMapImpl n=hash;
			
			assertEquals(ex, n);
		}
	//-----------------------------------------------------------------------
		//addAll(Collection<T> values)
				@Test
				public void addAllTestEmptyStringCollection()
				{
					//AAA
					Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
					ArrayList<String> input = new ArrayList<String>() ;
					Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
					
					input.add("");
					input.add("");
					Collection c = input;
					
					Mockery mockingContext;
					mockingContext = new Mockery();
					Multiset mockedObject = mockingContext.mock(Multiset.class);
					mockingContext.checking(new Expectations(){
					{
						oneOf(mockedObject).add(c);
						will(returnValue(1));
					}
					});
					
					hash.addAll(c);
					ex.add("");
					ex.add("");
					Multiset_HashMapImpl n=hash;
					
					assertEquals(ex, n);
				}
				@Test
				public void addAllTestStringCollection()
				{
					//AAA
					Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
					ArrayList<String> input = new ArrayList<String>() ;
					Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
					
					input.add("12");
					input.add("123");
					input.add("124");
					input.add("125");
					Collection c = input;
					
					Mockery mockingContext;
					mockingContext = new Mockery();
					Multiset mockedObject = mockingContext.mock(Multiset.class);
					mockingContext.checking(new Expectations(){
					{
						oneOf(mockedObject).add(c);
						will(returnValue(1));
					}
					});
					
					hash.addAll(c);
					ex.add("12");
					ex.add("123");
					ex.add("124");
					ex.add("125");
					Multiset_HashMapImpl n=hash;
					
					assertEquals(ex, n);
				}
				@Test
				public void addAllTestIntegerCollection()
				{
					//AAA
					Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
					ArrayList<Integer> input = new ArrayList<Integer>() ;
					Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
					
					input.add(1);
					input.add(2);
					input.add(3);
					input.add(4);
					Collection c = input;
					
					Mockery mockingContext;
					mockingContext = new Mockery();
					Multiset mockedObject = mockingContext.mock(Multiset.class);
					mockingContext.checking(new Expectations(){
					{
						oneOf(mockedObject).add(c);
						will(returnValue(1));
					}
					});
					
					hash.addAll(c);
					ex.add(1);
					ex.add(2);
					ex.add(3);
					ex.add(4);
					Multiset_HashMapImpl n=hash;
					
					assertEquals(ex, n);
				}
				//msh aked
				@Test
				public void addAllTestNullCollection()
				{
					//AAA
					Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
					ArrayList<String> input = new ArrayList<String>() ;
					Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
					
					input.add(null);
					input.add(null);
					Collection c = input;
					
					Mockery mockingContext;
					mockingContext = new Mockery();
					Multiset mockedObject = mockingContext.mock(Multiset.class);
					mockingContext.checking(new Expectations(){
					{
						oneOf(mockedObject).add(c);
						will(returnValue(1));
					}
					});
					
					hash.addAll(c);
					ex.add(null);
					ex.add(null);
					Multiset_HashMapImpl n=hash;
					
					assertEquals(ex, n);
				}
				@Test
				public void addAllTestDoubleCollection()
				{
					//AAA
					Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
					ArrayList<Double> input = new ArrayList<Double>() ;
					Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
					
					input.add(1.2);
					input.add(2.2);
					input.add(3.2);
					input.add(4.2);
					Collection c = input;
					
					Mockery mockingContext;
					mockingContext = new Mockery();
					Multiset mockedObject = mockingContext.mock(Multiset.class);
					mockingContext.checking(new Expectations(){
					{
						oneOf(mockedObject).add(c);
						will(returnValue(1));
					}
					});
					
					hash.addAll(c);
					ex.add(1.2);
					ex.add(2.2);
					ex.add(3.2);
					ex.add(4.2);
					Multiset_HashMapImpl n=hash;
					
					assertEquals(ex, n);
				}
				@Test
				public void addAllTestCollection()
				{
					//AAA
					Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
					ArrayList input = new ArrayList() ;
					Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
					
					input.add("12");
					input.add("");
					input.add(1);
					input.add(2.2);
					Collection c = input;
					
					Mockery mockingContext;
					mockingContext = new Mockery();
					Multiset mockedObject = mockingContext.mock(Multiset.class);
					mockingContext.checking(new Expectations(){
					{
						oneOf(mockedObject).add(c);
						will(returnValue(1));
					}
					});
					
					hash.addAll(c);
					ex.add("12");
					ex.add("");
					ex.add(1);
					ex.add(2.2);
					Multiset_HashMapImpl n=hash;
					
					assertEquals(ex, n);
				}
			//-----------------------------------------------------------------------
				//addAll(T[] values)
				@Test
				public void addAllTestEmptyStringArr()
				{
					//AAA
					Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
					Object[] input = {"",""};
					Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
					
					Mockery mockingContext;
					mockingContext = new Mockery();
					Multiset mockedObject = mockingContext.mock(Multiset.class);
					mockingContext.checking(new Expectations(){
					{
						oneOf(mockedObject).add(input);
						will(returnValue(1));
					}
					});
					
					hash.addAll(input);
					ex.add("");
					ex.add("");
					Multiset_HashMapImpl n=hash;
					
					assertEquals(ex, n);
				}
				@Test
				public void addAllTestStringArr()
				{
					//AAA
					Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
					Object[] input = {"12","123","124","125"};
					Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
					
					Mockery mockingContext;
					mockingContext = new Mockery();
					Multiset mockedObject = mockingContext.mock(Multiset.class);
					mockingContext.checking(new Expectations(){
					{
						oneOf(mockedObject).add(input);
						will(returnValue(1));
					}
					});
					
					hash.addAll(input);
					ex.add("12");
					ex.add("123");
					ex.add("124");
					ex.add("125");
					Multiset_HashMapImpl n=hash;
					
					assertEquals(ex, n);
				}
				@Test
				public void addAllTestIntegerArr()
				{
					//AAA
					Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
					Object[] input = {1,2,3,4};
					Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
					
					Mockery mockingContext;
					mockingContext = new Mockery();
					Multiset mockedObject = mockingContext.mock(Multiset.class);
					mockingContext.checking(new Expectations(){
					{
						oneOf(mockedObject).add(input);
						will(returnValue(1));
					}
					});
					
					hash.addAll(input);
					ex.add(1);
					ex.add(2);
					ex.add(3);
					ex.add(4);
					Multiset_HashMapImpl n=hash;
					
					assertEquals(ex, n);
				}
				//msh aked
				@Test
				public void addAllTestNullArr()
				{
					//AAA
					Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
					Object[] input = {null,null};
					Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
					
					Mockery mockingContext;
					mockingContext = new Mockery();
					Multiset mockedObject = mockingContext.mock(Multiset.class);
					mockingContext.checking(new Expectations(){
					{
						oneOf(mockedObject).add(input);
						will(returnValue(1));
					}
					});
					
					hash.addAll(input);
					ex.add(null);
					ex.add(null);
					Multiset_HashMapImpl n=hash;
					
					assertEquals(ex, n);
				}
				@Test
				public void addAllTestDoubleArr()
				{
					//AAA
					Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
					Object[] input = {1.2,2.2,3.2,4.2};
					Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
					
					Mockery mockingContext;
					mockingContext = new Mockery();
					Multiset mockedObject = mockingContext.mock(Multiset.class);
					mockingContext.checking(new Expectations(){
					{
						oneOf(mockedObject).add(input);
						will(returnValue(1));
					}
					});
					
					hash.addAll(input);
					ex.add(1.2);
					ex.add(2.2);
					ex.add(3.2);
					ex.add(4.2);
					Multiset_HashMapImpl n=hash;
					
					assertEquals(ex, n);
				}
				@Test
				public void addAllTestArr()
				{
					//AAA
					Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
					Object[] input = {1,"12",1.2,""};
					Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
					
					Mockery mockingContext;
					mockingContext = new Mockery();
					Multiset mockedObject = mockingContext.mock(Multiset.class);
					mockingContext.checking(new Expectations(){
					{
						oneOf(mockedObject).add(input);
						will(returnValue(1));
					}
					});
					
					hash.addAll(input);
					ex.add(1);
					ex.add("12");
					ex.add(1.2);
					ex.add("");
					Multiset_HashMapImpl n=hash;
					
					assertEquals(ex, n);
				}
			//-----------------------------------------------------------------------
	//remove(T entry)
		@Test
		public void removeTestEmptyString()
		{
			//AAA
			Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
			Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
			int x;
					
			hash.add("");
			hash.add("1234");
			x= hash.remove("");
			ex.add("1234");
			Multiset_HashMapImpl n=hash;
					
			assertEquals(1, x);
			assertEquals(ex, n);
		}		
		@Test
		public void removeTestString()
		{
			//AAA
			Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
			Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
			int x;
			
			hash.add("123");
			hash.add("1234");
			x= hash.remove("123");
			ex.add("1234");
			Multiset_HashMapImpl n=hash;
			
			assertEquals(1, x);
			assertEquals(ex, n);
		}
		@Test
		public void removeTestInteger()
		{
			//AAA
			Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
			Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
			int x;
			
			hash.add(2);
			hash.add(3);
			x= hash.remove(2);
			ex.add(3);
			Multiset_HashMapImpl n=hash;
			
			assertEquals(1, x);
			assertEquals(ex, n);
		}
		//msh aked
		@Test
		public void removeTestNull()
		{
			//AAA
			Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
			Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
			int x;
			
			hash.add(null);
			hash.add(2);
			x= hash.remove(null);
			ex.add(2);
			Multiset_HashMapImpl n=hash;
			
			assertEquals(1, x);
			assertEquals(ex, n);
		}
		@Test
		public void removeTestDouble()
		{
			//AAA
			Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
			Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
			int x;
			
			hash.add(1.2);
			hash.add(2.2);
			x= hash.remove(1.2);
			ex.add(2.2);
			Multiset_HashMapImpl n=hash;
			
			assertEquals(1, x);
			assertEquals(ex, n);
		}
		@Test
		public void removeTest()//if element doesnot exist return null
		{
			//AAA
			Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
			Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
			Integer x;
			
			hash.add("1234");
			hash.add("123");
			x= hash.remove("12");
			ex.add("1234");
			ex.add("123");
			Multiset_HashMapImpl n=hash;
			
			assertEquals(null, x);
			assertEquals(ex, n);
		}
	//-----------------------------------------------------------------------
		//remove(T entry, int mult)
		@Test
		public void removeTestEmptyStringWithPosition()
		{
			//AAA
			Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
			Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
			int x;
			
			hash.add("1234");
			hash.add("");
			x= hash.remove("",2);
			ex.add("1234");
			Multiset_HashMapImpl n=hash;
			
			assertEquals(1, x);
			assertEquals(ex, n);
		}
		@Test
		public void removeTestStringWithPositionPsitive()
		{
			//AAA
			Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
			Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
			int x;
			
			hash.add("1234");
			hash.add("123");
			x= hash.remove("123",2);
			ex.add("1234");
			Multiset_HashMapImpl n=hash;
			
			assertEquals(1, x);
			assertEquals(ex, n);
		}
		@Test
		public void removeTestStringWithPositionNegative()//htfdl fail
		{
			//AAA
			Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
			Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
			Integer x;
			
			hash.add("1234");
			hash.add("123");
			x= hash.remove("123",-2);
			ex.add("123");
			ex.add("1234");
			Multiset_HashMapImpl n=hash;
			
			assertEquals(1, x);
			assertEquals(ex, n);
		}
		@Test
		public void removeTestStringWithPositionZero()
		{
			//AAA
			Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
			Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
			int x;
			
			hash.add("1234");
			hash.add("123");
			x= hash.remove("123",0);
			ex.add("123");
			ex.add("1234");
			Multiset_HashMapImpl n=hash;
			
			assertEquals(1, x);
			assertEquals(ex, n);
		}
		@Test
		public void removeTestIntegerWithPosition()
		{
			//AAA
			Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
			Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
			int x;
			int y=2,z=3;
			
			hash.add(y);
			hash.add(z);
			x=hash.remove((Object)y,2);
			ex.add(z);
			Multiset_HashMapImpl n=hash;
			
			assertEquals(1, x);
			assertEquals(ex, n);
		}
		//msh aked
		@Test
		public void removeTestNullWithPosition()
		{
			//AAA
			Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
			Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
			int x;
			
			hash.add(null);
			hash.add("123");
			x=hash.remove(null,2);
			ex.add("123");
			Multiset_HashMapImpl n=hash;
			
			assertEquals(1, x);
			assertEquals(ex, n);
		}
		@Test
		public void removeTestDoubleWithPosition()
		{
			//AAA
			Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
			Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
			int x;
			double y=1.2,z=2.2;
			
			hash.add(y);
			hash.add(z);
			x=hash.remove((Object)y,2);
			ex.add(z);
			Multiset_HashMapImpl n=hash;
			
			assertEquals(1, x);
			assertEquals(ex, n);
		}
		@Test
		public void removeTestWithPosition()//if element doesnot exist return 0
		{
			//AAA
			Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
			Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
			int x;
			
			hash.add("1234");
			hash.add("123");
			x= hash.remove("12",2);
			ex.add("1234");
			ex.add("123");
			Multiset_HashMapImpl n=hash;
			
			assertEquals(0, x);
			assertEquals(ex, n);
		}
		//--------------------------------------------------------------------
		//removeAll(T entry)\
		@Test
		public void removeAllTestEmptyString()
		{
			//AAA
			Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
			Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
			int x;
			
			hash.add("");
			hash.add("1234");
			x= hash.removeAll("");
			ex.add("1234");
			Multiset_HashMapImpl n=hash;
			
			assertEquals(1, x);
			assertEquals(ex, n);
		}
				@Test
				public void removeAllTestString()
				{
					//AAA
					Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
					Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
					int x;
					
					hash.add("123");
					hash.add("1234");
					x= hash.removeAll("123");
					ex.add("1234");
					Multiset_HashMapImpl n=hash;
					
					assertEquals(1, x);
					assertEquals(ex, n);
				}
				@Test
				public void removeAllTestInteger()
				{
					//AAA
					Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
					Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
					int x;
					
					hash.add(2);
					hash.add(3);
					x= hash.removeAll(2);
					ex.add(3);
					Multiset_HashMapImpl n=hash;
					
					assertEquals(1, x);
					assertEquals(ex, n);
				}
				//msh aked
				@Test
				public void removeAllTestNull()
				{
					//AAA
					Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
					Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
					int x;
					
					hash.add(null);
					hash.add(2);
					x= hash.removeAll(null);
					ex.add(2);
					Multiset_HashMapImpl n=hash;
					
					assertEquals(1, x);
					assertEquals(ex, n);
				}
				@Test
				public void removeAllTestDouble()
				{
					//AAA
					Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
					Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
					int x;
					
					hash.add(1.2);
					hash.add(2.2);
					x= hash.removeAll(1.2);
					ex.add(2.2);
					Multiset_HashMapImpl n=hash;
					
					assertEquals(1, x);
					assertEquals(ex, n);
				}
				@Test
				public void removeAllTest()//if element doesnot exist return null
				{
					//AAA
					Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
					Multiset_HashMapImpl ex = new  Multiset_HashMapImpl();
					int x;
					
					hash.add("1234");
					hash.add("123");
					x= hash.removeAll("12");
					ex.add("1234");
					ex.add("123");
					Multiset_HashMapImpl n=hash;
					
					assertEquals(0, x);
					assertEquals(ex, n);
				}
			//-----------------------------------------------------------------------
		//totalCount()
		@Test
		public void totalCountTest()
		{
			Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
			int result;
			
			hash.add("123");
			hash.add("1234");
			hash.add("1235");
			hash.add("1237");
			hash.add("123");
			hash.add("12");
			
			result = hash.totalCount();
			
			assertEquals(6, result);
		}
		@Test
		public void totalCountTest2()
		{
			Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
			int result;
			
			
			result = hash.totalCount();
			
			assertEquals(0, result);
		}
		//-----------------------------------------------------------------------
		//toList()
		@Test
		public void toListTest()
		{
			Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
			List<String> result;
			List<String> list = List.of("12", "123", "123","1237","1235","1234");
			hash.add("123");
			hash.add("1234");
			hash.add("1235");
			hash.add("1237");
			hash.add("123");
			hash.add("12");
			
			result = hash.toList();
			
			assertEquals(list, result);
		}
		@Test
		public void toListTest2()
		{
			Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
			List<String> result;
			List<String> list = List.of();
			
			result = hash.toList();
			
			assertEquals(list, result);
		}
	//-----------------------------------------------------------------------
			//toString()
			@Test
			public void toStringTest()
			{
				Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
				String result;
				String list = "{1239, 12, 123, 1237, 1235, 1234}";
				hash.add("123");
				hash.add("1234");
				hash.add("1235");
				hash.add("1237");
				hash.add("1239");
				hash.add("12");
				
				result = hash.toString();
				
				assertEquals(list, result);
			}
			@Test
			public void toStringTest2()
			{
				Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
				String result;
				String list = "";
				
				result = hash.toString();
				
				assertEquals("{}", result);
			}
	//--------------------------------------------------------------------------------
	//equals(Object o)
	@Test
	public void equalsTestTrue()//same size and same elements
	{
		Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
		Multiset<String> multiset =new  Multiset_HashMapImpl();
		boolean result;
		
		hash.add("123");
		hash.add("1234");
		hash.add("12345");
		multiset.add("123");
		multiset.add("1234");
		multiset.add("12345");
		
		result = hash.equals(multiset);
		
		assertEquals(true, result);
	}
	public void equalsTestDiffSize()//diff. size
	{
		Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
		Multiset<String> multiset =new  Multiset_HashMapImpl();
		boolean result;
		
		hash.add("123");
		hash.add("1234");
		hash.add("12345");
		multiset.add("123");
		multiset.add("1234");
		multiset.add("12345");
		multiset.add("123456");
		
		result = hash.equals(multiset);
		
		assertEquals(false, result);
	}
	public void equalsTestDiffElements()//same size but diff. elements
	{
		Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
		Multiset<String> multiset =new  Multiset_HashMapImpl();
		boolean result;
		
		hash.add("123");
		hash.add("1234");
		hash.add("12345");
		multiset.add("1237");
		multiset.add("1234");
		multiset.add("12345");
		
		result = hash.equals(multiset);
		
		assertEquals(false, result);
	}
	//--------------------------------------------------------------------------------
		//Multiset<T> intersect(Multiset<T> other)
		@Test
		public void intersectTest()
		{
			Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
			Multiset<String> multiset =new  Multiset_HashMapImpl();
			Multiset<String> result =new  Multiset_HashMapImpl();
			Multiset<String> except =new  Multiset_HashMapImpl();
			
			hash.add("123");
			hash.add("1234");
			hash.add("12345");
			hash.add("12345");
			hash.add("123456");
			hash.add("1234578");
			multiset.add("123");
			multiset.add("1234");
			multiset.add("12345");
			multiset.add("123456");
			multiset.add("123457");
			multiset.add("123459");
			multiset.add("1234511");
			except.add("123");
			except.add("1234");
			except.add("12345");
			except.add("123456");
			
			result = hash.intersect(multiset);
			
			assertEquals(except, result);
		}
		public void intersectTest2()//no intesect
		{
			Multiset_HashMapImpl hash = new  Multiset_HashMapImpl();
			Multiset<String> multiset =new  Multiset_HashMapImpl();
			Multiset result;
			
			hash.add("123");
			hash.add("1234");
			hash.add("12345");
			hash.add("12345");
			hash.add("123456");
			hash.add("1234578");
			multiset.add("123");
			multiset.add("1234");
			multiset.add("12345");
			multiset.add("123456");
			multiset.add("123457");
			multiset.add("123459");
			multiset.add("1234511");

			result = hash.intersect(multiset);
			
			assertEquals(null, result);
		}
}
