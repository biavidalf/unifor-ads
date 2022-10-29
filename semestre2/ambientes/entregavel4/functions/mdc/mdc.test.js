const mdc = require('./mdc.js');

test('MDC de 12 e 15 eh 3', () => {
    expect(mdc(12, 15)).toBe("-> R: MDC de 12 e 15 é igual a: 3");
});

test('MDC de 18 e 60 eh 6', () => {
    expect(mdc(18, 60)).toBe("-> R: MDC de 18 e 60 é igual a: 6");
});