package dio.my_first_web_api.repository;

import dio.my_first_web_api.model.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.ArrayList;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario) {
        if(usuario.getId()==null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório.");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(usuario);
    }
    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("flavio", "senha"));
        usuarios.add(new Usuario("frank", "masterpass"));
        return (usuarios);
    }
    public Usuario findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("flavio", "senha");
    }
    public Usuario findByUsername(String username) {
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuário", username));
        return new Usuario("flavio", "senha");
    }
}