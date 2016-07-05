/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.backend.model;

/**
 *
 * @author Elijah
 */
public class Report {
    
    private int ReportNo;
    private String Report;
    private String RTime;
    private int HealthfacNo;

    /**
     * @return the ReportNo
     */
    public int getReportNo() {
        return ReportNo;
    }

    /**
     * @param ReportNo the ReportNo to set
     */
    public void setReportNo(int ReportNo) {
        this.ReportNo = ReportNo;
    }

    /**
     * @return the Report
     */
    public String getReport() {
        return Report;
    }

    /**
     * @param Report the Report to set
     */
    public void setReport(String Report) {
        this.Report = Report;
    }

    /**
     * @return the RTime
     */
    public String getRTime() {
        return RTime;
    }

    /**
     * @param RTime the RTime to set
     */
    public void setRTime(String RTime) {
        this.RTime = RTime;
    }

    /**
     * @return the HealthfacNo
     */
    public int getHealthfacNo() {
        return HealthfacNo;
    }

    /**
     * @param HealthfacNo the HealthfacNo to set
     */
    public void setHealthfacNo(int HealthfacNo) {
        this.HealthfacNo = HealthfacNo;
    }
    
}
