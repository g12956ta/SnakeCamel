package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
//import static 

import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void snakeToCamelcase�����s(){
		SnakeCamelUtil calc = new SnakeCamelUtil();
		String expected = "AppleBaseballCandy";
		String actual = calc.snakeToCamelcase("apple_baseball_candy_ ");
		assertThat(actual, is(expected));
	}

	@Test
	public void camelToSnakecase�����s(){
		SnakeCamelUtil calc = new SnakeCamelUtil();
		String expected = "apple_baseball_candy";
		String actual = calc.camelToSnakecase("AppleBaseballCandy");
		assertThat(actual,is(expected));
	}
}
