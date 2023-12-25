package com.Group11.TugasBesar.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Date;
import com.Group11.TugasBesar.models.Payment;
import java.util.*;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, String> {


}


