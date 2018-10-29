package com.pxq.simplelauncher.sort;

import java.util.Comparator;

import com.pxq.simplelauncher.bean.App;

/**
 * ����Ӧ�ø���ʱ������
 * @author pxq
 * @date 2018��8��2��
 */
public class UpdateTimeComparetor implements Comparator<App>{
	
	/**
	 * @Field �Ƿ�����Ĭ�Ͻ���
	 */
	private boolean asc = false;

	public UpdateTimeComparetor(boolean asc) {
		super();
		this.asc = asc;
	}

	@Override
	public int compare(App lhs, App rhs) {
		if (asc) {
			return Long.compare(lhs.getUpdateTime(), rhs.getUpdateTime());
		}
		return - Long.compare(lhs.getUpdateTime(), rhs.getUpdateTime());
	}

}
