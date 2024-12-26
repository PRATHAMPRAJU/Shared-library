def call() {
    def targetUrl = 'http://3.138.32.243:8080/swagger-ui/index.html'
    def reportFile = 'nikto_report.html'

    sh """
        sudo apt-get update && sudo apt-get install -y nikto
        nikto -h ${targetUrl} -o ${reportFile} -Tuning 2
    """
}
