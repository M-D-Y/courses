package com.asw.corba.ex1.BillingServiceModule;


/**
* com/asw/corba/ex1/BillingServiceModule/BillingServiceOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.1"
* from com/asw/corba/ex1/BillingService.idl
* 16 ���� 2006 �. 14:12:21 MSD
*/

public interface BillingServiceOperations 
{
  void addNewCard (String personName, String card);
  void addMoney (String card, double money);
  void subMoney (String card, double money);
  double getCardBalance (String card);
} // interface BillingServiceOperations
