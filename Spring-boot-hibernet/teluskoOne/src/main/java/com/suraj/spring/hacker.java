package com.suraj.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component   //this is to be handled by spring
public class hacker {
	
	@Autowired   //this Pentester objects are created by spring`
	Pentesters pt;
	
	public void quote() {
		System.out.println("where there is no intelligence nation is dumb");
		pt.getVulnerablity();
	}

}
