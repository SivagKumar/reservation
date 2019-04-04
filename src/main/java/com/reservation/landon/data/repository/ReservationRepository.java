package com.reservation.landon.data.repository;

import com.reservation.landon.data.entity.Reservation;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface ReservationRepository extends PagingAndSortingRepository<Reservation, Long> {

    List<Reservation> findByDate(Date date);
}
