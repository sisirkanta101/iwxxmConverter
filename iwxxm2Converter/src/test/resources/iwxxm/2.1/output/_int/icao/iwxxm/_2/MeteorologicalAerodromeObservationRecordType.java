//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.27 at 12:41:52 PM MSK 
//


package _int.icao.iwxxm._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractGMLType;
import net.opengis.gml.v_3_2_1.MeasureType;


/**
 * <p>Java class for MeteorologicalAerodromeObservationRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeteorologicalAerodromeObservationRecordType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGMLType">
 *       &lt;sequence>
 *         &lt;element name="airTemperature" type="{http://www.opengis.net/gml/3.2}MeasureType"/>
 *         &lt;element name="dewpointTemperature" type="{http://www.opengis.net/gml/3.2}MeasureType"/>
 *         &lt;element name="qnh" type="{http://www.opengis.net/gml/3.2}MeasureType"/>
 *         &lt;element name="surfaceWind" type="{http://icao.int/iwxxm/2.1}AerodromeSurfaceWindPropertyType"/>
 *         &lt;element name="visibility" type="{http://icao.int/iwxxm/2.1}AerodromeHorizontalVisibilityPropertyType" minOccurs="0"/>
 *         &lt;element name="rvr" type="{http://icao.int/iwxxm/2.1}AerodromeRunwayVisualRangePropertyType" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="presentWeather" type="{http://icao.int/iwxxm/2.1}AerodromePresentWeatherType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="cloud" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://icao.int/iwxxm/2.1}AerodromeObservedCloudsPropertyType">
 *                 &lt;attribute name="nilReason" type="{http://www.opengis.net/gml/3.2}NilReasonType" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="recentWeather" type="{http://icao.int/iwxxm/2.1}AerodromeRecentWeatherType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="windShear" type="{http://icao.int/iwxxm/2.1}AerodromeWindShearPropertyType" minOccurs="0"/>
 *         &lt;element name="seaState" type="{http://icao.int/iwxxm/2.1}AerodromeSeaStatePropertyType" minOccurs="0"/>
 *         &lt;element name="runwayState" type="{http://icao.int/iwxxm/2.1}AerodromeRunwayStatePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="cloudAndVisibilityOK" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeteorologicalAerodromeObservationRecordType", propOrder = {
    "airTemperature",
    "dewpointTemperature",
    "qnh",
    "surfaceWind",
    "visibility",
    "rvr",
    "presentWeather",
    "cloud",
    "recentWeather",
    "windShear",
    "seaState",
    "runwayState",
    "extension"
})
public class MeteorologicalAerodromeObservationRecordType
    extends AbstractGMLType
{

    @XmlElement(required = true)
    protected MeasureType airTemperature;
    @XmlElement(required = true)
    protected MeasureType dewpointTemperature;
    @XmlElement(required = true)
    protected MeasureType qnh;
    @XmlElement(required = true)
    protected AerodromeSurfaceWindPropertyType surfaceWind;
    protected AerodromeHorizontalVisibilityPropertyType visibility;
    protected List<AerodromeRunwayVisualRangePropertyType> rvr;
    @XmlElement(nillable = true)
    protected List<AerodromePresentWeatherType> presentWeather;
    @XmlElementRef(name = "cloud", namespace = "http://icao.int/iwxxm/2.1", type = JAXBElement.class, required = false)
    protected JAXBElement<MeteorologicalAerodromeObservationRecordType.Cloud> cloud;
    protected List<AerodromeRecentWeatherType> recentWeather;
    protected AerodromeWindShearPropertyType windShear;
    protected AerodromeSeaStatePropertyType seaState;
    protected List<AerodromeRunwayStatePropertyType> runwayState;
    protected List<Object> extension;
    @XmlAttribute(name = "cloudAndVisibilityOK", required = true)
    protected boolean cloudAndVisibilityOK;

    /**
     * Gets the value of the airTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAirTemperature() {
        return airTemperature;
    }

    /**
     * Sets the value of the airTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAirTemperature(MeasureType value) {
        this.airTemperature = value;
    }

    public boolean isSetAirTemperature() {
        return (this.airTemperature!= null);
    }

    /**
     * Gets the value of the dewpointTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getDewpointTemperature() {
        return dewpointTemperature;
    }

    /**
     * Sets the value of the dewpointTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setDewpointTemperature(MeasureType value) {
        this.dewpointTemperature = value;
    }

    public boolean isSetDewpointTemperature() {
        return (this.dewpointTemperature!= null);
    }

    /**
     * Gets the value of the qnh property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getQnh() {
        return qnh;
    }

    /**
     * Sets the value of the qnh property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setQnh(MeasureType value) {
        this.qnh = value;
    }

    public boolean isSetQnh() {
        return (this.qnh!= null);
    }

    /**
     * Gets the value of the surfaceWind property.
     * 
     * @return
     *     possible object is
     *     {@link AerodromeSurfaceWindPropertyType }
     *     
     */
    public AerodromeSurfaceWindPropertyType getSurfaceWind() {
        return surfaceWind;
    }

    /**
     * Sets the value of the surfaceWind property.
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeSurfaceWindPropertyType }
     *     
     */
    public void setSurfaceWind(AerodromeSurfaceWindPropertyType value) {
        this.surfaceWind = value;
    }

    public boolean isSetSurfaceWind() {
        return (this.surfaceWind!= null);
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link AerodromeHorizontalVisibilityPropertyType }
     *     
     */
    public AerodromeHorizontalVisibilityPropertyType getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeHorizontalVisibilityPropertyType }
     *     
     */
    public void setVisibility(AerodromeHorizontalVisibilityPropertyType value) {
        this.visibility = value;
    }

    public boolean isSetVisibility() {
        return (this.visibility!= null);
    }

    /**
     * Gets the value of the rvr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rvr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRvr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AerodromeRunwayVisualRangePropertyType }
     * 
     * 
     */
    public List<AerodromeRunwayVisualRangePropertyType> getRvr() {
        if (rvr == null) {
            rvr = new ArrayList<AerodromeRunwayVisualRangePropertyType>();
        }
        return this.rvr;
    }

    public boolean isSetRvr() {
        return ((this.rvr!= null)&&(!this.rvr.isEmpty()));
    }

    public void unsetRvr() {
        this.rvr = null;
    }

    /**
     * Gets the value of the presentWeather property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the presentWeather property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresentWeather().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AerodromePresentWeatherType }
     * 
     * 
     */
    public List<AerodromePresentWeatherType> getPresentWeather() {
        if (presentWeather == null) {
            presentWeather = new ArrayList<AerodromePresentWeatherType>();
        }
        return this.presentWeather;
    }

    public boolean isSetPresentWeather() {
        return ((this.presentWeather!= null)&&(!this.presentWeather.isEmpty()));
    }

    public void unsetPresentWeather() {
        this.presentWeather = null;
    }

    /**
     * Gets the value of the cloud property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeteorologicalAerodromeObservationRecordType.Cloud }{@code >}
     *     
     */
    public JAXBElement<MeteorologicalAerodromeObservationRecordType.Cloud> getCloud() {
        return cloud;
    }

    /**
     * Sets the value of the cloud property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeteorologicalAerodromeObservationRecordType.Cloud }{@code >}
     *     
     */
    public void setCloud(JAXBElement<MeteorologicalAerodromeObservationRecordType.Cloud> value) {
        this.cloud = value;
    }

    public boolean isSetCloud() {
        return (this.cloud!= null);
    }

    /**
     * Gets the value of the recentWeather property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recentWeather property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecentWeather().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AerodromeRecentWeatherType }
     * 
     * 
     */
    public List<AerodromeRecentWeatherType> getRecentWeather() {
        if (recentWeather == null) {
            recentWeather = new ArrayList<AerodromeRecentWeatherType>();
        }
        return this.recentWeather;
    }

    public boolean isSetRecentWeather() {
        return ((this.recentWeather!= null)&&(!this.recentWeather.isEmpty()));
    }

    public void unsetRecentWeather() {
        this.recentWeather = null;
    }

    /**
     * Gets the value of the windShear property.
     * 
     * @return
     *     possible object is
     *     {@link AerodromeWindShearPropertyType }
     *     
     */
    public AerodromeWindShearPropertyType getWindShear() {
        return windShear;
    }

    /**
     * Sets the value of the windShear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeWindShearPropertyType }
     *     
     */
    public void setWindShear(AerodromeWindShearPropertyType value) {
        this.windShear = value;
    }

    public boolean isSetWindShear() {
        return (this.windShear!= null);
    }

    /**
     * Gets the value of the seaState property.
     * 
     * @return
     *     possible object is
     *     {@link AerodromeSeaStatePropertyType }
     *     
     */
    public AerodromeSeaStatePropertyType getSeaState() {
        return seaState;
    }

    /**
     * Sets the value of the seaState property.
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeSeaStatePropertyType }
     *     
     */
    public void setSeaState(AerodromeSeaStatePropertyType value) {
        this.seaState = value;
    }

    public boolean isSetSeaState() {
        return (this.seaState!= null);
    }

    /**
     * Gets the value of the runwayState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the runwayState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRunwayState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AerodromeRunwayStatePropertyType }
     * 
     * 
     */
    public List<AerodromeRunwayStatePropertyType> getRunwayState() {
        if (runwayState == null) {
            runwayState = new ArrayList<AerodromeRunwayStatePropertyType>();
        }
        return this.runwayState;
    }

    public boolean isSetRunwayState() {
        return ((this.runwayState!= null)&&(!this.runwayState.isEmpty()));
    }

    public void unsetRunwayState() {
        this.runwayState = null;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Object>();
        }
        return this.extension;
    }

    public boolean isSetExtension() {
        return ((this.extension!= null)&&(!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
    }

    /**
     * Gets the value of the cloudAndVisibilityOK property.
     * 
     */
    public boolean isCloudAndVisibilityOK() {
        return cloudAndVisibilityOK;
    }

    /**
     * Sets the value of the cloudAndVisibilityOK property.
     * 
     */
    public void setCloudAndVisibilityOK(boolean value) {
        this.cloudAndVisibilityOK = value;
    }

    public boolean isSetCloudAndVisibilityOK() {
        return true;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://icao.int/iwxxm/2.1}AerodromeObservedCloudsPropertyType">
     *       &lt;attribute name="nilReason" type="{http://www.opengis.net/gml/3.2}NilReasonType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Cloud
        extends AerodromeObservedCloudsPropertyType
    {

        @XmlAttribute(name = "nilReason")
        protected List<String> nilReason;

        /**
         * Gets the value of the nilReason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nilReason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNilReason().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNilReason() {
            if (nilReason == null) {
                nilReason = new ArrayList<String>();
            }
            return this.nilReason;
        }

        public boolean isSetNilReason() {
            return ((this.nilReason!= null)&&(!this.nilReason.isEmpty()));
        }

        public void unsetNilReason() {
            this.nilReason = null;
        }

    }

}
