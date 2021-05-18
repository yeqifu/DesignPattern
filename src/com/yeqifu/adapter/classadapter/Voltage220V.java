package com.yeqifu.adapter.classadapter;

// 被适配对象
public class Voltage220V {
	public int output(){
		int src = 220;
		System.out.println("原始电压："+src+"伏！");
		return src;
	}
}
