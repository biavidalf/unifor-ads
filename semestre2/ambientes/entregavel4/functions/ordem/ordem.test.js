const ordem = require('./ordem.js');

test('2, 11, 3 ordenado eh 2, 3, 11', () => {
    expect(ordem([2, 11, 3])).toBe("-> R: Valores Ordenados: 2,3,11");
});

test('53, 11, 1.5, -2 ordenado eh -2, 1.5, 11, 53', () => {
    expect(ordem([53, 11, 1.5, -2])).toBe("-> R: Valores Ordenados: -2,1.5,11,53");
});