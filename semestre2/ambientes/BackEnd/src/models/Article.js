const mongoose = require('mongoose');

const Article = mongoose.model('Article', {
    id: Number,
    featured: Boolean,
    title: String,
    url: String,
    imageUrl: String,
    newsSite: String,
    summary: String,
    publishedAt: String,
    launches: [
      {
        id: String,
        provider: String
      }
    ],
    events: [
      {
        id: String,
        provider: String
      }
    ]
})

module.exports = Article;