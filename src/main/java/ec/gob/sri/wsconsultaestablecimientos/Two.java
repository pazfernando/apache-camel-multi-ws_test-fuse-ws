package ec.gob.sri.wsconsultaestablecimientos;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.0.redhat-610379
 * 2014-09-04T17:27:16.397-05:00
 * Generated source version: 2.7.0.redhat-610379
 * 
 */
@WebService(targetNamespace = "http://sri.gob.ec/wsConsultaEstablecimientos", name = "Two")
@XmlSeeAlso({ObjectFactory.class})
public interface Two {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "execute", targetNamespace = "http://sri.gob.ec/wsConsultaEstablecimientos", className = "ec.gob.sri.wsconsultaestablecimientos.Execute")
    @WebMethod
    @ResponseWrapper(localName = "executeResponse", targetNamespace = "http://sri.gob.ec/wsConsultaEstablecimientos", className = "ec.gob.sri.wsconsultaestablecimientos.ExecuteResponse")
    public java.util.List<java.lang.String> execute(
        @WebParam(name = "B", targetNamespace = "")
        java.lang.String b,
        @WebParam(name = "X", targetNamespace = "")
        java.lang.String x,
        @WebParam(name = "Y", targetNamespace = "")
        java.lang.String y
    );
}