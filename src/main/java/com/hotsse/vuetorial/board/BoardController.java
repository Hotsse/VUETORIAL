package com.hotsse.vuetorial.board;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hotsse.vuetorial.board.vo.BoardVO;

@Controller
@RequestMapping(value="/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/list")
	public String list() {
		return "board/list";
	}
	
	@RequestMapping(value="/getList")
	@ResponseBody
	public List<BoardVO> getList(){
		return boardService.getList();
	}
	
	@RequestMapping(value="/viewContent")
	public String viewContent(@RequestParam Map<String, Object> param, ModelMap model) {
		
		BoardVO board = null;
		
		try {
			int boardIdx = Integer.parseInt(param.get("boardIdx").toString());
			board = this.boardService.getContent(boardIdx);
		}
		catch (Exception e) {
			// nothing to do ..
		}
		
		model.put("board", board);
		
		return "board/viewContent";
	}
	

}
