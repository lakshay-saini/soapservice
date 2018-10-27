package order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Officials on 27-10-2018.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "_return"
})
@XmlRootElement(name = "GetUpdateOrderStatusRequest")
public class UpdateOrderStatusResponse {

    protected String _return;

    public String get_return() {
        return _return;
    }


    public void set_return(String _return) {
        this._return = _return;
    }
}
