package com.ai_note_taker.dto;

import lombok.Data;

@Data
public class PageDTO {

	private int startPage;
	private int endPage;
	
	private boolean prev;
	private boolean next;
	
	private int total;
	private Criteria criteria;
	
	public PageDTO(Criteria criteria, int total) {
		
		this.criteria = criteria;
		this.total = total;
		
		this.endPage = ((criteria.getPageNum()+9)/10)*10;
		this.startPage = this.endPage-9;
		
		int realEndPage = (int)(Math.ceil(this.total/(criteria.getAmount()*1.0)));
		
		if (realEndPage < this.endPage) this.endPage = realEndPage;
		
		this.prev = startPage != 1;
		this.next = this.endPage < realEndPage;
		
	}
	
}
