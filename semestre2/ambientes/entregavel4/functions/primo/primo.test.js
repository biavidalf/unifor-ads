const primo = require('./primo.js');

test('5 eh um numero primo', () => {
    expect(primo(5)).toBe("-> R: O número digitado (5) é primo.");
});

test('12 nao eh um numero primo', () => {
    expect(primo(12)).toBe("-> R: O número digitado (12) não é primo.");
});