package es.smartaccess.SealSignSQSService.wcf;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 4.0.4.1
//
// Created by Quasar Development at 21-10-2014
//
//---------------------------------------------------


import java.util.Hashtable;
import org.ksoap2.serialization.*;

public class Job extends AttributeContainer implements KvmSerializable,java.io.Serializable
{
    
    public JobReferenceEx jobReferenceEx;
    
    public ArrayOfSignatureClientBehaviour signatureClientBehaviour=new ArrayOfSignatureClientBehaviour();

    public Job ()
    {
    }

    public Job (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    
	    if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;


        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("jobReferenceEx"))
        {	
	        java.lang.Object j = soapObject.getProperty("jobReferenceEx");
	        this.jobReferenceEx = (JobReferenceEx)envelope.get(j,JobReferenceEx.class);
        }
        if (soapObject.hasProperty("signatureClientBehaviour"))
        {	
	        java.lang.Object j = soapObject.getProperty("signatureClientBehaviour");
	        this.signatureClientBehaviour = new ArrayOfSignatureClientBehaviour(j,envelope);
        }


    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return this.jobReferenceEx!=null?this.jobReferenceEx:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.signatureClientBehaviour!=null?this.signatureClientBehaviour:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 2;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = JobReferenceEx.class;
            info.name = "jobReferenceEx";
            info.namespace= "http://schemas.datacontract.org/2004/07/SealSignSQSTypes";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.VECTOR_CLASS;
            info.name = "signatureClientBehaviour";
            info.namespace= "http://schemas.datacontract.org/2004/07/SealSignSQSTypes";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

	@Override
	public String getInnerText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInnerText(String arg0) {
		// TODO Auto-generated method stub
		
	}

}
