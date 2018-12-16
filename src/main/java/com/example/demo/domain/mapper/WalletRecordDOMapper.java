package com.example.demo.domain.mapper;

import com.example.demo.domain.model.WalletRecordDO;
import com.example.demo.domain.paging.QueryWalletRecordPage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TB_WALLET_RECORD.
 * TB_WALLET_RECORD
 */
public interface WalletRecordDOMapper {

    /**
     * desc:插入表:TB_WALLET_RECORD.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TB_WALLET_RECORD( ID ,TITLE ,AMOUNT ,STATUS ,BALANCE ,CONTENT ,CUSER_ID ,ORDER_ID ,CUSER_SEX ,WALLET_ID ,COMPANY_ID ,CUSER_NAME ,ORDER_CODE ,TRADE_NO ,TRADE_TIME ,CREATE_TIME ,RECORD_TYPE ,WALLET_CODE ,CUSER_TELEPHONE )VALUES( #{id,jdbcType=BIGINT} , #{title,jdbcType=VARCHAR} , #{amount,jdbcType=BIGINT} , #{status,jdbcType=INTEGER} , #{balance,jdbcType=BIGINT} , #{content,jdbcType=VARCHAR} , #{cuserId,jdbcType=VARCHAR} , #{orderId,jdbcType=BIGINT} , #{cuserSex,jdbcType=VARCHAR} , #{walletId,jdbcType=BIGINT} , #{companyId,jdbcType=BIGINT} , #{cuserName,jdbcType=VARCHAR} , #{orderCode,jdbcType=VARCHAR} , #{tradeNo,jdbcType=VARCHAR} , #{tradeTime,jdbcType=BIGINT} , #{createTime,jdbcType=BIGINT} , #{recordType,jdbcType=INTEGER} , #{walletCode,jdbcType=VARCHAR} , #{cuserTelephone,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(WalletRecordDO entity);
    /**
     * desc:更新表:TB_WALLET_RECORD.<br/>
     * descSql =  UPDATE TB_WALLET_RECORD SET TITLE = #{title,jdbcType=VARCHAR} ,AMOUNT = #{amount,jdbcType=BIGINT} ,STATUS = #{status,jdbcType=INTEGER} ,BALANCE = #{balance,jdbcType=BIGINT} ,CONTENT = #{content,jdbcType=VARCHAR} ,CUSER_ID = #{cuserId,jdbcType=VARCHAR} ,ORDER_ID = #{orderId,jdbcType=BIGINT} ,CUSER_SEX = #{cuserSex,jdbcType=VARCHAR} ,WALLET_ID = #{walletId,jdbcType=BIGINT} ,COMPANY_ID = #{companyId,jdbcType=BIGINT} ,CUSER_NAME = #{cuserName,jdbcType=VARCHAR} ,ORDER_CODE = #{orderCode,jdbcType=VARCHAR} ,TRADE_NO = #{tradeNo,jdbcType=BIGINT} ,TRADE_TIME = #{tradeTime,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=BIGINT} ,RECORD_TYPE = #{recordType,jdbcType=INTEGER} ,WALLET_CODE = #{walletCode,jdbcType=VARCHAR} ,CUSER_TELEPHONE = #{cuserTelephone,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(WalletRecordDO entity);
    /**
     * desc:根据主键删除数据:TB_WALLET_RECORD.<br/>
     * descSql =  DELETE FROM TB_WALLET_RECORD WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TB_WALLET_RECORD.<br/>
     * descSql =  SELECT * FROM TB_WALLET_RECORD WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return WalletRecordDO
     */
    WalletRecordDO getByPrimary(Long id);
    /**
     * desc:foreach支持 many.<br/>
     * descSql =  SELECT * FROM TB_WALLET_RECORD WHERE 1 = 1 ,STATUS = #{status,jdbcType=INTEGER} ,ORDER_ID = #{orderId,jdbcType=BIGINT} ,ORDER_CODE = #{orderCode,jdbcType=VARCHAR} ,TRADE_TIME = #{tradeTime,jdbcType=BIGINT} ,RECORD_TYPE = #{recordType,jdbcType=INTEGER} ,WALLET_CODE = #{walletCode,jdbcType=VARCHAR} AND CUSER_NAME LIKE CONCAT(#{cuserName,jdbcType=VARCHAR}, '%') AND CUSER_TELEPHONE LIKE CONCAT(#{cuserTelephone,jdbcType=VARCHAR}, '%') AND COMPANY_ID = #{companyId,jdbcType=BIGINT} AND CUSER_ID = #{cuserId,jdbcType=VARCHAR} AND WALLET_ID = #{walletId,jdbcType=BIGINT} AND WALLET_CODE = #{walletCode,jdbcType=VARCHAR} AND TRADE_NO = #{tradeNo,jdbcType=VARCHAR} AND ORDER_CODE = #{orderCode,jdbcType=VARCHAR} AND ORDER_TYPE = #{orderType,jdbcType=INTEGER} AND MEDIUM_CODE = #{mediumCode,jdbcType=VARCHAR} AND MEDIUM_TYPE = #{mediumType,jdbcType=INTEGER} AND TRADE_STATUS = #{tradeStatus,jdbcType=VARCHAR} AND TRADE_TIME &gt; #{tradeTimeStart,jdbcType=BIGINT} AND TRADE_TIME &lt; #{tradeTimeEnd,jdbcType=BIGINT} AND STATUS = #{status,jdbcType=INTEGER} 
     * @param queryWalletRecord queryWalletRecord
     * @return int
     */
    int getListParamsPageCount(QueryWalletRecordPage queryWalletRecord);
    /**
     * desc:foreach支持 many.<br/>
     * descSql =  SELECT * FROM TB_WALLET_RECORD WHERE 1 = 1 ,STATUS = #{status,jdbcType=INTEGER} ,ORDER_ID = #{orderId,jdbcType=BIGINT} ,ORDER_CODE = #{orderCode,jdbcType=VARCHAR} ,TRADE_TIME = #{tradeTime,jdbcType=BIGINT} ,RECORD_TYPE = #{recordType,jdbcType=INTEGER} ,WALLET_CODE = #{walletCode,jdbcType=VARCHAR} AND CUSER_NAME LIKE CONCAT(#{cuserName,jdbcType=VARCHAR}, '%') AND CUSER_TELEPHONE LIKE CONCAT(#{cuserTelephone,jdbcType=VARCHAR}, '%') AND COMPANY_ID = #{companyId,jdbcType=BIGINT} AND CUSER_ID = #{cuserId,jdbcType=VARCHAR} AND WALLET_ID = #{walletId,jdbcType=BIGINT} AND WALLET_CODE = #{walletCode,jdbcType=VARCHAR} AND TRADE_NO = #{tradeNo,jdbcType=VARCHAR} AND ORDER_CODE = #{orderCode,jdbcType=VARCHAR} AND ORDER_TYPE = #{orderType,jdbcType=INTEGER} AND MEDIUM_CODE = #{mediumCode,jdbcType=VARCHAR} AND MEDIUM_TYPE = #{mediumType,jdbcType=INTEGER} AND TRADE_STATUS = #{tradeStatus,jdbcType=VARCHAR} AND TRADE_TIME &gt; #{tradeTimeStart,jdbcType=BIGINT} AND TRADE_TIME &lt; #{tradeTimeEnd,jdbcType=BIGINT} AND STATUS = #{status,jdbcType=INTEGER} 
     * @param queryWalletRecord queryWalletRecord
     * @return List<WalletRecordDO>
     */
    List<WalletRecordDO> getListParamsResult(QueryWalletRecordPage queryWalletRecord);

    /**
     * 不分页导出（用于出excel报表）
     * @param queryWalletRecord
     * @return List<WalletRecordDO>
     */
    List<WalletRecordDO> getListParamsPageResult(QueryWalletRecordPage queryWalletRecord);

    /**
     * 根据userCenterId来更新公司id
     *
     * @param companyId
     * @param userId
     */
    void updateCompanyId(@Param("companyId") String companyId, @Param("userCenterId") String userId);

}
