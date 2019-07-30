
## 자료형 

#### 숫자형 : 숫자 형태로 이루어진 자료형


```python
a = 120
b= 40
```


```python
a
```




    120




```python
b
```




    40




```python
# 나누기
a/b
```




    3.0




```python
# 제곱
(a/b)**2
```




    9.0




```python
# 나머지
a%b
```




    0




```python
# 몫
a//b
```




    3



#### 문자열 : 문자, 단어 등으로 구성된 문자들의 집합


```python
s1 = 'I am Sam' # 작은따옴표로 양쪽 둘러싸기
s2 = "This is awesome" # 큰따옴표로 양쪽 둘러싸기
```


```python
s1
```




    'I am Sam'




```python
s2
```




    'This is awesome'




```python
type(s1)
```




    str




```python
type(s2)
```




    str




```python
# 큰따옴표 3개를 연속으로 써서 양쪽 둘러싸기
"""Life is too short, You need Python"""
```




    'Life is too short, You need Python'




```python
# 작은따옴표 3개를 연속으로 써서 양쪽 둘러싸기
'''Life is too short, You need Python'''
```




    'Life is too short, You need Python'




```python
# She is Paul's friend 출력하기 (문자열 안에 작은따옴표가 있는 경우)
```


```python
"She is Paul's friend"
```




    "She is Paul's friend"




```python
# "Python is very easy." he says. 출력하기 (문자열 안에 큰따옴표가 있는 경우)
```


```python
'"Python is very easy." he says.'
```




    '"Python is very easy." he says.'




```python
# 백슬래시(\) 사용
"\"Python is very easy.\" he says."
```




    '"Python is very easy." he says.'




```python
## 개행 (여러 줄인 문자열의 경우)
```


```python
# 줄을 바꾸는 이스케이프 코드(\n) 삽입
multiline = "I am Sam\nWho is this"
print(multiline)
```

    I am Sam
    Who is this
    


```python
print("I am Sam\nWho is this")
```

    I am Sam
    Who is this
    


```python
# 연속된 작은따옴표 3개(''') 사용
multiline1 = '''I am Sam
Who is this'''
print(multiline1)
```

    I am Sam
    Who is this
    


```python
# 연속된 큰따옴표 3개(""") 사용
multiline2 = """I am Sam
Who is this"""
print(multiline2)
```

    I am Sam
    Who is this
    


```python
## 문자열 연산
```


```python
h = 'I '
t = 'am Sam '
h+t
```




    'I am Sam '




```python
(h+t)*2
```




    'I am Sam I am Sam '




```python
print('='*20)
print('awesome')
print('='*20)
```

    ====================
    awesome
    ====================
    


```python
len(h+t)
```




    9




```python
## 문자열 인덱싱 (인덱스 0부터 시작)
```


```python
(h+t)[7]
```




    'm'




```python
d = h+t
d
```




    'I am Sam '




```python
print(d)
```

    I am Sam 
    


```python
d[-1] # 맨 뒤에서 첫번째 값
```




    ' '




```python
## 문자열 슬라이싱 : a[시작 번호 : 끝 번호] 단, 끝 번호 해당 값 포함 X
```


```python
d[0]+d[1]+d[2]+d[3]
```




    'I am'




```python
d[-9]+d[-8]+d[-7]+d[-6]
```




    'I am'




```python
d[0:4]
```




    'I am'




```python
d[-9:-5]
```




    'I am'




```python
d[2:]
```




    'am Sam '




```python
d[:4]
```




    'I am'




```python
test = '20190727cool'
```


```python
year = test[:4]
date = test[4:8]
condition = test[8:]
```


```python
print(year, date, condition)
```

    2019 0727 cool
    


```python
# 연습) test 문자열에서 c를 k로 바꾸기
```


```python
test[:8] + 'k' + test[9:]
```




    '20190727kool'




```python
test[:-4] + 'k' + test[9:]
```




    '20190727kool'




```python
## 문자열 포맷팅
```


```python
"I eat %d apples." %3 #digit
```




    'I eat 3 apples.'




```python
"현재 온도는 %d도입니다." %20
```




    '현재 온도는 20도입니다.'




