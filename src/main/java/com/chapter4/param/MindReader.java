package com.chapter4.param;

/**
 * 读心者
 * 
 * @author Administrator
 *
 */
public interface MindReader {

	// 截听志愿者的内心感应
	void interceptThoughts(String thoughts);

	// 显示他们在想什么
	String getThoughts();

}