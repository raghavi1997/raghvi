pipelineJob('seed-job') {
	description ('Seed Nob for All Jobs')
	logRotator(-1,-1)
	parameters {
	choiceParam('GitURL'	,['https://github.com/raghavi1997/raghvi.git']	,'Repository URL')
	choiceParam('GitCred'	,['GIT_CRED']					,'Git Credentials')
        choiceParam('GitBrch'	,['master']                                    	,'Git Branch')
	}
	definition {
		cps {
			script(readFileFromWorkspace('pipeline/Clone-Repo-Pipeline.groovy'))
		}
	}
}
