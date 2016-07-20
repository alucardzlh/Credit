package com.example.credit.Entitys;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/13 0013.
 */
public class DataManager {

    public static MyComm MyComms=new MyComm();

    /**
     *我的评价
     */
    public static class MyComm {
        public String message;
        public String status;
        public DataBean data;
        public static class DataBean {
            public List<CommentListBean> commentList;

            public static class CommentListBean {
                public String FAILEDQTY;
                public String ENTERID;//附加表的企业ID
                public String REGNORE;
                public String CONTENT;//点评内容
                public String ENTNAME;
                public String CREATETIME;//评论时间
                public String PRIPID;
                public String COMMENTID;//评论ID
                public String ISSUCCESS;
                public String SUCCESSQTY;
                public String ENTTYPE;
                public String ISFAILED;
            }
        }
    }

    public class ContatUser {//联系人信息
        public Integer user_id;
        public Integer corps_id;
        public String user_name;
        public String gender;
        public String phone_num;
        public String password;
        public String qq_num;
        public String email;
        public Byte status;
        public String detail;
    }

    public class Root {
        public int status;
        public String message;
        public DataS data;
    }

    public class DataS {
        public Paging Paging;
        public List<search> Result;
    }

    public class Paging {
        public int PageSize;
        public int PageIndex;
        public int TotalRecords;
    }

    public static List<search> searchList = new ArrayList<>();//搜索列表集合

    /**
     * 搜索实体类
     */
    public static class search {//搜索列表信息 Result

        public String ENTTYPE;
        public String PRIPID;//主体身份代码
        public String ENTNAME;//企业(机构)名称
        public String REGNO;//注册号
        public String REGORG_CN;//登记机关（中文名称）
        public String NAME;//法定代表人
        public String OPFROM;//经营(驻在)期限自
        public String OPTO;//经营(驻在)期限至
        public String REGSTATE_CN;//登记状态中文名称
        public String C_PROVINCE;//省代码
        public String D_ADDTIME;//更新时间
        public String C_STATE;//经营状态  1 存续（在营，开业，在册）  2 吊销，未注销    3吊销，已注销  4，注销  5，撤销  6，迁出   9，其他
        public String REGCAP;//注册资本(金)  万元
        public String ENTTYPE_CN;//市场主体类型
        public String DOM;//住所
        public String INDUSTRYPHY;//行业代码
        public String INDUSTRYPHY_NAME;//行业代码中文名字
        public String OPSCOPE;//经营范围


       /* public String KeyNo;
        public String Name;//公司名
        public String No;
        public String BelongOrg;
        public String OperName;//法人
        public String StartDate;//注册时间
        public String EndDate;
        public String Status;//存续
        public String Province;
        public String UpdatedDate;
        public String ShortStatus;
        public String CreditCode;
        public String RegistCapi;//注册资金
        public String EconKind;
        public String Address;
        public Industry Industry;
        public List<OriginalName> OriginalName;
        public HitReason HitReason;
        public String Scope;
        public String ContactNumber;
        public String Email;
        public String WebSite;
        public String ImageUrl;
        public String OrgNo;
        public String EnglishName;*/
    }

    public class Industry {
        public String IndustryCode;
        public int SubIndustryCode;
        public String Industry;
        public String SubIndustry;
    }

    public class OriginalName {
        public String Name;
    }

    public class HitReason {
        public String Field;
        public String Value;
    }


//    public static List<citys> citysList = new ArrayList<citys>();//城市集合
//    /**
//     * 企查查城市实体类
//     */
//    public class citys {
//        public String Province;
//        public String City;
//        public String ProvinceCode;
//        public String CityCode;
//    }

    public static List<citys> citysList = new ArrayList<>();

    /**
     * 省份实体类
     */
    public static class citys {
        public String c_code;
        public String c_name;
        public List<citycode> citycode;

    }

    public static List<citycode> citycodeList = new ArrayList<>();

    /**
     * 城市实体类
     */
    public static class citycode {
        public String c_code;
        public String c_name;
    }

    public static List<String> city = new ArrayList<>();//城市数据源


    public static List<industryData> industryDataList = new ArrayList<>();

    /**
     * 行业实体类
     */
    public static class industryData {
        public String EC_VALUE;
        public String EC_NAME;
    }


//    public static List<SubIndustryList> SubyList;
//
//    /**
//     * 行业子类
//     */
//    public class SubIndustryList {
//        public String Code;
//        public String Name;
//        public String Desc;
//    }

    public static List<News> newsList;//新闻list

    /**
     * 新闻实体类
     */
    public static class News {
        public News(String img, String title, String content, String time) {
            this.img = img;
            this.title = title;
            this.content = content;
            this.time = time;
        }

        public String img;
        public String title;
        public String content;
        public String time;

    }


    public static GSXX gsxx = new GSXX();

    /**
     * 工商信息类
     */
    public static class GSXX {
        public String message;
        public String status;
        public DataBean data;

        public static class DataBean {
            public AreaBean Area;
            public CompanyBean Company;
            public BaseInfoBean BaseInfo;
            public List<AnnualReports> AnnualReports;
            public List<PartnersBean> Partners;
            public List<ChangeRecordsBean> ChangeRecords;
            public List<EmployeesBean> Employees;

            /**
             * 公司所在省市区
             */
            public static class AreaBean {
                public String C_COUNTY;//县/区
                public String C_CITY;//市
                public String C_PROVINCE;//省
            }

            public static class CompanyBean {
                public CountInfoBean CountInfo;

                public static class CountInfoBean {
                    public int sbxx;
                    public int xzsp;
                    public int xyxx;
                    public int xzcf;
                    public int zlxx;
                    public int dyxx;
                    public int ggzz;
                    public int ryxx;
                    public int czxx;
                    public int zzq;
                    public int fcxx;
                    public int jyyc;
                }
            }

            public static class BaseInfoBean {
                public String D_ADDTIME;//更新时间
                public String REGCAP;//注册资本
                public String NAME;//法定代表人
                public String ESTDATE;//成立日期
                public String REGSTATE_CN;//登记状态（中文名称）
                public String OPTO;//经营(驻在)期限至
                public String ENTTYPE;//9999=个体工商户
                public String INDUSTRYPHY;//行业门类
                public String REGNO;//注册号
                public String DOM;//住所
                public String REGORG_CN;//登记机关（中文名称）
                public String APPRDATE;
                public String ENTTYPE_CN;//市场主体类型（中文名称）
                public String ENTNAME;//企业(机构)名称
                public String OPSCOPE;//经营范围
                public String PRIPID;//主体身份代码
                public String C_STATE;//经营状态 （1 存续（在营，开业，在册）  2 吊销，未注销    3 吊销，已注销  4，注销  5，撤销  6，迁出   9，其他 ）
                public String OPFROM;//经营(驻在)期限自   起
                public String C_PROVINCE;//省
            }

