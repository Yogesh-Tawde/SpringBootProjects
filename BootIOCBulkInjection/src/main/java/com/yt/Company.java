package com.yt;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("company")
@Data
@ConfigurationProperties(prefix="org.yt")
public class Company 
{
	private String name;
	private String addrs;
	private Long pincode;
	private Long contact;

}
