package board.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import board.board.dto.BoardDto;
import board.board.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;

/*
 * BoardService를 구현하는 구현체
 * 사용 Mapper BoardMapper는 의존성 주입이 아닌 생성자 주입 기반으로 수정함
 */
@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

	private final BoardMapper boardMapper;
	
	@Override
	public List<BoardDto> selectBoardList() throws Exception {
		return boardMapper.selectBoardList();
	}


}
