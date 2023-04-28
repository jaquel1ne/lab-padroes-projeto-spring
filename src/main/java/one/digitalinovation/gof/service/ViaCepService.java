package one.digitalinovation.gof.service;

import one.digitalinovation.gof.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * Cliente HTTP, criado via <b>OpenFeign</b>, para o consumo da API do
 * <b>ViaCEP</b>.
 *
 * @author jaquel1ne
 */

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
