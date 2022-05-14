package com.ricardo.backupFilesAPI.repository;
import com.ricardo.backupFilesAPI.domain.RouterDomain;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RouterRepository extends JpaRepository<RouterDomain, Long> {

}
