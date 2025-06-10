// Função para buscar dados do ViaCEP
async function buscarCEP(cep) {
    const url = `https://viacep.com.br/ws/${cep}/json/`;
    try {
        const resposta = await fetch(url);
        const dados = await resposta.json();
        if (dados.erro) {
            throw new Error('CEP inválido');
        }
        return dados;
    } catch (e) {
        throw e;
    }
}

document.addEventListener('DOMContentLoaded', function() {
    const cepInput = document.getElementById('cep');
    const enderecoInput = document.getElementById('endereco');
    const bairroInput = document.getElementById('bairro');
    const cidadeInput = document.getElementById('cidade');
    const estadoInput = document.getElementById('estado');
    const cepErro = document.getElementById('cep-erro');

    cepInput.addEventListener('blur', async function() {
        const cep = cepInput.value.replace(/\D/g, '');
        if (cep.length === 8) {
            cepErro.textContent = '';
            enderecoInput.value = '';
            bairroInput.value = '';
            cidadeInput.value = '';
            estadoInput.value = '';
            try {
                const dados = await buscarCEP(cep);
                enderecoInput.value = dados.logradouro || '';
                bairroInput.value = dados.bairro || '';
                cidadeInput.value = dados.localidade || '';
                estadoInput.value = dados.uf || '';
            } catch (e) {
                cepErro.textContent = 'CEP inválido ou não encontrado.';
            }
        } else {
            cepErro.textContent = 'Digite um CEP válido (8 dígitos).';
        }
    });
});
