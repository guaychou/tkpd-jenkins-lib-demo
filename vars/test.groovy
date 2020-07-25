#!/usr/bin/env groovy

def call (Map config) {
    def text = config.get('text','lordchou')
    pipeline {
        stages{
            stage('tes echo aja'){
                script{
                    testPrint(text)
                }
            }
        }
    }
}

def testPrint(text) {
    echo "test print"
}