package com.example.demo.domain.model;

import com.example.demo.domain.common.AbstractBaseDo;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The table TB_WALLET_RECORD
 */
public class WalletRecordDO extends AbstractBaseDo {

    /**
     * id ID.
     */
    private Long id;
    /**
     * title 流水标题.
     */
    private String title;
    /**
     * amount 消费金额，单位分.
     */
    private Long amount;
    /**
     * status 状态（0：正常、1：异常）.
     */
    private Integer status;
    /**
     * balance 账户余额.
     */
    private Long balance;
    /**
     * content 流水内容.
     */
    private String content;
    /**
     * cuserId 用户ID.
     */
    private String cuserId;
    /**
     * orderId 订单ID.
     */
    private Long orderId;
    /**
     * tradeNo 中台支付订单号.
     */
    private String tradeNo;
    /**
     * cuserSex 用户性别.
     */
    private String cuserSex;
    /**
     * mediumId 交易渠道（POS，官网，APP）.
     */
    private Long mediumId;
    /**
     * walletId 钱包ID.
     */
    private Long walletId;
    /**
     * companyId 公司ID.
     */
    private String companyId;
    /**
     * cuserName 用户名称.
     */
    private String cuserName;
    /**
     * orderCode 订单编码.
     */
    private String orderCode;
    /**
     * tradeTime 交易时间.
     */
    private Long tradeTime;
    /**
     * tradeType 支付方式.
     */
    private String tradeType;
    /**
     * createTime CREATE_TIME.
     */
    private Long createTime;
    /**
     * mediumCode MEDIUM_CODE.
     */
    private String mediumCode;
    /**
     * mediumType 交易渠道（POS，官网，APP）.
     */
    private String mediumType;
    /**
     * recordType 流水记录类型（1：充值、2：消费、3：退款）.
     */
    private Integer recordType;
    /**
     * walletCode 钱包编码.
     */
    private String walletCode;
    /**
     * cuserTelephone 用户电话.
     */
    private String cuserTelephone;

    /**
     * channelType 支付渠道类型.
     */
    private String channelType;

    /**
     * Set id ID.
     */
    public void setId(Long id){
        this.id = id;
    }

    /**
     * Get id ID.
     *
     * @return the string
     */
    public Long getId(){
        return id;
    }

    /**
     * Set title 流水标题.
     */
    public void setTitle(String title){
        this.title = title;
    }

    /**
     * Get title 流水标题.
     *
     * @return the string
     */
    public String getTitle(){
        return title;
    }

    /**
     * Set amount 消费金额，单位分.
     */
    public void setAmount(Long amount){
        this.amount = amount;
    }

    /**
     * Get amount 消费金额，单位分.
     *
     * @return the string
     */
    public Long getAmount(){
        return amount;
    }

    /**
     * Set status 状态（0：正常、1：异常）.
     */
    public void setStatus(Integer status){
        this.status = status;
    }

    /**
     * Get status 状态（0：正常、1：异常）.
     *
     * @return the string
     */
    public Integer getStatus(){
        return status;
    }

    /**
     * Set balance 账户余额.
     */
    public void setBalance(Long balance){
        this.balance = balance;
    }

    /**
     * Get balance 账户余额.
     *
     * @return the string
     */
    public Long getBalance(){
        return balance;
    }

    /**
     * Set content 流水内容.
     */
    public void setContent(String content){
        this.content = content;
    }

    /**
     * Get content 流水内容.
     *
     * @return the string
     */
    public String getContent(){
        return content;
    }

    /**
     * Set cuserId 用户ID.
     */
    public void setCuserId(String cuserId){
        this.cuserId = cuserId;
    }

    /**
     * Get cuserId 用户ID.
     *
     * @return the string
     */
    public String getCuserId(){
        return cuserId;
    }

    /**
     * Set orderId 订单ID.
     */
    public void setOrderId(Long orderId){
        this.orderId = orderId;
    }

    /**
     * Get orderId 订单ID.
     *
     * @return the string
     */
    public Long getOrderId(){
        return orderId;
    }

    /**
     * Set tradeNo 中台支付订单号.
     */
    public void setTradeNo(String tradeNo){
        this.tradeNo = tradeNo;
    }

    /**
     * Get tradeNo 中台支付订单号.
     *
     * @return the string
     */
    public String getTradeNo(){
        return tradeNo;
    }

