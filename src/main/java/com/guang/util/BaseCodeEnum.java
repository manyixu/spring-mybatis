package com.guang.util;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Administrator on 15-8-23.
 */
public enum BaseCodeEnum {

    SEX_MALE("1001","100101","男"),
    SEX_FEMALE("1001","100102","女"),
    IDENTIFICATION_STUDENT("1002","100201","学生"),
    IDENTIFICATION_WORKER("1002","100202","在职"),
    IDENTIFICATION_FREE("1002","100203","自由职业"),
    IDENTIFICATION_OTHER("1002","100204","其他"),
    /**婚姻状况：单身、恋爱中、已婚、离异、丧偶*/
    MARITAL_STATUS_SINGLE("1003","100301","单身"),
    MARITAL_STATUS_LOVE_ING("1003","100302","恋爱中"),
    MARITAL_STATUS_MARRIED("1003","100303","已婚"),
    MARITAL_STATUS_DIVORCED("1003","100305","离异"),
    MARITAL_STATUS_WIDOWED("1003","100306","丧偶"),
    /*MARITAL_STATUS_SECRET("1003","100304","保密"),*/
    MARITAL_INTERESTING_FOOD("1004","100401","美食"),
    MARITAL_INTERESTING_FILM("1004","100402","电影"),
    MARITAL_INTERESTING_HOTEL("1004","100403","酒店"),
    MARITAL_INTERESTING_PLAY("1004","100404","休闲娱乐"),
    MARITAL_INTERESTING_BEAUTIFUL("1004","100405","丽人"),
    MARITAL_INTERESTING_TOURISM("1004","100406","旅游"),
    MARITAL_INTERESTING_SHOPPING("1004","100407","购物"),
    ORDER_EDITING__STATUS("1005","100501","未完成"),
    ORDER_APPROVING_STATUS("1005","100502","商家审核中"),
    ORDER_FENGKONG_APPROVING_STATUS("1005","100503","风控审核中"),
    ORDER_FENGKONG_FIRST_APPROVING_STATUS("1005","10050301","风控初审中"),
    ORDER_FENGKONG_SECOND_APPROVING_STATUS("1005","10050302","风控复审中"),
    ORDER_FENGKONG_THIRD_APPROVING_STATUS("1005","10050303","风控终审中"),
    ORDER_DELETED_STATUS("1005","100504","已删除"),
    ORDER_WAIT_SHOUXUFEI_STATUS("1005","100505","待缴费"),//待缴手续费改成待缴费
    ORDER_WAIT_FINANCE_APPROVING_STATUS("1005","100506","待放款"),//100510：待财务审核名称改成待放款
    ORDER_HUANKUAN_STATUS("1005","100507","还款中"),
    ORDER_FINISH_HUANKUAN_STATUS("1005","100508","已还清"),
    ORDER_APPROVING_NOPASS_STATUS("1005","100509","拒绝"),//未通过改成拒绝
    ORDER_OVERDUE_STATUS("1005","100510","已逾期"),
    ORDER_BREAK_CONTRACT_STATUS("1005","100511","已违约"),
    ORDER_OVERDUE_REPAY_FINISH_STATUS("1005","100512","逾期已还清"),
    ORDER_BREAK_CONTRACT_REPAY_FINISH_STATUS("1005","100513","违约已还清"),
    /*产品类型涉及所属品牌在数据库中维护
    ORDER_PACKAGE__YUEXIANGJIA1("1006","100601","悦享家"),
    ORDER_PACKAGE__ZUNXIANGJIA1("1006","100602","尊享家"),
    ORDER_PACKAGE__LINGBAOZHUANG1("1006","100603","拎包装"),
    ORDER_PACKAGE__LINGBAOZHUANG_PLUS1("1006","100604","拎包装plus"),*/
    ORDER_CUSTOMER_IDENTITY("1007","100701","身份证"),
    ORDER_REPUTATION("1007","100702","个人信证报告"),//房产证明
    ORDER_HUKOUBEN("1007","100703","户口本"),//居住证明
    ORDER_JIEHUNZHENG("1007","100704","结婚证"),//结婚证/单身证明
    ORDER_YINHANG_LIUSHUI("1007","100705","银行流水"),//收入证明
    ORDER_ZERENREN_IDENTITY("1007","100706","连带责任人照片"),//连带责任人身份证照片
    ORDER_YINGYE_ZHIZHAO("1007","100707","营业执照"),
    ORDER_ZUZHIJIEGOU("1007","100708","组织机构代码"),
    ORDER_ZAIZHIZHENGMING("1007","100709","在职证明"),//工作证明
    ORDER_QIYESHUIWU_DENGJIZHENG("1007","100710","企业税务登记证"),
    ORDER_JINGYING_CHANGSUO("1007","100711","企业经营场所照片"),
    ORDER_RETURN_TYPE("1008","100801","按月等额本金"),
    /*ORDER_STUDY_STATUS_XIAOXUE("1009","100901","小学"),
    ORDER_STUDY_STATUS_CHUZHONG("1009","100902","初中"),*/
    ORDER_STUDY_STATUS_GAOZHONG("1009","100903","高中及以下"),//小学、初中、高中变为高中以下
    ORDER_STUDY_STATUS_DAZHUAN("1009","100904","大专"),
    ORDER_STUDY_STATUS_BENKE("1009","100905","本科"),
    ORDER_STUDY_STATUS_YANJIUSHENG("1009","100906","硕士"),
    ORDER_STUDY_STATUS_BOSHISHENG("1009","100907","博士"),
    ORDER_APPLICANT_ASSET_HOUSE("1010","101001","有房"),
    ORDER_APPLICANT_ASSET_CAR("1010","101002","有车"),
    ORDER_APPLICANT_ASSET_HOUSE_CAR("1010","101004","有房有车"),
    ORDER_APPLICANT_ASSET_NOTHING("1010","101005","无房无车"),
    ORDER_JOB_NATURE_GONGXINJIECENG("1011","101101","工薪阶层"),
    ORDER_JOB_NATURE_QIYEZHU("1011","101102","企业主"),
    ORDER_JOB_NATURE_GETIHU("1011","101103","个体户"),
    ORDER_JOB_NATURE_WANGSHANG("1011","101104","网商"),
    ORDER_COMPANY_NATURE_JIGUAN("1012","101201","机关/事业/国企"),
    ORDER_COMPANY_NATURE_HEZI("1012","101202","合资/独资企业"),
    ORDER_COMPANY_NATURE_MINQI("1012","101203","民营企业/集体"),
    ORDER_COMPANY_NATURE_GETI("1012","101204","个体"),
    ORDER_COMPANY_NATURE_QITA("1012","101205","其他"),
    ORDER_COMPANY_INDUSTRY_GONGWUYUAN("1013","101301","公务员"),
    ORDER_COMPANY_INDUSTRY_KEYAN("1013","101302","科研/教育/医疗"),
    ORDER_COMPANY_INDUSTRY_JINRONG("1013","101303","金融/电信/电力"),
    ORDER_COMPANY_INDUSTRY_SHIWUSUO("1013","101304","注册事务所"),
    ORDER_COMPANY_INDUSTRY_YOUZHENG("1013","101305","邮政/交通/公用"),
    ORDER_COMPANY_INDUSTRY_MEITI("1013","101306","媒体/文艺/体育"),
    ORDER_COMPANY_INDUSTRY_GONGYE("1013","101307","工业/商业/贸易/服务"),
    ORDER_COMPANY_INDUSTRY_QITA("1013","101308","其他"),
    ORDER_APPLICANT_DUTIES_YIBANZHIYUAN("1014","101401","一般职员/一般干部"),
    ORDER_APPLICANT_DUTIES_MINQI_BUMENZHUGUAN("1014","101402","民企部门主管/科级"),
    ORDER_APPLICANT_DUTIES_GUOQI_BUMENZHUGUAN("1014","101403","国企部门主管/处级"),
    ORDER_APPLICANT_DUTIES_DANWEIZHUGUAN("1014","101404","单位主管/厅局级"),
    ORDER_APPLICANT_DUTIES_DONGSHIZHANG("1014","101405","董事长"),
    ORDER_APPLICANT_DUTIES_FARENDAIBIAO("1014","101406","法人代表"),
    ORDER_APPLICANT_DUTIES_GUDONG("1014","101407","股东"),
    ORDER_APPLICANT_DUTIES_CEO("1014","101408","CEO"),
    ORDER_APPLICANT_DUTIES_ZONGJINGLI("1014","101409","总经理"),
    ORDER_APPLICANT_DUTIES_ZONGJIAN("1014","101410","总监"),
    ORDER_APPLICANT_DUTIES_SHIYEBUJINGLI("1014","101411","事业部经理"),
    ORDER_APPLICANT_WORK_YEAR_FIVE("1015","101501","5年以上(含)"),
    ORDER_APPLICANT_WORK_YEAR_THREE("1015","101502","5年以下3年以上(含)"),
    ORDER_APPLICANT_WORK_YEAR_TWO("1015","101503","3年以下1年以上(含)"),
    ORDER_APPLICANT_WORK_YEAR_ONE("1015","101504","1年以下"),
    /*ORDER_LIABLE_RELATION_PEIOU("1016","101601","配偶"),*/
    ORDER_LIABLE_RELATION_ZINV("1016","101602","子女"),
    ORDER_LIABLE_RELATION_FUMU("1016","101603","父母"),
    ORDER_LIABLE_RELATION_XIONGDI("1016","101604","兄弟姐妹"),
    ORDER_LIABLE_RELATION_QITA("1016","101605","其他亲戚关系"),
    APPROVE_TYPE_SHANGJIA("1017","101701","商家审批"),
    APPROVE_TYPE_FENGKONG_FIRST("1017","101704","风控初审"),
    APPROVE_TYPE_FENGKONG_SECOND("1017","101703","风控复审"),
    APPROVE_TYPE_FENGKONG_THIRD("1017","101702","风控终审"),
    REPAYMENT_TYPE_SHOUXUFEI("1018","101801","服务费"),
    REPAYMENT_TYPE_FENQI("1018","101802","分期还款"),
    REPAYMENT_STATUS_ING("1019","101901","还款中"),
    REPAYMENT_STATUS_FINISH("1019","101902","已还款"),
    REPAYMENT_STATUS_OVERDUE("1019","101903","已逾期"),
    REPAYMENT_STATUS_BREAK_CONTRACT("1019","101904","已违约"),
    RESOURCE_TYPE_BACK_MENU("1020","102001","后台菜单"),
    RESOURCE_TYPE_FRONT_MENU("1020","102002","前台菜单"),
    WORK_STATUS_WAITING("1021","102101","等待执行"),
    WORK_STATUS_EXECUTION("1021","102102","执行中"),
    AUTHORITY_TYPE_MENU("1022","102201","菜单"),
    AUTHORITY_SYSTEM_ADMIN("1023","102301","系统管理"),
    LOAN_STATUS_WAITING_ZHIFU("1024","102401","待支付"),
    LOAN_STATUS_FINISH("1024","102402","已支付"),
    LOAN_STATUS_DOING("1024","102403","支付中"),
    COUPON_SHELVE("1025","102501","上架"),
    COUPON_UNSHELVE("1025","102502","下架"),
    COUPON_UNUSED("1026","102601","未使用"),
    COUPON_USED("1026","102602","已使用"),
    COUPON_EXPIRED("1026","102603","已过期"),

