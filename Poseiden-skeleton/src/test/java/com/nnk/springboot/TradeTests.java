package com.nnk.springboot;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.nnk.springboot.domain.Trade;
import com.nnk.springboot.repositories.TradeRepository;
import com.nnk.springboot.services.TradeService;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class TradeTests {
	@Mock
	private TradeRepository tradeRepository;

	@InjectMocks
	private TradeService tradeService;

	@Test
	public void findAllTest() {
		tradeService.findAll();
		verify(tradeRepository, times(1)).findAll();
	}

	@Test
	public void saveTest() {
		Trade trade = new Trade();
		tradeService.save(trade);
		verify(tradeRepository, times(1)).save(trade);
	}

	@Test
	public void findByIdTest() {
		Trade trade = new Trade();
		trade.setId(1);
		when(tradeRepository.findById(1)).thenReturn(Optional.of(trade));
		tradeService.findById(1);
		verify(tradeRepository, times(1)).findById(1);
	}

	@Test
	public void deleteTest() {
		Trade trade = new Trade();
		trade.setId(1);
		tradeService.delete(1);
		verify(tradeRepository, times(1)).deleteById(1);
	}
}