package com.service;

import java.io.InputStream;

public interface IFileUpService {

	/**
	 * 图片上传方法
	 * @param stream
	 * @param path
	 * @param suffix
	 * @return
	 */
	public String upFile(InputStream stream,String path,String suffix);
}
