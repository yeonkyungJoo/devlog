
#### 로지스틱 회귀분석(Logistic Regression) ####

# - 목적 : 일반 회귀분석과 동일하게 종속변수와 독립변수 간의 관계를 나타내어 향후 예측 모델을 생성하는데 있다.
# - 유형 : 이항형(종속변수가 2개 범주 - Yes/No), 다항형(종속변수가 3개 이상 범주 - iris 꽃 종류)
# - 다항형 로지스틱 회귀분석 : nnet, rpart 패키지 이용
# - a : 0.6, b : 0.3, c : 0.1  -> a 분류
# - 분야 : 의료, 통신, 기타 데이터마이닝

# <선형회귀분석 vs 로지스틱 회귀분석>
# 1. 로지스틱 회귀분석 결과는 0과 1로 나타난다. (이항형)
# 2. 정규분포 대신에 이항분포를 따른다.
# 3. 로지스틱 모형 적용 : 변수[-무한대, +무한대] -> 변수[0,1] 사이에 있도록 하는 모형
# => 로짓 변환 : 출력 범위를 [0, 1]로 조정
# 4. 종속변수가 2개 이상인 경우 더미변수(dummy variable)로 변환하여 0과 1를 갖도록 한다.
# ex) 혈액형 A인 경우 -> [1, 0, 0, 0] AB(1) -> A, B, O (0)


## 데이터 가져오기

getwd()
setwd("C:\\Rwork\\d6")

weather <- read.csv("weather.csv", stringsAsFactors = F)
dim(weather)
str(weather)
View(weather)

## chr 칼럼, Date, RainToday 칼럼 제거

weather_df <- weather[,c(-1, -6, -8, -14)]
str(weather_df)
View(weather_df)

## RainTomorrow 칼럼

weather_df$RainTomorrow[weather_df$RainTomorrow=='Yes'] <- 1
weather_df$RainTomorrow[weather_df$RainTomorrow=='No'] <- 0
weather_df$RainTomorrow <- as.numeric(weather_df$RainTomorrow)
View(weather_df)

## 데이터 분류(train, test) : sample() 사용

idx <- sample(1:nrow(weather_df), nrow(weather_df)*0.7)
idx

train <- weather_df[idx, ]
nrow(train)
test <- weather_df[-idx, ]
nrow(test)


## 모델 생성 : 학습데이터

weather_model <- glm(RainTomorrow ~ ., data = train, family = 'binomial') # glm은 내장함수
weather_model
summary(weather_model)


## 예측 실시

# newdata = test : 새로운 데이터 셋, type = "response" : 0 ~ 1 확률값으로 예측
pred <- predict(weather_model, newdata = test, type = "response")
pred
summary(pred)


## 예측치 : 0과 1로 변환(0.5 기준)

result_pred <- ifelse(pred>=0.5, 1, 0)
result_pred
table(result_pred)

table(result_pred, test$RainTomorrow)
confusionMatrix(as.factor(result_pred), as.factor(test$RainTomorrow))
