
package ec.gob.sri.wsconsultaestablecimientos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.gob.sri.wsconsultaestablecimientos package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ExecuteResponse_QNAME = new QName("http://sri.gob.ec/wsConsultaEstablecimientos", "executeResponse");
    private final static QName _Execute_QNAME = new QName("http://sri.gob.ec/wsConsultaEstablecimientos", "execute");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.gob.sri.wsconsultaestablecimientos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Execute }
     * 
     */
    public Execute createExecute() {
        return new Execute();
    }

    /**
     * Create an instance of {@link ExecuteResponse }
     * 
     */
    public ExecuteResponse createExecuteResponse() {
        return new ExecuteResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sri.gob.ec/wsConsultaEstablecimientos", name = "executeResponse")
    public JAXBElement<ExecuteResponse> createExecuteResponse(ExecuteResponse value) {
        return new JAXBElement<ExecuteResponse>(_ExecuteResponse_QNAME, ExecuteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Execute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sri.gob.ec/wsConsultaEstablecimientos", name = "execute")
    public JAXBElement<Execute> createExecute(Execute value) {
        return new JAXBElement<Execute>(_Execute_QNAME, Execute.class, null, value);
    }

}
