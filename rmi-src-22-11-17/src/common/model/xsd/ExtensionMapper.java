/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:58 BST)
 */
package common.model.xsd;


/**
 *  ExtensionMapper class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ExtensionMapper {
    public static java.lang.Object getTypeObject(
        java.lang.String namespaceURI, java.lang.String typeName,
        javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
        if ("http://model.common/xsd".equals(namespaceURI) &&
                "TrayCollection".equals(typeName)) {
            return common.model.xsd.TrayCollection.Factory.parse(reader);
        }

        if ("http://model.common/xsd".equals(namespaceURI) &&
                "AnimalCollection".equals(typeName)) {
            return common.model.xsd.AnimalCollection.Factory.parse(reader);
        }

        if ("http://model.common/xsd".equals(namespaceURI) &&
                "PartType".equals(typeName)) {
            return common.model.xsd.PartType.Factory.parse(reader);
        }

        if ("http://model.common/xsd".equals(namespaceURI) &&
                "AbstractPackage".equals(typeName)) {
            return common.model.xsd.AbstractPackage.Factory.parse(reader);
        }

        if ("http://model.common/xsd".equals(namespaceURI) &&
                "Animal".equals(typeName)) {
            return common.model.xsd.Animal.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}
