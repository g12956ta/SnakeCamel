package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
//import static 

import org.junit.Test;

public class SnakeCamelTest {
	@Test
	public void capitalizeを実行(){
		String expected = "A";
		String actual = SnakeCamelUtil.capitalize("a");
		assertThat(actual,is(expected));
		
		String expected2 = "Xyz";
		String actual2 = SnakeCamelUtil.capitalize("xyz");
		assertThat(actual2,is(expected2));
	}
	
	@Test
	public void uncapitalizeを実行(){
		String expected = "a";
		String actual = SnakeCamelUtil.uncapitalize("A");
		assertThat(actual,is(expected));
		
		String expected2 = "xyz";
		String actual2 = SnakeCamelUtil.uncapitalize("Xyz");
		assertThat(actual2,is(expected2));
	}

	@Test
	public void snakeToCamelcaseを実行(){
		String expected = "Abc";
		String actual = SnakeCamelUtil.snakeToCamelcase("abc");
		assertThat(actual, is(expected));
		
		String expected2 = "AbcDef";
		String actual2 = SnakeCamelUtil.snakeToCamelcase("abc_def");
		assertThat(actual2, is(expected2));
		
		String expected3 = "AbcDefGh";
		String actual3 = SnakeCamelUtil.snakeToCamelcase("abc_def_gh");
		assertThat(actual3, is(expected3));
		
		String expected4 = "AbcDefGh";
		String actual4 = SnakeCamelUtil.snakeToCamelcase("abc__def___gh");
		assertThat(actual4, is(expected4));
		
		String expected5 = "AbcDef";
		String actual5 = SnakeCamelUtil.snakeToCamelcase("_abc_def__");
		assertThat(actual5, is(expected5));
	}

	@Test
	public void camelToSnakecaseを実行(){
		String expected = "abc";
		String actual = SnakeCamelUtil.camelToSnakecase("Abc");
		assertThat(actual,is(expected));
		
		String expected2 = "abc_def";
		String actual2 = SnakeCamelUtil.camelToSnakecase("AbcDef");
		assertThat(actual2,is(expected2));
		
		String expected3 = "abc_def_gh";
		String actual3 = SnakeCamelUtil.camelToSnakecase("AbcDefGh");
		assertThat(actual3,is(expected3));
	}
}
