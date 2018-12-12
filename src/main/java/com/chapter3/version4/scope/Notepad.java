package com.chapter3.version4.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//作用域
//SCOPE_SINGLETON：单例，默认
//SCOPE_PROTOTYPE：原型，每次注入或通过spring上下文获取时，都会创建一个新的bena实例
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Notepad {

}
