package com.example.demo.domain.paging;

import com.example.demo.domain.model.WalletRecordDO;

/**
 * The table TB_WALLET_RECORD TB_WALLET_RECORD
 */
public class QueryWalletRecordPage extends BasePage<WalletRecordDO> {

    /**
     * walletId 钱包ID.
     */
    private Long walletId;
    /**
     * tradeNo 渠道交易号单号.
     */
    private String tradeNo;
    /**
     * orderId 订单ID.
     */
    private Long orderId;
    /**
     * recordType 流水记录类型（1：充值、2：消费、3：退款）.
     */
    private Integer recordType;
    /**
     * cuserName 用户名称.
     */
    private String cuserName;
    /**
     * tradeTimeEnd .
     */
    private Long tradeTimeEnd;
    /**
     * walletCode 钱包编码.
     */
    private String walletCode;
    /**
     * mediumCode MEDIUM_CODE.
     */
    private String mediumCode;
    /**
     * companyId 公司ID.
     */
    private String companyId;
    /**
     * cuserTelephone 用户电话.
     */
    private String cuserTelephone;
    /**
     * mediumType 交易渠道（POS，官网，APP）.
     */
    private String mediumType;
    /**
     * orderCode 订单编码.
     */
    private String orderCode;
    /**
     * cuserId 用户ID.
     */
    private String cuserId;
    /**
     * tradeType 支付方式.
     */
    private String tradeType;
    /**
     * tradeTimeStart .
     */
    private Long tradeTimeStart;
    /**
     * status 状态（0：正常、1：异常）.
     */
    private Integer status;

    /**
     * channelType 支付渠道类型.
     */
    private String channelType;

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
     * Set tradeTimeEnd .
     */
    public void setTradeTimeEnd(Long tradeTimeEnd){
        this.tradeTimeEnd = tradeTimeEnd;
    }

    /**
     * Get tradeTimeEnd .
     *
     * @return the string
     */
    public Long getTradeTimeEnd(){
        return tradeTimeEnd;
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
     * Set tradeTimeStart .
     */
    public void setTradeTimeStart(Long tradeTimeStart){
        this.tradeTimeStart = tradeTimeStart;
    }

    /**
     * Get tradeTimeStart .
     *
     * @return the string
     */
    public Long getTradeTimeStart(){
        return tradeTimeStart;
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
