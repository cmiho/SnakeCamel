package snakecamel;

public class Main {
	public static void main(String[] args){
	SnakeCamelUtil snake = new SnakeCamelUtil();
	
	if(equals1("",""))
		System.out.println("1.capitalizeで（空文字） → （空文字）OK");
	
	if(equals1("a","A"))
		System.out.println("2.capitalizeでa → AOK");
	
	if(equals1("xyz","Xyz"))
		System.out.println("3.capitalizeでxyz →XyzOK");
	
	if(equals2("",""))
	System.out.println("4.uncapitalizeで（空文字） → (空文字）OK");
	
	if(equals2("A","a"))
		System.out.println("5.uncapitalizeでA → aOK");
	if(equals2("Xyz","xyz"))
		System.out.println("6.uncapitalizeでXyz → xyzOK");
	
	
	if(equals3("abc","Abc"))
		System.out.println("7.snakeToCamelcaseでabc → AbcOK");
	if(equals3("abc_def","AbcDef"))
		System.out.println("8.snakeToCamelcaseでabc_def → AbcDefOK");
	if(equals3("abc_def_gh","AbcDefGh"))
		System.out.println("9.snakeToCamelcaseでabc_def_gh → AbcDefGhOK");
	if(equals3("abc__def___gh","AbcDefGh"))
		System.out.println("10.snakeToCamelcaseでabc__def___gh → AbcDefGhOK");
	if(equals3("_abc_def__","AbcDef"))
		System.out.println("11.snakeToCamelcaseで_abc_def__ → AbcDefOK");
	
	

	if(equals4("Abc","abc"))
		System.out.println("12.camelToSnakecaseでAbc → abcOK");
	if(equals4("AbcDef","abc_def"))
		System.out.println("13.camelToSnakecaseでAbcDef → abc_defOK");
	if(equals4("AbcDefGh","abc_def_gh"))
		System.out.println("14.camelToSnakecaseでAbcDefGh → abc_def_ghOK");
	
	
	}	
	static boolean equals1(String actual,String expect){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		if(expect.equals(snake.capitalize(actual)))
			return true;
		else
			return false;
	}
	static boolean equals2(String actual, String expect){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		if(expect.equals(snake.uncapitalize(actual)))
			return true;
		else
			return false;
	}
	static boolean equals3(String actual, String expect){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		if(expect.equals(snake.snakeToCamelcase(actual)))
			return true;
		else
			return false;
	}
	static boolean equals4(String actual, String expect){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		if(expect.equals(snake.camelToSnakecase(actual)))
			return true;
		else
			return false;
	}
}
