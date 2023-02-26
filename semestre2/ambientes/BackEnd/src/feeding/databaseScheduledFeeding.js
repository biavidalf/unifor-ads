const cron = require('node-cron');
const axios = require('axios');

cron.schedule('0 9 * * *', async function() {
    console.log('Schelued executado');
    axios.get(`https://api.spaceflightnewsapi.net/v3/articles?_limit=1&_start=31`)
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
    }
);

/* cron.schedule('26 9 * * *', async function() {
    console.log('running a task every minute');
    let max = await axios.get(`https://api.spaceflightnewsapi.net/v3/articles/count`).then(response => response.data);
    let limit = 10;
    let contagem = 0;

    for(let i = 0; i < max; i++){
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
}); */