	OP_LOG_TYPE_LOGIN("1027","102701","登录"),
	OP_LOG_TYPE_REGISTER("1027","102702","注册"),
	OP_LOG_TYPE_APPLY_FOR_INSTALLMENT("1027","102703","申请分期"),
	OP_LOG_TYPE_RISK1("1027","102704","风控初审"),
	OP_LOG_TYPE_RISH2("1027","102705","风控复审"),
	OP_LOG_TYPE_RISH3("1027","102706","风控终审"),
	OP_LOG_TYPE_SELLER("1027","102707","商家审核"),
	OP_LOG_TYPE_PAY_THE_FEE("1027","102708","缴纳手续费"),
	OP_LOG_TYPE_FINANCE("1027","102709","财务审核"),
	OP_LOG_TYPE_REPAYMENT("1027","102710","用户还款"),
	OP_LOG_TYPE_BINGDCARD("1027","102711","用户绑卡"),
	OP_LOG_TYPE_CONFIRMPAY("1027","102712","确认支付"),
	OP_LOG_TYPE_GETPAYRESULT("1027","102713","获取支付结果"),
	OP_LOG_TYPE_CALLBACK("1027","102714","获取回调结果")	;
	
    private String parentCode;
    private String code;
    private String desc;

    private BaseCodeEnum(String parentCode, String code, String desc){
        this.parentCode = parentCode;
        this.code = code;
        this.desc = desc;
    }

