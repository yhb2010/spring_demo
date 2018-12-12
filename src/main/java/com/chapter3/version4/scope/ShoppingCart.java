package com.chapter3.version4.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
//作用域
//SCOPE_SINGLETON：单例，默认
//SCOPE_PROTOTYPE：原型，每次注入或通过spring上下文获取时，都会创建一个新的bena实例
//session：在web应用中，为每个会话创建一个bean实例
//request：在web应用中，为每个请求创建一个bean实例
//proxyMode=ScopedProxyMode.INTERFACES， 如果bean的类型是具体类的话，就要将其设置为TARGET_CLASS，以此表明要生成目标类扩展的方式创建代理
@Scope(value=WebApplicationContext.SCOPE_SESSION, proxyMode=ScopedProxyMode.INTERFACES)
public class ShoppingCart {

}
