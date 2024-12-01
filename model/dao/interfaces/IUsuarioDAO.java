package model.dao.interfaces;

public interface IUsuarioDAO {
  
  String SQL_INSERT = "INSERT INTO Usuario (nome, login, senha, email, telefone, multa_acumulada, status_da_conta, tipo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
  String SQL_ALTER = "UPDATE Usuario SET nome = ?, SET login = ?, SET senha = ?, SET email = ?, SET telefone = ?, SET multa_acumulada = ?, SET status_da_conta = ?, SET tipo = ?, WHERE id_usuario = ?";
  String SQL_DELETE = "DELETE FROM Usuario WHERE id_usuario = ?";
  String SQL_SELECT = "SELECT * FROM Usuario WHERE id_usuario = ?";

  public boolean find();

  public boolean insert();
  
  public boolean remove();

  public boolean update();

}