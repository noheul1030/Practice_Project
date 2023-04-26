package xml.kopo11;

import java.io.*;
//import java.io.File;
//import java.io.IOException;

import javax.xml.parsers.*;
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.*;
//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLMain {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		// �ľ��� ���� �غ�
		DocumentBuilder kopo11_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		
		// xml ������ ó�� PC�ȿ� �־ ��ü��θ� ����, xml �Ľ�ó�� ����
		Document kopo11_doc = kopo11_docBuilder
				.parse(new File("C:\\Users\\����\\Documents\\GitHub\\KOPO-JAVA2\\XMLProject\\testdata.xml"));

		// root �±׸� ������ ���⵵ ������ ������ ���̴� ���� ����
		Element kopo11_root = kopo11_doc.getDocumentElement();

		// name, studentid, kor, eng, mat NodeList�� ������ �� ����
		NodeList kopo11_tag_name = kopo11_doc.getElementsByTagName("name");
		NodeList kopo11_tag_studentid = kopo11_doc.getElementsByTagName("studentid");
		NodeList kopo11_tag_kor = kopo11_doc.getElementsByTagName("kor");
		NodeList kopo11_tag_eng = kopo11_doc.getElementsByTagName("eng");
		NodeList kopo11_tag_mat = kopo11_doc.getElementsByTagName("mat");

		System.out.printf("*********************************\n"); // ******* ��� ����
		for (int kopo11_i = 0; kopo11_i < kopo11_tag_name.getLength(); kopo11_i++) { // kopo11_tag_name�� ���̸�ŭ ���� �ݺ���
			System.out.printf("�̸� : %s\n", kopo11_tag_name.item(kopo11_i).getFirstChild().getNodeValue());
			System.out.printf("�й� : %s\n", kopo11_tag_studentid.item(kopo11_i).getFirstChild().getNodeValue()); // String ����
			System.out.printf("���� : %s\n", kopo11_tag_kor.item(kopo11_i).getFirstChild().getNodeValue()); // String ����
			System.out.printf("���� : %s\n", kopo11_tag_eng.item(kopo11_i).getFirstChild().getNodeValue()); // String ����
			System.out.printf("���� : %s\n", kopo11_tag_mat.item(kopo11_i).getFirstChild().getNodeValue()); // String ����
			System.out.printf("*********************************\n"); // ******* ��� ����
		}

	}

}
