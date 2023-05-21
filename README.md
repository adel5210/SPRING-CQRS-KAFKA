# Spring CQRS pattern

Includes
- Kafka Producer/Consumer
- Vaadin UI
- env
- okteto


### Commit large files

Use this reference https://git-lfs.com/

### deploy through okteto
- Install okteto cli
- run `okteto up`
- Select NO to not create okteto cli

### Technical issue on okteto
- Sleep all pods

### Run Gradle prod
`clean build jar --project-prop vaadin.productionMode=true`

### Gradle build
`./gradlew clean vaadinBuildFrontend build`