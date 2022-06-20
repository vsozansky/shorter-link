package com.vs.shorterlink;

import org.springframework.data.repository.CrudRepository;

interface ShorterRepository extends CrudRepository<Shorter, Long> {
    Shorter findByHash(String hash);
}
