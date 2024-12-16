def call() {
    withSonarQubeEnv('SonarQube') {
        sh ''' 
            sonar/bin/sonar-scanner \
            -Dsonar.projectKey=salary \
            -Dsonar.projectName=salary \
            -Dsonar.java.binaries=./target
        '''
    }
}