            /**
             * 自然人信息
             */
            public static class PartnersBean {
                public String INV;//姓名
                public String PRIPID;//主体身份代码
                public String INVTYPE_CN;//股东类型
            }

            /**
             * 工商变更
             */
            public static class ChangeRecordsBean {
                public String ALTITEM_CN;
                public String ALTAF;
                public String ALTDATE;
                public String ALTBE;
            }

            /**
             * 主要人员信息
             */
            public static class EmployeesBean {
                public String NAME;//姓名
                public String CERNO;//件号码/代表证编号（DB320）
                public String POSITION_CN;//职务（中文名称）
                public String PERSONID;//主要人员id
            }

            /**
             * 分支机构
             */
            public class AnnualReports {//分支机构
                public String BRID;//分支机构ID
                public String PPRIPID;//主体身份代码
                public String PRIPID;//分支机构主体身份代码
                public String BRNAME;//分支机构名称
                public String REGNO;//注册号
                public String UNISCID;//统一社会信用代码
                public String REGORG_CN;//登记机关（中文名称）
                public String REGIDATE;//登记日期
            }
        }
    }


    /**
     * 工商变更临时
     */

    public static class ChangeTime {
        public String ALTDATE;//变更日期
        public List<ChangeData> changedata;//变更信息
    }

    public static class ChangeData {//临时仓库
        public String ALTDATE;//变更日期
        public String ALTITEM_CN;//变更事项
        public String ALTBE;//变更前
        public String ALTAF;//变更后

    }


    /**
     * 抵押信息动产实体类
     */
    public static List<mortgageMP> mortgageMP_List = new ArrayList<>();

    public static class mortgageMP {
        public String MORREG_ID;//抵押登记ID
        public String MORREGCNO;//登记编号
        public String REGIDATE;//登记日期
        public String PUBLICDATE;//公示日期
        public String REGORG_CN;//登记机关
        public String PRICLASECAM;//抵押数额 万元

    }

    /**
     * 抵押信息不动产实体类
     */
    public static List<mortgageRE> mortgageRE_List = new ArrayList<>();

    public static class mortgageRE {
        public String C_INFOID;//登记id
        public String C_DYDJZH;//登记编号
        public String D_DJRQ;//登记日期
        public String D_SQRQ;//公示时间
        public String C_DJJG;//登记机关
        public String C_DBFW;//详情
        // public String valuation;//抵押物估值
    }


    public static List<administraton> ad_List = new ArrayList<>();
    public static List<admin_other> admin_other_List = new ArrayList<>();
    /**
     * 行政审批
     * 行政许可实体类
     */
    public static class administraton {
        public String PRIPID;//主体身份代码
        public String LICNAME;//许可文件名称
        public String LICNO;//许可文件编号
        public String VALFROM;//有效期自
        public String LICANTH;//许可机关
        public String VALTO;//有效期止

    }

    /**
     * 行政审批
     * 其它信息实体类
     */
    public static class admin_other {
        public String LICANTH;//许可机关
        public String REGNO;//注册号
        public String VALFROM;//有效期自
        public String LICNAME_CN;//许可文件名称（中文名称）
        public String LICID;//其他部门行政许可信息
        public String ENTNAME;//名称
        public String LICNO;//许可文件编号
        public String VALTO;//有效期至
        public String PRIPID;//主体身份代码
        public String TYPE;//状态(  1有效   2无效)
        public String LICITEM;//许可内容

    }


    /**
     * 荣誉信息实体类
     */

    public static List<honorInfo> honorInfoList = new ArrayList<>();

    public static class honorInfo {
        public String HONORID;//荣誉id
        public String HONORNAME;//荣誉名称
        public String HONORCONTENT;//荣誉内容（类型）
        public String ORGAN;//机关
        public String C_UNIQUE_CODE;//统一社会信用代码
    }

    /**
     * 企业扶持信息实体类
     */




    public static supportInfo supportInfoS=new supportInfo();

    public static class supportInfo {
        public String message;
        public String status;
        public DataBean data;
        public String version;
        public static class DataBean {
            /**
             * IMPSPDEPART : 工商局
             * ENJSPCONTENT : 新开企业补贴
             * ENJSPAMOUNT : 100
             * IMPSPDATE : 2015-06-08
             * PRIPID : 3606222010112300036792
             */
            public List<AdvertisingBean> advertising;
            public static class AdvertisingBean {
                public String PRIPID;//主体身份代码
                public int ENJSPAMOUNT;//享受扶持政策的数额
                public String ENJSPCONTENT;//享受扶持政策内容
                public String IMPSPDEPART;//享受扶持政策的的部门
                public String IMPSPDATE;//实施扶持政策日期

            }
        }

    }

    /**
     * 出质信息实体类
     */
    public class Root5 {
        public String status;
        public String message;
        public List<pledgeInfo> data;
    }

    public static List<pledgeInfo> pledgeInfoList;

    public static class pledgeInfo {
        public String REGNO;//股权所在公司注册号
        public String EQUITYNO;//股权登记编号
        public String PLEDGOR;//出质人
        public String PLEDBLICNO;//出质人证照号
        public String PLEDBLICTYPE_CN;//出质人证件类型
        public String IMPAM;//出质股权数额
        public String IMPORG;//质权人
        public String IMPORGBLICNO;//质权人证照号
        public String ENTNAME;//股权所在公司名称
        public String EQUPLEDATE;//股权出质登记日期
        public String PUBLICDATE;//公示日期
        //public String registerAndChangeContent;


    }

    /**
     * 经营异常信息实体类
     */

    public static abnormalInfo abnormalInfoS=new abnormalInfo();

    public static class abnormalInfo {
        public String message;
        public String status;
        public DataBean data;
        public static class DataBean {
            public  List<AbNormalBean> abNormal;
            public  class AbNormalBean {
                public String BUSEXCLIST;//经营异常名录ID
                public String SPECAUSE_CN;//列入经营异常名录原因类型（中文名称）
                public String ABNTIME;//列入日期
                public String DECORG_CN;//列入决定机关（中文名称）
                public String REMEXCPRES_CN;//移出经营异常名录原因（中文名称）
                public String REMDATE;//移出日期
                public String REDECORG_CN;//移出决定机关（中文名称）
            }
        }
    }




    /**
     * 专利信息实体类
     */

    public static PatentInfo PatentInfoS=new PatentInfo();
    public static class PatentInfo {
        public String message;
        public String status;
        public String version;

        public List<PatentInfoBean> patentInfo;

