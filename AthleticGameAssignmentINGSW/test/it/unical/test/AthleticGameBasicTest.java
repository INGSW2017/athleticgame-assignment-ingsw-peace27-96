package it.unical.test;

import java.time.Instant;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest {
	
	private static AthleticGame athleticGame;
	
	@BeforeClass
	public static void init() {
		athleticGame = new AthleticGame("Soccer");
	}

	@Test
	public void addArrivalTest() {
		System.out.println("CIAO");
		athleticGame.addArrival("Totti", Instant.now());
		Assert.assertEquals(1, athleticGame.getArrivals().size());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getPartecipantTimeTest() {
		athleticGame.getParecipiantTime("Toni");
	}
}
