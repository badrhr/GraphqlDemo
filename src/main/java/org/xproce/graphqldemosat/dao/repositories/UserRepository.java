package org.xproce.graphqldemosat.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.graphqldemosat.dao.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
