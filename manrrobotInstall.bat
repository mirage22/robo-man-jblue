set folder=".\ManRobot"
set "DIR_TO_DELETE=%folder%"

IF EXIST %DIR_TO_DELETE% (
    FOR /D %%p IN ("%DIR_TO_DELETE%\*.*") DO rmdir "%%p" /S /Q
    del %DIR_TO_DELETE%\*.* /F /Q
)
rd %folder%

java -cp .\libs\robo-man-1.0-SNAPSHOT.jar com.robo4j.man.system.ExampleMain

IF EXIST %DIR_TO_DELETE% (
    FOR /D %%p IN ("%DIR_TO_DELETE%\*.*") DO rmdir "%%p" /S /Q
    del %DIR_TO_DELETE%\*.* /F /Q
)
rd %folder%