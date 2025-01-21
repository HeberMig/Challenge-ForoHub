package foro.hub.Foro_Hub.domain.topicos;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface TopicoRepository extends JpaRepository<Topico, Long> {


    Optional<Topico> findByTituloAndMensaje(String titulo, String mensaje);

    boolean existsByTituloAndIdNot(String titulo, Long id);


    boolean existsByMensajeAndIdNot(String mensaje, Long id);
}
