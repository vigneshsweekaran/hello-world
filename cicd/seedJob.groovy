def folderName = "hello-world"
def pipelineDetails = [
  [name: "01-echo-helloworld", script_path: "cicd/01-Jenkinsfile-helloworld"],
  [name: "02-maven-build", script_path: "cicd/02-Jenkinsfile-maven-build"],
  [name: "03-maven-build-tools", script_path: "cicd/03-Jenkinsfile-maven-build-tools"],
  [name: "04-maven-triggers-hook", script_path: "cicd/04-Jenkinsfile-maven-triggers-hook"],
  [name: "05-maven-triggers-poll", script_path: "cicd/05-Jenkinsfile-maven-triggers-poll"],
  [name: "06-maven-triggers-cron", script_path: "cicd/06-Jenkinsfile-maven-triggers-cron"],
  [name: "07-maven-build-options", script_path: "cicd/07-Jenkinsfile-maven-build-options"]
]

folder(folderName) {
  displayName(folderName)
}

for pipelineDetail in pipelineDetails {
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
        scriptPath(pipelineDetail.script_path)
      }
    }
  }
}

// pipelineJob("${folderName}/02-maven-build") {
//   definition {
//     cpsScm {
//       scm{
//         git {
//           branch('main')
//           remote{
//             url('https://github.com/vigneshsweekaran/hello-world.git')
//           }
//         }
//       }
//       scriptPath('cicd/02-Jenkinsfile-maven-build')
//     }
//   }
// }
// pipelineJob("${folderName}/03-maven-build-tools") {
//   definition {
//     cpsScm {
//       scm{
//         git {
//           branch('main')
//           remote{
//             url('https://github.com/vigneshsweekaran/hello-world.git')
//           }
//         }
//       }
//       scriptPath('cicd/03-Jenkinsfile-maven-build-tools')
//     }
//   }
// }
// pipelineJob("${folderName}/04-maven-triggers-hook") {
//   definition {
//     cpsScm {
//       scm{
//         git {
//           branch('main')
//           remote{
//             url('https://github.com/vigneshsweekaran/hello-world.git')
//           }
//         }
//       }
//       scriptPath('cicd/04-Jenkinsfile-maven-triggers-hook')
//     }
//   }
// }
// pipelineJob("${folderName}/05-maven-triggers-poll") {
//   definition {
//     cpsScm {
//       scm{
//         git {
//           branch('main')
//           remote{
//             url('https://github.com/vigneshsweekaran/hello-world.git')
//           }
//         }
//       }
//       scriptPath('cicd/05-Jenkinsfile-maven-triggers-poll')
//     }
//   }
// }
// pipelineJob("${folderName}/06-maven-triggers-cron") {
//   definition {
//     cpsScm {
//       scm{
//         git {
//           branch('main')
//           remote{
//             url('https://github.com/vigneshsweekaran/hello-world.git')
//           }
//         }
//       }
//       scriptPath('cicd/06-Jenkinsfile-maven-triggers-cron')
//     }
//   }
// }
// pipelineJob("${folderName}/07-maven-build-options") {
//   definition {
//     cpsScm {
//       scm{
//         git {
//           branch('main')
//           remote{
//             url('https://github.com/vigneshsweekaran/hello-world.git')
//           }
//         }
//       }
//       scriptPath('cicd/07-Jenkinsfile-maven-build-options')
//     }
//   }
// }