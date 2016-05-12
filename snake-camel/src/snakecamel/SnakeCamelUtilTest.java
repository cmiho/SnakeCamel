package snakecamel;

import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelUtilTest {

	//@Test
	//public void test() {
	//	fail("いえす");
		
	//}
	@Test
	public void snakeToCamelcaseでabcをAbc() {
		String except = "Abc";
		String actual = SnakeCamelUtil.snakeToCamelcase("abc");
		assertEquals(except, actual);
	}
	@Test
	public void snakeToCamelcaseでabc_defをAbcDef() {
		String except = "AbcDef";
		String actual = SnakeCamelUtil.snakeToCamelcase("abc_def");
		assertEquals(except, actual);
	}
	@Test
	public void snakeToCamelcaseでabc_def_ghをAbcDefGh() {
		String except = "AbcDefGh";
		String actual = SnakeCamelUtil.snakeToCamelcase("abc_def_gh");
		assertEquals(except, actual);
	}
	@Test
	public void snakeToCamelcaseでabc__def___ghをAbcDefGh() {
		String except = "AbcDefGh";
		String actual = SnakeCamelUtil.snakeToCamelcase("abc__def___gh");
		assertEquals(except, actual);
	}
	@Test
	public void snakeToCamelcaseで_abc_def__をAbcDef() {
		String except = "AbcDef";
		String actual = SnakeCamelUtil.snakeToCamelcase("_abc_def__");
		assertEquals(except, actual);
	}
	
	
	
	@Test
	public void camelToSnakecaseでAbcをabc() {
		String except = "abc";
		String actual = SnakeCamelUtil.camelToSnakecase("Abc");
		assertEquals(except, actual);
	}
	@Test
	public void camelToSnakecaseでAbcDefをabc_def() {
		String except = "abc_def";
		String actual = SnakeCamelUtil.camelToSnakecase("AbcDef");
		assertEquals(except, actual);
	}
	@Test
	public void camelToSnakecaseでAbcDefGhをabc_def_gh() {
		String except = "abc_def_gh";
		String actual = SnakeCamelUtil.camelToSnakecase("AbcDefGh");
		assertEquals(except, actual);
	}
	
	
	
	@Test
	public void capitalizeで空文字() {
		String except = ""; 
		String actual = SnakeCamelUtil.capitalize("");
		assertEquals(except, actual);
	}
	@Test
	public void capitalizeでAを得る() {
		String except = "A"; 
		String actual = SnakeCamelUtil.capitalize("a");
		assertEquals(except, actual);
	}
	@Test
	public void capitalizeでXyzを得る() {
		String except = "Xyz"; 
		String actual = SnakeCamelUtil.capitalize("xyz");
		assertEquals(except, actual);
	}
	@Test
	public void uncapitalizeで空文字() {
		String except = "";
		String actual = SnakeCamelUtil.uncapitalize("");
		assertEquals(except, actual);
	}
	@Test
	public void uncapitalizeでaを得る() {
		String except = "a";
		String actual = SnakeCamelUtil.uncapitalize("A");
		assertEquals(except, actual);
	}
	@Test
	public void uncapitalizeでxyzを得る() {
		String except = "xyz";
		String actual = SnakeCamelUtil.uncapitalize("Xyz");
		assertEquals(except, actual);
	}
}
