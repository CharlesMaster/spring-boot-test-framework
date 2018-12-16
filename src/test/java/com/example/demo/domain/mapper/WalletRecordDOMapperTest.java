package com.example.demo.domain.mapper;

import com.example.demo.domain.mapper.config.MybatisScanConfiguration;
import com.example.demo.domain.model.WalletRecordDO;
import com.example.demo.domain.paging.QueryWalletRecordPage;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 钱包对账业务数据库层单元测试
 */
@RunWith(SpringRunner.class)
/**
 *  这里指定的classes是可选的。如果不指定classes，则spring boot会启动整个spring容器，很慢（比如说会执行一些初始化，ApplicationRunner、CommandLineRunner等等）。不推荐
 *  指定的话，就只会初始化指定的bean，速度快，推荐
 */
@SpringBootTest(classes={DataSourceAutoConfiguration.class, MybatisAutoConfiguration.class, MybatisScanConfiguration.class})
@Transactional(transactionManager = "walletTransactionManager")
@TestPropertySource("classpath:application-mapper.properties")
public class WalletRecordDOMapperTest {

    @Autowired
    private WalletRecordDOMapper walletRecordDOMapper;

    @Test
    public void testGetByPrimary() {
        WalletRecordDO walletRecordDO = walletRecordDOMapper.getByPrimary(1l);
        Assert.assertEquals("WX_JSAPI", walletRecordDO.getTradeType());
        Assert.assertEquals("ALI_PASS",walletRecordDO.getChannelType());
    }

    @Test
    public void testInsert() {
        WalletRecordDO walletRecordDO = buildTestData();

        walletRecordDOMapper.insert(walletRecordDO);
        Assert.assertEquals(2L,walletRecordDO.getId().longValue());

        WalletRecordDO newRecord = walletRecordDOMapper.getByPrimary(2l);
        Assert.assertNull(newRecord.getTradeType());
        Assert.assertEquals("WEICHAT_PASS",newRecord.getChannelType());
        Assert.assertEquals("Charles",newRecord.getCuserName());
    }

    @Test
    public void testUpdate() {

        WalletRecordDO walletRecordDO = new WalletRecordDO();
        walletRecordDO.setId(1l);
        walletRecordDO.setTradeType("WALLET_PASSWORD");
        walletRecordDO.setChannelType("WEICHAT_PASS");
        walletRecordDO.setCuserName("Charles");

        walletRecordDOMapper.update(walletRecordDO);

        WalletRecordDO newRecord = walletRecordDOMapper.getByPrimary(1l);

        //updated
        Assert.assertEquals("WALLET_PASSWORD",newRecord.getTradeType());
        Assert.assertEquals("WEICHAT_PASS",newRecord.getChannelType());
        Assert.assertEquals("Charles",newRecord.getCuserName());

        //native
        Assert.assertEquals(88l,newRecord.getOrderId().longValue());
        Assert.assertEquals("3556300401799168",newRecord.getOrderCode());
        Assert.assertEquals("20171020020000001040",newRecord.getCompanyId());
        Assert.assertEquals(8l,newRecord.getWalletId().longValue());
        Assert.assertEquals("3556508069270528",newRecord.getWalletCode());
        Assert.assertEquals("00000001",newRecord.getCuserId());
        Assert.assertEquals("15868131120",newRecord.getCuserTelephone());
        Assert.assertEquals("man",newRecord.getCuserSex());
        Assert.assertEquals(1,newRecord.getRecordType().intValue());
        Assert.assertEquals(1l,newRecord.getAmount().longValue());
        Assert.assertEquals(1l,newRecord.getBalance().longValue());
        Assert.assertEquals("电子钱包充值",newRecord.getTitle());
        Assert.assertEquals("电子钱包充值金额 0.01元",newRecord.getContent());
        Assert.assertEquals("M00050007",newRecord.getTradeNo());
        Assert.assertEquals(1505907027000l,newRecord.getTradeTime().longValue());
        Assert.assertEquals(2l,newRecord.getMediumId().longValue());
        Assert.assertEquals("app",newRecord.getMediumType());
        Assert.assertEquals("abcd",newRecord.getMediumCode());
        Assert.assertEquals(1,newRecord.getStatus().intValue());
        Assert.assertEquals(1505907027000l,newRecord.getCreateTime().longValue());
    }


