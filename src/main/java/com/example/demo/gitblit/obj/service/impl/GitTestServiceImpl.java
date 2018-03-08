package com.example.demo.gitblit.obj.service.impl;


import com.example.demo.gitblit.obj.mapper.GitTestMapper;
import com.example.demo.gitblit.obj.model.GitTest;
import com.example.demo.gitblit.obj.service.GitTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p></p>
 *
 * @author wangdejian
 * @since 2018/3/7
 */
@Service
public class GitTestServiceImpl implements GitTestService {

    @Autowired
    private GitTestMapper gitTestMapper;

    @Override
    public List<GitTest> findGitTestList() {
        return gitTestMapper.selectGitList();
    }

}
