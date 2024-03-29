package com.ktdsuniversity.edu.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.ktdsuniversity.edu.vo.MemberVO;

public class MapMemberDAOImpl implements MemberDAO {
	
	private Map<String, MemberVO> dataSource;
	
	public MapMemberDAOImpl() {
		dataSource = new HashMap<>();		
	}

	@Override
	public int create(MemberVO memberVO) {
		dataSource.put(memberVO.getId(), memberVO);
		return 1;
	}

	@Override
	public List<MemberVO> readAll() {
		return dataSource.entrySet() 	// Set<String,MemberVO>
						  .stream()		// Stream<String,MemberVO>
		                  .map(entry -> entry.getValue())	// Stream<MemberVO>
		                  .collect(Collectors.toList());	//List<MemberVO>
		
	}
    
	@Override
	public MemberVO read(String id) {
		return dataSource.get(id);
	}

	@Override
	public MemberVO read(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
