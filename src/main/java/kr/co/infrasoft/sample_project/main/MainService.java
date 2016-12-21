package kr.co.infrasoft.sample_project.main;

import org.springframework.stereotype.Service;

@Service
public class MainService {
	public Integer add(Integer a, Integer b) {
		return a + b;
	}
}
