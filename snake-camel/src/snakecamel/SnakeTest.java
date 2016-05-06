package snakecamel;

import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeTest {

	@Test
	public void test() {
		fail("できてないよ");
		
	}
	@Test
	public void snakeToCamelcaseでキャメルケースを得る() {
		//SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "AbcDefGhi";
		String actual = SnakeCamelUtil.snakeToCamelcase("abc_def_ghi");
		assertEquals(actual,expected);
		
	}
	@Test
	public void camelToSnakecaseでスネークケースを得る() {
		//SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "abc_def_ghi";
		String actual = SnakeCamelUtil.camelToSnakecase("AbcDefGhi");
		assertEquals(actual,expected);
	}
	@Test
	public void capitalizeで頭文字大文字を得る() {
		//SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "abc";
		String actual = SnakeCamelUtil.capitalize("Abc");
		assertEquals(actual,expected);
	}

}
