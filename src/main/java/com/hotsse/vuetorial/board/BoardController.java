package com.hotsse.vuetorial.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hotsse.vuetorial.board.vo.BoardVO;

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
	
	@RequestMapping(value="/getList")
	@ResponseBody
	public List<BoardVO> getList(){
		return boardService.getList();
	}
	

}
