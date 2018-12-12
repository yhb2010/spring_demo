//舞台，单例
package com.chapter2.factory;

public class Stage {
	private Stage() {
	}

	private static class StageSingletonHolder {
		static Stage instance = new Stage(); // <co id="co_lazyLoad"/>
	}

	public static Stage getInstance() {
		return StageSingletonHolder.instance; // <co id="co_returnInstance"/>
	}
}
