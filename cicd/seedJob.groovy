def folderName = "hello-world"

folder(folderName) {
  displayName(folderName)
}
pipelineJob("${folderName}/01-echo-helloworld") {
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
pipelineJob("${folderName}/02-maven-build") {
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
      scriptPath('cicd/02-Jenkinsfile-maven-build')
    }
  }
}
pipelineJob("${folderName}/03-maven-build-tools") {
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
      scriptPath('cicd/03-Jenkinsfile-maven-build-tools')
    }
  }
}
pipelineJob("${folderName}/04-maven-triggers-hook") {
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
      scriptPath('cicd/04-Jenkinsfile-maven-triggers-hook')
    }
  }
}
pipelineJob("${folderName}/05-maven-triggers-poll") {
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
      scriptPath('cicd/05-Jenkinsfile-maven-triggers-poll')
    }
  }
}
pipelineJob("${folderName}/06-maven-triggers-cron") {
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
      scriptPath('cicd/06-Jenkinsfile-maven-triggers-cron')
    }
  }
}
pipelineJob("${folderName}/07-maven-build-options") {
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
      scriptPath('cicd/07-Jenkinsfile-maven-build-options')
    }
  }
}