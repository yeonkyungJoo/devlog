
## 연습문제

###### 연습 1 )  a = "a:b:c:d"에서 객체 a의 메서드를 이용하여 a#b#c#d#으로 바꿔서 출력하세요


```python
a = "a:b:c:d"
a.replace(":", "#")
```




    'a#b#c#d'




```python
a = a.replace(":", "#") + "#"
```


```python
a
```




    'a#b#c#d#'



###### 연습 2 ) [1, 3, 5, 4, 2]를 [5, 4, 3, 2, 1]로 만들어보세요


```python
a = [1, 3, 5, 4, 2]
a.sort()
a
```




    [1, 2, 3, 4, 5]




```python
a.reverse()
```


```python
a
```




    [5, 4, 3, 2, 1]



###### 연습 3 ) ['This', 'is', 'awesome'] 리스트를 This is awesome 문자열로 만들어 출력하세요


```python
a = ['This', 'is', 'awesome']
" ".join(a)
```




    'This is awesome'



###### 연습 4 )  a = {'A' : 90, 'B' : 80, 'C' : 70}에서 B에 해당하는 값 출력과 동시에 a 리스트에서 삭제하세요


```python
a = {'A' : 90, 'B' : 80, 'C' : 70}
```


```python
a.pop('B')
```




    80




```python
a
```




    {'A': 90, 'C': 70}



###### 연습 5 ) a = [1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5]를 중복 숫자 없이 만들어보세요


```python
a = [1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5]
```


```python
set_a = set(a)
set_a
```




    {1, 2, 3, 4, 5}




```python
a = list(set_a)
```


```python
a
```




    [1, 2, 3, 4, 5]


