package org.nirmalksingh.planeqdeque.priorityplaneqdq.controller;
/**
 * Nirmal Singh 2018(nirmalksingh@gmail.com)
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ATCDashBoardController {
	@RequestMapping("/home")
	public String home() {
		return "index";
	}
}
