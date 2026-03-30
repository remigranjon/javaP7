package com.nnk.springboot;

import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.nnk.springboot.domain.CurvePoint;
import com.nnk.springboot.repositories.CurvePointRepository;
import com.nnk.springboot.services.CurveService;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class CurvePointTests {
	@Mock
	private CurvePointRepository curvePointRepository;

	@InjectMocks
	private CurveService curveService;

	@Test
	public void findAllTest() {
		curveService.findAll();
		Mockito.verify(curvePointRepository, Mockito.times(1)).findAll();
	}

	@Test
	public void saveTest() {
		curveService.save(null);
		Mockito.verify(curvePointRepository, Mockito.times(1)).save(null);
	}

	@Test
	public void findByIdTest() {
		CurvePoint curvePoint = new CurvePoint();
		curvePoint.setId(1);
		when(curvePointRepository.findById(1)).thenReturn(Optional.of(curvePoint));
		curveService.findById(1);
		Mockito.verify(curvePointRepository, Mockito.times(1)).findById(1);
	}

	@Test
	public void deleteTest() {
		CurvePoint curvePoint = new CurvePoint();
		curvePoint.setId(1);
		curveService.delete(1);
		Mockito.verify(curvePointRepository, Mockito.times(1)).deleteById(1);
	}

}