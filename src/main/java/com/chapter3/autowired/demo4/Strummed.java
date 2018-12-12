package com.chapter3.autowired.demo4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * 创建自定义的限定器(Qualifier)
 *
 * @author dell
 *
 */
@Target({ ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Strummed {

}
