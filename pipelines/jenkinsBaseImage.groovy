multibranchPipelineJob('jenkinsBaseImage') {
    branchSources {
        github {
            id('jenkinsBaseImage')
            scanCredentialsId('github-cred')
            repoOwner('vittoriodargenio92')
            repository('jenkinsBaseImage')
        }
    }
}