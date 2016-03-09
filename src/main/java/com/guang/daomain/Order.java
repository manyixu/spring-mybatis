package com.guang.daomain;


import com.guang.util.BaseCodeEnum;
import com.guang.util.StringUtil;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 15-8-29.
 */
public class Order implements Serializable {
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 用户ID
     */
    private String customerId;
    /**
     * 合同编号
     */
    private String contractNo;
    /**
     * 公司ID
     */
    private String companyId;
    /**
     * 套餐名称
     */
    private String packageName;
    /**
     * 套餐类型
     */
    private String packageType;
    /**
     * 设计师
     */
    private String designer;
    /**
     * 申请套餐金额
     */
    private float applyPackageMoney = 0;
    /**
     * 套餐金额
     */
    private float packageMoney = 0;
    /**
     * 合同金额
     */
    private float contractMoney = 0;
    /**
     * 申请贷款金额
     */
    private float loanMoney = 0;
    /**
     * 月还款金额
     */
    private float moneyMonth = 0;

    /**
     * 手续费
     */
    private float poundage = 0;
    /**
     * 申请分期期数
     */
    private int applyFenQiTimes = 0;
    /**
     * 分期
     */
    private int fenQiTimes = 0;
    /**
     * 还款方式
     */
    private String repaymentType;

    /**
     * 还款方式描述
     */
    private String repaymentTypeDesc;
    /**
     * 申请人身份证
     */
    private String applicantIdentity;
    /**
     * 申请人姓名
     */
    private String applicantName;
    /**
     * 申请人电话
     */
    private String applicantPhone;
    /**
     * 申请人年龄
     */
    private String applicantAge;
    /**
     * 申请人性别
     */
    private String applicantSex;
    /**
     * 性别描述
     */
    private String applicantSexDesc;
    /**
     * 申请人婚姻状态
     */
    private String applicantMarital;
    /**
     * 婚姻状况描述
     */
    private String applicantMaritalDesc;
    /**
     * 申请人住址
     */
    private String applicantAddress;
    /**
     * 申请人学历
     */
    private String applicantStudyStatus;
    /**
     * 学历描述
     */
    private String applicantStudyStatusDesc;
    /**
     * 申请人学校
     */
    private String applicantSchool;
    /**
     * 申请人专业
     */
    private String applicantMajor;
    /**
     * 专业描述（废弃）
     */
    private String applicantMajorDesc;
    /**
     * 申请人资产
     */
    private String applicantAsset;
    /**
     * 资产描述
     */
    private String applicantAssetDesc;
    /**
     * 申请人房产数量（废弃）
     */
    private int applicantHouseNumber = 0;
    /**
     * 申请人房产价值（废弃）
     */
    private float applicantHouseWorth = 0;
    /**
     * 申请人车辆数量（废弃）
     */
    private int applicantCarNumber = 0;
    /**
     * 申请人车辆价值（废弃）
     */
    private float applicantCarWorth = 0;
    /**
     * 申请人工作性质
     */
    private String applicantJobNature;
    /**
     * 工作性质描述
     */
    private String applicantJobNatureDesc;
    /**
     * 申请人工作单位
     */
    private String applicantCompany;
    /**
     * 申请人工作单位性质
     */
    private String applicantCompanyNature;
    /**
     * 工作单位性质描述
     */
    private String applicantCompanyNatureDesc;
    /**
     * 申请人公司行业
     */
    private String applicantCompanyIndustry;
    /**
     * 申请人公司行业
     */
    private String applicantCompanyIndustryDesc;
    /**
     * 申请人工作年限
     */
    private String applicantWorkYears;
    /**
     * 工作年限描述
     */
    private String applicantWorkYearsDesc;
    /**
     * 申请人担任职务
     */
    private String applicantDuties;
    /**
     * 职务描述
     */
    private String applicantDutiesDesc;
    /**
     * 申请人工作单位地址
     */
    private String applicantCompanyAddress;
    /**
     * 申请人公司联系电话
     */
    private String applicantCompanyPhone;
    /**
     * 税后工资
     */
    private float applicantWages = 0;
    /**
     * 配偶姓名
     */
    private String familyName;
    /**
     * 配偶电话
     */
    private String familyPhone;
    /**
     * 亲属关系（配偶）
     */
    private String familyRelation;
    /**
     * 配偶关系描述
     */
    private String familyRelationDesc;
    /**
     * 直系亲属姓名
     */
    private String familyTwoName;
    /**
     * 直系亲属电话
     */
    private String familyTwoPhone;
    /**
     * 直系亲属关系
     */
    private String familyTwoRelation;
    /**
     * 直系亲属家庭关系描述
     */
    private String familyTwoRelationDesc;
    /**
     * 家属是否知情（废弃）
     */
    private boolean familyKnow;
    /**
     * 朋友姓名
     */
    private String friendName;
    /**
     * 朋友电话
     */
    private String friendPhone;
    /**
     * 朋友姓名（废弃）
     */
    private String friendTwoName;
    /**
     * 朋友电话（废弃）
     */
    private String friendTwoPhone;
    /**
     * 同事姓名
     */
    private String workmateName;
    /**
     * 同事电话
     */
    private String workmatePhone;
    /**
     * 同事姓名（废弃）
     */
    private String workmateTwoName;
    /**
     * 同事电话（废弃）
     */
    private String workmateTwoPhone;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 修改时间
     */
    private String modifyTime;
    /**
     * 订单状态
     */
    private String status;

