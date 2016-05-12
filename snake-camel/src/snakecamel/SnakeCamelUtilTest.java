package snakecamel;

import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelUtilTest {
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
	public void capitalizeで大文字() {
		String except = "A";
		String actual = SnakeCamelUtil.capitalize("a");
		assertEquals(except, actual);
	}
	@Test
	public void uncapitalizeで小文字() {
		String except = "a";
		String actual = SnakeCamelUtil.uncapitalize("A");
		assertEquals(except, actual);
	}
	
	
	
	
	
	
	
	
}
