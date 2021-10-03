java -Xmx28G -Xms14G -server -XX:ParallelGCThreads=4 -XX:+DisableExplicitGC -XX:MaxGCPauseMillis=500 -XX:SurvivorRatio=16 -XX:TargetSurvivorRatio=90 -XX:-UseGCOverheadLimit -Xnoclassgc -XX:UseSSE=3 -XX:PermSize=8G -XX:LargePageSizeInBytes=4m -jar paper.jar nogui