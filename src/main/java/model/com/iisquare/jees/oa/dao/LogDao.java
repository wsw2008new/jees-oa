package com.iisquare.jees.oa.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.iisquare.jees.framework.model.DaoBase;
import com.iisquare.jees.oa.domain.Log;

@Repository
@Scope("prototype")
public class LogDao extends DaoBase<Log> {
	
	public LogDao() {
		super(Log.class);
	}
}
