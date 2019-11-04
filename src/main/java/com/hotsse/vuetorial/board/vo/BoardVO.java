package com.hotsse.vuetorial.board.vo;

import lombok.Data;

@Data
public class BoardVO {
	private int boardIdx;
	private String title;
	private String content;
	private int viewCnt;
	private String userNm;
}
