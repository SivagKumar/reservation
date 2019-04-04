package com.reservation.landon.data.repository;

import com.reservation.landon.data.entity.Guest;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GuestRepository extends PagingAndSortingRepository <Guest, Long>{

    Optional<Guest> findById(long guestId);
}
