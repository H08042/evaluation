package com.example.evaluationofdailymaintenance.db;

import org.litepal.crud.LitePalSupport;

import java.util.Date;

public class Tunnel extends LitePalSupport {

    private String EvaluatedUnit;
    private Date date;
    private String EvaluationContent;
    private int BasicScore;
    private String DeductionStandard;
    private String ReasonForScoreDeduction;
    private int EvaluationScore;
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

    public String getEvaluationContent() {
        return EvaluationContent;
    }

    public void setEvaluationContent(String evaluationContent) {
        EvaluationContent = evaluationContent;
    }

    public int getBasicScore() {
        return BasicScore;
    }

    public void setBasicScore(int basicScore) {
        BasicScore = basicScore;
    }

    public String getDeductionStandard() {
        return DeductionStandard;
    }

    public void setDeductionStandard(String deductionStandard) {
        DeductionStandard = deductionStandard;
    }

    public String getReasonForScoreDeduction() {
        return ReasonForScoreDeduction;
    }

    public void setReasonForScoreDeduction(String reasonForScoreDeduction) {
        ReasonForScoreDeduction = reasonForScoreDeduction;
    }

    public int getEvaluationScore() {
        return EvaluationScore;
    }

    public void setEvaluationScore(int evaluationScore) {
        EvaluationScore = evaluationScore;
    }

    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String remarks) {
        Remarks = remarks;
    }
}

