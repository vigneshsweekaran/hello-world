folder('hello-world') {
  displayName('hello-world')
}
pipelineJob('01-echo-helloworld') {
  definition {
    cpsScm {
      scm{
        git {
          branch('main')
          remote{
            url('https://github.com/vigneshsweekaran/hello-world.git')
          }
        }
      }
      scriptPath('cicd/01-Jenkinsfile-helloworld')
    }
  }
}