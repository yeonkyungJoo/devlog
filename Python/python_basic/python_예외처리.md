
## 예외처리


```python
def AddDiv(a, b) :
    result1 = a+b
    result2 = a/b
    return result1, result2
```


```python
AddDiv(2, 0)
```


    ---------------------------------------------------------------------------

    ZeroDivisionError                         Traceback (most recent call last)

    <ipython-input-3-517955c4b773> in <module>()
    ----> 1 AddDiv(2, 0)
    

    <ipython-input-1-c2eca38dbb95> in AddDiv(a, b)
          1 def AddDiv(a, b) :
          2     result1 = a+b
    ----> 3     result2 = a/b
          4     return result1, result2
    

    ZeroDivisionError: division by zero



```python
def AddDiv(a, b) :
    result1 = a+b
    try :
        result2 = a/b
        return result1, result2
    except :
        print("a+b는 %d" %result1, '\n0으로 나눌 수 없습니다')
```


```python
AddDiv(2, 0)
```

    a+b는 2 
    0으로 나눌 수 없습니다
    


```python
# 발생오류만 포함한 except문
def AddDiv(a, b) :
    result1 = a+b
    try :
        result2 = a/b
        return result1, result2
    except ZeroDivisionError :
        print(result1, "error")
```


```python
AddDiv(2, 0)
```

    2 error
    


```python
# 발생오류와 오류메세지 변수까지 포함
def AddDiv(a, b) :
    result1 = a+b
    try :
        result2 = a/b
        return ("a+b는 %d" %result1, "a/b는 %d" %result2)
    except ZeroDivisionError as e :
        print("a+b는 %d" %result1, "\n두번째는 에러코드", e)
```


```python
AddDiv(2, 0)
```

    a+b는 2 
    두번째는 에러코드 division by zero
    


```python
# 여러 개의 오류 처리 : 먼저 나온 오류 처리
try : 
    a = [1, 2]
    4/0
    print(a[3])
except ZeroDivisionError :
    print('0으로 나눌 수 없습니다')
except IndexError :
    print('인덱싱할 수 없습니다')
```

    0으로 나눌 수 없습니다
    


```python
try : 
    a = [1, 2]
    print(a[3])
    4/0

except ZeroDivisionError :
    print('0으로 나눌 수 없습니다')
except IndexError :
    print('인덱싱할 수 없습니다')
```

    인덱싱할 수 없습니다
    


```python
try : 
    a = [1, 2]
    print(a[3])
    4/0

except ZeroDivisionError as e:
    print(e)
except IndexError as e:
    print(e)
```

    list index out of range
    


```python
try : 
    a = [1, 2]
    4/0
    print(a[3])

except ZeroDivisionError as e:
    print(e)
except IndexError as e:
    print(e)
```

    division by zero
    

#### 오류 회피


```python
f = open('없는파일.txt', 'r')
```


    ---------------------------------------------------------------------------

    FileNotFoundError                         Traceback (most recent call last)

    <ipython-input-17-c0c01e0cc22c> in <module>()
    ----> 1 f = open('없는파일.txt', 'r')
    

    FileNotFoundError: [Errno 2] No such file or directory: '없는파일.txt'



```python
try :
    f = open('없는파일.txt', 'r')
except FileNotFoundError :
    pass
```
