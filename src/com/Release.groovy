package com.tests

class Release {
    def logs
    
    Release() {
        this.logs = new com.logging.Logger()
    }
    
    def doSth() {
        this.logs.log(new Random().nextInt().toString())
    }
}
