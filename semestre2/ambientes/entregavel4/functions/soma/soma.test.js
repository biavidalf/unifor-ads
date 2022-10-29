const soma = require('./soma.js');

test('2 + 3 eh 5', () => {
    expect(soma([2, 3])).toBe("-> R: A soma dos 2 números é igual a: 5");
});

test('3.2 + 0 + -0.2 eh 3', () => {
    expect(soma([3.2, 0, -0.2])).toBe("-> R: A soma dos 3 números é igual a: 3");
});
