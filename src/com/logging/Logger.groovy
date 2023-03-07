package com.logging

class Logger {
    def logs = []
    
    def log(String message) {
        def stats = message.length() % 2 == 0 ? 'OK' : 'FAIL'
        this.logs << "[${stats}] - ${message}"
    }
    
    def showLogs() {
        return this.logs
    }
}
