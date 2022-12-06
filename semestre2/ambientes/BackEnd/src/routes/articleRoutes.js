const router = require('express').Router();
const Article = require('../models/Article');

router.route('/')
  .get(async (req, res) => {
    // Listar todos os artigos da base de dados, utilizar o sistema de paginação para não sobrecarregar a REQUEST
    try {
        const articles = await Article.find();
        res.status(200).json({data: articles});
      } catch (error) {
        res.status(500).json({error:error});
      }
  })
  .post(async (req, res) => {
    // Verificando se o body está vazio
    if(!req.body){
      res.status(500).json({message:'Por favor, insira dados! :('});
      return
    }
    
    // Adicionar um novo artigo
    const article = req.body;
    console.log(req.body);


    try {
      const articleNoBanco = await Article.findOne({id: article.id});
      if(articleNoBanco){
        res.status(500).json({message:'Article já existente no banco'});
        return
      }
      
      await Article.create(article);
      res.status(201).json({message: 'Article criado.'});
    } catch (error) {
      res.status(500).json({error:error});
    }
  })

router.route('/:id')
  .get(async (req, res) => {
    let id = req.params.id;
    
    try {
        const article = await Article.findOne({id: id});

        if(!article){
            res.status(422).json({message: 'Article nao encontrado'});
            return
        }

        res.status(200).json(article);
      } catch (error) {
        res.status(500).json({error:error});
    }
  })
  .put(async (req, res) => {
    let id = req.params.id;
    const articleNewData = req.body.data;

    try {
        const updatedArticle = await Article.updateOne({id: id}, articleNewData);

        if(!updatedArticle){
            res.status(422).json({message: 'Article nao encontrado'});
            return
        }

        res.status(200).json(updatedArticle);
      } catch (error) {
        res.status(500).json({error:error});
    }
  })
  .delete(async (req, res) => {
    // Deletar um artigo baseado no id
    let id = req.params.id;
    
    try {
        const article = await Article.findOne({id: id});

        if(!article){
            res.status(422).json({message: 'Article nao encontrado'});
            return
        }

        await Article.deleteOne({id:id});

        res.status(200).json({message: 'Article deletado'});
      } catch (error) {
        res.status(500).json({error:error});
    }
  })

  module.exports = router;