package Steps;

import Elementos.Elementos;
import Metados.Metados;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	Metados m = new Metados();
	Elementos e = new Elementos();

	@Given("^que o usuario acesse a url \"([^\"]*)\"$")
	public void que_o_usuario_acesse_a_url(String url) throws Throwable {
		m.executarNavegador(url, "Abrindo navegador");
	}

	@Given("^selecione o botao abrir nova conta$")
	public void selecione_o_botao_abrir_nova_conta() throws Throwable {

		m.click(e.getBtnAbrirConta(), "Selecionando botao abrir conta");
	}

	@Given("^selecionar o botao abrir conta para voce$")
	public void selecionar_o_botao_abrir_conta_para_voce() throws Throwable {
		m.pausa(5000, "pausa para carregar o botao abrir conta para voce");
		m.click(e.getBtnParaVoce(), "Selecionando botao abrir conta");
	}

	@When("^o usuario prencher o formulario$")
	public void o_usuario_prencher_o_formulario() throws Throwable {
		m.preencher(e.getCampoNome(), "Flash code", "Preenchendo o campo nome");
		m.preencher(e.getCampoTelefone(), "11111111111", "Preenchendo campo telefone");
		m.preencher(e.getCampoEmail(), "Test@test.com.br", "Preenchendo campo email");
		m.preencher(e.getCampoCpf(), "01862868050", "Preenchendo campo cpf");

	}

	@When("^selecionar o botao quero ser cliente$")
	public void selecionar_o_botao_quero_ser_cliente() throws Throwable {
		m.click(e.getBtnQueroSerClinte(), "Selecionando botao quero ser cliente");
	}

	@Then("^valido o texto falta pouco$")
	public void valido_o_texto_falta_pouco() throws Throwable {

	}

}
