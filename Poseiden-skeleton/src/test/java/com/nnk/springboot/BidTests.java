package com.nnk.springboot;

import com.nnk.springboot.domain.BidList;
import com.nnk.springboot.repositories.BidListRepository;
import com.nnk.springboot.services.BidListService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class BidTests {

	@Mock
	private BidListRepository bidListRepository;

	@InjectMocks 
	private BidListService bidListService;

	@Test
	public void findAllTest() {
		List<BidList> bidLists = List.of(new BidList(), new BidList());
		when(bidListRepository.findAll()).thenReturn(bidLists);
		assertEquals(2, bidListService.findAll().size());
		Mockito.verify(bidListRepository, Mockito.times(1)).findAll();
	}

	@Test
	public void saveTest() {
		BidList bidList = new BidList();
		when(bidListRepository.save(bidList)).thenReturn(bidList);
		assertEquals(bidList, bidListService.save(bidList));
		Mockito.verify(bidListRepository, Mockito.times(1)).save(bidList);
	}

	@Test
	public void findByIdTest() {
		BidList bidList = new BidList();
		bidList.setBidListId(1);
		when(bidListRepository.findById(1)).thenReturn(java.util.Optional.of(bidList));
		assertEquals(bidList, bidListService.findById(1));
		Mockito.verify(bidListRepository, Mockito.times(1)).findById(1);
	}

	@Test
	public void deleteTest() {
		BidList bidList = new BidList();
		bidList.setBidListId(1);
		bidListService.delete(1);
		Mockito.verify(bidListRepository, Mockito.times(1)).deleteById(1);
	}
	
}
