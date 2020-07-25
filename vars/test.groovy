#!/usr/bin/env groovy

def call (Map config) {
    def text = config.get('text','lordchou')

    pipeline {
        agent any 1
        stages {
            stage('joss') {
                steps {
                  echo 'hello world'
                }
            }
            stage('booss'){
                steps{
                    echo 'boss'
                }
            }
        }
   }
}
def testPrint(text) {
    echo "test ${test}"
}