package edu.poly.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2023-03-24T14:38:39.963+0700")
@StaticMetamodel(Share.class)
public class Share_ {
	public static volatile SingularAttribute<Share, Integer> shareId;
	public static volatile SingularAttribute<Share, String> emails;
	public static volatile SingularAttribute<Share, Date> shareDate;
	public static volatile SingularAttribute<Share, User> user;
	public static volatile SingularAttribute<Share, Video> video;
}