        public static class PatentInfoBean {
            public String PRIPID;//企业ID
            public String PATENTNAME;//专利名称
            public String RCODE;//申请号
            public String RDATE;//申请日期
            public String ACODE;//授权公布号
            public String ADATE;//授权公布日期
            public String INVENTOR;//发明人
            public String PATENTTYPE;//专利类型
            public String AGENCY;//代理机构
            public String LEGALSTATUS;//法律状态
            public String DETAILINFO;//详细信息

        }
    }
    /**
     * 处罚信息实体类
     */
    public class Root8 {
        public String status;
        public String message;
        public List<punishInfo> data;
    }

    public static List<punishInfo> punishInfoList;

    public static class punishInfo {
        public String CASEID;//行政处罚ID
        public String ILLEGACTTYPE;//违法行为类型
        public String PENCONTENT;//处罚内容
        public String PENDECNO;//处罚决定书文号
        public String JUDAUTH;//作出行政处罚决定机关名称
        public String PENDECISSDATE;//作出处罚决定书日期
        public String Remark;//备注
    }

    /**
     * 商标信息实体类
     */
    public static List<trademarkInfo> trademarkInfoList = new ArrayList<>();

    public static class trademarkInfo {
        public String ID;//商标id
        public String PRIPID;//企业id
        public String REGNO;//注册号
        public String APPLICATIONDATE;//申请日期
        public String APPLICANT;//申请人
        public String BRANDSTAUTS;//商标状态
        public String CLASSIFYID;//商标分类号
        public String BRANDIMG;//商标图标链接
        public String AGENCY;//代理机构
        public String LIFESPAN;//使用期限
        public String REGCORE;//商标注册号
        public String BRANDNAME;//商标名称
        public String ENTNAME;//企业名称
        public String UNISCID;//社会统一信用代码
    }


    /**
     * 著作信息实体类
     */

    public static List<copyrightInfo> copyrightInfoeList = new ArrayList<>();

    public static class copyrightInfo {
        public String ID;
        public String REGISTERDATA;//登记日期
        public String REGISTERID;//登记号

        public String WORKNAME;//作品名称
        public String WORKCLASS;//作品类别
        public String FINISHDATE;//创作完成日期
        public String FIRSTDATE;//首次发表日期

        public String SOFTWARENAME;//软件名称
        public String SOFTWARESHORT;//软件简称
        public String STARTINGDATE;//首发日期
    }

    public static class patentInfos {
        public String ID;
        public String WORKNAME;//作品名称
        public String REGISTERDATA;//登记日期
        public String REGISTERID;//登记号
        public String WORKCLASS;//作品类别
        public String FINISHDATE;//创作完成日期
        public String FIRSTDATE;//首次发表日期
    }

    public static class patentInfoSoftwore {
        public static String ID;
        public static String SOFTWARENAME;//软件名称
        public static String REGISTERDATA;//登记日期
        public static String REGISTERID;//登记号
        public static String SOFTWARESHORT;//软件简称
        public static String STARTINGDATE;//首发日期
    }

  /*  *//**
     * 新自主公示
     *//*
    public static class autonomy{

    }*/
    public static List<report> reportList = new ArrayList<>();

    /**
     * 自主公示
     * 企业年报实体类
     */
    public static class report {
        /**
         * ANCHEDATE : 2016-06-15
         * ANCHEYEAR : 2015
         * ANCHEID : 7dde62bb16ba427c99f19f127e67163a
         */
        public String ANCHEDATE;//年报时间
        public String ANCHEYEAR;//年度报告
        public String ANCHEID;//年报id

    }


    public static List<funded> fundedList = new ArrayList<>();

    /**
     * 自主公示
     * 股东出资
     */
    public static class funded {
        /**
         * ACCONFORM_CN : 股权
         * ACCONDATE : 2016-06-28 00:00:00
         * ACCONFORM : 5
         * CONDATE : 2016-06-28 00:00:00
         * CONFORM : 3
         * SUBCONAM : 300
         * ACCONAM : 200
         * CONFORM_CN : 知识产权
         * INV : 他们
         * PUBLICDATE : 2016-06-28 00:00:00
         * ACPUBLICDATE : 2016-06-28 00:00:00
         */

        public String ACCONFORM_CN;//实缴出资方式CN
        public String ACCONDATE;//实缴出资日期
        public String ACCONFORM;//实缴出资方式
        public String CONDATE;
        public String CONFORM;//认缴出资方式
        public double SUBCONAM;//认缴额=认缴出资额
        public double ACCONAM;//实缴额=实缴出资额
        public String CONFORM_CN;//认缴出资方式CN
        public String INV;//股东 发起人名字
        public String PUBLICDATE;//认缴出资日期=公示日期
        public String ACPUBLICDATE;//实缴公示日期


//        public String INV;//股东 发起人名字
//        public String SUBCONAM;//认缴额=认缴出资额
//        public String ACCONAM;//实缴额=实缴出资额
//        public String CONFORM_CN;//认缴出资方式
//        //public String subscribedNum;//认缴出资额
//        public String PUBLICDATE;//认缴出资日期=公示日期
//        public String ACCONFORM_CN;//实缴出资方式
//        //public String actuallyPaidNum;//实缴出资额
//        public String ACCONDATE;//实缴出资日期
//        //public String publishDate;//公示日期
    }


    public static List<stock> stockList = new ArrayList<>();

    /**
     * 自主公示
     * 股权变更
     */
    public static class stock {
        public String ALTDATE;//时间
        public String TRANSAMAFT;//变更后
        public String TRANSAMPR;//变更前
    }


    public static List<permit> permitList = new ArrayList<>();

    /**
     * 自主公示
     * 行政许可信息实体类
     */
    public static class permit {
        public String LICNAME_CN;//许可文件名称
        public String LICNO;//许可文件编号
        public String VALFROM;//有效期起
        public String VALTO;//有效期止
        public String LICANTH;//许可机关
        public String PUBLICDATE;//公示日期
        public String LICITEM;//许可内容
        public String invalidDate;//起止时间拼接
    }

    public static List<lore> loreList = new ArrayList<>();

    /**
     * 自主公示
     * 知识产权实体类
     */
    public static class lore {
        /**
         * TYPENAME : 有效
         * TMNAME :
         * INVALIDDATE :
         * PLEREGPERFROM : 2016-06-14
         * EQUPLECANREA :
         * CANDATE :
         * UNISCID :
         * KINDS : 3
         * PLEREGPERTO : 2016-07-04
         * REGNO : 360103210025958
         * TMREGNO :
         * PLEDGOR : lkjl
         * PLEID : f4584e3689ad43ef8a016cd40f0bd935
         * ENTNAME : 江西智容科技有限公司
         * INVALIDREA :
         * PRIPID : 3601032011041300098564
         * PUBLICDATE : 2016-06-22
         * IMPORG : mjhk
         * TYPE : 1
         */

