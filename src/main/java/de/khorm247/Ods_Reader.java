package de.khorm247;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import java.io.*;
import java.util.List;

/*
    Tried to add an XML Reader, but it didnt work out.
    ToDo: fix in a later update
 */

public class Ods_Reader {

    public static void readMyFile() throws IOException, JDOMException {
        // Erstellen eines SAXBuilder-Objekts
        SAXBuilder builder = new SAXBuilder();

        // Einlesen der XML-Datei
        InputStream inputStream = ClassLoader.getSystemResourceAsStream("cleanedPetTable.xml");
        System.out.println(inputStream);
        if(inputStream == null){
            System.out.println("Datei nicht gefunden");
            return;
        }
        Document document = builder.build(inputStream);

        // Zugriff auf das Wurzelelement
        Element rootElement = document.getRootElement();

        // Drucken des Namens des Wurzelelements
        System.out.println("Wurzelelement: " + rootElement.getName());

        // Zugriff auf die Kinderelemente
        List<Element> childElements = rootElement.getChildren();

        // Drucken der Namen der Kinderelemente
        for (Element childElement : childElements) {
            System.out.println("Kinderelement: " + childElement.getName());
            if(childElement.getName().equals("Worksheet")){
                List<Element> newChild = childElement.getChildren();
                newChild.forEach(System.out::println);
            }
        }
    }
}