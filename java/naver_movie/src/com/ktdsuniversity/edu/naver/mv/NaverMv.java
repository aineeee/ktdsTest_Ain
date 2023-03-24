package com.ktdsuniversity.edu.naver.mv;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.naver.mv.cmmncd.service.CmmnCdService;
import com.ktdsuniversity.edu.naver.mv.cmmncd.service.CmmnCdServiceImpl;
import com.ktdsuniversity.edu.naver.mv.cmmncd.vo.CmmnCdVO;
import com.ktdsuniversity.edu.naver.mv.cmpn.service.CmpnService;
import com.ktdsuniversity.edu.naver.mv.cmpn.service.CmpnServiceImpl;
import com.ktdsuniversity.edu.naver.mv.cmpn.vo.CmpnVO;
import com.ktdsuniversity.edu.naver.mv.gnr.service.GnrService;
import com.ktdsuniversity.edu.naver.mv.gnr.service.GnrServiceImpl;
import com.ktdsuniversity.edu.naver.mv.gnr.vo.GnrVO;
import com.ktdsuniversity.edu.naver.mv.mv.service.MvService;
import com.ktdsuniversity.edu.naver.mv.mv.service.MvServiceImpl;
import com.ktdsuniversity.edu.naver.mv.mv.vo.MvVO;
import com.ktdsuniversity.edu.naver.mv.mv.vo.PrdcPrtcptnCmpnVO;
import com.ktdsuniversity.edu.naver.mv.mvppl.service.MvPplService;
import com.ktdsuniversity.edu.naver.mv.mvppl.service.MvPplServiceImpl;
import com.ktdsuniversity.edu.naver.mv.mvppl.vo.MvPplVO;
import com.ktdsuniversity.edu.naver.mv.ntn.service.NtnService;
import com.ktdsuniversity.edu.naver.mv.ntn.service.NtnServiceImpl;
import com.ktdsuniversity.edu.naver.mv.ntn.vo.NtnVO;

public class NaverMv {