        public String TYPENAME;      //状态名称
        public String TMNAME;        //名称
        public String INVALIDDATE;     //其他无效日期
        public String PLEREGPERFROM;      //知识产权质权登记期限自
        public String EQUPLECANREA;      //注销原因
        public String CANDATE;       //注销日期
        public String UNISCID;      //统一社会信用代码
        public String KINDS;         //种类代码
        public String PLEREGPERTO;    //知识产权质权登记期限止
        public String REGNO;          //注册号
        public String TMREGNO;        //商品注册号
        public String PLEDGOR;       //知识产权出质人名称
        public String PLEID;           //出质ID
        public String ENTNAME;          //企业机构名称
        public String INVALIDREA;       //其他无效原因
        public String PRIPID;          //主体身份证代码
        public String PUBLICDATE;          //公示日期
        public String IMPORG;          //知识产权质权人名称
        public String TYPE;            //状态

//        public String PLEID;//出质ID
//        public String PRIPID;//主体身份证代码
//        public String ENTNAME;//企业机构名称
//        public String REGNO;//注册号
//        public String UNISCID;//统一社会信用代码
//        public String TMREGNO;//商品注册号
//        public String TMNAME;//名称
//        public String KINDS;//种类代码
//        public String PLEDGOR;//知识产权出质人名称
//        public String IMPORG ;//知识产权质权人名称
//        public String PLEREGPERFROM;//知识产权质权登记期限自
//        public String PLEREGPERTO;//知识产权质权登记期限止
//        public String TYPE;//状态
//        public String TYPENAME;//状态名称
//        public String CANDATE;//注销日期
//        public String EQUPLECANREA;//注销原因
//        public String INVALIDDATE;//其他无效日期
//        public String INVALIDREA;//其他无效原因
//        public String PUBLICDATE;//公示日期




    }


    public static List<punish> punishList = new ArrayList<>();

    /**
     * 自主公示
     * 行政处罚信息
     */
    public static class punish {
        /**
         * PENTYPE_CN : 责令停业整顿
         * REMARK : 啊实打实的
         * UNISCID :
         * PENDECISSDATE : 2016-06-14
         * PENAM :
         * CASEID : 83e5c4d5236049b9a693aae7015cb9f2
         * REGNO : 360103210025958
         * JUDAUTH : 省工商局
         * ENTNAME : 江西智容科技有限公司
         * PENDECNO : 呵呵呵
         * PENTYPE : 4
         * FORFAM :
         * ILLEGACTTYPE : 呃呃呃
         * PENCONTENT :
         * PRIPID : 3601032011041300098564
         * PUBLICDATE : 2016-06-22
         */

        public String PENTYPE_CN;       //处罚种类（中文名称）
        public String REMARK;            //备注
        public String UNISCID;          //统一社会信用代码
        public String PENDECISSDATE;    //作出处罚决定书日期
        public String PENAM;            //罚款金额
        public String CASEID;         //行政处罚ID
        public String REGNO;           //注册号
        public String JUDAUTH;        //作出行政处罚决定机关名称
        public String ENTNAME;        //企业(机构)名称
        public String PENDECNO;         //处罚决定书文号
        public String PENTYPE;        //处罚种类
        public String FORFAM;         //没收金额
        public String ILLEGACTTYPE;    //违法行为类型
        public String PENCONTENT;       //处罚内容
        public String PRIPID;          //主体身份代码
        public String PUBLICDATE;      //公示日期

//        public String CASEID;//行政处罚ID
//        public String PRIPID;//主体身份代码
//        public String ENTNAME;//企业(机构)名称
//        public String REGNO;//注册号
//        public String UNISCID;//统一社会信用代码
//        public String PENDECNO;//处罚决定书文号
//        public String ILLEGACTTYPE;//违法行为类型
//        public String PENTYPE;//处罚种类
//        public String PENTYPE_CN;//处罚种类（中文名称）
//        public String PENAM;//罚款金额
//        public String FORFAM;//没收金额
//        public String PENCONTENT;//处罚内容
//        public String JUDAUTH;//作出行政处罚决定机关名称
//        public String PENDECISSDATE;//作出处罚决定书日期
//        public String PUBLICDATE;//公示日期
//        public String REMARK;//备注
    }


//    public static List<paperwork_expire> paperwork_expireList = new ArrayList<>();
//    /**
//     * 证照到期zzdq(证照到期)
//     */
//    public static class paperwork_expire {
//        public String No;//编号
//        public String certificateName;//证件名
//        public String deadline;//证照期间
//        public String daysRemaining;//剩余天数
//
//    }

//    public static List<date> pdateList_zzdq = new ArrayList<>();
//    public static List<date> pdateList_zzgq = new ArrayList<>();
//    public static List<date> pdateList_zlgz = new ArrayList<>();
//    public static List<date> pdateList_qdxx = new ArrayList<>();
//    public static List<date> pdateList_qsxx = new ArrayList<>();
//    public static List<date> pdateList_qxxx = new ArrayList<>();

    public static AlertInfo AlertInfoS=new AlertInfo();
    public static class AlertInfo {
        public String message;
        public String status;
        public String version;
        public List<DataBean> data;

        public static class DataBean {
            public String type;
            public List<date> data;
            /**
             * Date[]： 6个type返回字段一样
             */
            public static class date {
                public String D_AD;

                public String WARNID;//数据id
                public String REGNO;//注册号
                public String PRIPID;//企业id
                public String UNISCID;//社会统一信用代码
                public String ENTNAME;//企业名称
                public String WARNDATE;//预警日期
                public String WARNAMOUNT;//预警金额
                public String WARNSTATUS;//预警状态
                public String ORGAN;//预警机关
                public String WARNCONTENT;//预警内容
                public String SOURCE;//数据来源（部门）
                public String STATE;//数据状态（0有效，1无效）
                public String SOURCENAME;//部门名称
                public String SUPDEPARTMENT;//上级部门编码
                public String UPDEPARTMENTNAME;//上级部门名称
                public String BUSINESSATT;//业务属性
                public String UPDATETIME;//更新时间
                public String USERNAME;//上传用户
                public String DEPID;//部门id
                public String DATATYPE;//数据种类
            }
        }


    }
//    /**
//     * 证照过期zzgq(证照过期)
//     */
//    public static List<paperwork_Expired> paperwork_ExpiredList = new ArrayList<>();
//
//    public static class paperwork_Expired {
//        public String No;//编号
//        public String certificateName;//证件名
//        public String deadline;//证照期间
//        public String state;//状态（是否过期）
//    }
//
//    /**
//     * 责令改正 zlgz（责令改正）
//     */
//    public static List<correction> correctionList = new ArrayList<>();
//
//    public static class correction {
//        public String No;//编号
//        public String project;//整改项目名
//        public String centent;//整改内容
//
//    }
//
//    /**
//     * 欠贷信息 qdxx(欠贷信息)
//     */
//    public static List<loan> loanList = new ArrayList<>();
//
//    public static class loan {
//        public String No;//编号
//        public String time;//欠贷时间
//        public String money;//欠贷金额
//        public String bank;//欠贷银行
//        public String status;//欠贷状态（还清、未还清）
//    }
//
//    /**
//     * 欠税信息  qsxx(欠税信息)
//     */
//    public static List<Taxes> taxesList = new ArrayList<>();
//
//    public static class Taxes {
//        public String No;//编号
//        public String time;//欠税日期
//        public String money;//欠税金额
//        public String organ;//征缴机关
//        public String status;//完税状态（完税,未缴）
//    }
//
//    /**
//     * 欠薪信息qxxx(欠薪信息)
//     */
//    public static List<Wages> wagesList = new ArrayList<>();
//
//    public static class Wages {
//        public String No;//编号
//        public String time;//欠薪日期
//        public String money;//欠薪金额
//        public String status;//给薪状态
//        public String source;//信息来源
//    }

