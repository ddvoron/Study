//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.16 at 11:48:19 AM EEST 
//


package by.it.aborisenok.JD02_09.TaskB;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for policlinic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="policlinic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="doctor" type="{http://TaskC.JD02_09.aborisenok.it.by/}doctor"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "policlinic", propOrder = {
    "number",
    "doctor"
})
public class Policlinic {

    @XmlElement(required = true)
    protected String number;
    @XmlElement(required = true)
    protected Doctor doctor;

    /**
     * Gets the value of the number property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the doctor property.
     *
     * @return
     *     possible object is
     *     {@link Doctor }
     *
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * Sets the value of the doctor property.
     *
     * @param value
     *     allowed object is
     *     {@link Doctor }
     *
     */
    public void setDoctor(Doctor value) {
        this.doctor = value;
    }

}
