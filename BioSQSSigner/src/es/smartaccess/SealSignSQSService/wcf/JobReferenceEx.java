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

public class JobReferenceEx extends AttributeContainer implements KvmSerializable,java.io.Serializable
{
    
    public String JobMetadata;
    
    public byte[] blob;
    
    public String computerName;
    
    public Integer id;
    
    public Integer idQueue;
    
    public String jobTitle;
    
    public Integer originalJobId;
    
    public String owner;
    
    public Boolean processed;
    
    public String queueName;
    
    public org.joda.time.DateTime time;

    public JobReferenceEx ()
    {
    }

    public JobReferenceEx (java.lang.Object paramObj,ExtendedSoapSerializationEnvelope envelope)
    {
	    
	    if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;


        SoapObject soapObject=(SoapObject)inObj;  
        if (soapObject.hasProperty("JobMetadata"))
        {	
	        java.lang.Object obj = soapObject.getProperty("JobMetadata");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.JobMetadata = j.toString();
                }
	        }
	        else if (obj!= null && obj instanceof String){
                this.JobMetadata = (String)obj;
            }    
        }
        if (soapObject.hasProperty("blob"))
        {	
            java.lang.Object j = soapObject.getProperty("blob");
            this.blob = Helper.getBinary(j,false);
        }
        if (soapObject.hasProperty("computerName"))
        {	
	        java.lang.Object obj = soapObject.getProperty("computerName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.computerName = j.toString();
                }
	        }
	        else if (obj!= null && obj instanceof String){
                this.computerName = (String)obj;
            }    
        }
        if (soapObject.hasProperty("id"))
        {	
	        java.lang.Object obj = soapObject.getProperty("id");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.id = Integer.parseInt(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof Integer){
                this.id = (Integer)obj;
            }    
        }
        if (soapObject.hasProperty("idQueue"))
        {	
	        java.lang.Object obj = soapObject.getProperty("idQueue");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.idQueue = Integer.parseInt(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof Integer){
                this.idQueue = (Integer)obj;
            }    
        }
        if (soapObject.hasProperty("jobTitle"))
        {	
	        java.lang.Object obj = soapObject.getProperty("jobTitle");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.jobTitle = j.toString();
                }
	        }
	        else if (obj!= null && obj instanceof String){
                this.jobTitle = (String)obj;
            }    
        }
        if (soapObject.hasProperty("originalJobId"))
        {	
	        java.lang.Object obj = soapObject.getProperty("originalJobId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.originalJobId = Integer.parseInt(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof Integer){
                this.originalJobId = (Integer)obj;
            }    
        }
        if (soapObject.hasProperty("owner"))
        {	
	        java.lang.Object obj = soapObject.getProperty("owner");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.owner = j.toString();
                }
	        }
	        else if (obj!= null && obj instanceof String){
                this.owner = (String)obj;
            }    
        }
        if (soapObject.hasProperty("processed"))
        {	
	        java.lang.Object obj = soapObject.getProperty("processed");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.processed = new Boolean(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof Boolean){
                this.processed = (Boolean)obj;
            }    
        }
        if (soapObject.hasProperty("queueName"))
        {	
	        java.lang.Object obj = soapObject.getProperty("queueName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.queueName = j.toString();
                }
	        }
	        else if (obj!= null && obj instanceof String){
                this.queueName = (String)obj;
            }    
        }
        if (soapObject.hasProperty("time"))
        {	
	        java.lang.Object obj = soapObject.getProperty("time");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class))
            {
                SoapPrimitive j =(SoapPrimitive) obj;
                if(j.toString()!=null)
                {
                    this.time = Helper.ConvertFromWebService(j.toString());
                }
	        }
	        else if (obj!= null && obj instanceof org.joda.time.DateTime){
                this.time = (org.joda.time.DateTime)obj;
            }    
        }


    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return this.JobMetadata!=null?this.JobMetadata:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.blob!=null?org.kobjects.base64.Base64.encode(this.blob):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.computerName!=null?this.computerName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.id!=null?this.id:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.idQueue!=null?this.idQueue:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.jobTitle!=null?this.jobTitle:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.originalJobId!=null?this.originalJobId:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==7)
        {
            return this.owner!=null?this.owner:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==8)
        {
            return this.processed!=null?this.processed:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==9)
        {
            return this.queueName!=null?this.queueName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==10)
        {
            return this.time!=null?this.time:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 11;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "JobMetadata";
            info.namespace= "http://schemas.datacontract.org/2004/07/SealSignSQSTypes";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "blob";
            info.namespace= "http://schemas.datacontract.org/2004/07/SealSignSQSTypes";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "computerName";
            info.namespace= "http://schemas.datacontract.org/2004/07/SealSignSQSTypes";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "id";
            info.namespace= "http://schemas.datacontract.org/2004/07/SealSignSQSTypes";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "idQueue";
            info.namespace= "http://schemas.datacontract.org/2004/07/SealSignSQSTypes";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "jobTitle";
            info.namespace= "http://schemas.datacontract.org/2004/07/SealSignSQSTypes";
        }
        if(propertyIndex==6)
        {
            info.type = PropertyInfo.INTEGER_CLASS;
            info.name = "originalJobId";
            info.namespace= "http://schemas.datacontract.org/2004/07/SealSignSQSTypes";
        }
        if(propertyIndex==7)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "owner";
            info.namespace= "http://schemas.datacontract.org/2004/07/SealSignSQSTypes";
        }
        if(propertyIndex==8)
        {
            info.type = PropertyInfo.BOOLEAN_CLASS;
            info.name = "processed";
            info.namespace= "http://schemas.datacontract.org/2004/07/SealSignSQSTypes";
        }
        if(propertyIndex==9)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "queueName";
            info.namespace= "http://schemas.datacontract.org/2004/07/SealSignSQSTypes";
        }
        if(propertyIndex==10)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "time";
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
