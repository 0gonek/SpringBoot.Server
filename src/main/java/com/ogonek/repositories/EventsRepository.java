package com.ogonek.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ogonek.entities.*;

public interface EventsRepository extends JpaRepository<Event, Long> {
}
