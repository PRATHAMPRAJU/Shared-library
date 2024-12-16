def call() {
    withSonarQubeEnv('SonarQube') {
        sh '''
            sonar-scanner \
            -Dsonar.projectKey=salary \
            -Dsonar.projectName=salary \
            -Dsonar.java.binaries=target
        '''
    }
}
