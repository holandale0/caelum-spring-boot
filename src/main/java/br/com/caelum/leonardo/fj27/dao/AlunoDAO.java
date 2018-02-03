package br.com.caelum.leonardo.fj27.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.caelum.leonardo.fj27.model.Aluno;

@Repository
public interface AlunoDAO extends MongoRepository<Aluno,String>{
	
	Aluno findByIdade(Integer idade);
		
	

}
