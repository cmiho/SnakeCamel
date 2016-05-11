package snakecamel;

import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelUtilTest {

	//@Test
	//public void test() {
	//	fail("いえす");
		
	//}
	@Test
	public void snakeToCamelcaseでキャメルケースを得る() {
		String except = "AbcDefGhi";
		String actual = SnakeCamelUtil.snakeToCamelcase("abc_def_ghi");
		assertEquals(except, actual);
	}
	@Test
	public void camelToSnakecaseでスネークケースを得る() {
		String except = "abc_def_ghi";
		String actual = SnakeCamelUtil.camelToSnakecase("AbcDefGhi");
		assertEquals(except, actual);
	}
	
	@Test
	public void capitalizeは大文字ではじめる() {
		String except = "Abc";
		String actual = SnakeCamelUtil.capitalize("abc");
		assertEquals(except, actual);
	}
	@Test
	public void uncapitalizeは小文字ではじめる() {
		String except = "abc";
		String actual = SnakeCamelUtil.uncapitalize("Abc");
		assertEquals(except, actual);
	}

}
