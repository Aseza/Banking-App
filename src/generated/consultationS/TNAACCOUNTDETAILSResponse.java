//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.12 at 09:00:46 AM WEST 
//


package generated.consultationS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TNAACCOUNTDETAILSResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TNAACCOUNTDETAILSResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{T24WebServicesImpl}Status" minOccurs="0"/&gt;
 *         &lt;element name="TNAACCOUNTDETAILSType" type="{T24WebServicesImpl}TNAACCOUNTDETAILSType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TNAACCOUNTDETAILSResponse", propOrder = {
    "status",
    "tnaaccountdetailsType"
})
public class TNAACCOUNTDETAILSResponse {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "TNAACCOUNTDETAILSType")
    protected List<TNAACCOUNTDETAILSType> tnaaccountdetailsType;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the tnaaccountdetailsType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tnaaccountdetailsType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTNAACCOUNTDETAILSType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TNAACCOUNTDETAILSType }
     * 
     * 
     */
    public List<TNAACCOUNTDETAILSType> getTNAACCOUNTDETAILSType() {
        if (tnaaccountdetailsType == null) {
            tnaaccountdetailsType = new ArrayList<TNAACCOUNTDETAILSType>();
        }
        return this.tnaaccountdetailsType;
    }

}