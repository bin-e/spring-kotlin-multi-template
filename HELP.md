# spring-service-domain-template

## 사용법
1. `settings.gradle.kts` 에 `rootProject.name` 변경
2. `main` Application name 변경 (e.g. SpringServiceDomainTemplateApplication -> SpringService**Application)
3. 패키지명 변경 (e.g. `com.parkju.spring.service.**`)
4. `domain` 과 `service` 코드 변경 (Intellij 로 해결하면 한번에 됨)
5. 

## 셋팅
1. Intellij -> New Project -> Gradle -> Kotlin/JVM
2. 프로젝트 우클릭 -> new -> module -> 동일하게 빈 모듈로 각각 `doamin`, `service` 생성
3. gradle 및 settings 설정
4. `.gitignore` 설정
