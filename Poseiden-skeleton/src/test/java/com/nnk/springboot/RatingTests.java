package com.nnk.springboot;

import com.nnk.springboot.domain.Rating;
import com.nnk.springboot.repositories.RatingRepository;
import com.nnk.springboot.services.RatingService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class RatingTests {

	@Mock
	private RatingRepository ratingRepository;

	@InjectMocks
	private RatingService ratingService;

	@Test
	public void findAllTest() {
		List<Rating> ratings = List.of(new Rating(), new Rating());
		when(ratingRepository.findAll()).thenReturn(ratings);
		ratingService.findAll();
		verify(ratingRepository, times(1)).findAll();
	}

	@Test
	public void saveTest() {
		Rating rating = new Rating();
		when(ratingRepository.save(rating)).thenReturn(rating);
		ratingService.save(rating);
		verify(ratingRepository, times(1)).save(rating);
	}

	@Test
	public void findByIdTest() {
		Rating rating = new Rating();
		rating.setId(1);
		when(ratingRepository.findById(1)).thenReturn(java.util.Optional.of(rating));
		ratingService.findById(1);
		verify(ratingRepository, times(1)).findById(1);
	}

	@Test
	public void deleteTest() {
		Rating rating = new Rating();
		rating.setId(1);
		ratingService.delete(1);
		verify(ratingRepository, times(1)).deleteById(1);
	}
}
