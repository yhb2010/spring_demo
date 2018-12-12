package com.chapter3.version4.conditional.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Profile;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

public class WindowsCondition2 implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		if(context.getEnvironment() != null){
			MultiValueMap<String, Object> attrs = metadata.getAllAnnotationAttributes(Profile.class.getName());
			if(attrs != null){
				for(Object value : attrs.get("values")){
					if(context.getEnvironment().acceptsProfiles(((String[])value))){
						return true;
					}
				}
				return false;
			}
		}
		return true;
	}

}
