package com.payments.service;

import com.payments.model.Payment;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PaymentsService {

	static Long paymentCounter = 1L;
	static Map<Long, Payment> paymentMap = new LinkedHashMap<>();

	public List<Payment> getPayments() {
		List<Payment> list = paymentMap.entrySet().stream().map(e -> e.getValue()).collect(Collectors.toList());
		return list;
	}

	public Payment getPayment(long id) {
		return paymentMap.get(id);
	}

	public List<Payment> getPaymentsByUserId(long userId) {
		return paymentMap.entrySet().stream().map(e -> e.getValue()).filter(e -> e.getUserId() == userId)
				.collect(Collectors.toList());
	}

	public List<Payment> getPaymentsByTransactionType(String transactionType) {
		return paymentMap.entrySet().stream().map(e -> e.getValue())
				.filter(e -> e.getTransactionType().toString().equalsIgnoreCase(transactionType))
				.collect(Collectors.toList());
	}

	public List<Payment> getPaymentsByDate(Date queryDate) {
		return paymentMap.entrySet().stream().map(e -> e.getValue())
				.filter(e -> isSameDay(e.getTransactionDt(), queryDate)).collect(Collectors.toList());
	}

	public Payment addPayment(Payment payment) {
		payment.setId(paymentCounter);
		paymentMap.put(paymentCounter, payment);
		paymentCounter++;
		return payment;
	}

	public Payment updatePayment(Payment payment) {
		paymentMap.put(payment.getId(), payment);
		return payment;
	}

	public boolean isSameDay(Date date1, Date date2) {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
		return fmt.format(date1).equals(fmt.format(date2));
	}
}
