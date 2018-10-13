package com.lmgd02.prototype_v3;

/**
 * 工作经历
 */
public class WorkExprience {

    private String timeArea;
    private String company;


    public WorkExprience(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
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
        return "WorkExprience{" +
                "timeArea='" + timeArea + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
