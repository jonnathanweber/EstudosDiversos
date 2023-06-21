package br.com.alura.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import io.quarkus.security.jpa.UserDefinition;
import io.quarkus.security.jpa.Username;
import io.quarkus.security.jpa.Roles;
import io.quarkus.security.jpa.Password;

import io.quarkus.elytron.security.common.BcryptUtil;

@Entity
@UserDefinition
// define que a entidade contem dados de acesso.
// apenas uma entidade pode ter UserDefinition.
public class Usuario extends PanacheEntityBase{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String cpf;

    // Campos DEVEM ser string (documentacao)
    @Username
    private String username;
    @Password
    private String password;
    @Roles
    private String role;

    public void serRole(String role) {
      this.role = role;
    }

    public String getRole() {
      return this.role;
    }

    public String getNome() {
      return this.nome;
    }
    public void setNome(String value) {
      this.nome = value;
    }

    public String getCpf() {
      return this.cpf;
    }
    public void setCpf(String value) {
      this.cpf = value;
    }

    public String getUsername() {
      return this.username;
    }
    public void setUsername(String value) {
      this.username = value;
    }

    public String getPassword() {
      return this.password;
    }
    public void setPassword(String value) {
      this.password = value;
    }

    public static void adicionar(Usuario usuario) {
      usuario.password=BcryptUtil.bcryptHash(usuario.password);
      usuario.role = validarUsername(usuario.username);
      usuario.persist();
    }
    private static String validarUsername (String username) {
      if(username.equals("alura")){
        return "admin";
      }
      return "user";
    }
}

