#### Logistic Regression 예제

## 1. 종속변수의 범주가 2개로 하기 위해 iris 데이터의 일부분만 이용
## --> 종속변수는 setosa, versicolor 2개로 이항분류 적용, 독립변수는 sepal.length만 이용

library(dplyr)

# 1) 데이터 로딩 및 서브셋

data(iris)
str(iris)
View(iris)

iris <- iris %>% filter(Species %in% c("setosa", "versicolor")) %>% 
                  select(Sepal.Length, Species)
# iris <- subset(iris, Species == 'setosa' | Species =='versicolor')
iris
str(iris)

# 2) factor로 변경

iris$Species <- as.factor(iris$Species)
str(iris)
class(iris$Species)
table(iris$Species)

# 3) glm 함수로 모델 생성(family = binomial)

m_iris <- glm(Species ~., data = iris, family = 'binomial') 
# 원래 데이터에서 하려면 Species ~(독립변수) 
# =-> glm(formula = Species ~Sepal.Length, data = iris, family = 'binomial')

m_iris

# 4) 적합된 모델 요약 정보 보기

summary(m_iris)

# 5) 적합결과 보기

fitted(m_iris)

# 6) predict 위해 편의상 모형 구축에 사용된 데이터, (인덱스) 1,50,51,100 사용

test_iris <- iris [c(1, 5, 51, 100),]
test_iris
str(test_iris)

# 7) predict()로 예측 실시

pre <- predict(m_iris, newdata = test_iris , type = "response" )
pre

# 8) 0.5보다 작으면 1(setosa), 아니면 2(versicolor)로 리코딩

result_pre <- ifelse(pre < 0.5, "setosa", "versicolor")
result_pre
table(result_pre)

# 9) 예측결과와 테스트데이터 caret, e1071 패키지의 confusionMatrix()로 비교

require(caret)
require(e1071)

table(result_pre, test_iris$Species)
confusionMatrix(as.factor(result_pre), as.factor(test_iris$Species))

# 10) 7:3 분할하여 모델 적합 및 예측 재실시

idx <- sample(1: nrow(iris), nrow(iris)*0.7) 
idx

# set.seed(1)
# idx1 <- sample(1: nrow(iris), nrow(iris)*0.7)
# idx

# set.seed(2)
# idx2 <- sample(1 : nrow(iris), nrow(iris)*0.7)
# idx2

train <- iris[idx, ]
nrow(train)
test <- iris[-idx, ]
nrow(test)

# 11) 모델 적합하기

model_iris <-  glm(Species ~., data = train, family = 'binomial')
model_iris

# 12) 테스트 데이터 이용 예측

predict_iris <- predict(model_iris, newdata = test, type = "response")
predict_iris

# 13) 0.5보다 작으면 1(setosa), 아니면 2(versicolor)로 리코딩

predict_iris <- ifelse(predict_iris < 0.5, "setosa", "versicolor")
predict_iris
table(predict_iris)

# 14) 정확도 비교

table(predict_iris, test$Species)
confusionMatrix(as.factor(predict_iris), as.factor(test$Species))
