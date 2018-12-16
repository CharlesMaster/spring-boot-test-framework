package com.example.demo.domain.dao;

import com.example.demo.domain.common.AbstractBaseDao;
import com.example.demo.domain.mapper.WalletRecordDOMapper;
import com.example.demo.domain.model.WalletRecordDO;
import com.example.demo.domain.paging.QueryWalletRecordPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* The Table TB_WALLET_RECORD.
* TB_WALLET_RECORD
*/
@Repository
public class WalletRecordDAO extends AbstractBaseDao<WalletRecordDO> {

    @Autowired
    private WalletRecordDOMapper walletRecordDOMapper;

    /**
     * desc:插入表:TB_WALLET_RECORD.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TB_WALLET_RECORD( ID ,TITLE ,AMOUNT ,STATUS ,BALANCE ,CONTENT ,CUSER_ID ,ORDER_ID ,CUSER_SEX ,WALLET_ID ,COMPANY_ID ,CUSER_NAME ,ORDER_CODE ,TRADE_NO ,TRADE_TIME ,CREATE_TIME ,RECORD_TYPE ,WALLET_CODE ,CUSER_TELEPHONE )VALUES( #{id,jdbcType=BIGINT} , #{title,jdbcType=VARCHAR} , #{amount,jdbcType=BIGINT} , #{status,jdbcType=INTEGER} , #{balance,jdbcType=BIGINT} , #{content,jdbcType=VARCHAR} , #{cuserId,jdbcType=VARCHAR} , #{orderId,jdbcType=BIGINT} , #{cuserSex,jdbcType=VARCHAR} , #{walletId,jdbcType=BIGINT} , #{companyId,jdbcType=BIGINT} , #{cuserName,jdbcType=VARCHAR} , #{orderCode,jdbcType=VARCHAR} , #{tradeNo,jdbcType=VARCHAR} , #{tradeTime,jdbcType=BIGINT} , #{createTime,jdbcType=BIGINT} , #{recordType,jdbcType=INTEGER} , #{walletCode,jdbcType=VARCHAR} , #{cuserTelephone,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    @Override
    public Long insert(WalletRecordDO entity){
        return walletRecordDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TB_WALLET_RECORD.<br/>
     * descSql =  UPDATE TB_WALLET_RECORD SET TITLE = #{title,jdbcType=VARCHAR} ,AMOUNT = #{amount,jdbcType=BIGINT} ,STATUS = #{status,jdbcType=INTEGER} ,BALANCE = #{balance,jdbcType=BIGINT} ,CONTENT = #{content,jdbcType=VARCHAR} ,CUSER_ID = #{cuserId,jdbcType=VARCHAR} ,ORDER_ID = #{orderId,jdbcType=BIGINT} ,CUSER_SEX = #{cuserSex,jdbcType=VARCHAR} ,WALLET_ID = #{walletId,jdbcType=BIGINT} ,COMPANY_ID = #{companyId,jdbcType=BIGINT} ,CUSER_NAME = #{cuserName,jdbcType=VARCHAR} ,ORDER_CODE = #{orderCode,jdbcType=VARCHAR} ,TRADE_NO = #{tradeNo,jdbcType=BIGINT} ,TRADE_TIME = #{tradeTime,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=BIGINT} ,RECORD_TYPE = #{recordType,jdbcType=INTEGER} ,WALLET_CODE = #{walletCode,jdbcType=VARCHAR} ,CUSER_TELEPHONE = #{cuserTelephone,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    @Override
    public Long update(WalletRecordDO entity){
        return walletRecordDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TB_WALLET_RECORD.<br/>
     * descSql =  DELETE FROM TB_WALLET_RECORD WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    @Override
    public Long deleteByPrimary(Long id){
        return walletRecordDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TB_WALLET_RECORD.<br/>
     * descSql =  SELECT * FROM TB_WALLET_RECORD WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return WalletRecordDO
     */
    @Override
    public WalletRecordDO getByPrimary(Long id){
        return walletRecordDOMapper.getByPrimary(id);
    }
    /**
     * desc:foreach支持 many.<br/>
     * descSql =  SELECT * FROM TB_WALLET_RECORD WHERE 1 = 1 ,STATUS = #{status,jdbcType=INTEGER} ,ORDER_ID = #{orderId,jdbcType=BIGINT} ,ORDER_CODE = #{orderCode,jdbcType=VARCHAR} ,TRADE_TIME = #{tradeTime,jdbcType=BIGINT} ,RECORD_TYPE = #{recordType,jdbcType=INTEGER} ,WALLET_CODE = #{walletCode,jdbcType=VARCHAR} AND CUSER_NAME LIKE CONCAT(#{cuserName,jdbcType=VARCHAR}, '%') AND CUSER_TELEPHONE LIKE CONCAT(#{cuserTelephone,jdbcType=VARCHAR}, '%') AND COMPANY_ID = #{companyId,jdbcType=BIGINT} AND CUSER_ID = #{cuserId,jdbcType=VARCHAR} AND WALLET_ID = #{walletId,jdbcType=BIGINT} AND WALLET_CODE = #{walletCode,jdbcType=VARCHAR} AND TRADE_NO = #{tradeNo,jdbcType=VARCHAR} AND ORDER_CODE = #{orderCode,jdbcType=VARCHAR} AND ORDER_TYPE = #{orderType,jdbcType=INTEGER} AND MEDIUM_CODE = #{mediumCode,jdbcType=VARCHAR} AND MEDIUM_TYPE = #{mediumType,jdbcType=INTEGER} AND TRADE_STATUS = #{tradeStatus,jdbcType=VARCHAR} AND TRADE_TIME &gt; #{tradeTimeStart,jdbcType=BIGINT} AND TRADE_TIME &lt; #{tradeTimeEnd,jdbcType=BIGINT} AND STATUS = #{status,jdbcType=INTEGER} 
     * @param queryWalletRecord queryWalletRecord
     * @return QueryWalletRecordPage
     */
    public QueryWalletRecordPage getListParamsPage(QueryWalletRecordPage queryWalletRecord){
        int total = walletRecordDOMapper.getListParamsPageCount(queryWalletRecord);
        if(total>0){
            queryWalletRecord.setDatas(walletRecordDOMapper.getListParamsPageResult(queryWalletRecord));
        }
        queryWalletRecord.setTotal(total);
        return queryWalletRecord;
    }

    /**
     * 不分页查询，用于报表导出
     * @param queryWalletRecord
     * @return
     */
    public QueryWalletRecordPage getListParams(QueryWalletRecordPage queryWalletRecord){
        List<WalletRecordDO> list = walletRecordDOMapper.getListParamsResult(queryWalletRecord);
        if(null!=list && list.size()>0){
            queryWalletRecord.setDatas(list);
            queryWalletRecord.setTotal(list.size());
        }
        return queryWalletRecord;
    }

    /**
     * 查询list
     * @param queryWalletRecordPage
     * @return
     */
    public List<WalletRecordDO> getListParamsPageResult(QueryWalletRecordPage queryWalletRecordPage) {
        return walletRecordDOMapper.getListParamsPageResult(queryWalletRecordPage);
    }

    public void updateCompanyId(String companyId, String userId) {
        walletRecordDOMapper.updateCompanyId(companyId,userId);
    }
}
