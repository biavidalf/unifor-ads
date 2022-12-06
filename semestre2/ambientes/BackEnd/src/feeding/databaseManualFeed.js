const Article = require('../models/Article');
const axios = require('axios');

const limit = 10;
let contagem = 0.

for(let i = 0; i < 3; i++){
    axios.get(`https://api.spaceflightnewsapi.net/v3/articles?_limit=${limit}&_start=${contagem}`)
    .then((response) => {
        let articles = response.data;
        for(indexArticle in articles){
            let data = articles[indexArticle];
            axios.post('http://localhost:3000/articles', data)
                .then(response => console.log(response.data))
                .catch(error => console.log(error))
        }
    })
    .catch((error) => console.log(error))
    contagem += limit;
}

// CRON EXPRESSION: 0 0 9 * * ?
// https://www.digitalocean.com/community/tutorials/nodejs-cron-jobs-by-examples