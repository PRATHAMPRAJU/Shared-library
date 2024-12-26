def call() {
    archiveArtifacts artifacts: 'target/dependency-check-report.html', allowEmptyArchive: true

    archiveArtifacts artifacts: 'nikto_report.html', allowEmptyArchive: true
}
