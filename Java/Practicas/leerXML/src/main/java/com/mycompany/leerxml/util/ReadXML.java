/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leerxml.util;

import com.mycompany.leerxml.model.CD;
import java.io.File;
import java.util.ArrayList;
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author joshuansu
 */
public class ReadXML {

    static public ArrayList<CD> readXML(String filePath) {
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        ArrayList<CD> cdList = null;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("CD");

            cdList = new ArrayList<CD>();
            for (int i = 0; i < nodeList.getLength(); i++) {
                cdList.add(getCD(nodeList.item(i)));
            }

            for (CD emp : cdList) {
                System.out.println(emp.toString());
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }

        return cdList;
    }

    private static CD getCD(Node node) {

        CD cd = new CD();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            cd.setArtist(getTagValue("ARTIST", element));
            cd.setCompany(getTagValue("COMPANY", element));
            cd.setCountry(getTagValue("COUNTRY", element));
            cd.setPrice(Float.valueOf(getTagValue("PRICE", element)));
            cd.setTitle(getTagValue("TITLE", element));
            cd.setYear(Integer.parseInt(getTagValue("YEAR", element)));
        }

        return cd;
    }

    private static String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodeList.item(0);
        return node.getNodeValue();
    }
}
