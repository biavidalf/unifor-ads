# 📝 Entregavel 4 - Ambientes de Desenvolvimento de Software

Repositório para armazenar os códigos do Entregável 4 da disciplina Ambientes de Desenvolvimento de Software.

O entregável pede que seja  refatorado o código do primeir entregável para torná-lo um código limpo. Além disso, também deve ser implementado 2 testes para cada um dos algoritmos fundamentais. Os testes foram aplicados utilizando Jest.

# 📈 Tutorial para uso

### Preparação do ambiente

- Baixar os códigos contidos nesse repositórios para a sua máquina
- Executar no terminal o comando

```Bash
npm install
```

### Rodando os testes

- O npm install já instalou o jest e o deixou pronto para preparação. No package json também já está informado que o comando npm test irá executar o jest

- Agora, com todos os pacotes instalados, coloque os testes para rodar com o comando

```Bash
npm test
```

- Você verá no terminal informações básicas sobre os testes, como por exemplo se eles passaram ou não

#### Flags
##### Coverage
- Caso queira ver o **coverage** da sua classe teste (o quanto ela cobriu do seu código), execute o npm test com as seguintes flag: -- --coverage

```Bash
npm test -- --coverage
```

##### Teste único
- Caso queira executar um **teste em específico**, use o npm teste passando as flags -- --nome-teste

```Bash
npm test -- --soma.test.js
```
