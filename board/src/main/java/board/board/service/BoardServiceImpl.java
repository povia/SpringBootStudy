package board.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import board.board.dto.BoardDto;
import board.board.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;

/*
 * BoardService�� �����ϴ� ����ü
 * ��� Mapper BoardMapper�� ������ ������ �ƴ� ������ ���� ������� ������
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
