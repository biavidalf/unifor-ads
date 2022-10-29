const contagem = require('./contagem.js');

test('3 numeros inteiros', () => {
    expect(contagem([2, 4.5, 3, 53])).toBe("Quantidade de números inteiros: 3");
});

test('1 numeros inteiros', () => {
    expect(contagem([2.1, 4.5, 3.6, 1.0])).toBe("Quantidade de números inteiros: 1");
});