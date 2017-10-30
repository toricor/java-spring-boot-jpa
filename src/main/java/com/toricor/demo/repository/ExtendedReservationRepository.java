package com.toricor.demo.repository;

import com.toricor.demo.domain.ExtendedReservation;
import com.toricor.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExtendedReservationRepository extends JpaRepository<ExtendedReservation, Integer> {
    @Query(value = "SELECT reservation.id, user.name AS userName, event.title AS eventTitle " +
            "FROM reservation " +
            "INNER JOIN user ON user.id = reservation.user_id " +
            "INNER JOIN event ON event.id = reservation.event_id",
            nativeQuery = true)
    List<ExtendedReservation> findAllJoined();

}
