package com.chapter4.aspectj.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 类/接口描述: 标识该方法是否需要拦截
 *
 * @author 张苏磊
 * @version 1.0
 * 创建时间： 2015年11月30日 下午1:52:19
 * JDK版本：sun jdk 1.7
 *********************************更新记录******************************
 * 版本：  <版本号>        修改日期：  <日期>        修改人： <修改人姓名>
 * 修改内容：  <修改内容描述>
 **********************************************************************
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface OperateAspce {

	public abstract String message() default "";

}