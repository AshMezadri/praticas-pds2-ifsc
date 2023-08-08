package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Filme;

public class FilmeDAO {

	public boolean inserir(Filme f) {

		Conexao c = Conexao.getInstancia();

		Connection con = c.conectar();

		String query = "INSERT INTO filme (nome_filme, diretor, genero) values (?, ?, ?)";

		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, f.getNome_filme());
			ps.setString(2, f.getDiretor());
			ps.setString(3, f.getGenero());

			ps.executeUpdate();

			c.fecharConexao();

			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

}
