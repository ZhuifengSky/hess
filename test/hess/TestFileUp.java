package hess;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.service.impl.FileUpServiceImpl;

public class TestFileUp {

	public static void main(String[] args) {
		FileUpServiceImpl service = new FileUpServiceImpl();
		InputStream is = null;
		try {
			is = new BufferedInputStream(new FileInputStream("G:/公司项目/财务系统/环球财务系统业务处理逻辑.doc"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String result = service.uploadFile( "呵呵", "doc",is);
	}
}