    /**
     * 订单状态描述
     */
    private String statusDes;
    /**
     * 删除状态
     */
    private int deleted = 0;

    /**
     * 下次还款时间
     */
    private String nextRepaymentTime;

    /**
     * 下次还款金额
     */
    private float nextRepaymentMoney = 0;

    /**
     * 未还款次数
     */
    private int noRepaymentTimes = 0;

    /**
     * 下次还款解释
     */
    private String nextRepaymentDesc;
    /**
     * 编辑完成时间
     */
    private String editCompleteTime;
    /**
     * 商家审批时间
     */
    private String sellerApproveTime;
    /**
     * 风控审批时间（废弃）
     */
    private String riskManagementTime;
    /**
     * 放款时间
     */
    private String loanTime;
    /**
     * 订单放款状态
     */
    private String loanStatus;
    /**
     * 订单放款状态描述
     */
    private String loanStatusDesc;
    /**
     * 订单剩余放款金额
     */
    private float loanResidueMoney = 0;
    /**
     * 公司名称
     */
    private String company;
    /**
     * 所属分公司
     */
    private String subsidiaryId;
    /**
     * 所属分公司名称
     */
    private String subsidiary;
    /**
     * 手续费还款记录id
     */
    private String poundageRecordId;
    /**
     * 手续费还款状态
     */
    private String poundageStatus;
    /**
     * 还款开始日期
     */
    private String expectRepaymentStartTime;
    /**
     * 还款还清日期
     */
    private String repaymentFinishTime;
    /**
     * 手续费期望还款时间
     */
    private String poundageExpectRepaymentTime;
    /**
     * 下订单的平台
     */
    private String platform;
    /**
     * 是否曾经逾期过
     */
    private String onceOverdue;
    /**
     * 终止合同时间
     */
    private String finishContractTime;
    /**
     * 违约原因
     */
    private String finishContractReason;
    /**
     * 当前订单的待还的还款记录的应还金额(已逾期的为所有逾期的应还金额，已违约的为所有未还的分期金额，还款中的为当前下一期应还金额)
     */
    private float currentBalance;
    /**
     * 订单一次还清时的所有应还金额
     */
    private float totalCurrentBalance;
    /**
     * 当前订单的待还的还款记录的逾期费用
     */
    private float overdueFee;
    /**
     * 当前订单的待还的还款记录的剩余本金
     */
    private float residuePrincipal;
    /**
     * 当前订单实际还款金额总和
     */
    private float realRepaymentMoney;
    /**
     * 分期中当前未还的第一笔的逾期天数
     */
    private int overdueTime;
    /**
     * 逾期笔数
     */
    private int overdueCount;
    /**
     * 分期中当前未还的第一笔的期望还款时间
     */
    private String firstExpectRepaymentTime;
    /**
     * 分期中当前已还的最新实际时间
     */
    private String lastRealRepaymentTime;
    /**
     * 逾期时间(距离当前时间最远的逾期的时间)
     */
    private String overdueDate;
    /**
     * 审批记录
     */
    private List<ApproveRecord> approveRecords = new ArrayList<ApproveRecord>();

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public float getPackageMoney() {
        return packageMoney;
    }

