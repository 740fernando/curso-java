// Um try sempre exige um catch ou um finally
/*
 * Repare que a conexão foi fechada automaticamente. Então concluímos que essas três linhas do console se 
 * referem aos antigos blocos try e finally. Não precisamos mais escrever explicitamente o bloco finally,
 * pois o novo try já nos garante que o recurso que está sendo aberto dessa forma será fechado automaticamente,
 * desde que ele implemente a interface AutoCloseable.
 * 
 */
public class TesteConexao  {
	public static void main(String[] args) {
		
		try(Conexao conexao = new Conexao()){
			conexao.leDados();				
		}catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexao");
		}
	}
}
		
//		//----------------------------
//		Conexao con =null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		}catch(IllegalStateException e) {
//			System.out.println("Deu erro na conexao");
//		}finally { // esse bloco sempre sera executado, com ou sem erro
//			System.out.println("Finally");
//			if(con !=null) {
//				con.fecha();	
//			}
//		}
	
