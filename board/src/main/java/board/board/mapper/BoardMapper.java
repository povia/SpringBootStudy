package board.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import board.board.dto.BoardDto;

@Mapper
public interface BoardMapper {
	List<BoardDto> selectBoardList() throws Exception;

	void insertBoard(BoardDto board) throws Exception;
	
	void updateHitCnt(int boardIdx) throws Exception;
	
	BoardDto selectBoardDetail(int boardIdx) throws Exception;

	void updateBoard(BoardDto board);

	void deleteBoard(int boardIdx);
}
