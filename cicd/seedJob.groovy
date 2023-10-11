def folderName = "hello-world"
def pipelineDetails = [
  [name: "01-echo-helloworld", script_path: "cicd/01-Jenkinsfile-helloworld"],
  [name: "02-maven-build", script_path: "cicd/02-Jenkinsfile-maven-build"],
  [name: "03-maven-build-tools", script_path: "cicd/03-Jenkinsfile-maven-build-tools"],
  [name: "04-maven-triggers-hook", script_path: "cicd/04-Jenkinsfile-maven-triggers-hook"],
  [name: "05-maven-triggers-poll", script_path: "cicd/05-Jenkinsfile-maven-triggers-poll"],
  [name: "06-maven-triggers-cron", script_path: "cicd/06-Jenkinsfile-maven-triggers-cron"],
  [name: "07-maven-build-options", script_path: "cicd/07-Jenkinsfile-maven-build-options"],
  [name: "08-maven-post-cleanup", script_path: "cicd/08-Jenkinsfile-maven-post-cleanup"],
  [name: "09-maven-build-parameters-string", script_path: "cicd/09-Jenkinsfile-maven-build-parameters-string"],
  [name: "10-maven-build-parameters-choice", script_path: "cicd/10-Jenkinsfile-maven-build-parameters-choice"]
]

folder(folderName) {
  displayName(folderName)
}

for (pipelineDetail in pipelineDetails) {
  pipelineJob("${folderName}/${pipelineDetail.name}") {
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
        lightweight(true)
        scriptPath(pipelineDetail.script_path)
      }
    }
  }
}
