package com.lmgd02.prototype_v3;


/**
 * 简历对象
 */
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;

    private String timeArea;
    private String company;

    public Resume(String name) {
        this.name = name;
    }

    @Override
    public Object clone() {
        Resume resume = null;
        try {
            resume = (Resume) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return resume;
    }

    /**
     * 设置个人信息
     *
     * @return
     */
    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    /**
     * 设置工作经历
     *
     * @return
     */
    public void setWorkExprience(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    }

    /**
     * 显示
     *
     * @return
     */
    public void display() {
        System.out.println("姓名：" + name + "性别：" + sex + ",年龄：" + age);
        System.out.println("工作经历：" + timeArea + "," + company);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", timeArea='" + timeArea + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
