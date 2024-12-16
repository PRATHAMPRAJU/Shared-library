def call() {
     withSonarQubeEnv('SonarQube') {
                        sh "usr/bin/mvn clean package -Dmaven.test.skip=true sonar:sonar"
                    }
}