    /**
     * 司法信息实体类
     */

    public static List<JudicialDocuments> JudicialDocumentsList=new ArrayList<>();

    public static class JudicialDocuments {//司法文书信息
        public String CASENUM;//判决书文号
        public String SENTENCECONMENT;//判决内容
        public String SUPDEPARTMENT;//作出判决机关
        public String SENTENCEDATE;//作出判决书日期
        public String REDECORG_CN;//详情
    }

    public static List<CrackCredit> CrackCreditList=new ArrayList<>();

    public static class CrackCredit {//失信被执行人信息
        public String COURT_NAME;//执行法院
        public String REG_DATE;//立案时间
        public String COURTCASEID;//法院案件表ID
        public String GIST_CID;//执行依据文号
        public String PERFORMANCE;//被执行人的履行情况
        public String DISREPUT_TYPE_NAME;//类型名称（APP增加此项）
    }

    public static List<ShareholderInformationChange> ShareholderInformationChangeList=new ArrayList<>();

    public static class ShareholderInformationChange {//股东变更信息
        public String ALIEN;//受让人
        public String REGNO;//注册号
        public String FROAUTH;//执行法院
        public String FROAM;//股权数额
        public String INV;//被执行人
    }

    public static List<FrozenInformation> FrozenInformationList=new ArrayList<>();

    public static class FrozenInformation {//股权冻结信息
        public String FROID;//冻结ID
        public String FROFROM;//冻结期限自
        public String FROZDEADLINE;//冻结期限
        public String FROAUTH;//执行法院
        public String INVTYPE_CN;//被执行人
        public String FROAM;//股权数额
    }

    /**
     * 广告信息实体类
     * {"message":"true","status":"1","data":{"advertising":[{"ADVERTID":"1","CATEGORY":"1","C_LEVEL":"a","IDENTIFYDATE":"2013-05-30",
     * "Validity":"null-2013-05-01","VALFORM":"2013-03-12","SOURCENAME":"豆腐干","IDENTIFYORGANS":"工商局","VALTO":"2013-05-01"}]}}
     */
    public static List<advertisementInfo> advertisementInfoList=new ArrayList<>();

    public static class advertisementInfo {
        public String Validity;
        public String SOURCENAME;

        public String ADVERTID;//ID
        public String C_LEVEL;// 广告资质级别
        public String CATEGORY;//类别
        public String IDENTIFYDATE;//认定时间
        public String VALFORM;//有效期自
        public String VALTO;//有效期至
        public String IDENTIFYORGANS;//认定机关
    }

    /**
     * 守合同重信用信息实体类
     */
    public static List<obeyedInfo> obeyedInfoList=new ArrayList<>();

    public static class obeyedInfo {
        public String PRIPID;//企业id
        public String ENTNAME;//企业名称
        public String REGNO;//注册号
        public String UNISCID;//统一社会信用代码
        public String CONTENT;//内容
        public String IDENTIFYDATE;//认定日期
        public String IDENTIFYORGANS;//认定机关
        public String STATE;//状态，1表示有效，2表示无效

    }


    public static List<Newss> NewssList = new ArrayList<>();

    /**
     * 新闻测试实体类
     */
    public class Newss {
        public String title;
        public String content;
        public String img_width;
        public String full_title;
        public String pdate;
        public String src;
        public String img_length;
        public String img;
        public String url;
        public String pdate_src;
    }

    public class Root11 {
        public String reason;
        public List<Newss> result;
        public int error_code;
    }

    /**
     * 搜索接口返回参数实体类
     */
    public static class baging {
        public String TotalPage;
        public String PageIndex;
        public String showCount;
        public int TotalRecords;
    }

    /**
     * 参数数据
     */
    public static class Baseinfo {
        public String REGSTATE;//登记状态
        public String EnterAddtionID;//企业附加表ID
        public String REGNO;//企业注册号
        public String IsFavorite;//是否关注
        public String NAME;//法人
        public String REGCAP;//注册资金
        public String ESTDATE;//成立日期
        public String ENTTYPE_CN;//公司类型（市场主体类型中文）
        public String ENTNAME;//公司名字
        public String REGSTATE_CN;//经营状态（中文）
        public String UNISCID;//统一社会信用代码
        public String PRIPID;//主体身份代码
        public String ENTTYPE;//市场主体类型
    }

    public static List<Baseinfo> BaseinfoList = new ArrayList<>();

    /**
     * 16个item条数实体类
     */
    public static class allcount {
        public String IsFavorite;//关注信息

        public String HonorCount;//荣誉信息
        public String JudiciaryCount;//司法信息
        public String PledgeCount;//抵押
        public String CopyrightCount;//著作权
        public String AnnualCount;//自主公示
        public String AdvertisementCount;//广告资质
        public String BaseInfoCount;//基本信息 工商
        public String ApprovalCount;//赞同  行政审批
        public String PunishCount;//行政处罚
        public String WarningCount;//预警信息
        public String TrademarkCount;//商标
        public String AbnormityCount;//经营异常
        public String CreditCount;//守合同重信用
        public String SupportCount;//扶持
        public String MortgagorCount;//出质
        public String PatentCount;//专利
        public String PageView;//浏览量    +++
        public String IsClaim;//是否认领   +++

    }

    public static List<allcount> allcountsList = new ArrayList<>();

    public static List<Userreview> UserreviewList = new ArrayList<>();

