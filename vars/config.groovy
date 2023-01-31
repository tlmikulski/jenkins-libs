class Config {
  final String url = 'abc.def'
  String getUrl() {
    return this.url
  }
}

def call() {
  return new Config().getUrl()
}
