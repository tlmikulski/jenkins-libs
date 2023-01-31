package local.jenkins

class Config {
   final String nexusUrl = 'https://nexus.local'

   String getNexusUrl() {
      return this.nexusUrl;
   }

}