    /**
     * 我的点评列表
     */
    public static MyCommentlistr MyCommentlistrS=new MyCommentlistr();
    public static class MyCommentlistr {
        public String message;
        public String status;
        public DataBean data;
        public String version;
        public static class DataBean {
            public PagingBean Paging;
            public List<UserreviewBean> userreview;
            public static class PagingBean {
                public int TotalPage;
                public int ShowCount;
                public int TotalResult;
                public int CurrentResult;
                public int CurrentPage;
            }
            public static class UserreviewBean {
                public String ENTERID;//附加表的企业ID
                public String ICONPATH;//头像
                public String FAILEDQTY;//点赞吐槽
                public String replay2reviewCount;
                public String MEMBERID;//本评论用户ID
                public String CREATETIME;//评论时间
                public String COMMENTID;//评论ID
                public String CONTENT;//点评内容
                public String SUCCESSQTY;//点赞数量
                public String ISSUCCESS;//是否点赞 0为否，1为是
                public List<Replay2review> replay2review;
                public String MEMBERNAME;//本评论用户名称
                public String ISFAILED;//是否吐槽 0为否，1为是
                /**
                 * 回复评论（楼中楼）
                 */
                public static class Replay2review {
                    public String CHILDMEMBERID;//用户ID
                    public String REPLAYCOMMENT;//回复评论内容
                    public String CHILDMEMBERNAME;//用户名称
                    public String REPLAYTIME;//回复评论时间
                }
            }
        }
    }
    public static class Userreview {
        public String ENTERID;//附加表的企业ID
        public String ICONPATH;//头像
        public String FAILEDQTY;//点赞吐槽
        public String replay2reviewCount;
        public String MEMBERID;//本评论用户ID
        public String CREATETIME;//评论时间
        public String COMMENTID;//评论ID
        public String CONTENT;//点评内容
        public String SUCCESSQTY;//点赞数量
        public String ISSUCCESS;//是否点赞 0为否，1为是
        public List<Replay2review> replay2review;
        public String MEMBERNAME;//本评论用户名称
        public String ISFAILED;//是否吐槽 0为否，1为是
    }

    public static List<Replay2review> replay2reviewList = new ArrayList<>();

    /**
     * 回复评论（楼中楼）
     */
    public static class Replay2review {
        public String CHILDMEMBERID;//用户ID
        public String REPLAYCOMMENT;//回复评论内容
        public String CHILDMEMBERNAME;//用户名称
        public String REPLAYTIME;//回复评论时间
    }

    public class Data201 {
        public List<Userreview> userreview;
        public Paging Paging;
    }

    public class Root201 {
        public String message;
        public int status;
        public Data201 data;
        public String version;
    }

    /**
     * 点赞 and 差评  and 发表 and 回复
     */
    public class Root202 {
        public String message;
        public int status;
        public Data202 data;
        public String version;
    }

    public class Data202 {
        public String result;
    }

    public static String Result = "";


    public static User user = new User();

    /**
     * 用户信息 + 修改个人资料  实体类
     */
    public static class User {

        /**
         * message : true
         * status : 1
         * data : {"memberList":[{"STATUS":"0","AMOUNT":"","INDUSTRY":"","MOBILE":"","INDUSTRYID":"","USERTYPE":"","SEX":"","EDUCATIONID":"","ISDELETE":"0","ID":"26235a38bad44b4190abfa64bd8b50b5","EDUCATION":"","ICONSTEAM":"","USERNAME":"gzq12321@152.com","EMAIL":"gzq12321@152.com","ALIASNAME":"","PASSWORD":"61278de2e31a5c72860f8b5ef8101c0f0d92bb92","USERTYPEID":""}]}
         * version : v1.0
         */
        public String message;
        public int status;
        public DataBean data;
        public String version;

        public static class DataBean {
            /**
             * STATUS : 状态：激活1、未激活0 对应数字默认0
             * AMOUNT :余额
             * INDUSTRY :行业
             * MOBILE :移动电话
             * INDUSTRYID :行业ID
             * USERTYPE :用户类型
             * SEX :性别
             * EDUCATIONID :教育ID
             * ISDELETE : 账户是否删除 默认0未删除，1已删除
             * ID : 26235a38bad44b4190abfa64bd8b50b5  用户ID
             * EDUCATION :教育
             * ICONSTEAM :头像base64位图
             * USERNAME : gzq12321@152.com  用户名
             * EMAIL : gzq12321@152.com
             * ALIASNAME :别名
             * PASSWORD : 61278de2e31a5c72860f8b5ef8101c0f0d92bb92 密码
             * USERTYPEID :用户类型ID
             */

            public List<MemberListBean> memberList;

            public static class MemberListBean {

                public String STATUS;//状态：激活1、未激活0 对应数字默认0
                public String AMOUNT;//余额
                public String INDUSTRY;//行业
                public String MOBILE;//移动电话
                public String INDUSTRYID;//行业ID
                public String USERTYPE;//用户类型
                public String SEX;//性别
                public String EDUCATIONID;//教育ID
                public String ISDELETE;//账户是否删除 默认0未删除，1已删除
                public String ID;//用户ID
                public String EDUCATION;//教育
                public String ICONSTEAM;//头像base64位图
                public String USERNAME;//用户名
                public String EMAIL;
                public String ALIASNAME;//别名
                public String PASSWORD;//密码
                public String USERTYPEID;//用户类型ID86D9D7F53FCA45DD93E2D83DFCA0CB43
            }
        }
    }

    public static MyComplaint myComplaint = new MyComplaint();

    /**
     * 我的投诉列表实体类
     */
    public static class MyComplaint {


        /**
         * message : true
         * status : 1
         * data : 数据源
         * version : v1.0
         */

        public String message;
        public String status;
        /**
         * Paging : 页信息
         * commentList :投诉列表
         */
        public DataBean data;
        public String version;

        public static class DataBean {
            /**
             * TotalPage : 总页数
             * ShowCount : 每页显示总页数
             * TotalResult : 总记录数
             * CurrentResult : 当前记录启示索引
             * CurrentPage : 当前页
             */

            public PagingBean Paging;
            /**
             * COMPLAINTIME : 2016-06-28 15:58:47  *投诉时间
             * COMPLAINTID : 7a710d65c0c54571bb3903d4a9227b4c  *投诉ID
             * ENTERNAME : 南昌市青山湖区小美小百货店    *投诉企业
             * AttachmentList : []   附件集合
             * COMPLAINTITLE : 哀伤的风格 *投诉标题
             * COMPLAINSTATUS : 0 投诉状态
             */

            public List<CommentListBean> commentList;

            public static class PagingBean {
                public int TotalPage;
                public int ShowCount;
                public int TotalResult;
                public int CurrentResult;
                public int CurrentPage;
            }

