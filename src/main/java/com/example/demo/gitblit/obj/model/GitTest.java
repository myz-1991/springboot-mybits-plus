package com.example.demo.gitblit.obj.model;

import java.io.Serializable;

/**
 * <p></p>
 *
 * @author wangdejian
 * @since 2018/3/7
 */
public class GitTest implements Serializable {

    private Integer id;
    private Integer num;
    private Integer pid;
    private String name;
    private String tips;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    @Override
    public String toString() {
        return "GitTest{" +
                "id=" + id +
                ", num=" + num +
                ", pid=" + pid +
                ", name='" + name + '\'' +
                ", tips='" + tips + '\'' +
                '}';
    }
}
