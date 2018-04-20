package org.pachira.message.entity;

import com.pachiraframework.entity.BaseEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 消息模版
 * 
 * @author KevinWang
 *
 */
@Getter
@Setter
@ToString
public class Template extends BaseEntity<Long>{
	private static final long serialVersionUID = 3552968867764411673L;
	private String title;
	/**
	 * 内容
	 */
	private String content;
	/**
	 * 发送的网关
	 */
	private String gateway;
	/**
	 * @see TypeEnum
	 * 模版类型
	 */
	private String type;
	
	/**
	 * 模版类型枚举
	 * @author KevinWang
	 *
	 */
	public static enum TypeEnum{
		SMS,EMAIL;
	}
}
