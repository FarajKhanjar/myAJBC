package xml.Cars_project;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class ModifyCars {

	public static void run() {
		try {
			File inputFile = new File("myFiles/myCars.xml");
			SAXBuilder saxBuilder = new SAXBuilder();
			Document document = saxBuilder.build(inputFile);
			Element rootElement = document.getRootElement();

			// get first supercar
			Element car_1Element = rootElement.getChild("car_1");

			// loop the supercar child node
			List<Element> list = car_1Element.getChildren();

			for (int i = 0; i < list.size(); i++) 
			{
				Element carElement = list.get(i);

				if ("2015".equals(carElement.getText())) 
				{
					carElement.setText("2022");
				}
			}

			XMLOutputter xmlOutput = new XMLOutputter();

			// display xml
			xmlOutput.setFormat(Format.getPrettyFormat());
			
			//overwrite file
			OutputStream outputStream = new FileOutputStream(inputFile);
			xmlOutput.output(document, outputStream);
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
