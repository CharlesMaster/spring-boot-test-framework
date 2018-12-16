package com.example.demo.domain.common;

/**
 * 基础base设置
 * @author ivoter
 *
 */
public abstract class AbstractBaseDao<T extends AbstractBaseDo> {
	
	/**
	 * 插入数据
	 * @param entity
	 * @return
	 */
	public abstract Long insert(T entity);
	
	/**
	 * 更新数据
	 * @param entity
	 * @return
	 */
	public abstract Long update(T entity);
	
	/**
	 * 根据主键删除
	 * @param id
	 * @return
	 */
	public abstract Long deleteByPrimary(Long id);
	
	/**
	 * 根据主键查询
	 * @param id
	 * @return
	 */
	public abstract T getByPrimary(Long id);


}
