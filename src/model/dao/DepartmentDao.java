package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	void insert(Department obj); // inserir no banco de dados o objeto passado como argumento

	void update(Department obj); // atualizando um department

	void deleteById(Integer id); // deletando um department pelo ID

	Department findById(Integer id); // retorna um Department pelo ID

	List<Department> findAll(); // retorna todos os departments

}
