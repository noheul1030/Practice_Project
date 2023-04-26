package xml.kopo11;

//import java.io.File;
//import java.io.IOException;
import java.io.File;
import java.io.IOException;

//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLMain {

    public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
        // 파씽을 위한 준비
        DocumentBuilder kopo11_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();

        // xml 파일을 처리 PC안에 있어서 전체경로를 지정, xml 파싱처리 시작
        Document kopo11_doc = kopo11_docBuilder
                .parse(new File("C:\\Users\\노을\\Documents\\GitHub\\KOPO-JAVA2\\XMLProject\\testdata.xml"));

        // root 태그를 가지고 오기도 하지만 지금은 쓰이는 곳이 없음
        Element kopo11_root = kopo11_doc.getDocumentElement();

        // name, studentid, kor, eng, mat NodeList에 각각의 값 대입
        NodeList kopo11_tag_name = kopo11_doc.getElementsByTagName("name");
        NodeList kopo11_tag_studentid = kopo11_doc.getElementsByTagName("studentid");
        NodeList kopo11_tag_kor = kopo11_doc.getElementsByTagName("kor");
        NodeList kopo11_tag_eng = kopo11_doc.getElementsByTagName("eng");
        NodeList kopo11_tag_mat = kopo11_doc.getElementsByTagName("mat");

        System.out.printf("*********************************\n"); // ******* 출력 개행
        for (int kopo11_i = 0; kopo11_i < kopo11_tag_name.getLength(); kopo11_i++) { // kopo11_tag_name의 길이만큼 도는 반복문
            System.out.printf("이름 : %s\n", kopo11_tag_name.item(kopo11_i).getFirstChild().getNodeValue());
            System.out.printf("학번 : %s\n", kopo11_tag_studentid.item(kopo11_i).getFirstChild().getNodeValue()); // String
                                                                                                                // 주의
            System.out.printf("국어 : %s\n", kopo11_tag_kor.item(kopo11_i).getFirstChild().getNodeValue()); // String 주의
            System.out.printf("영어 : %s\n", kopo11_tag_eng.item(kopo11_i).getFirstChild().getNodeValue()); // String 주의
            System.out.printf("수학 : %s\n", kopo11_tag_mat.item(kopo11_i).getFirstChild().getNodeValue()); // String 주의
            System.out.printf("*********************************\n"); // ******* 출력 개행
        }

    }

}
