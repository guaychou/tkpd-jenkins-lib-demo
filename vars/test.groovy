#!/usr/bin/env groovy

def call (Map config) {
    def text = config.get('text','lordchou')

    pipeline {
        stages {
            stage('joss') {
                steps {
                    script {
                        testPrint(text)
                    }
                }
            }
        }
   }
}
def testPrint(text) {
    echo "test ${test}"
}