package com.theironyard.services;

import com.theironyard.entities.Recipient;
import com.theironyard.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by stevenburris on 10/28/16.
 */
public interface RecipientRepository extends CrudRepository<Recipient, Integer> {
    List<Recipient> findByUser(User user);
    List<Recipient> findByViewedLessThan(LocalDateTime timestamp);
}
