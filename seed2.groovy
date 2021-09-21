def githubUrl = "https://github.com/m-goos/jenkins-jobdsl-seedrepo-example.git"

pipelineJob("Seed job 2") {
definition {
    cpsScm {
        scm {
            git{
              remote {
                url("${githubUrl}")
                // credentials("${SSH_CREDENTIALS}")
              }
              branch("*/seed-job-2")
            }
        }
    }
  }
}