package dz.gl.app;

/**
 * Hello world!
 *
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class demotest {

	@Test
	public void test() {
		App u=new App();
		assertEquals(7,u.add(3,4) );
	}

}

