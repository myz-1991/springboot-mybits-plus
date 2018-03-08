package com.example.demo.gitblit.obj.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.gitblit.obj.model.GitTest;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * <p></p>
 *
 * @author wangdejian
 * @since 2018/3/7
 */
@Mapper
@Component
public interface GitTestMapper extends BaseMapper<GitTest> {

    List<GitTest> selectGitList();

}
