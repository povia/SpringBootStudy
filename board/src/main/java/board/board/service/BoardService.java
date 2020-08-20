package board.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import board.board.dto.BoardDto;

@Service
public interface BoardService {

	public List<BoardDto> selectBoardList() throws Exception;

}
