package model;
// default package
// Generated Nov 24, 2014 3:39:25 PM by Hibernate Tools 4.3.1

import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;

import org.hibernate.annotations.Entity;

/**
 * UserDictionary generated by hbm2java
 */

public class UserDictionary implements java.io.Serializable {
	@EmbeddedId
	private UserDictionaryId id;
	private Dictionary dictionary;
	private Float maxScore;
	private Date bestTime;

	public UserDictionary() {
	}

	public UserDictionary(UserDictionaryId id, Dictionary dictionary) {
		this.id = id;
		this.dictionary = dictionary;
	}

	public UserDictionary(UserDictionaryId id, Dictionary dictionary,
			Float maxScore, Date bestTime) {
		this.id = id;
		this.dictionary = dictionary;
		this.maxScore = maxScore;
		this.bestTime = bestTime;
	}

	public UserDictionaryId getId() {
		return this.id;
	}

	public void setId(UserDictionaryId id) {
		this.id = id;
	}

	public Dictionary getDictionary() {
		return this.dictionary;
	}

	public void setDictionary(Dictionary dictionary) {
		this.dictionary = dictionary;
	}

	public Float getMaxScore() {
		return this.maxScore;
	}

	public void setMaxScore(Float maxScore) {
		this.maxScore = maxScore;
	}

	public Date getBestTime() {
		return this.bestTime;
	}

	public void setBestTime(Date bestTime) {
		this.bestTime = bestTime;
	}

}
