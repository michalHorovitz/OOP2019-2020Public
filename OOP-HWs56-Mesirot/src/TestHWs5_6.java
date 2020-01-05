import static org.junit.Assert.fail;

import org.junit.Test;

public class TestHWs5_6 {

	@Test
	public void test1() throws Exception {

		Game game = new Game(10, 10, 5, 2, 5, 1);
		game.start();

		Thread.sleep(20000);

		if (game.isAlive()) {
			fail("\'test1\' does not stop");
		}

	}
}