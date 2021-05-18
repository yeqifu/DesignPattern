package com.yeqifu.adapter.objectadapter;

public class VoltageAdapter implements IVoltage5V {

	public Voltage220V voltage220v;

	public VoltageAdapter(Voltage220V voltage220v) {
		this.voltage220v = voltage220v;
	}

	public int output5V() {
		int dst = 0;
		if (null != voltage220v) {
			// 获得220V电压
			int src = voltage220v.output();
			System.out.println("使用对象适配器进行适配！");
			dst = src / 44;
			System.out.println("适配完成，输出电压为：" + dst+"V");
		}
		return dst;
	}

}
