package com.service;

import java.io.InputStream;

public interface IFileUpService {

	/**
	 * ͼƬ�ϴ�����
	 * @param stream
	 * @param path
	 * @param suffix
	 * @return
	 */
	public String upFile(InputStream stream,String path,String suffix);
}
