
## 연습문제

###### 연습 1 ) 1부터 1000까지의 자연수 중 3의 배수의 합을 구해보세요 (while)


```python
n = 1
sum = 0
while n <= 1000 :
    if n%3 ==0 :
        sum += n
    n = n+1
```


```python
print(sum)
```

    166833
    

###### 연습 2 ) 다음의 별 표시 프로그램을 작성해보세요


```python
*
**
***
****
*****
```


```python
# while문으로
```


```python
i = 1
while i<6 :
    print('*'*i)
    i = i+1
```

    *
    **
    ***
    ****
    *****
    


```python
# for문으로
```


```python
for i in range(1, 6) :
    print('*'*i)
```

    *
    **
    ***
    ****
    *****
    

###### 연습 3 ) for문을 이용해 1부터 100 사이의 7의 배수 출력


```python
for i in range(1, 101) :
    if i%7 == 0 :
        print(i)
```

    7
    14
    21
    28
    35
    42
    49
    56
    63
    70
    77
    84
    91
    98
    

###### 연습 4 ) A반 총 10명의 중간고사 성적은 [70, 60, 55, 75, 95, 90, 80, 80, 85, 100]일 때, for문  이용 A학급의 평균 점수를 구해보세요


```python
score = [70, 60, 55, 75, 95, 90, 80, 80, 85, 100]
sum = 0
for i in score :
    sum += i
avg = sum / len(score)
print(avg)
```

    79.0
    

###### 연습 5 ) 아래의 코드를 리스트 내포를 사용해 바꾸어 보세요


```python
numbers = [1, 2, 3, 4, 5]
result = []
for n in numbers : 
    if n % 2 == 1 :
        result.append(n*2)
```


```python
result = [n*2 for n in numbers if n%2==1]
```


```python
result
```




    [2, 6, 10]


