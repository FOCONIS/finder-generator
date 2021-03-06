package org.example.domain.query;

import io.ebean.EbeanServer;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.PTimestamp;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;
import org.example.domain.Contact;
import org.example.domain.query.assoc.QAssocContactNote;
import org.example.domain.query.assoc.QAssocCustomer;

/**
 * Query bean for Contact.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QContact extends TQRootBean<Contact,QContact> {

  private static final QContact _alias = new QContact(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QContact alias() {
    return _alias;
  }

  public PLong<QContact> id;
  public PLong<QContact> version;
  public PTimestamp<QContact> whenCreated;
  public PTimestamp<QContact> whenUpdated;
  public PString<QContact> firstName;
  public PString<QContact> lastName;
  public PString<QContact> email;
  public PString<QContact> phone;
  public QAssocCustomer<QContact> customer;
  public QAssocContactNote<QContact> notes;


  /**
   * Construct with a given EbeanServer.
   */
  public QContact(EbeanServer server) {
    super(Contact.class, server);
  }

  /**
   * Construct using the default EbeanServer.
   */
  public QContact() {
    super(Contact.class);
  }

  /**
   * Construct for Alias.
   */
  private QContact(boolean dummy) {
    super(dummy);
  }
}
