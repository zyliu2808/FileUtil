package com.file.poi;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

import com.properties.PropertiesUtil;

public class XwpfUtil {
	public void readWordX() throws Exception {
		String path = System.getProperty("user.dir") + PropertiesUtil.getProperties("src/file.properties", "wordformat");
		System.out.println(path);
		InputStream in = new FileInputStream(path);
		XWPFDocument doc = new XWPFDocument(in);
		List<XWPFParagraph> pras = doc.getParagraphs();
		for(XWPFParagraph pra : pras) {
			System.out.println(pra.getText());
		}
	}
	public static void main(String[] args) {
		System.out.println("s");
		System.out.println(Class.class.getClass().getResource(""));
		
		try {
			new XwpfUtil().readWordX();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
