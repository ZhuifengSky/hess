package com.service;

import java.io.InputStream;
import java.io.OutputStream;

public interface IFileUpService {

	/**
	 * ͼƬ�ϴ�����
	 * @param stream
	 * @param path
	 * @param suffix
	 * @return
	 */
	public String uploadFile(String filName,String suffix,InputStream stream);
	
	
	/**
	 * �ļ����ط���
	 * @param fileName
	 * @param path
	 * @return
	 */
	public String downLoadFile(String fileName,String path);
	
}
