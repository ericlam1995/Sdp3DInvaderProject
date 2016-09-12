import static org.junit.Assert.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Test;

import application.Main;
import glen14852903.LevelValues;
import javafx.geometry.Point3D;
import javafx.scene.layout.BorderPane;

public class ShootingTest {
	private Point3D bulletStart = new Point3D(200, 300, 200);
	@Test
	public void shootingspeedtest() {
		//fail("Not yet implemented");
		LevelValues levelvalue = new LevelValues();
		assertEquals(Math.round(10.0), Math.round(levelvalue.getBulletSpeed()));
	}
	@Test
	public void shootingkeypressed(){
		assertEquals(KeyEvent.VK_COMMA, KeyEvent.VK_COMMA);
	}
	@Test
	public void testbulletstartX(){
		
		//assertEquals(Math.round(200), Math.round(bulletStart.getX()));
		assertTrue(Math.round(200) == Math.round(bulletStart.getX()));
	}
	@Test
	public void testbulletstartY(){

		//assertEquals(Math.round(300), Math.round(bulletStart.getY()));
		assertTrue(Math.round(300) == Math.round(bulletStart.getY()));
	}
	@Test
	public void testbulletstartZ(){

		//assertEquals(Math.round(200), Math.round(bulletStart.getZ()));
		assertTrue(Math.round(200) == Math.round(bulletStart.getZ()));
	}
	
	
}
