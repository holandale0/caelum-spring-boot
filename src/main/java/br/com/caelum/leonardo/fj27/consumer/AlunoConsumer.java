package br.com.caelum.leonardo.fj27.consumer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import br.com.caelum.leonardo.fj27.model.Aluno;

@Component
public class AlunoConsumer {
	
	@RabbitListener(queues = "queue.alunos")
	public void leMensagem(Aluno aluno){
		System.out.println("[Consumer Alunos] "+"recebendo mensagem: "+aluno);
	}

}
