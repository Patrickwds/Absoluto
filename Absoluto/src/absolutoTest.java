import static org.junit.Assert.*;

import org.junit.Test;

public class absolutoTest {

	@Test
	public void test() {
		int resultado = TestarAbsoluto.absoluto(-1);
		assertEquals(1, resultado);
	}
}
