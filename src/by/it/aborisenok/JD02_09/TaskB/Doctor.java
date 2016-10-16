//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.16 at 11:48:19 AM EEST 
//


package by.it.aborisenok.JD02_09.TaskB;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doctor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doctor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="post" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="doctorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="doctorSurname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cabinet" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doctor", propOrder = {
    "post",
    "doctorName",
    "doctorSurname",
    "category",
    "cabinet"
})
public class Doctor {

    @XmlElement(required = true)
    protected String post;
    @XmlElement(required = true)
    protected String doctorName;
    @XmlElement(required = true)
    protected String doctorSurname;
    @XmlElement(required = true)
    protected String category;
    @XmlElement(required = true)
    @XmlSchemaType(name = "Integer")
    protected Integer cabinet;

    /**
     * Gets the value of the post property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPost() {
        return post;
    }

    /**
     * Sets the value of the post property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPost(String value) {
        this.post = value;
    }

    /**
     * Gets the value of the doctorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * Sets the value of the doctorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoctorName(String value) {
        this.doctorName = value;
    }

    /**
     * Gets the value of the doctorSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoctorSurname() {
        return doctorSurname;
    }

    /**
     * Sets the value of the doctorSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoctorSurname(String value) {
        this.doctorSurname = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the cabinet property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCabinet() {
        return cabinet;
    }

    /**
     * Sets the value of the cabinet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCabinet(Integer value) {
        this.cabinet = value;
    }

}
