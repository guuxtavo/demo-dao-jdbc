package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj); // inserir no banco de dados o objeto passado como argumento

	void update(Seller obj); // atualizando um Seller

	void deleteById(Integer id); // deletando um Seller pelo ID

	Seller findById(Integer id); // retorna um Seller pelo ID

	List<Seller> findAll(); // retorna todos os Sellers
}
