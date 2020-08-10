package edu.miu.eshop.amexbank.repository;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import edu.miu.eshop.amexbank.domain.Amexdata;


@Repository
public interface AmexdataRepository extends MongoRepository<Amexdata, BigInteger> {

	
}
