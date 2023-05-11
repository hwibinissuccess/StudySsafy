package com.ssafy.rest.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.rest.model.dto.User;

@RestController
@RequestMapping("/rest2")
public class TestController2 {
	// 메소드를 쭉 작성할건데...

//	http://localhost:8080/mvc/rest2/test1 --> 404에러가 떴다. 뷰리졸버가 저이름을 뷰네임이라고 생각하고 경로를 만들어버리니
	@GetMapping("/test1")
	public String test1() {
		return "hi rest";
	}

//	http://localhost:8080/mvc/rest2/test2 --> @ResponseBody 붙였다. JSP 화면 그런거 반환이 아니라 데이터를 넘긴다.
	@GetMapping("/test2")
	public String test2() {
		return "hi rest";
	}

//	http://localhost:8080/mvc/rest2/test3 --> map을 반환하면 얘도 키 / 벨류니까 알잘로 JSON으로 바꾸어주지 않을까나?
	@GetMapping("/test3")
	public Map<String, String> test3() {
		// Map은 키와 벨류를 가지고 있음.
		Map<String, String> data = new HashMap<>();

		data.put("id", "ssafy");
		data.put("password", "1234");
		data.put("name", "양띵균");

		return data; // jasckson을 추가했더니 요거 맵인데도 JSON으로 바꿔서 돌려주더라 오 good!
	}

//	http://localhost:8080/mvc/rest2/test4 --> DTO 한번 반환해보자~~ 짹슨이 객체도 알아서 JSON형태로 바꾸어줘따
	@GetMapping("/test4")
	public User test4() {
		User user = new User();
		user.setId("ssafy");
		user.setPassword("1234");
		user.setName("유지나");

		return user;
	}

//	http://localhost:8080/mvc/rest2/test5 --> List 반환해보자. 자바스크립트의 배열 형태로 알잘로 바뀌어서 반환하더라
	@GetMapping("/test5")
	public List<User> test5() {
		List<User> list = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			User user = new User();
			user.setId("ssafy" + i);
			user.setPassword("1234");
			user.setName("쾌지나" + "bot" + i);
			list.add(user);
		}
		return list;
	}

}