```python
"현재 온도는 %s도입니다." %'이십'
```




    '현재 온도는 이십도입니다.'




```python
num = 7
"I eat %d apples." %num
```




    'I eat 7 apples.'




```python
number = 10
day = "three"
"I ate %d apples, so I was sick for %s days." %(number, day)
```




    'I ate 10 apples, so I was sick for three days.'




```python
# %를 출력하려면 %%
"Probability is %d%%" %99
```




    'Probability is 99%'




```python
# %s : 문자열(String)
# %c : 문자 1개(character)
# %d : 정수(Integer)
# %f : 부동소수(floating-point)
```


```python
## 문자열 정렬 및 공백
```


```python
# 오른쪽 정렬
t = "%10s" %"hi"  # 문자열 전체 길이 10자리 중 hi 제외 8자리는 공백
t
```




    '        hi'




```python
# 왼쪽 정렬
t = "%-10s" %"hi"
t
```




    'hi        '




```python
# 소수점 이하 4자리까지만 나타내고 싶은 경우
"%0.4f" %3.425897
```




    '3.4259'




```python
"%10.4f" %3.425897
```




    '    3.4259'




```python
## format 함수 사용 포맷팅
```


```python
# 숫자 대입
"I eat {0} apples.".format(3)  # 문자열 내 중괄호 안의 숫자는 인덱스를 의미
```




    'I eat 3 apples.'




```python
# 문자열 대입
"I eat {0} apples.".format("five")
```




    'I eat five apples.'




```python
number = 3
"I eat {0} apples.".format(number)
```




    'I eat 3 apples.'




```python
# 2개 이상의 값 넣기
number = 10
day = "three"
"I ate {0} apples, so I was sick for {1} days.".format(number, day)
```




    'I ate 10 apples, so I was sick for three days.'




```python
# 이름으로 넣기
"I ate {number} apples, so I was sick for {day} days.".format(number = 10, day = "three")
```




    'I ate 10 apples, so I was sick for three days.'




```python
# 인덱스와 이름을 혼용해서 넣기
"I ate {0} apples, so I was sick for {day} days.".format(10, day = "three")
```




    'I ate 10 apples, so I was sick for three days.'




```python
# 왼쪽 정렬
"{0:<10}".format("hi")
```




    'hi        '




```python
# 오른쪽 정렬
"{0:>10}".format("hi")
```




    '        hi'




```python
# 가운데 정렬
"{0:^10}".format("hi")
```




    '    hi    '




```python
# 공백 채우기
"{0:=^10}".format("hi")
```




    '====hi===='




```python
"{0:!<10}".format("hi")
```




    'hi!!!!!!!!'




```python
## f문자열 포맷팅
```


```python
name = "홍길동"
age = 30
f"나의 이름은 {name}입니다. 나이는 {age}입니다."
```




    '나의 이름은 홍길동입니다. 나이는 30입니다.'




```python
f"나는 내년이면 {age+1}살이 된다."
```




    '나는 내년이면 31살이 된다.'




```python
d = {'name' : '홍길동', 'age' : 30}
f"나의 이름은 {d['name']}입니다. 나이는 {d['age']}입니다."
```




    '나의 이름은 홍길동입니다. 나이는 30입니다.'




```python
# 왼쪽 정렬
f"{'hi':<10}"
```




    'hi        '




```python
# 오른쪽 정렬
f"{'hi':>10}"
```




    '        hi'




```python
# 가운데 정렬
f"{'hi':^10}"
```




    '    hi    '




```python
# 공백 채우기
f"{'hi':=^10}"
```




    '====hi===='




```python
f"{'hi':!<10}"
```




    'hi!!!!!!!!'




```python
# 소수점 표현
y = 3.42134234
f"{y:0.4f}"
```




    '3.4213'




```python
f"{y:10.4f}"
```




    '    3.4213'




```python
# '!!!python!!!' 출력하기
f"{'python':!^12}"
```




    '!!!python!!!'




```python
## 문자열 관련 함수
```


```python
# 문자 개수 세기 : count
a = 'hobby'
a.count('b') # 문자열 중 문자 b의 개수를 반환
```




    2




