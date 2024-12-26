def call() {
    // Dependency 
    archiveArtifacts artifacts: 'target/dependency-check-report.html', allowEmptyArchive: true, includes: '**/*.html'

    // DAST 
    archiveArtifacts artifacts: 'nikto_report.html', allowEmptyArchive: true, includes: '**/*.html'
}
