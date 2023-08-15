package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Filme;

public class FilmeDAO {

	public ArrayList<Filme> listar() {

		Conexao c = Conexao.getInstancia();

		Connection con = c.conectar();

		ArrayList<Filme> filmes = new ArrayList<>();

		String query = "SELECT * FROM filme";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int idFilme = rs.getInt("idFilme");
				String titulo = rs.getString("titulo");
				
				Filme f = new Filme();
				f.setIdFilme(idFilme);
				f.setTitulo(titulo);
				
				filmes.add(f);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		c.fecharConexao();

		return filmes;
	}

	public boolean inserir(Filme f) {

		Conexao c = Conexao.getInstancia();

		Connection con = c.conectar();

		String query = "INSERT INTO filme (nome_filme, diretor, genero) values (?, ?, ?)";

		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, f.getTitulo());
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
