const fibonacci = require('./fibonacci.js');

test('Serie Fibonacci com 4 termos eh igual a 0, 1, 1, 2', () => {
    expect(fibonacci(4)).toBe("-> R: Série Fibonacci com 4 termos: 0, 1, 1, 2.");
});

test('Serie Fibonacci com 7 termos eh igual a 0, 1, 1, 2, 3, 5, 8.', () => {
    expect(fibonacci(7)).toBe("-> R: Série Fibonacci com 7 termos: 0, 1, 1, 2, 3, 5, 8.");
});