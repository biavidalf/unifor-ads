const express = require('express');
const cors = require('cors');
const app = express();
const mongoose = require('mongoose');
const bodyParser = require('body-parser');
const articleRoutes = require('./src/routes/articleRoutes');
 
app.use(cors());
app.use(
    express.urlencoded({
        extended: true,
    }),
);

app.use(bodyParser.json())
app.use(express.json());
app.use('/articles', articleRoutes);

app.get('/', (req, res) => {
  res.status(200).send('Back-end Challenge 2021 🏅 - Space Flight News');
})

const DB_USER = 'vidal-databaseNumber1';
const DB_PASSWORD = process.env.pass_database1;

mongoose
  .connect(`mongodb+srv://${DB_USER}:${DB_PASSWORD}@cluster0.ip1c0xp.mongodb.net/?retryWrites=true&w=majority`)
  .then(() => {
    console.log('Conectado');
    app.listen(3000);
  })
  .catch((err) => {
    console.log(err);
  })

