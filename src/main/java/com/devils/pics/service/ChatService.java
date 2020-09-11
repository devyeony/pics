package com.devils.pics.service;

import java.util.List;
import java.util.Map;

public interface ChatService {
	/* 업체의 스튜디오 및 고객별 최근 수신 대화  */
	public List<Map<String, String>> getRecentComChat(String comId) throws Exception;
}
