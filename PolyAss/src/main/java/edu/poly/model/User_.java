package edu.poly.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2023-03-24T14:38:39.965+0700")
@StaticMetamodel(User.class)
public class User_ {
	public static volatile SingularAttribute<User, String> username;
	public static volatile SingularAttribute<User, Boolean> admin;
	public static volatile SingularAttribute<User, String> email;
	public static volatile SingularAttribute<User, String> fullname;
	public static volatile ListAttribute<User, Favorite> favorites;
	public static volatile ListAttribute<User, Share> shares;
}
