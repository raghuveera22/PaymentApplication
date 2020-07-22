package com.payments.controller;

import com.payments.model.Payment;
import com.payments.service.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/payments")
public class PaymentsController {
	Logger logger = Logger.getLogger(this.getClass().getName());

	@Autowired
	PaymentsService paymentsService;

	@GetMapping(value = "/", produces = "application/json")
	public List<Payment> getAllPayments() {
		List<Payment> paymentList = paymentsService.getPayments();
		return paymentList;
	}

	@GetMapping(value = "/{id}", produces = "application/json")
	public Payment getPayment(@PathVariable("id") long id) {
		Payment payment = paymentsService.getPayment(id);
		return payment;
	}

	@GetMapping(value = "/user/{userId}", produces = "application/json")
	public List<Payment> getPaymentByUserId(@PathVariable("userId") long userId) {
		List<Payment> paymentList = paymentsService.getPaymentsByUserId(userId);
		return paymentList;
	}

	@GetMapping(value = "/transaction/{transactionType}", produces = "application/json")
	public List<Payment> getPaymentByTransactionId(@PathVariable("transactionType") String transactionType) {
		List<Payment> paymentList = paymentsService.getPaymentsByTransactionType(transactionType);
		return paymentList;
	}

	@GetMapping(value = "/date/{queryDt}", produces = "application/json")
	public List<Payment> getPaymentsByDate(@PathVariable("queryDt") String queryDt) throws Exception {
		// SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
		Date dt = new SimpleDateFormat("yyyy-MM-dd").parse(queryDt);

		List<Payment> paymentList = paymentsService.getPaymentsByDate(dt);
		return paymentList;
	}

	@PostMapping(value = "/", produces = "application/json")
	public Payment addPayment(@RequestBody Payment payment) {
		Payment resp = paymentsService.addPayment(payment);
		return resp;
	}

	@PutMapping(value = "/{id}", produces = "application/json")
	public Payment updatePayment(@RequestBody Payment PaymentRq) {
		Payment resp = paymentsService.updatePayment(PaymentRq);
		return resp;
	}
}