    public void setPackageMoney(float packageMoney) {
        this.packageMoney = packageMoney;
    }

    public float getMoneyMonth() {
        return moneyMonth;
    }

    public void setMoneyMonth(float moneyMonth) {
        this.moneyMonth = moneyMonth;
    }

    public float getPoundage() {
        return poundage;
    }

    public void setPoundage(float poundage) {
        this.poundage = poundage;
    }

    public int getFenQiTimes() {
        return fenQiTimes;
    }

    public void setFenQiTimes(int fenQiTimes) {
        this.fenQiTimes = fenQiTimes;
    }

    public String getRepaymentType() {
        return repaymentType;
    }

    public void setRepaymentType(String repaymentType) {
        this.repaymentType = repaymentType;
    }

    public String getApplicantIdentity() {
        return applicantIdentity;
    }

    public void setApplicantIdentity(String applicantIdentity) {
        this.applicantIdentity = applicantIdentity;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getApplicantPhone() {
        return applicantPhone;
    }

    public void setApplicantPhone(String applicantPhone) {
        this.applicantPhone = applicantPhone;
    }

    public String getApplicantAge() {
        return applicantAge;
    }

    public void setApplicantAge(String applicantAge) {
        this.applicantAge = applicantAge;
    }

    public String getApplicantSex() {
        return applicantSex;
    }

    public void setApplicantSex(String applicantSex) {
        this.applicantSex = applicantSex;
    }

    public String getApplicantMarital() {
        return applicantMarital;
    }

    public void setApplicantMarital(String applicantMarital) {
        this.applicantMarital = applicantMarital;
    }

    public String getApplicantAddress() {
        return applicantAddress;
    }

    public void setApplicantAddress(String applicantAddress) {
        this.applicantAddress = applicantAddress;
    }

    public String getApplicantStudyStatus() {
        return applicantStudyStatus;
    }

    public void setApplicantStudyStatus(String applicantStudyStatus) {
        this.applicantStudyStatus = applicantStudyStatus;
    }

    public String getApplicantStudyStatusDesc() {
        if (StringUtil.isNullOrEmpty(this.applicantStudyStatus))
            return null;
        BaseCodeEnum baseCodeEnum = BaseCodeEnum.getBaseCodeByCode(this.applicantStudyStatus);
        if (baseCodeEnum == null)
            return null;
        return baseCodeEnum.getDesc();
    }

    public void setApplicantStudyStatusDesc(String applicantStudyStatusDesc) {
        this.applicantStudyStatusDesc = applicantStudyStatusDesc;
    }

    public String getApplicantMajor() {
        return applicantMajor;
    }

    public void setApplicantMajor(String applicantMajor) {
        this.applicantMajor = applicantMajor;
    }

    public String getApplicantAsset() {
        return applicantAsset;
    }

    public void setApplicantAsset(String applicantAsset) {
        this.applicantAsset = applicantAsset;
    }

    public int getApplicantHouseNumber() {
        return applicantHouseNumber;
    }

    public void setApplicantHouseNumber(int applicantHouseNumber) {
        this.applicantHouseNumber = applicantHouseNumber;
    }

    public float getApplicantHouseWorth() {
        return applicantHouseWorth;
    }

    public void setApplicantHouseWorth(float applicantHouseWorth) {
        this.applicantHouseWorth = applicantHouseWorth;
    }

    public int getApplicantCarNumber() {
        return applicantCarNumber;
    }

    public void setApplicantCarNumber(int applicantCarNumber) {
        this.applicantCarNumber = applicantCarNumber;
    }

    public float getApplicantCarWorth() {
        return applicantCarWorth;
    }

    public void setApplicantCarWorth(float applicantCarWorth) {
        this.applicantCarWorth = applicantCarWorth;
    }

    public String getApplicantJobNature() {
        return applicantJobNature;
    }

    public void setApplicantJobNature(String applicantJobNature) {
        this.applicantJobNature = applicantJobNature;
    }

    public String getApplicantCompany() {
        return applicantCompany;
    }

    public void setApplicantCompany(String applicantCompany) {
        this.applicantCompany = applicantCompany;
    }

    public String getApplicantCompanyNature() {
        return applicantCompanyNature;
    }

    public void setApplicantCompanyNature(String applicantCompanyNature) {
        this.applicantCompanyNature = applicantCompanyNature;
    }

    public String getApplicantCompanyIndustry() {
        return applicantCompanyIndustry;
    }

    public void setApplicantCompanyIndustry(String applicantCompanyIndustry) {
        this.applicantCompanyIndustry = applicantCompanyIndustry;
    }

    public String getApplicantCompanyIndustryDesc() {
        if (StringUtil.isNullOrEmpty(this.applicantCompanyIndustry))
            return null;
        BaseCodeEnum baseCodeEnum = BaseCodeEnum.getBaseCodeByCode(this.applicantCompanyIndustry);
        if (baseCodeEnum == null)
            return null;
        return baseCodeEnum.getDesc();
    }

    public void setApplicantCompanyIndustryDesc(String applicantCompanyIndustryDesc) {
        this.applicantCompanyIndustryDesc = applicantCompanyIndustryDesc;
    }

    public String getApplicantWorkYears() {
        return applicantWorkYears;
    }

    public void setApplicantWorkYears(String applicantWorkYears) {
        this.applicantWorkYears = applicantWorkYears;
    }

    public String getApplicantDuties() {
        return applicantDuties;
    }

    public void setApplicantDuties(String applicantDuties) {
        this.applicantDuties = applicantDuties;
    }

    public String getApplicantCompanyAddress() {
        return applicantCompanyAddress;
    }

    public void setApplicantCompanyAddress(String applicantCompanyAddress) {
        this.applicantCompanyAddress = applicantCompanyAddress;
    }

    public String getApplicantCompanyPhone() {
        return applicantCompanyPhone;
    }

    public void setApplicantCompanyPhone(String applicantCompanyPhone) {
        this.applicantCompanyPhone = applicantCompanyPhone;
    }

    public float getApplicantWages() {
        return applicantWages;
    }

    public void setApplicantWages(float applicantWages) {
        this.applicantWages = applicantWages;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFamilyPhone() {
        return familyPhone;
    }

    public void setFamilyPhone(String familyPhone) {
        this.familyPhone = familyPhone;
    }

    public String getFamilyRelation() {
        return familyRelation;
    }

    public void setFamilyRelation(String familyRelation) {
        this.familyRelation = familyRelation;
    }

    public boolean isFamilyKnow() {
        return familyKnow;
    }

    public void setFamilyKnow(boolean familyKnow) {
        this.familyKnow = familyKnow;
    }

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public String getFriendPhone() {
        return friendPhone;
    }

    public void setFriendPhone(String friendPhone) {
        this.friendPhone = friendPhone;
    }


    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public String getNextRepaymentTime() {
        return nextRepaymentTime;
    }

    public void setNextRepaymentTime(String nextRepaymentTime) {
        this.nextRepaymentTime = nextRepaymentTime;
    }

    public float getNextRepaymentMoney() {
        return nextRepaymentMoney;
    }

    public void setNextRepaymentMoney(float nextRepaymentMoney) {
        this.nextRepaymentMoney = nextRepaymentMoney;
    }

    public String getApplicantSchool() {
        return applicantSchool;
    }

    public void setApplicantSchool(String applicantSchool) {
        this.applicantSchool = applicantSchool;
    }

    public int getNoRepaymentTimes() {
        return noRepaymentTimes;
    }

    public void setNoRepaymentTimes(int noRepaymentTimes) {
        this.noRepaymentTimes = noRepaymentTimes;
    }

    public String getNextRepaymentDesc() {
        return nextRepaymentDesc;
    }

    public void setNextRepaymentDesc(String nextRepaymentDesc) {
        this.nextRepaymentDesc = nextRepaymentDesc;
    }

    public String getStatusDes() {
        if (StringUtil.isNullOrEmpty(this.status))
            return null;
        BaseCodeEnum baseCodeEnum = BaseCodeEnum.getBaseCodeByCode(this.status);
        if (baseCodeEnum == null)
            return null;
        return baseCodeEnum.getDesc();
    }

    public void setStatusDes(String statusDes) {
        this.statusDes = statusDes;
    }

    public String getRepaymentTypeDesc() {
        if (StringUtil.isNullOrEmpty(this.repaymentType))
            return null;
        BaseCodeEnum baseCodeEnum = BaseCodeEnum.getBaseCodeByCode(this.repaymentType);
        if (baseCodeEnum == null)
            return null;
        return baseCodeEnum.getDesc();
    }

    public void setRepaymentTypeDesc(String repaymentTypeDesc) {
        this.repaymentTypeDesc = repaymentTypeDesc;
    }

    public String getApplicantSexDesc() {
        if (StringUtil.isNullOrEmpty(this.applicantSex))
            return null;
        BaseCodeEnum baseCodeEnum = BaseCodeEnum.getBaseCodeByCode(this.applicantSex);
        if (baseCodeEnum == null)
            return null;
        return baseCodeEnum.getDesc();
    }

    public void setApplicantSexDesc(String applicantSexDesc) {
        this.applicantSexDesc = applicantSexDesc;
    }

    public String getApplicantMaritalDesc() {
        if (StringUtil.isNullOrEmpty(this.applicantMarital))
            return null;
        BaseCodeEnum baseCodeEnum = BaseCodeEnum.getBaseCodeByCode(this.applicantMarital);
        if (baseCodeEnum == null)
            return null;
        return baseCodeEnum.getDesc();
    }

    public void setApplicantMaritalDesc(String applicantMaritalDesc) {
        this.applicantMaritalDesc = applicantMaritalDesc;
    }

    public String getApplicantMajorDesc() {
        if (StringUtil.isNullOrEmpty(this.applicantMajor))
            return null;
        BaseCodeEnum baseCodeEnum = BaseCodeEnum.getBaseCodeByCode(this.applicantMajor);
        if (baseCodeEnum == null)
            return null;
        return baseCodeEnum.getDesc();
    }

    public void setApplicantMajorDesc(String applicantMajorDesc) {
        this.applicantMajorDesc = applicantMajorDesc;
    }

    public String getApplicantAssetDesc() {
        if (StringUtil.isNullOrEmpty(this.applicantAsset))
            return null;
        BaseCodeEnum baseCodeEnum = BaseCodeEnum.getBaseCodeByCode(this.applicantAsset);
        if (baseCodeEnum == null)
            return null;
        return baseCodeEnum.getDesc();
    }

    public void setApplicantAssetDesc(String applicantAssetDesc) {
        this.applicantAssetDesc = applicantAssetDesc;
    }

    public String getApplicantJobNatureDesc() {
        if (StringUtil.isNullOrEmpty(this.applicantJobNature))
            return null;
        BaseCodeEnum baseCodeEnum = BaseCodeEnum.getBaseCodeByCode(this.applicantJobNature);
        if (baseCodeEnum == null)
            return null;
        return baseCodeEnum.getDesc();
    }

    public void setApplicantJobNatureDesc(String applicantJobNatureDesc) {
        this.applicantJobNatureDesc = applicantJobNatureDesc;
    }

    public String getApplicantCompanyNatureDesc() {
        if (StringUtil.isNullOrEmpty(this.applicantCompanyNature))
            return null;
        BaseCodeEnum baseCodeEnum = BaseCodeEnum.getBaseCodeByCode(this.applicantCompanyNature);
        if (baseCodeEnum == null)
            return null;
        return baseCodeEnum.getDesc();
    }

    public void setApplicantCompanyNatureDesc(String applicantCompanyNatureDesc) {
        this.applicantCompanyNatureDesc = applicantCompanyNatureDesc;
    }

    public String getApplicantWorkYearsDesc() {
        if (StringUtil.isNullOrEmpty(this.applicantWorkYears))
            return null;
        BaseCodeEnum baseCodeEnum = BaseCodeEnum.getBaseCodeByCode(this.applicantWorkYears);
        if (baseCodeEnum == null)
            return null;
        return baseCodeEnum.getDesc();
    }

    public void setApplicantWorkYearsDesc(String applicantWorkYearsDesc) {
        this.applicantWorkYearsDesc = applicantWorkYearsDesc;
    }

    public String getApplicantDutiesDesc() {
        if (StringUtil.isNullOrEmpty(this.applicantDuties))
            return null;
        BaseCodeEnum baseCodeEnum = BaseCodeEnum.getBaseCodeByCode(this.applicantDuties);
        if (baseCodeEnum == null)
            return null;
        return baseCodeEnum.getDesc();
    }

    public void setApplicantDutiesDesc(String applicantDutiesDesc) {
        this.applicantDutiesDesc = applicantDutiesDesc;
    }

    public String getFamilyRelationDesc() {
        if (StringUtil.isNullOrEmpty(this.familyRelation))
            return null;
        BaseCodeEnum baseCodeEnum = BaseCodeEnum.getBaseCodeByCode(this.familyRelation);
        if (baseCodeEnum == null)
            return null;
        return baseCodeEnum.getDesc();
    }

    public void setFamilyRelationDesc(String familyRelationDesc) {
        this.familyRelationDesc = familyRelationDesc;
    }


    public float getLoanMoney() {
        return loanMoney;
    }

    public void setLoanMoney(float loanMoney) {
        this.loanMoney = loanMoney;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /**
     * 亲属姓名
     */
    public String getFamilyTwoName() {
        return familyTwoName;
    }

    public void setFamilyTwoName(String familyTwoName) {
        this.familyTwoName = familyTwoName;
    }

    /**
     * 家属电话
     */
    public String getFamilyTwoPhone() {
        return familyTwoPhone;
    }

    public void setFamilyTwoPhone(String familyTwoPhone) {
        this.familyTwoPhone = familyTwoPhone;
    }

    /**
     * 亲属关系
     */
    public String getFamilyTwoRelation() {
        return familyTwoRelation;
    }

    public void setFamilyTwoRelation(String familyTwoRelation) {
        this.familyTwoRelation = familyTwoRelation;
    }

    /**
     * 家庭关系描述
     */
    public String getFamilyTwoRelationDesc() {
        if (StringUtil.isNullOrEmpty(this.familyTwoRelation))
            return null;
        BaseCodeEnum baseCodeEnum = BaseCodeEnum.getBaseCodeByCode(this.familyTwoRelation);
        if (baseCodeEnum == null)
            return null;
        return baseCodeEnum.getDesc();
    }

    public void setFamilyTwoRelationDesc(String familyTwoRelationDesc) {
        this.familyTwoRelationDesc = familyTwoRelationDesc;
    }

    /**
     * 朋友姓名
     */
    public String getFriendTwoName() {
        return friendTwoName;
    }

    public void setFriendTwoName(String friendTwoName) {
        this.friendTwoName = friendTwoName;
    }

    /**
     * 朋友电话
     */
    public String getFriendTwoPhone() {
        return friendTwoPhone;
    }

    public void setFriendTwoPhone(String friendTwoPhone) {
        this.friendTwoPhone = friendTwoPhone;
    }

    /**
     * 同事姓名
     */
    public String getWorkmateName() {
        return workmateName;
    }

    public void setWorkmateName(String workmateName) {
        this.workmateName = workmateName;
    }

    /**
     * 同事电话
     */
    public String getWorkmatePhone() {
        return workmatePhone;
    }

    public void setWorkmatePhone(String workmatePhone) {
        this.workmatePhone = workmatePhone;
    }

    /**
     * 同事姓名
     */
    public String getWorkmateTwoName() {
        return workmateTwoName;
    }

    public void setWorkmateTwoName(String workmateTwoName) {
        this.workmateTwoName = workmateTwoName;
    }

    /**
     * 同事电话
     */
    public String getWorkmateTwoPhone() {
        return workmateTwoPhone;
    }

    public void setWorkmateTwoPhone(String workmateTwoPhone) {
        this.workmateTwoPhone = workmateTwoPhone;
    }

    public float getContractMoney() {
        return contractMoney;
    }

    public void setContractMoney(float contractMoney) {
        this.contractMoney = contractMoney;
    }

    public List<ApproveRecord> getApproveRecords() {
        return approveRecords;
    }

    public void setApproveRecords(List<ApproveRecord> approveRecords) {
        this.approveRecords = approveRecords;
    }

    public String getEditCompleteTime() {
        return editCompleteTime;
    }

    public void setEditCompleteTime(String editCompleteTime) {
        this.editCompleteTime = editCompleteTime;
    }

    public String getSellerApproveTime() {
        return sellerApproveTime;
    }

    public void setSellerApproveTime(String sellerApproveTime) {
        this.sellerApproveTime = sellerApproveTime;
    }

    public String getRiskManagementTime() {
        return riskManagementTime;
    }

    public void setRiskManagementTime(String riskManagementTime) {
        this.riskManagementTime = riskManagementTime;
    }

    public String getLoanTime() {
        return loanTime;
    }

    public void setLoanTime(String loanTime) {
        this.loanTime = loanTime;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    public String getLoanStatusDesc() {
        if (StringUtil.isNullOrEmpty(this.loanStatus))
            return null;
        BaseCodeEnum baseCodeEnum = BaseCodeEnum.getBaseCodeByCode(this.loanStatus);
        if (baseCodeEnum == null)
            return null;
        return baseCodeEnum.getDesc();
    }

    public void setLoanStatusDesc(String loanStatusDesc) {
        this.loanStatusDesc = loanStatusDesc;
    }

    public float getLoanResidueMoney() {
        return loanResidueMoney;
    }

    public void setLoanResidueMoney(float loanResidueMoney) {
        this.loanResidueMoney = loanResidueMoney;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSubsidiaryId() {
        return subsidiaryId;
    }

    public void setSubsidiaryId(String subsidiaryId) {
        this.subsidiaryId = subsidiaryId;
    }

    public String getSubsidiary() {
        return subsidiary;
    }

    public void setSubsidiary(String subsidiary) {
        this.subsidiary = subsidiary;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public String getPoundageRecordId() {
        return poundageRecordId;
    }

    public void setPoundageRecordId(String poundageRecordId) {
        this.poundageRecordId = poundageRecordId;
    }

    public String getPoundageStatus() {
        return poundageStatus;
    }

    public void setPoundageStatus(String poundageStatus) {
        this.poundageStatus = poundageStatus;
    }

    public String getExpectRepaymentStartTime() {
        return expectRepaymentStartTime;
    }

    public void setExpectRepaymentStartTime(String expectRepaymentStartTime) {
        this.expectRepaymentStartTime = expectRepaymentStartTime;
    }

    public String getRepaymentFinishTime() {
        return repaymentFinishTime;
    }

    public void setRepaymentFinishTime(String repaymentFinishTime) {
        this.repaymentFinishTime = repaymentFinishTime;
    }

    public String getPoundageExpectRepaymentTime() {
        return poundageExpectRepaymentTime;
    }

    public void setPoundageExpectRepaymentTime(String poundageExpectRepaymentTime) {
        this.poundageExpectRepaymentTime = poundageExpectRepaymentTime;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public float getApplyPackageMoney() {
        return applyPackageMoney;
    }

    public void setApplyPackageMoney(float applyPackageMoney) {
        this.applyPackageMoney = applyPackageMoney;
    }

    public int getApplyFenQiTimes() {
        return applyFenQiTimes;
    }

    public void setApplyFenQiTimes(int applyFenQiTimes) {
        this.applyFenQiTimes = applyFenQiTimes;
    }

    public String getOnceOverdue() {
        return onceOverdue;
    }

    public void setOnceOverdue(String onceOverdue) {
        this.onceOverdue = onceOverdue;
    }

    public String getFinishContractTime() {
        return finishContractTime;
    }

    public void setFinishContractTime(String finishContractTime) {
        this.finishContractTime = finishContractTime;
    }


    public String getFinishContractReason() {
        return finishContractReason;
    }

    public void setFinishContractReason(String finishContractReason) {
        this.finishContractReason = finishContractReason;
    }

    public float getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(float currentBalance) {
        this.currentBalance = currentBalance;
    }

    public int getOverdueTime() {
        return overdueTime;
    }

    public void setOverdueTime(int overdueTime) {
        this.overdueTime = overdueTime;
    }

    public float getRealRepaymentMoney() {
        return realRepaymentMoney;
    }

    public void setRealRepaymentMoney(float realRepaymentMoney) {
        this.realRepaymentMoney = realRepaymentMoney;
    }

    public String getFirstExpectRepaymentTime() {
        return firstExpectRepaymentTime;
    }

    public void setFirstExpectRepaymentTime(String firstExpectRepaymentTime) {
        this.firstExpectRepaymentTime = firstExpectRepaymentTime;
    }

    public float getOverdueFee() {
        return overdueFee;
    }

    public void setOverdueFee(float overdueFee) {
        this.overdueFee = overdueFee;
    }

    public String getLastRealRepaymentTime() {
        return lastRealRepaymentTime;
    }

    public void setLastRealRepaymentTime(String lastRealRepaymentTime) {
        this.lastRealRepaymentTime = lastRealRepaymentTime;
    }

    public float getTotalCurrentBalance() {
        return totalCurrentBalance;
    }

    public void setTotalCurrentBalance(float totalCurrentBalance) {
        this.totalCurrentBalance = totalCurrentBalance;
    }

    public int getOverdueCount() {
        return overdueCount;
    }

    public void setOverdueCount(int overdueCount) {
        this.overdueCount = overdueCount;
    }

    public float getResiduePrincipal() {
        return residuePrincipal;
    }

    public void setResiduePrincipal(float residuePrincipal) {
        this.residuePrincipal = residuePrincipal;
    }

    public String getOverdueDate() {
        return overdueDate;
    }

    public void setOverdueDate(String overdueDate) {
        this.overdueDate = overdueDate;
    }

}
