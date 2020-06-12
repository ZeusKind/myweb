package com.myweb.entity;


/*
  评论实体类

  wuzuowei 2020 06 10
 */

import java.util.Date;

public class ComInfo {

    //ID
    private int id;

    //评论内容
    private String details;

    //点赞数
    private  int favourable;

    //创建时间（评论时间）
    private Date comment_time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getFavourable() {
        return favourable;
    }

    public void setFavourable(int favourable) {
        this.favourable = favourable;
    }

    public Date getComment_time() {
        return comment_time;
    }

    public void setComment_time(Date comment_time) {
        this.comment_time = comment_time;
    }

    @Override
    public String toString() {
        return "ComInfo{" +
                "id=" + id +
                ", details='" + details + '\'' +
                ", favourable=" + favourable +
                ", comment_time=" + comment_time +
                '}';
    }
}
