package com.file.service;

import java.util.List;
import java.util.Map;

/**
 * ����ӿ�
 * @author mozz
 */
public interface HessianAPI {
	
	/**
	 * ��ҵ��Ա��Ϣ��֤
	 * @return
	 */
	public Map<String,Object> userInfo(Map<String,byte[]> req);
	
	/**
	 * ��ҵ��Ա����ѧʱ���
	 * @return
	 */
	public Map<String,Object> periodInfo(Map<String,byte[]> req);
	
	/**
	 * �������Ͻ���ѧϰ���
	 * @return
	 */
	public Map<String,Object> education(Map<String,Object> req);
	
	
	
	/**
	 * �������ԣ����Է����Ƿ�������
	 * @return
	 */
	public Map<String,Object> heartbeat(Map<String,byte[]> req);
	
}