    public String getParentCode(){return this.parentCode;}
    public String getCode(){return this.code;}
    public String getDesc(){return this.desc;}

    /**
     * 根据父编号获取基础代码
     * @param parentCode
     * @return
     */
    public static Map<String,String> getBaseCode(String parentCode){
        Map<String,String> baseCodes = new TreeMap<String, String>();
        for(BaseCodeEnum baseCodeEnum : BaseCodeEnum.values()){
            if (baseCodeEnum.parentCode.equals(parentCode)){
            	//不获取订单状态为已删除、风控初审中、复审中、终审中的数据字典
            	if(BaseCodeEnum.ORDER_DELETED_STATUS.getCode().equals(baseCodeEnum.getCode())||
            			baseCodeEnum.code.startsWith("1005030")){
            		continue;
            	}
            	baseCodes.put(baseCodeEnum.code, baseCodeEnum.desc);
            }
        }
        return baseCodes;
    }

    /**
     * 根据编码获得基础编码对象
     * @param code
     * @return
     */
    public static BaseCodeEnum getBaseCodeByCode(String code){
        BaseCodeEnum bc = null;
        for(BaseCodeEnum baseCodeEnum : BaseCodeEnum.values()){
            if (baseCodeEnum.code.equals(code)){
                bc = baseCodeEnum;
                break;
            }
        }
        return  bc;
    }
    /**
     * 根据编码获得一组以此编码开头的对象
     * @param code
     * @return
     */
    public static Map<String,String> getBaseCodesStartWithCode(String code){
    	Map<String,String> baseCodes = new TreeMap<String, String>();
    	for(BaseCodeEnum baseCodeEnum : BaseCodeEnum.values()){
            if (baseCodeEnum.code.startsWith(code)){
            	baseCodes.put(baseCodeEnum.code, baseCodeEnum.desc);
            }
        }
        return baseCodes;
    }
}
