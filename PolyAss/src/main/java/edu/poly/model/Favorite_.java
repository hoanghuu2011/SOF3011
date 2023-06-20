package edu.poly.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2023-03-24T14:38:39.961+0700")
@StaticMetamodel(Favorite.class)
public class Favorite_ {
	public static volatile SingularAttribute<Favorite, Integer> favoriteld;
	public static volatile SingularAttribute<Favorite, User> user;
	public static volatile SingularAttribute<Favorite, Video> video;
	public static volatile SingularAttribute<Favorite, Date> likedDate;
}
