package io.github.thatyane.videogamesurvey.exception;

import org.springframework.util.Assert;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class UniqueValueValidator implements ConstraintValidator<UniqueValue, Object> {
	
	private String domainAttribute;
	private Class<?> clazz;

	@PersistenceContext
	private EntityManager manager;

	@Override
	public void initialize(UniqueValue params) {
		domainAttribute = params.fieldName();
		clazz = params.domainClass();
	}

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		Query query = manager.createQuery("select 1 from " + clazz.getName() + " where " + domainAttribute + "=:value");
		query.setParameter("value", value);
		List<?> list = query.getResultList();
		Assert.state(list.size() <=1, "It was found more than one " + clazz + " with attribute " + domainAttribute + " = " + value);

		return list.isEmpty();
	}
}