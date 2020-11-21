package com.ronaldo.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.ronaldo.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
