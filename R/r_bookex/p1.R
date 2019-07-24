
#### 한국복지패널데이터 분석


install.packages("foreign") # foreign 패키지 설치 
                            # SPSS, SAS, STATA 등 다양한 통계분석 소프트웨어의 파일 불러오기
install.packages("readxl")

library(foreign) # SPSS 파일 불러오기
library(dplyr) # 전처리
library(ggplot2) # 시각화
library(readxl) # Excel 파일 불러오기


# 데이터 불러오기
getwd()
setwd("C:\\Rwork\\r_practice")
raw_welfare <- read.spss(file = "Koweps_hpc10_2015_beta1.sav", to.data.frame = T) # 기본적으로 리스트 형태
raw_welfare
View(raw_welfare)

# 복사본 만들기
welfare <- raw_welfare

# 데이터 검토
head(welfare)
tail(welfare)
View(welfare)
dim(welfare)
str(welfare)
summary(welfare)

# 변수명 변경
welfare <- rename(welfare,
                  sex = h10_g3,
                  birth = h10_g4,
                  marriage = h10_g10,
                  religion = h10_g11,
                  income = p1002_8aq1,
                  code_job = h10_eco9,
                  code_region = h10_reg7)
View(welfare)


welfare <- welfare %>% select(sex, birth, marriage, religion, income, code_job, code_region)
View(welfare)

# <데이터 분석 절차>
# 1단계 : 변수 검토 및 전처리(변수 각각)
# - 변수 특성 파악
# - 이상치 정제
# - 파생변수 생성
# 2단계 : 변수 간 관계 분석
# - 데이터 요약 표
# - 그래프

## 1) 성별에 따른 월급 차이 - "성별에 따라 월급이 다를까?" ----------------------------- ## 

class(welfare$sex) # class() : 변수의 타입을 확인
table(welfare$sex) # table() : 각 범주에 해당하는 데이터 수 확인, 범주 변수에 사용

# 이상치 결측 처리
welfare$sex <- ifelse(welfare$sex == 9, NA, welfare$sex)

# 결측치 확인
table(is.na(welfare$sex))

# 성별 항목 이름 부여 (1: 남(male), 2: 여(female))
welfare$sex <- ifelse(welfare$sex == 1, "male", "female")
table(welfare$sex)
qplot(welfare$sex)


class(welfare$income)
summary(welfare$income) # 연속 변수는 summary()로 요약 통계량을 확인해야 특징 파악 가능
qplot(welfare$income)
qplot(welfare$income) + xlim(0, 1000) # xlim()을 이용하여 0~1000까지만 표현되도록 설정

# income 이상치 결측 처리
welfare$income <- ifelse(welfare$income %in% c(0,9999), NA, welfare$income)

# 결측치 확인
table(is.na(welfare$income))

## sex-income 변수 간 관계 분석
# 성(sex)별 월급(income) 평균표, 그래프 만들기 
sex_income <- welfare %>% 
                      filter(!is.na(income)) %>% 
                      group_by(sex) %>% 
                      summarise(mean_income = mean(income))
sex_income

ggplot(data = sex_income, aes(x=sex, y=mean_income)) + geom_col()



## 2) 나이와 월급의 관계 - "몇 살 때 월급을 가장 많이 받을까?" ----------------------------- ## 

# 나이 변수 검토 : 태어난 연도(welfare$birth)를 이용해서 나이 변수(파생변수)를 만들어야 한다
class(welfare$birth)
summary(welfare$birth)
qplot(welfare$birth)

# 이상치 확인
summary(welfare$birth)

# 결측치 확인
table(is.na(welfare$birth))

# (이상치가 없지만, 있다면) 이상치 결측처리
welfare$birth <- ifelse(welfare$birth == 9999, NA, welfare$birth)
table(is.na(welfare$birth))

# 나이 파생변수 만들기
welfare$age <- 2015 - welfare$birth + 1 # 2015년에 조사가 진행되었으므로
welfare$age
summary(welfare$age)
qplot(welfare$age)

# 나이에 따른 월급 평균표, 그래프 만들기
age_income <- welfare %>% 
                      filter(!is.na(income)) %>% 
                      group_by(age) %>% 
                      summarise(mean_income = mean(income))
age_income
head(age_income)

ggplot(data = age_income, aes(x=age, y=mean_income)) + geom_line()


## 3) 연령대에 따른 월급 차이 - "어떤 연령대의 월급이 가장 많을까?" ----------------------------- ## 
