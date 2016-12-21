package kr.co.infrasoft.sample_project.test.main;

import kr.co.infrasoft.sample_project.main.MainService;

import org.junit.Test;

public class MainTest {
	@Test
	public void testAdd() {
		MainService mainService = new MainService();
		Integer result = mainService.add(100, 200);
		org.junit.Assert.assertEquals(300, result, 0);
	}
}
