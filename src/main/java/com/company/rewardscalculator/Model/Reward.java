package com.company.rewardscalculator.Model;

import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;

public abstract class Reward {

	@JsonInclude  //Jackson serialization
	@Transient    //making this field not persistant
	protected Long points;

	public abstract Long getPoints();

}