	public static void main(String[] args) {
		MvService mvService = new MvServiceImpl();
		MvVO mvVO = new MvVO();
		mvVO.setMvTtl("새로운 영화");
		mvVO.setEngTtl("New Movie");
		mvVO.setScrnStt("001_01");
		mvVO.setScrnTm(120);
		mvVO.setOpngDt("20230301");
		mvVO.setGrd("002_04");
		mvVO.setPstr("http://movie.naver.com/ddd.jpg");
		mvVO.setSmr("영화줄거리");
		mvVO.setMvId("3");
		
		List<PrdcPrtcptnCmpnVO> cmpnList = new ArrayList<>();
		PrdcPrtcptnCmpnVO cmpnVO = new PrdcPrtcptnCmpnVO();
		cmpnVO.setCmpnId("CO-20230308-00003");
		cmpnVO.setCrcltnCd("006_01");
		cmpnList.add(cmpnVO);
		
		cmpnVO = new PrdcPrtcptnCmpnVO();
		cmpnVO.setCmpnId("CO-20230308-00003");
		cmpnVO.setCrcltnCd("006_02");
		cmpnList.add(cmpnVO);
		
		
		List<MvVO> mvList = mvService.readAllMv();
		for(MvVO mvVO : mvList) {
			System.out.println("MV_ID : " + mvVO.getMvId());
			System.out.println("MV_TTL : " + mvVO.getMvTtl());
			System.out.println("ENG_TTL : " + mvVO.getEngTtl());
			System.out.println("SMR: " + mvVO.getSmr());

		
		List<GnrVO> mvGnrList = mvVO.getGnrList();
		List<NtnVO> mvNtnList = mvVO.getNtnList();
		
		for (GnrVO mvGnr : mvGnrList) {
			System.out.println("GNR_ID : " + mvGnr.getGnrId());
			System.out.println("GNR_NM : " + mvGnr.getGnrNm());
		}
		for (NtnVO mvNtn : mvNtnList) {
			System.out.println("NTN_ID : " + mvNtn.getNtnId());
			System.out.println("NTN_NM : " + mvNtn.getNtnNM());
			
		}
		
		}
		
		
		List<CmmnCdVO> cmmnCdList = cmmnCdService.readAllCmmnCd();
		for(CmmnCdVO cmmnCdVO : cmmnCdList) {
			System.out.println(cmmnCdVO.getCdId());
			System.out.println(cmmnCdVO.getCdNm());
			System.out.println(cmmnCdVO.getPrcdncCdId());
		}
		/*
		mvVO = new MvVO();
		mvVO.setMvId("MV-20230309-00008");
		mvVO.setMvTtl("수정된 영화");
		mvVO.setEngTtl("Update");
		mvPpList.add(mvPplVO);
		
		mvVO.setMvPplList(mvPplList);
		mvVO.setMvId("MV-20230309-00008");
		mvVO.setMvTtl("수정된 영화");
		mvVO.setEngTtl("Update");
		/
		mvPplVO = new PrdcPrtcptnPplVO();
		mvPplVO.setMvPplId("PD-20230308-00012");
		mvPplVO.setMssn("005_02");
		mvPplList.add(mvPplVO);
		
		mvPplVO = new PrdcPrtcptnPplVO();
		mvPplVO.setMvPplId("PD-20230308-00013");
		mvPplVO.setMssn("005_03");
		mvPplList.add(mvPplVO)
		
		mvVO.setMvPplList(mvPplList);
		
		mvVO.setMvId("MV-20230309-00008");
		mvVO.setMvTtl("수정된 영화");
		mvVO.setEngTtl("Update");
		mvService.updateMv(mvVO)
		
		/*
		List<GnrVO> gnrList = new ArrayList();
		GnrVO gnrVO = new GnrVO();
		gnrVO.setGnrId(2);
		gnrList.add(gnrVO);
		mvVO.setGnrList(gnrList);
		*/
		
		// 장르변경
		/*
		GnrService gnrService = new GnrServiceImpl();
		GnrVO gnrVO = new GnrVO();
		gnrVO.setGnrId(2);
		gnrVO.setGnrNm("스릴러");
		gnrService.updateGnr(gnrVO);
		*/
		/*		
		List<NtnVO> ntnList = new ArrayList<>();
		NtnVO ntnVO = new NtnVO();
		ntnVO.setNtnId(2);
		ntnList.add(ntnVO);
		mvVO.setNtnList(ntnList);	
		*/
		//
		
		/*				
		List<PrdcPrtcptnCmpnVO> cmpnList = new ArrayList<>();
		PrdcPrtcptnCmpnVO cmpnVO = new PrdcPrtcptnCmpnVO();
		cmpnVO.setCmpnId("CO-20230308-00003");
		cmpnVO.setCrcltnCd("006_01");
		cmpnList.add(cmpnVO);
		
		cmpnVO = new PrdcPrtcptnCmpnVO();
		cmpnVO.setCmpnId("CO-20230308-00003");
		cmpnVO.setCrcltnCd("006_02");
		cmpnList.add(cmpnVO);
		
		cmpnVO = new PrdcPrtcptnCmpnVO();
		cmpnVO.setCmpnId("CO-20230308-00003");
		cmpnVO.setCrcltnCd("006_03");
		cmpnList.add(cmpnVO);
		
		mvVO.setCmpnList(cmpnList);
		
		
		
		
		/*
		GnrService gnrService = new GnrServiceImpl();
		GnrVO gnrVO1 = new GnrVO();
		gnrVO1.setGnrNm("범죄11");
		boolean createResult = gnrService.createGnr(gnrVO1);
		System.out.println("범죄 장르 등록 성공? " + createResult);

		
		NtnService ntnService = new NtnServiceImpl();
		NtnVO ntnVO = new NtnVO();
		ntnVO.setNtnNM("대한민국7");
		boolean createResult2 = ntnService.createNtn(ntnVO);
		System.out.println("국가 등록 성공? " + createResult2);

		MvPplService mvPplService = new MvPplServiceImpl();
		MvPplVO mvPplVO = new MvPplVO();
		mvPplVO.setPrflPctr("프로필사진5");
		mvPplVO.setNm("유연석7");
		mvPplVO.setPlNm("안연석8");
		boolean createResult3 = mvPplService.createMvPpl(mvPplVO);
		System.out.println("영화인 등록 성공? " + createResult3);

		CmpnService cmpnService = new CmpnServiceImpl();
		CmpnVO cmpnVO = new CmpnVO();
		cmpnVO.setCmpnNm("(주)누리픽쳐스7");
		boolean createResult4 = cmpnService.createCmpn(cmpnVO);
		System.out.println("회사 등록 성공? " + createResult4);

		CmmnCdService cmmnCdService = new CmmnCdServiceImpl();
		CmmnCdVO cmmnCdVO = new CmmnCdVO();
		cmmnCdVO.setCdId("공통코드원8");
		cmmnCdVO.setCdNm("공통코드투8");
		cmmnCdVO.setPrcdncCdId("공통코드쓰리8");
		boolean createResult5 = cmmnCdService.createCmmncd(cmmnCdVO);
		System.out.println("공통코드 등록 성공? " + createResult5);
		*/
		
		//mvService.createMv(mvVO);
		
	}

}
