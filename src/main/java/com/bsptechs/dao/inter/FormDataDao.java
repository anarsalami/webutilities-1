package com.bsptechs.dao.inter;

import com.bsptechs.entities.FormData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormDataDao extends CrudRepository<FormData, Integer> {
}