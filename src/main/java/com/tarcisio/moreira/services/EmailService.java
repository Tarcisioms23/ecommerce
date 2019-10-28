package com.tarcisio.moreira.services;

import org.springframework.mail.SimpleMailMessage;

import com.tarcisio.moreira.domain.Pedido;

public interface EmailService {
	
		void sendOrderConfirmationEmail(Pedido obj);
		
		void sendEmail(SimpleMailMessage msg);
}
