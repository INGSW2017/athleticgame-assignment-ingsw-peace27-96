package it.unical.test;

import java.time.Instant;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnersTest {
	
	private static AthleticGame athleticGame;
	
	@BeforeClass
	public static void init() {
		athleticGame = new AthleticGame("Soccer");
	}
	
	@After
	public void reset() {
		athleticGame.reset();
	}
	
	@Before
	public void start() {
		athleticGame.start();
	}
	
	@Test 
	public void getWinnerTest1() {
		athleticGame.addArrival("Totti", Instant.now());
		athleticGame.addArrival("Toni", Instant.now().plusMillis(10));
		Assert.assertEquals("Totti", athleticGame.getWinner());
	}
	
	@Test 
	public void getWinnerTest2() {
		Assert.assertEquals(null, athleticGame.getWinner());
	}

}
