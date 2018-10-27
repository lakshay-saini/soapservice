//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.27 at 10:42:42 PM IST 
//


package order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for data complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="data">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="obb_ref_num" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="order_status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="installation_date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="power_level_at_cap" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="power_level_at_fdh" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ont_make" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ont_serialno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="handset_make" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="handset_serialno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fdn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="problem_category" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="problem_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="consent_signature_file_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="consent_signature_file" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="evidence_photo_file_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="evidence_photo_file" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="qhse_form_file_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="qhse_form_file" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="completion_sheet_file_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="completion_sheet_file" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "data", propOrder = {

})
@XmlRootElement(name="Data")
public class Data {

    @XmlElement(name = "obb_ref_num", required = true)
    protected String obbRefNum;
    @XmlElement(name = "order_status", required = true)
    protected String orderStatus;
    @XmlElement(name = "installation_date", required = true)
    protected String installationDate;
    @XmlElement(name = "power_level_at_cap", required = true)
    protected String powerLevelAtCap;
    @XmlElement(name = "power_level_at_fdh", required = true)
    protected String powerLevelAtFdh;
    @XmlElement(name = "ont_make", required = true)
    protected String ontMake;
    @XmlElement(name = "ont_serialno", required = true)
    protected String ontSerialno;
    @XmlElement(name = "handset_make", required = true)
    protected String handsetMake;
    @XmlElement(name = "handset_serialno", required = true)
    protected String handsetSerialno;
    @XmlElement(required = true)
    protected String fdn;
    @XmlElement(name = "problem_category", required = true)
    protected String problemCategory;
    @XmlElement(name = "problem_description", required = true)
    protected String problemDescription;
    @XmlElement(name = "consent_signature_file_name", required = true)
    protected String consentSignatureFileName;
    @XmlElement(name = "consent_signature_file", required = true)
    protected byte[] consentSignatureFile;
    @XmlElement(name = "evidence_photo_file_name", required = true)
    protected String evidencePhotoFileName;
    @XmlElement(name = "evidence_photo_file", required = true)
    protected byte[] evidencePhotoFile;
    @XmlElement(name = "qhse_form_file_name", required = true)
    protected String qhseFormFileName;
    @XmlElement(name = "qhse_form_file", required = true)
    protected byte[] qhseFormFile;
    @XmlElement(name = "completion_sheet_file_name", required = true)
    protected String completionSheetFileName;
    @XmlElement(name = "completion_sheet_file", required = true)
    protected byte[] completionSheetFile;

    /**
     * Gets the value of the obbRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObbRefNum() {
        return obbRefNum;
    }

    /**
     * Sets the value of the obbRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObbRefNum(String value) {
        this.obbRefNum = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatus(String value) {
        this.orderStatus = value;
    }

    /**
     * Gets the value of the installationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallationDate() {
        return installationDate;
    }

    /**
     * Sets the value of the installationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallationDate(String value) {
        this.installationDate = value;
    }

    /**
     * Gets the value of the powerLevelAtCap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerLevelAtCap() {
        return powerLevelAtCap;
    }

    /**
     * Sets the value of the powerLevelAtCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerLevelAtCap(String value) {
        this.powerLevelAtCap = value;
    }

    /**
     * Gets the value of the powerLevelAtFdh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerLevelAtFdh() {
        return powerLevelAtFdh;
    }

    /**
     * Sets the value of the powerLevelAtFdh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerLevelAtFdh(String value) {
        this.powerLevelAtFdh = value;
    }

    /**
     * Gets the value of the ontMake property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOntMake() {
        return ontMake;
    }

    /**
     * Sets the value of the ontMake property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOntMake(String value) {
        this.ontMake = value;
    }

    /**
     * Gets the value of the ontSerialno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOntSerialno() {
        return ontSerialno;
    }

    /**
     * Sets the value of the ontSerialno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOntSerialno(String value) {
        this.ontSerialno = value;
    }

    /**
     * Gets the value of the handsetMake property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandsetMake() {
        return handsetMake;
    }

    /**
     * Sets the value of the handsetMake property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandsetMake(String value) {
        this.handsetMake = value;
    }

    /**
     * Gets the value of the handsetSerialno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandsetSerialno() {
        return handsetSerialno;
    }

    /**
     * Sets the value of the handsetSerialno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandsetSerialno(String value) {
        this.handsetSerialno = value;
    }

    /**
     * Gets the value of the fdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdn() {
        return fdn;
    }

    /**
     * Sets the value of the fdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdn(String value) {
        this.fdn = value;
    }

    /**
     * Gets the value of the problemCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblemCategory() {
        return problemCategory;
    }

    /**
     * Sets the value of the problemCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblemCategory(String value) {
        this.problemCategory = value;
    }

    /**
     * Gets the value of the problemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblemDescription() {
        return problemDescription;
    }

    /**
     * Sets the value of the problemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblemDescription(String value) {
        this.problemDescription = value;
    }

    /**
     * Gets the value of the consentSignatureFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsentSignatureFileName() {
        return consentSignatureFileName;
    }

    /**
     * Sets the value of the consentSignatureFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsentSignatureFileName(String value) {
        this.consentSignatureFileName = value;
    }

    /**
     * Gets the value of the consentSignatureFile property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getConsentSignatureFile() {
        return consentSignatureFile;
    }

    /**
     * Sets the value of the consentSignatureFile property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setConsentSignatureFile(byte[] value) {
        this.consentSignatureFile = value;
    }

    /**
     * Gets the value of the evidencePhotoFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvidencePhotoFileName() {
        return evidencePhotoFileName;
    }

    /**
     * Sets the value of the evidencePhotoFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvidencePhotoFileName(String value) {
        this.evidencePhotoFileName = value;
    }

    /**
     * Gets the value of the evidencePhotoFile property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEvidencePhotoFile() {
        return evidencePhotoFile;
    }

    /**
     * Sets the value of the evidencePhotoFile property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEvidencePhotoFile(byte[] value) {
        this.evidencePhotoFile = value;
    }

    /**
     * Gets the value of the qhseFormFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQhseFormFileName() {
        return qhseFormFileName;
    }

    /**
     * Sets the value of the qhseFormFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQhseFormFileName(String value) {
        this.qhseFormFileName = value;
    }

    /**
     * Gets the value of the qhseFormFile property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getQhseFormFile() {
        return qhseFormFile;
    }

    /**
     * Sets the value of the qhseFormFile property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setQhseFormFile(byte[] value) {
        this.qhseFormFile = value;
    }

    /**
     * Gets the value of the completionSheetFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletionSheetFileName() {
        return completionSheetFileName;
    }

    /**
     * Sets the value of the completionSheetFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletionSheetFileName(String value) {
        this.completionSheetFileName = value;
    }

    /**
     * Gets the value of the completionSheetFile property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCompletionSheetFile() {
        return completionSheetFile;
    }

    /**
     * Sets the value of the completionSheetFile property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCompletionSheetFile(byte[] value) {
        this.completionSheetFile = value;
    }

}
