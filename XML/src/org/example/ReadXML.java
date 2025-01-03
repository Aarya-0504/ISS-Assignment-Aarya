package org.example;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;

import java.io.File;

public class ReadXML {
    public static void main(String[] args) {
        try {
            // Load the XML file
            File xmlFile = new File("example.xml");
            
            // Create a DocumentBuilder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            // Parse the XML file
            Document document = builder.parse(xmlFile);
            
            // Normalize the document
            document.getDocumentElement().normalize();
            
            // Get the root element
            Element root = document.getDocumentElement();
            System.out.println("Root Element: " + root.getNodeName());
            
            // Get all employees
            NodeList employees = document.getElementsByTagName("employee");
            
            for (int i = 0; i < employees.getLength(); i++) {
                Node node = employees.item(i);
                
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element employee = (Element) node;
                    
                    // Read data
                    String id = employee.getElementsByTagName("id").item(0).getTextContent();
                    String name = employee.getElementsByTagName("name").item(0).getTextContent();
                    String department = employee.getElementsByTagName("department").item(0).getTextContent();
                    
                    // Print data
                    System.out.println("Employee ID: " + id);
                    System.out.println("Name: " + name);
                    System.out.println("Department: " + department);
                    System.out.println();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
