package com.devils.pics.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devils.pics.dao.StudioReserveDAO;
import com.devils.pics.domain.ExceptionDate;
import com.devils.pics.domain.RepeatDate;
import com.devils.pics.domain.Reservation;
import com.devils.pics.service.StudioReserveService;

@Service
public class StudioReserveServiceImpl implements StudioReserveService {	
	@Autowired
	private StudioReserveDAO studioReserveDAO;

	@Override
	public ArrayList<ExceptionDate> getExceptionDate(int stuId) {
		List<ExceptionDate> exceptionDateList =new ArrayList<ExceptionDate>();
		for(ExceptionDate ex: studioReserveDAO.getExceptionDate(stuId))
			exceptionDateList .add(ex);
		return (ArrayList<ExceptionDate>) exceptionDateList;
	}

	@Override
	public ArrayList<RepeatDate> getRepeatDate(int stuId) {
		List<RepeatDate> repeatDateList =new ArrayList<RepeatDate>();
		for(RepeatDate rep: studioReserveDAO.getRepeatDate(stuId))
			repeatDateList.add(rep);
		return (ArrayList<RepeatDate>) repeatDateList;
	}

	@Override
	public int AddReservation(Reservation reservation) {
		return studioReserveDAO.AddReservation(reservation);
	}

	@Override
	public int AddExceptionDates(Reservation reservation) {
		return studioReserveDAO.AddExceptionDates(reservation);
	}

	@Override
	public List<Reservation> getReservation(Reservation reservation) {
		return studioReserveDAO.getReservation(reservation);
	}

	@Override
	public int UpdateReservation(Reservation reservation) {
		return studioReserveDAO.UpdateReservation(reservation);
	}

	@Override
	public int UpdateExceptionDate(Reservation reservation) {
		return studioReserveDAO.UpdateExceptionDate(reservation);
	}

	@Override
	public int DeleteReservations(List<Reservation> reservationList) {
		return studioReserveDAO.DeleteReservations(reservationList);
	}

	@Override
	public int DeleteExceptionDates(List<Reservation> reservationList) {
		return studioReserveDAO.DeleteExceptionDates(reservationList);
	}
}
