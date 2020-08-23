package board.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import board.board.dto.BoardDto;

public interface BoardService {

	public List<BoardDto> selectBoardList() throws Exception;
	public void insertBoard(BoardDto board) throws Exception;
	public BoardDto selectBoardDetail(int boardIdx) throws Exception;
	public void updateBoard(BoardDto board) throws Exception;
	public void deleteBoard(int boardIdx) throws Exception;
}
