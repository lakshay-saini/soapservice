package order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Officials on 27-10-2018.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "usercredentials", "data"
})
@XmlRootElement(name = "UpdateOrderStatusRequest")
public class UpdateOrderStatusRequest {

    @XmlElement(name = "usercredentials", required = true)
    protected Usercredentials usercredentials;

    @XmlElement(name = "data", required = true)
    protected Data data;


}
