//表演者接口
package com.chapter4.version4.aspectj;

import com.chapter2.constructor.PerformanceException;

public interface Performer {
	void perform() throws PerformanceException;
}