package com.hotsse.vuetorial.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/test")
	@ResponseBody
	public int test() {
		return boardService.test();
	}
	
	@RequestMapping(value="/test2")
	public String test2() {
		return "test2";
	}
	

}