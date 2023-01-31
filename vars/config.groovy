class Config {
  final String url = 'abc.def'
  String getUrl() {
    return this.url
  }
}

def call() {
  echo "${new Config().getUrl()}"
}
