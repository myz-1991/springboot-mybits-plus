package com.example.demo.gitblit.obj.controller;

import com.example.demo.gitblit.obj.model.GitTest;
import com.example.demo.gitblit.obj.model.Msg;
import com.example.demo.gitblit.obj.model.ResultUtil;
import com.example.demo.gitblit.obj.model.Student;
import com.example.demo.gitblit.obj.service.GitTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *     查询操作.
 * </p>
 *
 * @author wangdejian
 * @since 2018/3/7
 */
@RestController
public class GitController {

    @Autowired
    private GitTestService gitTestService;

    @RequestMapping(value = "searchGitList")
    public List<GitTest> searchGit() {
        return gitTestService.findGitTestList();
    }

    @RequestMapping(value = "/searchStudentList")
    public Msg searchStudentList() {
        return ResultUtil.success(getStudentList().stream()
                .filter((x) -> x.getScore() < 80)
                .collect(Collectors.toList()));
    }

    private List<Student> getStudentList() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("张三", 16, "00001", "北京", 87.5));
        studentList.add(new Student("李四", 17, "00002", "上海", 91.0));
        studentList.add(new Student("王五", 19, "00003", "大连", 88.5));
        studentList.add(new Student("马六", 14, "00004", "深圳", 55.0));
        studentList.add(new Student("胜七", 14, "00005", "广东", 91.5));
        studentList.add(new Student("lilei", 19, "00015", "广东", 60.0));
        studentList.add(new Student("ali", 29, "00017", "郑州", 77.5));
        studentList.add(new Student("ten", 99, "00018", "朝阳", 68.0));
        studentList.add(new Student("ten", 9, "00018", "朝阳", 100.0));
        studentList.add(new Student("ten", 9, "00018", "朝阳", 100.0));
        return studentList;
    }

}
