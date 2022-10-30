def factorial(n):
    """
    This number accepts a nonnegative integer n and returns n factorial
    @param n, an integer n not less than 0
    @return n!
    """

    if n == 0:
        return 1
    else:
        return n * factorial(n-1)


def Fibonacci(n):
    """
    This number accepts a positive integer n and returns the nth
    Fibonacci number. The first two Fibonacci numbers are 1, and all
    subsequent Fibonacci numbers are the sum of the two previous
    Fibonacci numbers. Therefore, this sequence is best defined recursively

    @param n the index position in the Fibonacci sequence requested
    @return the nth Fibonacci number
    """

    if n == 1 or n == 2:
        return 1
    else:
        return Fibonacci(n-1) + Fibonacci(n-2)

    """
        Inferior implementation:

        if n==1:
            return 1
        if n==2:
            return 1
        if n>2:
            s = Fibonacci(n-1)
            return s + Fibonacci(n-2)
    """

