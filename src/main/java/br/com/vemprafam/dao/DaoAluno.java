package br.com.vemprafam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import br.com.vemprafam.pojo.Aluno;

public class DaoAluno {
	private String user = "SA";
	private String password = "";
	private String url = "jdbc:hsqldb:hsql://localhost/";
	private Connection connection;
	public DaoAluno() {
		try {
			connection = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void inserir( Aluno aluno ) {
	
	}
	
	public List<Aluno> getLista() {
		return null;
	}
	
	public Aluno buscarPeloRa( int ra ) {
		return null;
	}
	
	public void atualizar( Aluno aluno ) {}
	
	public void excluir( Aluno aluno ) {}
}












