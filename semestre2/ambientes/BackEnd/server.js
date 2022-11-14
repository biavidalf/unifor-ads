const express = require('express');
const cors = require('cors');
const app = express();
 
app.use(cors());
app.use(express.json());

app.get('/', (req, res) => {
    res.status(200).send('Back-end Challenge 2021 🏅 - Space Flight News');
})

app.route('/articles/')
  .get((req, res) => {
    // Listar todos os artigos da base de dados, utilizar o sistema de paginação para não sobrecarregar a REQUEST
    res.send('All articles');
  })
  .post((req, res) => {
    // Adicionar um novo artigo
    res.send('Novo article')
  })

app.route('/articles/:id')
  .get((req, res) => {
    let id = req.params.id;
    res.send('Get article ' + id);
  })
  .put((req, res) => {
    // Atualizar um artigo baseado no id
    res.send('Update article ' + req.params.id)
  })
  .delete((req, res) => {
    // Deletar um artigo baseado no id
    res.send('Delete article ' + req.params.id)
  })

app.listen(3333);