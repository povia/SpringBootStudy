package board.board.dto;

import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class BoardDto {
	private int boardIdx;
	private String title;
	private String contentsDtl;
	private int hitCnt;
	private String creatorId;
	private String createdDt;
	private String updaterId;
	private String updatedDt;
}