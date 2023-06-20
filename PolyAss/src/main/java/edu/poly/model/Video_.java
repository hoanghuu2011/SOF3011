package edu.poly.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2023-03-24T14:38:39.968+0700")
@StaticMetamodel(Video.class)
public class Video_ {
	public static volatile SingularAttribute<Video, String> videoId;
	public static volatile SingularAttribute<Video, Boolean> active;
	public static volatile SingularAttribute<Video, String> description;
	public static volatile SingularAttribute<Video, String> poster;
	public static volatile SingularAttribute<Video, String> title;
	public static volatile SingularAttribute<Video, Integer> views;
	public static volatile ListAttribute<Video, Favorite> favorites;
	public static volatile ListAttribute<Video, Share> shares;
}
