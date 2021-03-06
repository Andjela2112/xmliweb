package com.megatravel.agent.model;

import java.util.Comparator;

import com.megatravel.agent.dto.PorukaDTO;

public class PorukaComparator implements Comparator<PorukaDTO> {

	@Override
	public int compare(PorukaDTO o1, PorukaDTO o2) {
		return o1.getVreme().compareTo(o2.getVreme());
	}
	
}
