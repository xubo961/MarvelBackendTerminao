package org.proyecto.primerproyecto.models;


import jakarta.persistence.*;

@Entity
@Table(name = "favoritos_marvel")
public class FavoritoMarvel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Usuario usuario;

    @Column(name = "serie_marvel", nullable = false)
    private long serieMarvel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public long getSerieMarvel() {
        return serieMarvel;
    }

    public void setSerieMarvel(long serieMarvel) {
        this.serieMarvel = serieMarvel;
    }
}
