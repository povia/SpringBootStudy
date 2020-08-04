package board.board.mapper;

import java.util.List;

import board.board.dto.BoardDto;

public interface BoardMapper {
	List<BoardDto> selectBoardList() throws Exception;
}
