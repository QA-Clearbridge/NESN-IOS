package com.qa.utils;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;

public class TestUtils {
    public static final Duration WAIT = Duration.ofSeconds(10);
        public HashMap<String, String> parseStringXML(InputStream file) throws Exception{
            HashMap<String, String> stringMap = new HashMap<String, String>();
            //Get Document Builder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            //Build Document
            Document document = builder.parse(file);

            //Normalize the XML Structure; It's just too important !!
            document.getDocumentElement().normalize();

            //Here comes the root node
            Element root = document.getDocumentElement();

            //Get all elements
            NodeList nList = document.getElementsByTagName("string");

            for (int temp = 0; temp < nList.getLength(); temp++)
            {
                Node node = nList.item(temp);
                if (node.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element eElement = (Element) node;
                    // Store each element key value in map
                    stringMap.put(eElement.getAttribute("name"), eElement.getTextContent());
                }
            }
            return stringMap;
        }
}