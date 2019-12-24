package com.sean.basic.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.sean.basic.model.User;

@Controller
public class SessionController {
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public String loginPost(
			User user,
			HttpSession session) {
		// ������ ��𼭵���(���� ������ ����) ��밡��
		session.setAttribute("user", user);
		// ������ �ּҷ� �̵�(���ѱ�)
		return "redirect:/main";
	}

	@GetMapping("/main")
	public String main() {
		return "main";
	}
}