            public static class CommentListBean {
                public String COMPLAINTIME;
                public String COMPLAINTID;
                public String ENTERNAME;
                public String COMPLAINTITLE;
                public String COMPLAINSTATUS;
                public List<?> AttachmentList;
            }
        }
    }

    /**
     * 关注 and 取消关注
     */
    public static Favotite FavotiteS=new Favotite();
    public static class Favotite {
        public String message;
        public String status;
        /**
         * result : success
         */
        public DataBean data;
        public static class DataBean {
            public String result;//结果
        }
    }
    /**
     * 我的关注列表
     */
    public static FavotiteList FavotiteListS=new FavotiteList();
    public static class FavotiteList {
        public String message;
        public String status;
        public DataBean data;

        public static class DataBean {
            /**
             * ENTERID : 29cf69863e6a11e6b90f00163e160363
             * REGNORE : 360103210025958
             * ATTENTIONTIME : 2016-07-01 19:41:26
             * NAME : 万杏娥
             * ENTTYPE_CN : 有限责任公司(自然人投资或控股)
             * ENTERNAME : 江西智容科技有限公司
             * ATTENTIONID : 63ddaceb1f7d439eb10b6a9002f327f7
             * ATTENTIONTYPE : 南昌
             * PRIPID : 3601032011041300098564
             * ENTTYPE : 1130
             */
            public List<AttentionListBean> AttentionList=new ArrayList<>();
            public static class AttentionListBean {
                public String ENTERID;//附加表的企业ID
                public String REGNORE;//注册号
                public String ATTENTIONTIME;//关注时间
                public String NAME;//法人名字
                public String ENTTYPE_CN;//公司类型
                public String ENTERNAME;//企业名称
                public String ATTENTIONID;//关注ID
                public String ATTENTIONTYPE;//关注类型
                public String PRIPID;//企业主体ID
                public String ENTTYPE;//市场主体类型代码

            }
        }
    }


    public static ComplaintDetail complaintDetail = new ComplaintDetail();

    /**
     * 投诉详情实体类
     */
    public static class ComplaintDetail {

        /**
         * message : true
         * status : 1
         * data : {"AttachmentCount":"1","AttachmentList":[{"ATTACHMENTDESC":"my_icon","ATTACHMENTNAME":"73287324ae494a5799e842e8c5f6df901467366492379.jpg","ATTACHMENTID":"15126d98fb9a450fb0e9c149ee4b3e62","ATTACHMENTPATH":"/9j/4AAQSkZJRgABAQEBLAEsAAD/2wBDAAYEBQYFBAYGBQYHBwYIChAKCgkJChQODwwQFxQYGBcU\r\nFhYaHSUfGhsjHBYWICwgIyYnKSopGR8tMC0oMCUoKSj/2wBDAQcHBwoIChMKChMoGhYaKCgoKCgo\r\nKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCj/wAARCAC0ALQDASIA\r\nAhEBAxEB/8QAHwAAAQUBAQEBAQEAAAAAAAAAAAECAwQFBgcICQoL/8QAtRAAAgEDAwIEAwUFBAQA\r\nAAF9AQIDAAQRBRIhMUEGE1FhByJxFDKBkaEII0KxwRVS0fAkM2JyggkKFhcYGRolJicoKSo0NTY3\r\nODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqDhIWGh4iJipKTlJWWl5iZmqKjpKWm\r\np6ipqrKztLW2t7i5usLDxMXGx8jJytLT1NXW19jZ2uHi4+Tl5ufo6erx8vP09fb3+Pn6/8QAHwEA\r\nAwEBAQEBAQEBAQAAAAAAAAECAwQFBgcICQoL/8QAtREAAgECBAQDBAcFBAQAAQJ3AAECAxEEBSEx\r\nBhJBUQdhcRMiMoEIFEKRobHBCSMzUvAVYnLRChYkNOEl8RcYGRomJygpKjU2Nzg5OkNERUZHSElK\r\nU1RVVldYWVpjZGVmZ2hpanN0dXZ3eHl6goOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3\r\nuLm6wsPExcbHyMnK0tPU1dbX2Nna4uPk5ebn6Onq8vP09fb3+Pn6/9oADAMBAAIRAxEAPwBrM25v\r\nmP50m5vU/nQ/3m+tJX6KfjVxdzep/Ojc3qfzpKKYXF3N6n86Nzep/OkooC4u5vU/nRub1P50lFAX\r\nF3N6n86Nzep/OkooC4u5vU/nRub1P50lFAXF3N6n86Nzep/OkooC4u5vU/nRub1P50lFAXF3N6n8\r\n6Nzep/OkooC4u5vU/nRub1P50lFAXF3N6n86Nzep/OkooC5NESV+8fzop1v9w/WikMgf7zfWkpX+\r\n831pKYjR0PRr7XLt7XTY1kmRN5DMF4yB3+tb3/CufEv/AD5Rf9/1q/8ABX/karn/AK9W/wDQ1r22\r\nvn8wzOthqzpwSt/XmfW5RkmHxuGVWo3e72/4Y8D/AOFc+Jf+fKL/AL/rWPr/AId1LQPIGqwrEZs7\r\n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","ATTACHMENTTYPE":"投诉类型","ATTACHMENTTIME":"2016-07-01 17:48:12"}],"UserComplain":{"COMPLAINTYPE":"","COMPLAINTIME":"2016-07-01 17:48:11","COMPLAINCOMMENT":"是的风格和健康巨化股份但是法国红酒看11111111111111111","ENTERCOMMENT":"","REFUSEREASON":"","GOVCOMMENT":"","COMPLAINTTITLE":"啊当事人同意就很快乐","MEMBERID":"b2d794b453664657af61b373c1d00e7c","ENTERNAME":"江西智容科技有限公司","COMPLAINSTATUS":"0","MEMBERNAME":"林恒56"}}
         * version : v1.0
         */

        public String message;
        public String status;
        /**
         * AttachmentCount : 1 附件条数
         * AttachmentList :用户投诉时附件
         * UserComplain : 用户对企业的投诉列表
         */

        public DataBean data;
        public String version;

        public static class DataBean {
            public String AttachmentCount;
            /**
             * COMPLAINTYPE :投诉类型
             * COMPLAINTIME : 2016-07-01 17:48:11：投诉时间
             * COMPLAINCOMMENT : 是的风格和健康巨化股份：投诉内容
             * ENTERCOMMENT :  企业处理回复
             * REFUSEREASON :拒绝原因
             * GOVCOMMENT : 政府回复
             * COMPLAINTTITLE : 啊当事人同意就很快乐：投诉标题
             * MEMBERID : b2d794b453664657af61b373c1d00e7c ：用户ID
             * ENTERNAME : 江西智容科技有限公司：企业名称
             * COMPLAINSTATUS : 0 ：投诉处理状态 0未处理 1已处理 2已拒绝
             * MEMBERNAME : 林恒56：用户名称
             */

