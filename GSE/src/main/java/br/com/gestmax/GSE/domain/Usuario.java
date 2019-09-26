package br.com.gestmax.GSE.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Usuario {
    private Integer id;
    private Boolean stAtivo;
    private String dsEmail;
    private String snUsuario;
    private Timestamp dtUltimologin;
    private Collection<PrivilegioUsuario> privilegiousuariosById;
    private Collection<TabPrecoUsuario> tabprecousuariosById;
    private GrupoUsuario grupoUsuario;
    private Collection<UsuarioFilial> usuariofilialsById;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "st_ativo", nullable = false)
    public Boolean getStAtivo() {
        return stAtivo;
    }

    public void setStAtivo(Boolean stAtivo) {
        this.stAtivo = stAtivo;
    }


    @Basic
    @Column(name = "ds_email", nullable = false, length = 80)
    public String getDsEmail() {
        return dsEmail;
    }

    public void setDsEmail(String dsEmail) {
        this.dsEmail = dsEmail;
    }

    @Basic
    @Column(name = "sn_usuario", nullable = false, length = 80)
    public String getSnUsuario() {
        return snUsuario;
    }

    public void setSnUsuario(String snUsuario) {
        this.snUsuario = snUsuario;
    }

    @Basic
    @Column(name = "dt_ultimologin", nullable = false)
    public Timestamp getDtUltimologin() {
        return dtUltimologin;
    }

    public void setDtUltimologin(Timestamp dtUltimologin) {
        this.dtUltimologin = dtUltimologin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id) &&
                Objects.equals(stAtivo, usuario.stAtivo) &&
                Objects.equals(dsEmail, usuario.dsEmail) &&
                Objects.equals(snUsuario, usuario.snUsuario) &&
                Objects.equals(dtUltimologin, usuario.dtUltimologin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stAtivo, dsEmail, snUsuario, dtUltimologin);
    }

    @OneToMany(mappedBy = "usuario")
    public Collection<PrivilegioUsuario> getPrivilegiousuariosById() {
        return privilegiousuariosById;
    }

    public void setPrivilegiousuariosById(Collection<PrivilegioUsuario> privilegiousuariosById) {
        this.privilegiousuariosById = privilegiousuariosById;
    }

    @OneToMany(mappedBy = "usuario")
    public Collection<TabPrecoUsuario> getTabprecousuariosById() {
        return tabprecousuariosById;
    }

    public void setTabprecousuariosById(Collection<TabPrecoUsuario> tabprecousuariosById) {
        this.tabprecousuariosById = tabprecousuariosById;
    }

    @ManyToOne
    @JoinColumn(name = "id_grupousuario", referencedColumnName = "id", nullable = false)
    public GrupoUsuario getGrupoUsuario() {
        return grupoUsuario;
    }

    public void setGrupoUsuario(GrupoUsuario grupousuarioByIdGrupoUsuario) {
        this.grupoUsuario = grupousuarioByIdGrupoUsuario;
    }

    @OneToMany(mappedBy = "usuario")
    public Collection<UsuarioFilial> getUsuariofilialsById() {
        return usuariofilialsById;
    }

    public void setUsuariofilialsById(Collection<UsuarioFilial> usuariofilialsById) {
        this.usuariofilialsById = usuariofilialsById;
    }
}
