rootProject.name = "custom-plugins"

include(":leaguesChopper")
include(":leaguesZMI")
include(":leaguesPlanker")
include(":leaguesSand")
//include(":prayerPOH")
//include(":tokenFarmer")
include(":fungusLooter")

for (project in rootProject.children) {
    project.apply {
        projectDir = file(name)
        buildFileName = "${name.toLowerCase()}.gradle.kts"

        require(projectDir.isDirectory) { "Project '${project.path} must have a $projectDir directory" }
        require(buildFile.isFile) { "Project '${project.path} must have a $buildFile build script" }
    }
}
