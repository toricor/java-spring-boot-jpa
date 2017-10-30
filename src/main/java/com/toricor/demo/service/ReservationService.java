package com.toricor.demo.service;

import com.toricor.demo.domain.Reservation;
import com.toricor.demo.domain.ExtendedReservation;
import com.toricor.demo.repository.ExtendedReservationRepository;
import com.toricor.demo.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ReservationService {
    @Autowired
    ReservationRepository reservationRepository;

    @Autowired
    ExtendedReservationRepository extendedReservationRepository;

    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    public List<ExtendedReservation> findAllJoined() {
        return extendedReservationRepository.findAllJoined();
    }

    public Reservation findOne(Integer id) {
        return reservationRepository.findOne(id);
    }

    public void create(Reservation reservation) {
        reservationRepository.save(reservation);
    }

    public void update(Reservation reservation) {
        reservationRepository.save(reservation);
    }

    public void delete(Integer id) {
        reservationRepository.delete(id);
    }
}
