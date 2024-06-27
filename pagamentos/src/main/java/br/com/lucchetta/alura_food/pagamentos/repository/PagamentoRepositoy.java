package br.com.lucchetta.alura_food.pagamentos.repository;

import br.com.lucchetta.alura_food.pagamentos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepositoy extends JpaRepository<Pagamento, Long> {
}
