package kr.co.jsphomme.purchaselist.dao;

import kr.co.jsphomme.purchaselist.vo.PurchaseListVo;

public interface PurchaseListDao {
	public PurchaseListVo purchaseListInsert(PurchaseListVo purchaseListVo);			//구매목록 추가
	public PurchaseListVo purchaseListView(PurchaseListVo purchaseListVo);			//구매목록 보여주기
	public int purchaseListDelete(int no);						//구매 취소
}