```python
# 위치 알려주기 : find
a = 'Python is the best choice'
a.find('b') # 문자열에서 b가 처음 나온 위치
```




    14




```python
a.find('k') # 문자열에서 k는 존재하지 않으므로 -1 반환
```




    -1




```python
# 위치 알려주기 : index
a.index('b')
```




    14




```python
# a.index('k') # find 함수와 구분, 존재하지 않는 문자를 찾으면 오류 발생
```


```python
# 문자열 삽입
",".join('abcd') # abcd 문자열의 각각의 문자 사이에 ','를 삽입
```




    'a,b,c,d'




```python
",".join(['a', 'b', 'c', 'd'])
```




    'a,b,c,d'




```python
# 소문자를 대문자로 바꾸기 : upper
a = 'hi'
a.upper()
```




    'HI'




```python
# 대문자를 소문자로 바꾸기 : lower
a = 'HI'
a.lower()
```




    'hi'




```python
# 왼쪽 공백 지우기 : lstrip
a = ' hi '
a.lstrip()
```




    'hi '




```python
# 오른쪽 공백 지우기 : rstrip
a.rstrip()
```




    ' hi'




```python
# 양쪽 공백 지우기 : strip
a.strip()
```




    'hi'




```python
# 문자열 바꾸기 : replace
a = "Life is too short"
a.replace("Life", "Your leg")
```




    'Your leg is too short'




```python
# 문자열 나누기 : split
a = "Life is too short"
a.split() # 공백(스페이스, 탭, 엔터 등)을 기준으로 문자열을 나누어 준다
```




    ['Life', 'is', 'too', 'short']




```python
b = "a:b:c:d"
b.split(":")
```




    ['a', 'b', 'c', 'd']



#### 리스트 자료형


```python
odd = [1, 3, 5, 7, 9] # 대괄호로 감싸준다
type(odd)
```




    list




```python
# 리스트 안에는 어떠한 자료형도 포함시킬 수 있다
```


```python
a = [1, 2, 'a']
type(a)
```




    list




```python
# 빈 리스트
a = []
type(a)
```




    list




```python
a = []
a.extend([1, 2, 3])
a
```




    [1, 2, 3]




```python
## 리스트 인덱싱
```


```python
a = [1, 2, 3]
a[0]
```




    1




```python
a[0]+a[1]+a[2]
```




    6




```python
a[-1]
```




    3




```python
a = [1, 2, 3, ['a', 'b', 'c']]
```


```python
a[-1]
```




    ['a', 'b', 'c']




```python
a[-1][0]
```




    'a'




```python
a = [1, 2, ['a', 'b', ['Life', 'is']]]
```


```python
# Life, is 추출하기
print(a[-1][-1][0], a[-1][-1][1])
```

    Life is
    


```python
## 리스트 슬라이싱
```


```python
a = [1, 2, 3, 4, 5]
```


```python
a[0:2] # [1,2]
```




    [1, 2]




```python
a[:2]
```




    [1, 2]




```python
a[2:]
```




    [3, 4, 5]




```python
a[:2] + a[2:]
```




    [1, 2, 3, 4, 5]




```python
## 리스트 연산
```


```python
a = [1, 2, 3]
b = [4, 5, 6]
a+b
```




    [1, 2, 3, 4, 5, 6]




```python
a = [1, 2, 3]
a*3
```




    [1, 2, 3, 1, 2, 3, 1, 2, 3]




```python
# 리스트 길이 구하기
len(a)
```




    3




```python
# '3hi' 출력하기
a = [1, 2, 3]
str(a[2])+"hi" # 형 오류 방지 : 정수와 문자열은 서로 더할 수 없으므로 str()
```




    '3hi'




```python
## 리스트 수정, 삭제 : 리스트는 값을 수정하거나 삭제할 수 있다
```


```python
a = [1, 2, 3]
a[2] = 4
a
```




    [1, 2, 4]




```python
a = [1, 2, 3]
del a[1]
a
```




    [1, 3]




```python
## 리스트 관련 함수
```


```python
# 리스트에 요소 추가 : append
a = [1, 2, 3]
a.append([1, 2, 3, 4])   # 리스트 안에는 어떤 자료형도 추가할 수 있다    
a
```




    [1, 2, 3, [1, 2, 3, 4]]




