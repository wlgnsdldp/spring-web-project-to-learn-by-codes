package org.zerock.service;


import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;

import java.util.List;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {

    private BoardMapper mapper;

    @Override
    public void register(BoardVO boardVO) {
        log.info("register......"+boardVO);
        mapper.insertSelectKey(boardVO);
    }

    @Override
    public BoardVO get(Long bno) {

        log.info("get........." + bno);

        return mapper.read(bno);
    }

    @Override
    public boolean modify(BoardVO boardVO) {

        log.info("modify......." + boardVO);

        return mapper.update(boardVO) == 1;
    }

    @Override
    public boolean remove(Long bno) {

        log.info("remove...." + bno);

        return mapper.delete(bno) == 1;
    }

    @Override
    public List<BoardVO> getList() {

        log.info("getList.........");

        return mapper.getList();
    }
}
