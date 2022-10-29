const primo = require('./primo.js');

test('5 eh um numero primo', () => {
    expect(primo(5)).toBe("-> R: O número digitado (5) é primo.");
});