```python
# 리스트 정렬 : sort
a = [1, 4, 3, 2]
a.sort()
a
```




    [1, 2, 3, 4]




```python
a = ['a', 'c', 'b']
a.sort()
a
```




    ['a', 'b', 'c']




```python
# 리스트 뒤집기 : reverse
a = [1, 2, 3, 4]
a.reverse()
a
```




    [4, 3, 2, 1]




```python
# 위치 반환 : index -> 리스트에 값이 있으면 그 위치 값 반환, 없으면 오류
a = [1, 2, 3]
a.index(3)
```




    2




```python
# 리스트에 요소 삽입 : insert
# insert(a, b)는 리스트의 a번째 위치에 b를 삽입하는 함수
a = [1, 2, 3]
a.insert(0, 4)
a
```




    [4, 1, 2, 3]




```python
a.insert(3, 5)
a
```




    [4, 1, 2, 5, 3]




```python
# 리스트 요소 제거 : remove
# remove(x)는 리스트에서 첫 번째로 나오는 x를 삭제하는 함수
a = [1, 2, 3, 1, 2, 3]
a.remove(3)
a
```




    [1, 2, 1, 2, 3]




```python
# 리스트 요소 끄집어내기 : pop
# pop()은 리스트의 맨 마지막 요소를 돌려주고 그 요소는 삭제
a = [1, 2, 3]
a.pop()
```




    3




```python
a
```




    [1, 2]




```python
# pop(x)는 리스트의 x번째 요소를 돌려주고 그 요소는 삭제
a = [1, 2, 3]
a.pop(1)
```




    2




```python
a
```




    [1, 3]




```python
# 리스트에 포함된 요소 x의 개수 세기 : count
a = [1, 2, 3, 1]
a.count(1)
```




    2




```python
# 리스트 확장 : extend
# extend(x)에서 x에는 리스트만 올 수 있다
a = [1, 2, 3]
a.extend([4, 5])
a
```




    [1, 2, 3, 4, 5]




```python
b = [6, 7]
a.extend(b)
```


```python
a
```




    [1, 2, 3, 4, 5, 6, 7]



#### 튜플 자료형

- 리스트는 []으로 둘러싸지만 튜플은 ()으로 둘러싼다
- 리스트는 그 값의 생성, 삭제, 수정이 가능하지만 튜플은 그 값을 바꿀 수 없다
- 위 2가지를 제외하고 리스트와 유사


```python
t1 = ()
t2 = (1, )
t3 = (1, 2, 3)
t4 = 1, 2, 3
t5 = ('a', 'b', ('ab', 'cd'))
# t2 = (1, )처럼 단지 1개의 요소만을 가질 때에는 요소 뒤에 콤마를 반드시 붙여야 한다
# t4 = 1, 2, 3처럼 괄호를 생략해도 무방하다
```

#### 딕셔너리 자료형 : key-value 구조

- 리스트나 튜플처럼 순차적으로 해당 요솟값을 구하지 않고 Key를 통해 Value를 얻는다


```python
dic = {'name' : 'pey', 'phone' : '0123456789', 'birth' : '1118'}
dic
```




    {'name': 'pey', 'phone': '0123456789', 'birth': '1118'}




```python
a = {1 : 'hi'}
a[1]
```




    'hi'




```python
a = {'a' : [1, 2, 3]}
a['a']
```




    [1, 2, 3]




```python
# 딕셔너리 쌍 추가하기
a = {1 : 'a'}
a[2] = 'b'
a
```




    {1: 'a', 2: 'b'}




```python
a['name'] = 'pey'
a
```




    {1: 'a', 2: 'b', 'name': 'pey'}




```python
a[3] = [1, 2, 3]
a
```




    {1: 'a', 2: 'b', 'name': 'pey', 3: [1, 2, 3]}




```python
# 딕셔너리 요소 삭제하기
a = {1: 'a', 2: 'b', 'name': 'pey', 3: [1, 2, 3]}
del a[1] # key가 1인 key-value 쌍 삭제
a
```




    {2: 'b', 'name': 'pey', 3: [1, 2, 3]}




