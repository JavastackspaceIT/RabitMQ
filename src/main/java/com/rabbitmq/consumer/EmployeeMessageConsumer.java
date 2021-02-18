package com.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.rabbitmq.model.Employee;

@Component
public class EmployeeMessageConsumer {

	/*@Value("${javastackspacceit.rabbitmq.queue}")
	private String employeeQueue;*/

	@RabbitListener(queues = "${javastackspacceit.rabbitmq.queue}")
	public void readMessage(Employee employee) {
		
		/***
		 * 
		 * There will bussine code 
		 * */
		System.err.println(employee);
	}

}
