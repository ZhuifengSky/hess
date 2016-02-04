package com.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.slf4j.Logger;

import com.service.IFileUpService;
import com.util.DateUtil;
import com.util.EnvironmentUtil;
import com.util.RandomStrUtil;

public class FileUpServiceImpl implements IFileUpService {

	public static Logger logger;
	public static String path =EnvironmentUtil.getInstance().getPropertyValue("File.SavePath");;

	@Override
	public String uploadFile(String filName, String suffix,InputStream stream) {
		String fileName = DateUtil.format(new Date(), DateUtil.DATE)
				+ RandomStrUtil.getCharAndNumr(5);
		String folderName = DateUtil.format(new Date(), DateUtil.DATE);
		String savePath = path + File.separatorChar + File.separatorChar
				+ folderName + File.separatorChar + File.separatorChar
				+ fileName + "." + suffix;
		String folderPath = path + File.separatorChar + folderName;
		File file = new File(folderPath);
		if (!file.exists() && !file.isDirectory()) {
			System.out.println("//������");
			file.mkdir();
		} else {
			System.out.println("//Ŀ¼����");
		}
		FileOutputStream fs = null;
		try {
			fs = new FileOutputStream(savePath);
			byte[] buffer = new byte[1024 * 1024];
			int bytesum = 0;
			int byteread = 0;
			while ((byteread = stream.read(buffer)) != -1) {
				bytesum += byteread;
				fs.write(buffer, 0, byteread);
				fs.flush();
			}
		} catch (FileNotFoundException e) {
			/*logger.error("�ϴ��ļ�ʱ�ļ�δ�ҵ���");*/
			e.printStackTrace();
			return "file up error";
		} catch (IOException e) {
			/*logger.error("�ļ��ϴ��׳�IO�쳣��");*/
			e.printStackTrace();
			return "file up error";
		} finally {
			try {
				fs.close();
				stream.close();
			} catch (IOException e) {
				/*logger.error("�ر������ʱ�׳�IO�쳣��");*/
				e.printStackTrace();
			}
		}
		 return savePath;
	}

	@Override
	public String downLoadFile(String fileName, String path) {
		System.out.println("���ݹ����Ĳ���"+fileName+"---"+path);
		String msg = "�˷�������ִ�У�";
		System.out.println("���Բ��Զ�");
		return msg;
	}
	

}
