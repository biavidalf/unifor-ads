# 📝 Entregavel 3 - Ambientes de Desenvolvimento de Software

Repositório para armazenar os códigos do Entregável 3 da disciplina Ambientes de Desenvolvimento de Software.

O entregável pede que seja construído um servidor express com dois endpoints, "/" e "/soma", os quais devem ser testados via Postman

# 📈 Tutorial para uso

### Preparação do ambiente

- Baixar os códigos contidos nesse repositórios para a sua máquina
- Para baixar só a pasta atual, você pode clicar no link abaixo:
- [Baixar pasta atual](https://download-directory.github.io/?url=https%3A%2F%2Fgithub.com%2Fbiavidalf%2Funifor-ads%2Fedit%2Fmain%2Fsemestre2%2Fambientes%2Fentregavel3 "Link Download Pasta atual")
- Executar no terminal o comando

```Bash
npm install
```

- Após instalar todos os pacotes, coloque o servidor para rodar com o comando

```Bash
node app.js
```


### Primeira Requisição

- [Instalar](https://www.postman.com/downloads/ "Link Download Postman") e abrir o postman
- Adicionar um request
- Colocar o método GET
- Adicionar na URL do request <http://localhost:3001>
- Clicar send
![Primeira Requisicao](./CapturaGet.png "Primeira Requisicao")



## Segunda Requisição

- Abrir o Postman
- Adicionar um request
- Colocar o método POST
- Adicionar na URL do request <http://localhost:3001/calcular>
- Clicar em Body
- Selecionar a opção "raw"
- Colocar o json no body

```JSON
{
    "operador": "soma",
    "a": 10,
    "b":20
}
```
- De operador estão disponíneis: "soma", "subtracao", "multiplicacao", "divisao"
- Altere o operador no JSON que a operação também mudará
- Clique em enviar
![Segunda Requisicao](./CapturaPost.png "Segunda Requisicao")
