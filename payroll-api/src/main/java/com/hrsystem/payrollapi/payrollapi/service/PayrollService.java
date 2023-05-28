package com.hrsystem.payrollapi.payrollapi.service;

import com.hrsystem.payrollapi.payrollapi.domain.Payroll;
import com.hrsystem.payrollapi.payrollapi.feignClients.UserFeign;
import com.hrsystem.payrollapi.payrollapi.service.execeptions.ObjectNotFoundException;
import com.sun.jdi.ObjectCollectedException;
import feign.FeignException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@Slf4j
@RequiredArgsConstructor
public class PayrollService {

    private final Environment env;
    private final UserFeign userFeign;

    public Payroll getPayment(Long workedId, Payroll payroll) {
        log.info("PAYROLL_SERVICE ::: Get request on " + env.getProperty("local.server.port") + " port");
        try {
            var user = userFeign.findById(workedId).getBody();
            if (Objects.nonNull(user)) {
                return new Payroll(
                        user.getName(),
                        payroll.getDescription(),
                        user.getHourlyPrice(),
                        payroll.getWorkedHours(),
                        payroll.getWorkedHours() * user.getHourlyPrice()
                        );
            }
        } catch (FeignException.NotFound ex) {
            throw new ObjectNotFoundException("Object Not Found");
        } catch (Exception ex) {
            throw new IllegalArgumentException("Ilegal argument exception");
        }
        return null;
    }
}
