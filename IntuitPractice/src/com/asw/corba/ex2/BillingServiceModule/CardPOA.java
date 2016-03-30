package com.asw.corba.ex2.BillingServiceModule;


/**
* com/asw/corba/ex2/BillingServiceModule/CardPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.1"
* from com/asw/corba/ex2/BillingService.idl
* 16 ���� 2006 �. 15:01:11 MSD
*/

public abstract class CardPOA extends org.omg.PortableServer.Servant
 implements com.asw.corba.ex2.BillingServiceModule.CardOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("addMoney", new java.lang.Integer (0));
    _methods.put ("subMoney", new java.lang.Integer (1));
    _methods.put ("getBalance", new java.lang.Integer (2));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // BillingServiceModule/Card/addMoney
       {
         double money = in.read_double ();
         this.addMoney (money);
         out = $rh.createReply();
         break;
       }

       case 1:  // BillingServiceModule/Card/subMoney
       {
         double money = in.read_double ();
         this.subMoney (money);
         out = $rh.createReply();
         break;
       }

       case 2:  // BillingServiceModule/Card/getBalance
       {
         double $result = (double)0;
         $result = this.getBalance ();
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:BillingServiceModule/Card:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Card _this() 
  {
    return CardHelper.narrow(
    super._this_object());
  }

  public Card _this(org.omg.CORBA.ORB orb) 
  {
    return CardHelper.narrow(
    super._this_object(orb));
  }


} // class CardPOA
