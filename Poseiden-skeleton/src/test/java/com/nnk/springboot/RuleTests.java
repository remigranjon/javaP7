package com.nnk.springboot;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.apache.tomcat.util.digester.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.nnk.springboot.domain.RuleName;
import com.nnk.springboot.repositories.RuleNameRepository;
import com.nnk.springboot.services.RuleNameService;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class RuleTests {
	@Mock
	private RuleNameRepository ruleNameRepository;

	@InjectMocks
	private RuleNameService ruleNameService;

	@Test
	public void findAllTest() {
		ruleNameService.findAll();
		verify(ruleNameRepository, times(1)).findAll();
	}

	@Test
	public void saveTest() {
		RuleName ruleName = new RuleName();
		ruleNameService.save(ruleName);
		verify(ruleNameRepository, times(1)).save(ruleName);
	}

	@Test
	public void findByIdTest() {
		RuleName ruleName = new RuleName();
		ruleName.setId(1);
		when(ruleNameRepository.findById(1)).thenReturn(Optional.of(ruleName));
		ruleNameService.findById(1);
		verify(ruleNameRepository, times(1)).findById(1);
	}

	@Test
	public void deleteTest() {
		RuleName ruleName = new RuleName();
		ruleName.setId(1);
		ruleNameService.delete(1);
		verify(ruleNameRepository, times(1)).deleteById(1);
	}
}


