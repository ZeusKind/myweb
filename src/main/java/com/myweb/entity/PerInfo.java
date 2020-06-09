package com.myweb.entity;

public class PerInfo {

    private String name;
    private int original_num;
    private int favourable_num;
    private int reprint_num;
    private String head_img_url;
    private int hits_num;
    private int comment_num;
    private int age;
    private int code_age;
    private String phone;

    public PerInfo() {
    }

    public PerInfo(String name, int orginal_num, int favourable_num, int reprint_num, String head_img_url, int hits_num, int comment_num, int age, int code_age, String phone) {
        this.name = name;
        this.original_num = orginal_num;
        this.favourable_num = favourable_num;
        this.reprint_num = reprint_num;
        this.head_img_url = head_img_url;
        this.hits_num = hits_num;
        this.comment_num = comment_num;
        this.age = age;
        this.code_age = code_age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrginal_num() {
        return original_num;
    }

    public void setOrginal_num(int orginal_num) {
        this.original_num = orginal_num;
    }

    public int getFavourable_num() {
        return favourable_num;
    }

    public void setFavourable_num(int favourable_num) {
        this.favourable_num = favourable_num;
    }

    public int getReprint_num() {
        return reprint_num;
    }

    public void setReprint_num(int reprint_num) {
        this.reprint_num = reprint_num;
    }

    public String getHead_img_url() {
        return head_img_url;
    }

    public void setHead_img_url(String head_img_url) {
        this.head_img_url = head_img_url;
    }

    public int getHits_num() {
        return hits_num;
    }

    public void setHits_num(int hits_num) {
        this.hits_num = hits_num;
    }

    public int getComment_num() {
        return comment_num;
    }

    public void setComment_num(int comment_num) {
        this.comment_num = comment_num;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCode_age() {
        return code_age;
    }

    public void setCode_age(int code_age) {
        this.code_age = code_age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "PerInfo{" +
                "name='" + name + '\'' +
                ", orginal_num=" + original_num +
                ", favourable_num=" + favourable_num +
                ", reprint_num=" + reprint_num +
                ", head_img_url='" + head_img_url + '\'' +
                ", hits_num=" + hits_num +
                ", comment_num=" + comment_num +
                ", age=" + age +
                ", code_age=" + code_age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
