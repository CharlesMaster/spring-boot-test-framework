package com.example.demo.domain.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
@MapperScan(basePackages = { "com.example.demo.domain.mapper" }, sqlSessionFactoryRef = "walletSqlSessionFactory")
public class WalletDataSourceConfig {

	@Bean(name = "walletDataSource")
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "walletTransactionManager")
	public DataSourceTransactionManager transactionManager(@Qualifier("walletDataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean(name = "walletSqlSessionFactory")
	public SqlSessionFactory sqlSessionFactory(@Qualifier("walletDataSource") DataSource dataSource) throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		String path = "classpath*:mapper/**/*.xml";
		Resource[] resources = new PathMatchingResourcePatternResolver().getResources(path);

		// 分页插件
		/*
		 * PageHelper pageHelper = new PageHelper(); Properties props = new
		 * Properties(); props.setProperty("reasonable", "true");
		 * props.setProperty("supportMethodsArguments", "true");
		 * props.setProperty("returnPageInfo", "check");
		 * props.setProperty("params", "count=countSql");
		 * pageHelper.setProperties(props); //添加插件 factoryBean.setPlugins(new
		 * Interceptor[]{pageHelper});
		 */
		factoryBean.setMapperLocations(resources);

		return factoryBean.getObject();
	}

	@Bean(name = "walletSqlSessionTemplate")
	public SqlSessionTemplate sqlSessionTemplate(
			@Qualifier("walletSqlSessionFactory") SqlSessionFactory walletSqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(walletSqlSessionFactory);
	}
}