```python
# 딕셔너리에서 key 사용해 value 얻기
grade = {'pey' : 10, 'juliet' : 99}
```


```python
grade['pey']
```




    10




```python
grade['juliet']
```




    99




```python
# 리스트나 튜플, 문자열은 요솟값을 얻고자 할 때 인덱싱이나 슬라이싱 기법 중 하나를 사용했다. 
# 하지만 딕셔너리는 단 한 가지, key를 사용해 value를 구하는 방법밖에 없다
```


```python
## 딕셔너리 관련 함수
```


```python
# key 리스트 만들기 : keys
a = {'name' : 'pey', 'phone' : '0123456789', 'birth' : '1118'}
a.keys()
```




    dict_keys(['name', 'phone', 'birth'])




```python
for k in a.keys() :
    print(k)
```

    name
    phone
    birth
    


```python
# dict_keys 객체를 리스트로 변환하려면
list(a.keys())
```




    ['name', 'phone', 'birth']




```python
# value 리스트 만들기 : values
a.values()
```




    dict_values(['pey', '0123456789', '1118'])




```python
# key-value 쌍 얻기 : items
a.items()
```




    dict_items([('name', 'pey'), ('phone', '0123456789'), ('birth', '1118')])




```python
# key-value 쌍 모두 지우기 : clear
a.clear()
a
```




    {}




```python
# key로 value 얻기 : get
a = {'name' : 'pey', 'phone' : '0123456789', 'birth' : '1118'}
a.get('name')
```




    'pey'




```python
a.get('phone')
```




    '0123456789'




```python
# get(x, '디폴트 값') : 딕셔너리 안에 찾으려는 key 값이 없을 경우, 
# 미리 정해 둔 디폴트 값을 대신 가져오게 하고 싶을 때
a.get('foo', 'bar')
```




    'bar'




```python
# 해당 key가 딕셔너리 안에 있는지 조사하기 : in
a = {'name' : 'pey', 'phone' : '0123456789', 'birth' : '1118'}
'name' in a
```




    True




```python
'email' in a
```




    False



#### 집합 자료형

- 중복을 허용하지 않는다
- 순서가 없다(Unordered)


```python
s1 = set([1, 2, 3])
s1
```




    {1, 2, 3}




```python
s2 = set("HELLO")
s2
```




    {'E', 'H', 'L', 'O'}




```python
# set 자료형은 순서가 없기 때문에 인덱싱으로 값을 얻을 수 없다
# set 자료형에 저장된 값을 인덱싱으로 접근하려면 리스트나 튜플로 전환한 후 해야 한다
```


```python
s1 = set([1, 2, 3])
l1 = list(s1)
l1
```




    [1, 2, 3]




```python
l1[0]
```




    1




```python
t1 = tuple(s1)
t1
```




    (1, 2, 3)




```python
t1[0]
```




    1




```python
s1 = set([1, 2, 3, 4, 5, 6]) 
s2 = set([4, 5, 6, 7, 8, 9])
```


```python
# 교집합
s1 & s2
```




    {4, 5, 6}




```python
s1.intersection(s2)
```




    {4, 5, 6}




```python
# 합집합
s1 | s2
```




    {1, 2, 3, 4, 5, 6, 7, 8, 9}




```python
s1.union(s2)
```




    {1, 2, 3, 4, 5, 6, 7, 8, 9}




```python
# 차집합
s1 - s2
```




    {1, 2, 3}




```python
s1.difference(s2)
```




    {1, 2, 3}




```python
s2 - s1
```




    {7, 8, 9}




```python
s2.difference(s1)
```




    {7, 8, 9}




```python
## 집합 자료형 관련 함수
```


```python
# 값 1개 추가하기 : add
s1 = set([1, 2, 3])
s1.add(4)
s1
```




    {1, 2, 3, 4}




```python
# 값 여러 개 추가하기 : update -> 여러 개의 값을 한꺼번에 추가할 때
s1 = set([1, 2, 3])
s1.update([4, 5, 6])
s1
```




    {1, 2, 3, 4, 5, 6}




```python
# 특정 값 제거하기 : remove
s1 = set([1, 2, 3])
s1.remove(2)
s1
```




    {1, 3}


