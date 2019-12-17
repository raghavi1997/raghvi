node('master') {
	stage ('Clone Repository'){
		checkout([$class: 'GitSCM', 
		branches: [[name: GitBrch]], 
		doGenerateSubmoduleConfigurations: false, 
		extensions: [[$class: 'SubmoduleOption', disableSubmodules: false, parentCredentials: true, recursiveSubmodules: true, reference: '', shallow: true, trackingSubmodules: false]], 
		submoduleCfg: [], 
		userRemoteConfigs: [[credentialsId: GitCred, url: GitURL]]])
	}
}
