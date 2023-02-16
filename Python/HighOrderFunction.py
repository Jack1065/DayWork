def loud(text):
    return text.upper()
def quiet(text):
    return text.lower()

def hello(func):
    text = func("hello world")
    print(text)
    
    
hello(quiet)

def divisor(x):
    def dividend(y):
        return y/x
    return dividend
    
    
divide = divisor(2)
print(divide(10))