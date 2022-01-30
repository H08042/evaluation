package com.example.evaluationofdailymaintenance.db;

import org.litepal.crud.LitePalSupport;

import java.util.Date;

public class HighwayPatrol extends LitePalSupport {
    private String EvaluatedUnit;
    private Date date;
    private String ReasonForScoreDeduction;
    private Double EvaluationScore;
    private String Remarks;

    public String getEvaluatedUnit() {
        return EvaluatedUnit;
    }

    public void setEvaluatedUnit(String evaluatedUnit) {
        EvaluatedUnit = evaluatedUnit;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public String getReasonForScoreDeduction() {
        return ReasonForScoreDeduction;
    }

    public void setReasonForScoreDeduction(String reasonForScoreDeduction) {
        ReasonForScoreDeduction = reasonForScoreDeduction;
    }

    public Double getEvaluationScore() {
        return EvaluationScore;
    }

    public void setEvaluationScore(Double evaluationScore) {
        EvaluationScore = evaluationScore;
    }

    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String remarks) {
        Remarks = remarks;
    }
}