    /**
     * Set cuserSex 用户性别.
     */
    public void setCuserSex(String cuserSex){
        this.cuserSex = cuserSex;
    }

    /**
     * Get cuserSex 用户性别.
     *
     * @return the string
     */
    public String getCuserSex(){
        return cuserSex;
    }

    /**
     * Set mediumId 交易渠道（POS，官网，APP）.
     */
    public void setMediumId(Long mediumId){
        this.mediumId = mediumId;
    }

    /**
     * Get mediumId 交易渠道（POS，官网，APP）.
     *
     * @return the string
     */
    public Long getMediumId(){
        return mediumId;
    }

    /**
     * Set walletId 钱包ID.
     */
    public void setWalletId(Long walletId){
        this.walletId = walletId;
    }

    /**
     * Get walletId 钱包ID.
     *
     * @return the string
     */
    public Long getWalletId(){
        return walletId;
    }

    /**
     * Set companyId 公司ID.
     */
    public void setCompanyId(String companyId){
        this.companyId = companyId;
    }

    /**
     * Get companyId 公司ID.
     *
     * @return the string
     */
    public String getCompanyId(){
        return companyId;
    }

    /**
     * Set cuserName 用户名称.
     */
    public void setCuserName(String cuserName){
        this.cuserName = cuserName;
    }

    /**
     * Get cuserName 用户名称.
     *
     * @return the string
     */
    public String getCuserName(){
        return cuserName;
    }

    /**
     * Set orderCode 订单编码.
     */
    public void setOrderCode(String orderCode){
        this.orderCode = orderCode;
    }

    /**
     * Get orderCode 订单编码.
     *
     * @return the string
     */
    public String getOrderCode(){
        return orderCode;
    }

    /**
     * Set tradeTime 交易时间.
     */
    public void setTradeTime(Long tradeTime){
        this.tradeTime = tradeTime;
    }

    /**
     * Get tradeTime 交易时间.
     *
     * @return the string
     */
    public Long getTradeTime(){
        return tradeTime;
    }

    /**
     * Set tradeType 支付方式.
     */
    public void setTradeType(String tradeType){
        this.tradeType = tradeType;
    }

    /**
     * Get tradeType 支付方式.
     *
     * @return the string
     */
    public String getTradeType(){
        return tradeType;
    }

    /**
     * Set createTime CREATE_TIME.
     */
    public void setCreateTime(Long createTime){
        this.createTime = createTime;
    }

    /**
     * Get createTime CREATE_TIME.
     *
     * @return the string
     */
    public Long getCreateTime(){
        return createTime;
    }

    /**
     * Set mediumCode MEDIUM_CODE.
     */
    public void setMediumCode(String mediumCode){
        this.mediumCode = mediumCode;
    }

    /**
     * Get mediumCode MEDIUM_CODE.
     *
     * @return the string
     */
    public String getMediumCode(){
        return mediumCode;
    }

    /**
     * Set mediumType 交易渠道（POS，官网，APP）.
     */
    public void setMediumType(String mediumType){
        this.mediumType = mediumType;
    }

    /**
     * Get mediumType 交易渠道（POS，官网，APP）.
     *
     * @return the string
     */
    public String getMediumType(){
        return mediumType;
    }

    /**
     * Set recordType 流水记录类型（1：充值、2：消费、3：退款）.
     */
    public void setRecordType(Integer recordType){
        this.recordType = recordType;
    }

    /**
     * Get recordType 流水记录类型（1：充值、2：消费、3：退款）.
     *
     * @return the string
     */
    public Integer getRecordType(){
        return recordType;
    }

    /**
     * Set walletCode 钱包编码.
     */
    public void setWalletCode(String walletCode){
        this.walletCode = walletCode;
    }

    /**
     * Get walletCode 钱包编码.
     *
     * @return the string
     */
    public String getWalletCode(){
        return walletCode;
    }


    /**
     * Set cuserTelephone 用户电话.
     */
    public void setCuserTelephone(String cuserTelephone){
        this.cuserTelephone = cuserTelephone;
    }

    /**
     * Get cuserTelephone 用户电话.
     *
     * @return the string
     */
    public String getCuserTelephone(){
        return cuserTelephone;
    }
    
    @JsonIgnore
    @Override
	public Long getPrimaryKey() {
		return this.id;
	}


    /**
     * Get channelType 支付渠道类型
     * @return
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * Set channelType 支付渠道类型
     * @return
     */
    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }
}
