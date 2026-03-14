def folderName = "hello-world"
def pipelineDetails = [
  [name: "01-helloworld", script_path: "cicd/01-Jenkinsfile-helloworld"],
  [name: "02-maven-build", script_path: "cicd/02-Jenkinsfile-maven-build"],
  [name: "03-maven-build-tools", script_path: "cicd/03-Jenkinsfile-maven-build-tools"],
  [name: "04-maven-triggers-webhook", script_path: "cicd/04-Jenkinsfile-maven-triggers-webhook"],
  [name: "05-maven-triggers-pollscm", script_path: "cicd/05-Jenkinsfile-maven-triggers-pollscm"],
  [name: "06-maven-triggers-cron", script_path: "cicd/06-Jenkinsfile-maven-triggers-cron"],
  [name: "07-maven-triggers-upstream", script_path: "cicd/07-Jenkinsfile-maven-triggers-upstream"],
  [name: "08-child-pipeline", script_path: "cicd/08-Jenkinsfile-child-pipeline"],
  [name: "08-parent-pipeline", script_path: "cicd/08-Jenkinsfile-parent-pipeline"],
  [name: "09-replay", script_path: "cicd/09-Jenkinsfile-replay"],
  [name: "10-maven-build-options", script_path: "cicd/10-Jenkinsfile-maven-build-options"],
  [name: "12-maven-post-cleanup", script_path: "cicd/12-Jenkinsfile-maven-post-cleanup"],
  [name: "13-maven-build-parameters-string", script_path: "cicd/13-Jenkinsfile-maven-build-parameters-string"],
  [name: "14-maven-build-parameters-choice", script_path: "cicd/14-Jenkinsfile-maven-build-parameters-choice"],
  [name: "15-deploy-to-tomcat", script_path: "cicd/15-Jenkinsfile-deploy-to-tomcat"],
  [name: "16-deploy-to-tomcat-multiple-env", script_path: "cicd/16-Jenkinsfile-deploy-to-tomcat-multiple-env"],
  [name: "17-deploy-to-tomcat-multiple-env-when", script_path: "cicd/17-Jenkinsfile-deploy-to-tomcat-multiple-env-when"],
  [name: "18-deploy-to-tomcat-environment-variables", script_path: "cicd/18-Jenkinsfile-deploy-to-tomcat-environment-variables"],
  [name: "19-predefined-environment-variables", script_path: "cicd/19-Jenkinsfile-predefined-environment-variables"],
  [name: "20-docker-build-deploy-dockerhub", script_path: "cicd/20-Jenkinsfile-docker-build-deploy-dockerhub"],
  [name: "21-docker-build-deploy-dockerhub-environment-variables", script_path: "cicd/21-Jenkinsfile-docker-build-deploy-dockerhub-environment-variables"],
  [name: "22-docker-plugin-build-deploy-dockerhub", script_path: "cicd/22-Jenkinsfile-docker-plugin-build-deploy-dockerhub"],
  [name: "23-docker-plugin-build-deploy-jfrog", script_path: "cicd/23-Jenkinsfile-docker-plugin-build-deploy-jfrog"],
  [name: "30-01-docker-build-push-jfrog", script_path: "cicd/30-01-Jenkinsfile-docker-build-push-jfrog"],
  [name: "30-02-docker-deploy-jfrog", script_path: "cicd/30-02-Jenkinsfile-docker-deploy-jfrog"],
  [name: "30-03-docker-build-push-dev-repository-trigger-dev-deploy", script_path: "cicd/30-03-Jenkinsfile-docker-build-push-dev-repository-trigger-dev-deploy"],
  [name: "30-04-docker-deploy-multiple-repository", script_path: "cicd/30-04-Jenkinsfile-docker-deploy-multiple-repository"],
  [name: "30-05-docker-build-push-jf-cli", script_path: "cicd/30-05-Jenkinsfile-docker-build-push-jf-cli"],
  [name: "30-06-docker-promotion-build-info", script_path: "cicd/30-06-Jenkinsfile-docker-promotion-build-info"],
  [name: "30-07-sonarqube-docker-build-push-deploy", script_path: "cicd/30-07-Jenkinsfile-sonarqube-docker-build-push-deploy"],
  [name: "30-08-sonarqube-docker-build-push-anchore-deploy", script_path: "cicd/30-08-Jenkinsfile-sonarqube-docker-build-push-anchore-deploy"],
  [name: "30-09-sonarqube-docker-build-push-anchore-deploy-to-kubernetes", script_path: "cicd/30-09-Jenkinsfile-sonarqube-docker-build-push-anchore-deploy-to-kubernetes"],
  [name: "30-10-docker-build-push-to-artifactory-condition-shared-library", script_path: "cicd/30-10-Jenkinsfile-docker-build-push-to-artifactory-condition-shared-library"],
  [name: "40-helm", script_path: "cicd/40-Jenkinsfile-helm"],
  [name: "45-terraform", script_path: "cicd/45-Jenkinsfile-terraform"],
  [name: "Jenkinsfile", script_path: "cicd/Jenkinsfile"],
  [name: "Jenkinsfile-add-comment-in-github-pr", script_path: "cicd/Jenkinsfile-add-comment-in-github-pr"]
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
