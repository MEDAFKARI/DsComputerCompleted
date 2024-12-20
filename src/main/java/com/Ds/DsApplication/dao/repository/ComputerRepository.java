package com.Ds.DsApplication.dao.repository;

import com.Ds.DsApplication.dao.entity.Computer;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComputerRepository extends JpaRepository<Computer,Long> {

   public List<Computer> findByProce(String proce);
}
