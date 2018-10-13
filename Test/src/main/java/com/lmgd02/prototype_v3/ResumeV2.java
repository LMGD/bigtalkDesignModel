package com.lmgd02.prototype_v3;


/**
 * 简历对象
 */
public class ResumeV2 implements Cloneable {
    private String name;
    private String sex;
    private String age;

    private WorkExprience work;

    public ResumeV2(String name) {
        this.name = name;
    }

    @Override
    public Object clone() {
        ResumeV2 resume = null;
        try {
            resume = (ResumeV2) super.clone();
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

    public WorkExprience getWork() {
        return work;
    }

    public void setWork(WorkExprience work) {
        this.work = work;
    }

    /**
     * 设置工作经历
     */
    public void setWorkExprience(String timeArea, String company) {
        work = new WorkExprience(timeArea, company);
    }

    /**
     * 显示
     */
    public void display() {
        System.out.println("姓名：" + name + "性别：" + sex + ",年龄：" + age);
        System.out.println("工作经历：" + work.getTimeArea() + "," + work.getCompany());
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

    @Override
    public String toString() {
        return "ResumeV2{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", work=" + work +
                '}';
    }
}
