
pipeline{
    agent any
    stages{
        stage("build"){
            steps{
                echo("build project")
            }
        }
         stage("deploy to dev"){
            steps{
                echo("deploy to dev")
            }
        }
         stage("run UTs"){
            steps{
                echo("run Unit tests")
            }
        }
        stage("deploy to qa"){
            steps{
                echo("deploy to qa")
            }
        }
         stage("run Automation tests"){
            steps{
                echo("run automation tests")
            }
        }
       stage("deploy to stage"){
            steps{
                echo("deploy to stage")
            }
        }
         stage("run sanity tests"){
            steps{
                echo("run sanity tests")
            }
        } 
         stage("deploy to prod"){
            steps{
                echo("deploy to prod")
            }
        }
    }

}