            public UserComplainBean UserComplain;
            /**
             * ATTACHMENTDESC : my_icon：附件描述
             * ATTACHMENTNAME : 73287324ae494a5799e842e8c5f6df901467366492379.jpg：文件名？
             * ATTACHMENTID : 15126d98fb9a450fb0e9c149ee4b3e62 ：附件ID
             * ATTACHMENTPATH : Base64图片
             * ATTACHMENTTYPE : 附件类型，如身份证等
             * ATTACHMENTTIME : 2016-07-01 17:48:12
             */

            public List<AttachmentListBean> AttachmentList;

            public static class UserComplainBean {
                public String COMPLAINTYPE;
                public String COMPLAINTIME;
                public String COMPLAINCOMMENT;
                public String ENTERCOMMENT;
                public String REFUSEREASON;
                public String GOVCOMMENT;
                public String COMPLAINTTITLE;
                public String MEMBERID;
                public String ENTERNAME;
                public String COMPLAINSTATUS;
                public String MEMBERNAME;
            }

            public static class AttachmentListBean {
                public String ATTACHMENTDESC;
                public String ATTACHMENTNAME;
                public String ATTACHMENTID;
                public String ATTACHMENTPATH;
                public String ATTACHMENTTYPE;
                public String ATTACHMENTTIME;
            }
        }
    }
    public static ClaimUtils ClaimUtilsModel = new ClaimUtils();
    /**
     * 提交认领实体类 + 提交认领附件实体类
     */
    public static class ClaimUtils {
        public String message;
        public String status;
        /**
         * result : success
         * CLAIMID : 0ba157faf37d47a1adba808b95e00ab0
         */
        public DataBean data;
        public static class DataBean {
            public String result;
            public String CLAIMID;
        }
    }

    public static MyClaimUtils MyClaimUtilsModel = new MyClaimUtils();
    /**
     * 我的认领列表实体类
     */
    public static class MyClaimUtils {
        public String message;
        public String status;
        public DataBean data;
        public String version;//版本号

        public static class DataBean {

            public PagingBean Paging;
            /**
             * ENTERID : 29cf69863e6a11e6b90f00163e160363
             * CLAIMID : 3e8657395f804e07b70020add0ef1844
             * DESCRIPTION : 123123123123123
             * CLAIMTIME : 2016-07-06 14:45:25
             * STATUS : 0
             * TELPHONE : 1231231231231
             * STATUSNAME : 审核中
             * REGNORE : 360103210025958
             * REFUSEREASON :
             * ENTTYPE_CN : 有限责任公司(自然人投资或控股)
             * ENTERNAME : 江西智容科技有限公司
             * EMAIL : 1231232@qq.com
             * AttachmentList : [{"ATTACHMENTDESC":"pic","ATTACHMENTNAME":"d75bb0be5bb74b6e81e1ef06b8a5b39d1467787553609.jpg","ATTACHMENTID":"da13ee17e44f4f8d9632233bc8ec3228","ATTACHMENTPATH":"iVBORw0KGgoAAAANSUhEUgAAAKcAAACoCAIAAAAKImluAAAAA3NCSVQ/gAAAgAElEQVR4\nnKy8aZRlV3UmuPc+59zpzTFHZERG5KhMZSqVKSmRBJqQQBgEMsJtKNyGbrBpt92rjV1Q7eoCTNn\n7lpd5cZgU27XMrSpLlxlA7KEDWhMzUIIZSol5TxGZmRExhzxxjuec3b/uBGRoQkPq896K+K++967\nw9nTt7+9z8VzjZiZmRkALAIA8MpfsW4bAMACAICxGSJmDIhohcPMGkBK2e60yuWSCSPP82wcpmla\ndN3Lly+ff/nwRz7yEV8JAOBUO44\nP3Bob6dPyMZ7tIqYRrgNInFe72VR1n1REheGSYNRFDDBkABI8DHSS6Qh+MQYL7q7tZnPNJuZDSJp\nnaQfnBUF8MZgdKO9P3DgwJNPPlkUxbvvvttqtUIIjUZjFI/UURARh6AmsEUbXOBib/vSRfZ7vbKw\nGW98tUreToDxvnDFfebK9yVv4+N/3eOoYemdBUYAAAAASUVORK5CYII=\n","ATTACHMENTTYPE":"认领企业","ATTACHMENTTIME":"2016-07-06 14:45:53"}]
             * PRIPID : 3601032011041300098564
             */
            public List<ClaimlistBean> Claimlist;

            public static class PagingBean {
                public int TotalPage;
                public int ShowCount;
                public int TotalResult;
                public int CurrentResult;
                public int CurrentPage;

            }

            public static class ClaimlistBean {
                public String ENTERID;//附加表的企业ID
                public String CLAIMID;//认领ID
                public String DESCRIPTION;//认领申明
                public String CLAIMTIME;//认领时间
                public String STATUS;//认领状态
                public String TELPHONE;//电话号码
                public String STATUSNAME;//认领状态中文
                public String REGNORE;//注册号
                public String REFUSEREASON;//拒审原因
                public String ENTTYPE_CN;//市场主体类型代码
                public String ENTERNAME;//企业名称
                public String EMAIL;//邮件地址
                public String PRIPID;//企业主体ID

                public List<AttachmentListBean> AttachmentList;

                public static class AttachmentListBean {
                    public String ATTACHMENTDESC;//图片备注内容
                    public String ATTACHMENTNAME;//图片名字
                    public String ATTACHMENTID;//图片ID
                    public String ATTACHMENTPATH;//图片base64位码
                    public String ATTACHMENTTYPE;//图片类型
                    public String ATTACHMENTTIME;//图片时间
                }
            }
        }
    }


    public  static ToComplain toComplain=new ToComplain();
    /**
     * 提交投诉成功后返回数据实体类
     */
    public static class ToComplain{
        /**
         * message : true
         * status : 1
         * data : {"result":"success","COMPLAINID":"0fb01a8e74fc4338aea42197dcb8fd5f"}
         * version : v1.0
         */
        public String message;
        public String status;
        /**
         * result : success
         * COMPLAINID : 0fb01a8e74fc4338aea42197dcb8fd5f： 事件ID
         */
        public DataBean data;
        public String version;

        public static class DataBean {
            public String result;
            public String COMPLAINID;
        }
    }

    public  static TwoDim TwoDimSli=new TwoDim();

    public static class TwoDim {
        public String message;
        public String status;
        public DataBean data;
        public String version;
        public static class DataBean {
            public String result;
        }
    }
}

