def call() {
    // Dependency check report archiving
    archiveArtifacts artifacts: 'target/dependency-check-report.html', allowEmptyArchive: true, includes: '**/*.html'

    // DAST report archiving
    archiveArtifacts artifacts: 'nikto_report.html', allowEmptyArchive: true, includes: '**/*.html'
}
