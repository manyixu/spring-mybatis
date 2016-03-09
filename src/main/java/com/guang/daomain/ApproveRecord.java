package com.guang.daomain;


import com.guang.util.BaseCodeEnum;
import com.guang.util.StringUtil;

import java.io.Serializable;

/**
 * Created by Administrator on 15-9-1.
 */
public class ApproveRecord  implements Serializable {
    /**
     * 审批记录编号
     */
    private String approveRecordId;
    /**
     * 订单编号
     */
    private String orderId;
    /**
     * 审批类型
     */
    private String approveType;
    /**
     * 审批类型描述
     */
    private String approveTypeDesc;
    /**
     * 审批人
     */
    private String approvePerson;
    /**
     * 审批人姓名
     */
    private String approveName;
    /**
     * 审批结果 0-通过，1-拒绝，不通过，2-退回
     */
    private String approveResult;
    /**
     * 审批意见
     */
    private String approveRemarks;
    
    /**
     * 审批报告
     */
    private String approveReport;
    /**
     * 是否被删除
     */
    private Integer deleted = 0;
    /**
     * 审批时间
     */
    private String createTime;
    /**
     * 分期金额
     */
    private float packageMoney = 0;
    /**
     * 分期期数
     */
    private int fenQiTimes =0;
    /**
     * 缴纳的服务费
     */
    private float poundage = 0;
    /**
     * 月还款金额
     */
    private float moneyMonth = 0;

    public String getApproveRecordId() {
        return approveRecordId;
    }

    public void setApproveRecordId(String approveRecordId) {
        this.approveRecordId = approveRecordId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getApproveType() {
        return approveType;
    }

    public void setApproveType(String approveType) {
        this.approveType = approveType;
    }

    public String getApprovePerson() {
        return approvePerson;
    }

    public void setApprovePerson(String approvePerson) {
        this.approvePerson = approvePerson;
    }

    public String getApproveName() {
        return approveName;
    }

    public void setApproveName(String approveName) {
        this.approveName = approveName;
    }
    public String getApproveResult() {
		return approveResult;
	}

	public void setApproveResult(String approveResult) {
		this.approveResult = approveResult;
	}

	public String getApproveRemarks() {
        return approveRemarks;
    }

    public void setApproveRemarks(String approveRemarks) {
        this.approveRemarks = approveRemarks;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getApproveTypeDesc() {
        if (StringUtil.isNullOrEmpty(this.approveType))
            return null;
        BaseCodeEnum baseCodeEnum = BaseCodeEnum.getBaseCodeByCode(this.approveType);
        if (baseCodeEnum ==null)
            return null;
        return baseCodeEnum.getDesc();
    }

    public void setApproveTypeDesc(String approveTypeDesc) {
        this.approveTypeDesc = approveTypeDesc;
    }

    public float getPackageMoney() {
        return packageMoney;
    }

    public void setPackageMoney(float packageMoney) {
        this.packageMoney = packageMoney;
    }

    public int getFenQiTimes() {
        return fenQiTimes;
    }

    public void setFenQiTimes(int fenQiTimes) {
        this.fenQiTimes = fenQiTimes;
    }

    public float getPoundage() {
        return poundage;
    }

    public void setPoundage(float poundage) {
        this.poundage = poundage;
    }

    public float getMoneyMonth() {
        return moneyMonth;
    }

    public void setMoneyMonth(float moneyMonth) {
        this.moneyMonth = moneyMonth;
    }

	public String getApproveReport() {
		return approveReport;
	}

	public void setApproveReport(String approveReport) {
		this.approveReport = approveReport;
	}
    
    
}
