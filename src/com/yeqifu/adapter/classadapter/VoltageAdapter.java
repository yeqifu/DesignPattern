package com.yeqifu.adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements IVoltage5V{

	@Override
	public int output5V() {
		int srcV = output();
		// 将原电压转换成目标电压
		int desV = srcV/44;
		return desV;
	}

}
