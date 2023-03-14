package com.durgesh;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface MessageRepository extends PagingAndSortingRepository<Message, Integer>{
}
//public interface MessageRepository extends PagingAndSortingRepository<Message, Integer> 