    @Test
    public void testDeleteByPrimary() {
        walletRecordDOMapper.deleteByPrimary(1l);
        WalletRecordDO walletRecordDO = walletRecordDOMapper.getByPrimary(1l);
        Assert.assertNull(walletRecordDO);
    }

    @Rule
    public ExpectedException thrown= ExpectedException.none();

    @Test
    public void testUpdateCompanyId() throws BadSqlGrammarException {
        walletRecordDOMapper.updateCompanyId("20171020020000001040","12345678");
        WalletRecordDO walletRecordDO = walletRecordDOMapper.getByPrimary(1l);
        Assert.assertEquals("12345678",walletRecordDO.getCompanyId());

        thrown.expect(BadSqlGrammarException.class);//验证预期的异常
        walletRecordDOMapper.updateCompanyId("12345678","");
    }

    @Test
    public void testGetListParamsPageCount() {
        QueryWalletRecordPage queryWalletRecordPage = new QueryWalletRecordPage();
        queryWalletRecordPage.setCuserName("zhuzhengke");
        int count = walletRecordDOMapper.getListParamsPageCount(queryWalletRecordPage);
        Assert.assertEquals(1,count);

        queryWalletRecordPage.setChannelType("ALI_PASS");
        count = walletRecordDOMapper.getListParamsPageCount(queryWalletRecordPage);
        Assert.assertEquals(1,count);
    }

    @Test
    public void testGetListParamsPageResult() {
        QueryWalletRecordPage queryWalletRecordPage = new QueryWalletRecordPage();
        queryWalletRecordPage.setCuserName("zhuzhengke");
        List<WalletRecordDO> list = walletRecordDOMapper.getListParamsPageResult(queryWalletRecordPage);
        Assert.assertEquals(1,list.size());

        WalletRecordDO walletRecordDO = list.get(0);
        Assert.assertEquals("WX_JSAPI", walletRecordDO.getTradeType());
        Assert.assertEquals("ALI_PASS",walletRecordDO.getChannelType());

        queryWalletRecordPage.setChannelType("ALI_PASS");
        list = walletRecordDOMapper.getListParamsPageResult(queryWalletRecordPage);
        Assert.assertEquals(1,list.size());
        WalletRecordDO newRecordDO = list.get(0);
        Assert.assertEquals("WX_JSAPI", newRecordDO.getTradeType());
        Assert.assertEquals("ALI_PASS",newRecordDO.getChannelType());
    }

    @Test
    public void testGetListParamsResult() {
        QueryWalletRecordPage queryWalletRecordPage = new QueryWalletRecordPage();
        queryWalletRecordPage.setCuserName("zhuzhengke");
        List<WalletRecordDO> list = walletRecordDOMapper.getListParamsResult(queryWalletRecordPage);

        Assert.assertEquals(1,list.size());
        WalletRecordDO walletRecordDO = list.get(0);
        Assert.assertEquals("WX_JSAPI", walletRecordDO.getTradeType());
        Assert.assertEquals("ALI_PASS",walletRecordDO.getChannelType());

        queryWalletRecordPage.setChannelType("ALI_PASS");
        list = walletRecordDOMapper.getListParamsResult(queryWalletRecordPage);
        Assert.assertEquals(1,list.size());
        WalletRecordDO newRecordDO = list.get(0);
        Assert.assertEquals("WX_JSAPI", newRecordDO.getTradeType());
        Assert.assertEquals("ALI_PASS",newRecordDO.getChannelType());

    }

    /**
     * prepare data
     * @return
     */
    private WalletRecordDO buildTestData(){
        WalletRecordDO walletRecordDO = new WalletRecordDO();
        walletRecordDO.setOrderId(83l);
        walletRecordDO.setOrderCode("3556300401799169");
        walletRecordDO.setCompanyId("20171020020000001041");
        walletRecordDO.setWalletId(9l);
        walletRecordDO.setWalletCode("3556508069270529");
        walletRecordDO.setCuserId("00000007");
        walletRecordDO.setCuserName("Charles");
        walletRecordDO.setCuserTelephone("18551817498");
        walletRecordDO.setChannelType("WEICHAT_PASS");

        return walletRecordDO;
    }
}
