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

public class STUButtonDefinition extends AttributeContainer implements KvmSerializable,java.io.Serializable
{
    
    public Integer x1;
    
    public Integer x2;
    
    public Integer y1;
    
    public Integer y2;

    public STUButtonDefinition ()
    {
    }

    public STUButtonDefinition (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    
	    if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;


        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("x1"))
        {	
	        java.lang.Object obj = soapObject.getProperty("x1");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.x1 = Integer.parseInt(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof Integer){
                this.x1 = (Integer)obj;
            }    
        }
        if (soapObject.hasProperty("x2"))
        {	
	        java.lang.Object obj = soapObject.getProperty("x2");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.x2 = Integer.parseInt(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof Integer){
                this.x2 = (Integer)obj;
            }    
        }
        if (soapObject.hasProperty("y1"))
        {	
	        java.lang.Object obj = soapObject.getProperty("y1");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.y1 = Integer.parseInt(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof Integer){
                this.y1 = (Integer)obj;
            }    
        }
        if (soapObject.hasProperty("y2"))
        {	
	        java.lang.Object obj = soapObject.getProperty("y2");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.y2 = Integer.parseInt(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof Integer){
                this.y2 = (Integer)obj;
            }    
        }


    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return this.x1!=null?this.x1:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.x2!=null?this.x2:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.y1!=null?this.y1:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.y2!=null?this.y2:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 4;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "x1";
            info.namespace= "http://schemas.datacontract.org/2004/07/SealSignSQSTypes";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "x2";
            info.namespace= "http://schemas.datacontract.org/2004/07/SealSignSQSTypes";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "y1";
            info.namespace= "http://schemas.datacontract.org/2004/07/SealSignSQSTypes";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "y2";
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