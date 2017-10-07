//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.11 at 11:57:57 AM WEST 
//


package ouvertureS;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACCOUNTBCPOUVDIGITALPPHType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACCOUNTBCPOUVDIGITALPPHType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Client" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Intituleducompte1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Intituleducompte2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Devise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Gestionnaireducompte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gOTHEROFFICER" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Autreresponsable" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Numerodecompte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACLR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gAC.LR2" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ACLR2" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LGENERIQUEACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LPLURALACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MATRICULEEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACCOUNTBCPOUVDIGITALPPHType", propOrder = {
    "client",
    "category",
    "intituleducompte1",
    "intituleducompte2",
    "devise",
    "gestionnaireducompte",
    "gotherofficer",
    "numerodecompte",
    "aclr1",
    "gaclr2",
    "lgeneriqueacc",
    "lpluralacc",
    "matriculeext"
})
public class ACCOUNTBCPOUVDIGITALPPHType {

    @XmlElement(name = "Client")
    protected String client;
    @XmlElement(name = "Category")
    protected String category;
    @XmlElement(name = "Intituleducompte1")
    protected String intituleducompte1;
    @XmlElement(name = "Intituleducompte2")
    protected String intituleducompte2;
    @XmlElement(name = "Devise")
    protected String devise;
    @XmlElement(name = "Gestionnaireducompte")
    protected String gestionnaireducompte;
    @XmlElement(name = "gOTHEROFFICER")
    protected ACCOUNTBCPOUVDIGITALPPHType.GOTHEROFFICER gotherofficer;
    @XmlElement(name = "Numerodecompte")
    protected String numerodecompte;
    @XmlElement(name = "ACLR1")
    protected String aclr1;
    @XmlElement(name = "gAC.LR2")
    protected ACCOUNTBCPOUVDIGITALPPHType.GACLR2 gaclr2;
    @XmlElement(name = "LGENERIQUEACC")
    protected String lgeneriqueacc;
    @XmlElement(name = "LPLURALACC")
    protected String lpluralacc;
    @XmlElement(name = "MATRICULEEXT")
    protected String matriculeext;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClient(String value) {
        this.client = value;
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
     * Gets the value of the intituleducompte1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntituleducompte1() {
        return intituleducompte1;
    }

    /**
     * Sets the value of the intituleducompte1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntituleducompte1(String value) {
        this.intituleducompte1 = value;
    }

    /**
     * Gets the value of the intituleducompte2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntituleducompte2() {
        return intituleducompte2;
    }

    /**
     * Sets the value of the intituleducompte2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntituleducompte2(String value) {
        this.intituleducompte2 = value;
    }

    /**
     * Gets the value of the devise property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevise() {
        return devise;
    }

    /**
     * Sets the value of the devise property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevise(String value) {
        this.devise = value;
    }

    /**
     * Gets the value of the gestionnaireducompte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGestionnaireducompte() {
        return gestionnaireducompte;
    }

    /**
     * Sets the value of the gestionnaireducompte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGestionnaireducompte(String value) {
        this.gestionnaireducompte = value;
    }

    /**
     * Gets the value of the gotherofficer property.
     * 
     * @return
     *     possible object is
     *     {@link ACCOUNTBCPOUVDIGITALPPHType.GOTHEROFFICER }
     *     
     */
    public ACCOUNTBCPOUVDIGITALPPHType.GOTHEROFFICER getGOTHEROFFICER() {
        return gotherofficer;
    }

    /**
     * Sets the value of the gotherofficer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACCOUNTBCPOUVDIGITALPPHType.GOTHEROFFICER }
     *     
     */
    public void setGOTHEROFFICER(ACCOUNTBCPOUVDIGITALPPHType.GOTHEROFFICER value) {
        this.gotherofficer = value;
    }

    /**
     * Gets the value of the numerodecompte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerodecompte() {
        return numerodecompte;
    }

    /**
     * Sets the value of the numerodecompte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerodecompte(String value) {
        this.numerodecompte = value;
    }

    /**
     * Gets the value of the aclr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACLR1() {
        return aclr1;
    }

    /**
     * Sets the value of the aclr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACLR1(String value) {
        this.aclr1 = value;
    }

    /**
     * Gets the value of the gaclr2 property.
     * 
     * @return
     *     possible object is
     *     {@link ACCOUNTBCPOUVDIGITALPPHType.GACLR2 }
     *     
     */
    public ACCOUNTBCPOUVDIGITALPPHType.GACLR2 getGACLR2() {
        return gaclr2;
    }

    /**
     * Sets the value of the gaclr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACCOUNTBCPOUVDIGITALPPHType.GACLR2 }
     *     
     */
    public void setGACLR2(ACCOUNTBCPOUVDIGITALPPHType.GACLR2 value) {
        this.gaclr2 = value;
    }

    /**
     * Gets the value of the lgeneriqueacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGENERIQUEACC() {
        return lgeneriqueacc;
    }

    /**
     * Sets the value of the lgeneriqueacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGENERIQUEACC(String value) {
        this.lgeneriqueacc = value;
    }

    /**
     * Gets the value of the lpluralacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLPLURALACC() {
        return lpluralacc;
    }

    /**
     * Sets the value of the lpluralacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLPLURALACC(String value) {
        this.lpluralacc = value;
    }

    /**
     * Gets the value of the matriculeext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATRICULEEXT() {
        return matriculeext;
    }

    /**
     * Sets the value of the matriculeext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATRICULEEXT(String value) {
        this.matriculeext = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ACLR2" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "aclr2"
    })
    public static class GACLR2 {

        @XmlElement(name = "ACLR2")
        protected List<String> aclr2;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the aclr2 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the aclr2 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACLR2().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getACLR2() {
            if (aclr2 == null) {
                aclr2 = new ArrayList<String>();
            }
            return this.aclr2;
        }

        /**
         * Gets the value of the g property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getG() {
            return g;
        }

        /**
         * Sets the value of the g property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setG(BigInteger value) {
            this.g = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Autreresponsable" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "autreresponsable"
    })
    public static class GOTHEROFFICER {

        @XmlElement(name = "Autreresponsable")
        protected List<String> autreresponsable;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the autreresponsable property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the autreresponsable property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAutreresponsable().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAutreresponsable() {
            if (autreresponsable == null) {
                autreresponsable = new ArrayList<String>();
            }
            return this.autreresponsable;
        }

        /**
         * Gets the value of the g property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getG() {
            return g;
        }

        /**
         * Sets the value of the g property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setG(BigInteger value) {
            this.g = value;
        }

    }

}
