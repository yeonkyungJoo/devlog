
## 제어문


```python
money = 2000
if money >= 3000 :
    print('택시를 타고 가라')
else :
    print('걸어가라')
```

    걸어가라
    


```python
money = 2000
card = True
if money >= 3000 or card :
    print('택시를 타고 가라')
else :
    print('걸어가라')
```

    택시를 타고 가라
    


```python
1 in [1, 2, 3]
```




    True




```python
1 not in [1, 2, 3]
```




    False




```python
'a' in ('a', 'b', 'c')
```




    True




```python
'j' not in 'python'
```




    True




```python
pocket = ['paper', 'cellphone', 'money']
if 'money' in pocket :
    print('택시를 타고 가라')
else :
    print('걸어가라')
```

    택시를 타고 가라
    


```python
pocket = ['paper', 'cellphone']
card = False
if 'money' in pocket :
    print('택시를 타고 가라')
elif card :
    print('택시를 타고 가라')
else :
    print('걸어가라')
```

    걸어가라
    


```python
pocket = ['paper', 'cellphone']
card = False
if 'money' in pocket : print('택시를 타고 가라')
elif card : print('택시를 타고 가라')
else : print('걸어가라')
```

    걸어가라
    


```python
score = 50
```


```python
if score >= 60 :
    message = "success"
else :
    message = "failure"
```


```python
print(message)
```

    failure
    


```python
message = "success" if score >= 60 else "failure"
```


```python
print(message)
```

    failure
    

#### while


```python
treeHit = 0
while treeHit < 10 :
    treeHit = treeHit + 1
    print("나무를 %d번 찍었습니다." %treeHit)
    if(treeHit == 10) :
        print("나무 넘어갑니다.")
```

    나무를 1번 찍었습니다.
    나무를 2번 찍었습니다.
    나무를 3번 찍었습니다.
    나무를 4번 찍었습니다.
    나무를 5번 찍었습니다.
    나무를 6번 찍었습니다.
    나무를 7번 찍었습니다.
    나무를 8번 찍었습니다.
    나무를 9번 찍었습니다.
    나무를 10번 찍었습니다.
    나무 넘어갑니다.
    


```python
treeHit = 0
while treeHit < 10 :
    treeHit += 1
    print("나무를 %d번 찍었습니다." %treeHit)
    if(treeHit == 10) :
        print("나무 넘어갑니다.")
```

    나무를 1번 찍었습니다.
    나무를 2번 찍었습니다.
    나무를 3번 찍었습니다.
    나무를 4번 찍었습니다.
    나무를 5번 찍었습니다.
    나무를 6번 찍었습니다.
    나무를 7번 찍었습니다.
    나무를 8번 찍었습니다.
    나무를 9번 찍었습니다.
    나무를 10번 찍었습니다.
    나무 넘어갑니다.
    


```python
## 무한루프 벗어나기 : break
```


```python
# 커피자판기
coffee = 10
money = 300
while money :
    print("돈을 받았으니 커피를 줍니다.")
    coffee = coffee - 1
    print("남은 커피의 양은 %d개입니다." %coffee)
    if coffee == 0 :
        print("커피가 다 떨어졌습니다. 판매를 중지합니다.")
        break
```

    돈을 받았으니 커피를 줍니다.
    남은 커피의 양은 9개입니다.
    돈을 받았으니 커피를 줍니다.
    남은 커피의 양은 8개입니다.
    돈을 받았으니 커피를 줍니다.
    남은 커피의 양은 7개입니다.
    돈을 받았으니 커피를 줍니다.
    남은 커피의 양은 6개입니다.
    돈을 받았으니 커피를 줍니다.
    남은 커피의 양은 5개입니다.
    돈을 받았으니 커피를 줍니다.
    남은 커피의 양은 4개입니다.
    돈을 받았으니 커피를 줍니다.
    남은 커피의 양은 3개입니다.
    돈을 받았으니 커피를 줍니다.
    남은 커피의 양은 2개입니다.
    돈을 받았으니 커피를 줍니다.
    남은 커피의 양은 1개입니다.
    돈을 받았으니 커피를 줍니다.
    남은 커피의 양은 0개입니다.
    커피가 다 떨어졌습니다. 판매를 중지합니다.
    


```python
## 반복문의 맨 처음으로 돌아가기 : continue
```


```python
# continue 이용 홀수만 출력
a = 0
while a < 10 :
    a = a + 1
    if a % 2 == 0 :
        continue
    print(a)
```

    1
    3
    5
    7
    9
    


```python
# pass 이용 홀수만 출력
a = 0
while a < 10 :
    a = a + 1
    if a % 2 == 0 :
        pass
    else : 
        print(a)
```

    1
    3
    5
    7
    9
    

#### for

for 변수 in 리스트(또는 튜플, 문자열) :
                    수행할 문장 


```python
sum = 0
for i in range(1, 11) : # range(1, 11)에서 11은 포함 X
    sum = sum + i
print(sum)
```

    55
    


```python
a = [1, 2, 3, 4]
result = []
for num in a :
    result.append(num*3)
```


```python
result
```




    [3, 6, 9, 12]




```python
a = [3, 4, 5, 6]
result = [num*3 for num in a]
```


```python
result
```




    [9, 12, 15, 18]




```python
a = [5, 6, 7, 8]
result = [n*3 for n in a if n % 2 == 0]
```


```python
result
```




    [18, 24]



#### 사용자 정의 함수


```python
def add(a, b) :
    result = a+b
    return result
```


```python
add(3, 4)
```




    7




```python
# 결과값이 없는 함수
def adding(a, b) :
    print("%d, %d의 합은 %d입니다." %(a, b, (a+b)))
```


```python
k = adding(3, 4)
```

    3, 4의 합은 7입니다.
    


```python
print(k) # None은 결과값이 없다는 것
```

    None
    


```python
# 입력값이 몇 개인지 정확히 모를 때
def add_many (*many) :
    result = 0
    for i in many :
        result += i
    return result
```


```python
add_many(5, 6, 7, 8, 9)
```




    35




```python
def add_mul(choice, *args) :
    if choice == 'add' :
        result = 0     # 초기화
        for i in args :
            result += i
    elif choice == 'mul' :
        result = 1     # 초기화
        for i in args :
            result *= i
    return result
```


```python
add_mul('mul', 1, 2, 3, 4)
```




    24




```python
# 함수의 결과값은 하나
def add_and_mul(a, b) :
    return a+b, a*b    # 두 개의 값을 가진 하나의 튜플로 return
```


```python
add_and_mul(3, 4)
```




    (7, 12)




```python
type(add_and_mul(3, 4))
```




    tuple




```python
result1, result2 = add_and_mul(3, 4)
```


```python
result1
```




    7




```python
result2
```




    12




```python
# 함수 안 변수의 효력
a = 1
def vartest(n) :
    n = n +1
```


```python
vartest(a) # 함수 실행
```


```python
a
```




    1




```python
a = 1
def vartest(n) :
    n = n + 1
    return n
```


```python
vartest(a)
```




    2




```python
# lambda (return 없이 결과값 반환)
add = lambda a, b : a+b
```


```python
result = add(3, 4)
```


```python
result
```




    7


