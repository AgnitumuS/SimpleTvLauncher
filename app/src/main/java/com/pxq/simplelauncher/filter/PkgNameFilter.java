package com.pxq.simplelauncher.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.pxq.simplelauncher.bean.App;

/**
 * ���˵�ָ��������APK
 * 
 * @author pxq
 * @date 2018��8��2��
 */
public class PkgNameFilter implements IFilter {

	private String[] pkgNames;

	/**
	 * ���˵�ָ��������APK
	 * 
	 * @param pkgNames
	 *            ָ�������б�
	 */
	public PkgNameFilter(String... pkgNames) {
		super();
		this.pkgNames = pkgNames;
	}

	@Override
	public List<App> doFilter(List<App> apps) {
		if (apps == null) {
			return null;
		}
		List<App> filterApp = new ArrayList<App>();
		if (pkgNames != null) {
			List<String> pkgNameList = Arrays.asList(pkgNames);
			for (App app : apps) {
				if (!pkgNameList.contains(app.getPkg())) {
					filterApp.add(app);
				}
			}
		} else {
			return apps;
		}

		return filterApp;
	}

}
