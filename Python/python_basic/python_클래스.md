
## 클래스


```python
class Calculator :
    def __init__(self) :
        self.result = 0
```


```python
a = Calculator()
```


```python
a.result
```




    0




```python
class Calculator :
    def __init__(self) :
        self.result = 0
    
    def add(self, num) :
        self.result += num
        return self.result
```


```python
cal1 = Calculator()
```


```python
cal1.result
```




    0




```python
cal1.add(3)
```




    3




```python
cal1.add(5)
```




    8




```python
# 데이터 입력 메서드 작성
class FourCal :
    def setdata(self, first, second) :
        self.first = first
        self.second = second
```


```python
a = FourCal()
```


```python
print(type(a))
```

    <class '__main__.FourCal'>
    


```python
a.setdata(4, 5)
```


```python
a.first, a.second
```




    (4, 5)




```python
# 더하기 기능
class FourCal :
    def setdata(self, first, second) :
        self.first = first
        self.second = second

    def add(self) :
        result = self.first + self.second
        return result
```


```python
a = FourCal()
```


```python
a.setdata(4, 2)
```


```python
a.add()
```




    6




```python
# 사칙연산 기능
class FourCal :
    def setdata(self, first, second) :
        self.first = first
        self.second = second

    def add(self) :
        result = self.first + self.second
        return result
    
    def mul(self) :
        result = self.first * self.second
        return result
    
    def sub(self) :
        result = self.first - self.second
        return result
    
    def div(self) :
        result = self.first / self.second
        return result
```


```python
a = FourCal()
```


```python
a.setdata(5, 6)
```


```python
a.mul()
```




    30




```python
# 생성자 이용
class FourCal :
    def __init__(self, first, second) :
        self.first = first
        self.second = second
   
    def add(self) :
        result = self.first + self.second
        return result
    
    def mul(self) :
        result = self.first * self.second
        return result
    
    def sub(self) :
        result = self.first - self.second
        return result
    
    def div(self) :
        result = self.first / self.second
        return result
```


```python
a = FourCal(5, 6)
```


```python
a.add()
```




    11




```python
a.mul()
```




    30




```python
a.add(), a.mul()
```




    (11, 30)




```python
# 클래스 상속
class MoreFourCal(FourCal) :
    pass
```


```python
a = MoreFourCal(4, 2)
```


```python
a.add()
```




    6




```python
class MoreFourCal(FourCal) :
    def pow(self) :
        result = self.first ** self.second
        return result
```


```python
a = MoreFourCal(5, 6)
```


```python
a.pow()
```




    15625




```python
# 메서드 오버라이딩
class SafeFourCal(FourCal) :
    def div(self) :
        if self.second == 0 :
            return 0
        else :
            return self.first / self.second
```


```python
a = SafeFourCal(2, 0)
```


```python
a.div()
```




    0




```python
class Calculator :
    def __init__(self) :
        self.result = 0
    
    def initation(self) :   # 초기화 메소드
        self.result = 0
    
    def add(self, num) :
        self.result += num
        return self.result
```


```python
a = Calculator()
```


```python
a.add(3)
```




    3




```python
a.result
```




    3




```python
a.initation()
```


```python
a.result
```




    0




```python
a.add(5)
```




    5




```python
a.result
```




    5


