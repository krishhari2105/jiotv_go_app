package com.skylake.skytv.jgorunner.core.update

object ReleaseRepositories {
    const val SERVER = "krishhari2105/jiotv_go"
    const val APP = "krishhari2105/jiotv_go_app"

    fun latestReleaseURL(repository: String): String =
        "https://api.github.com/repos/$repository/releases/latest"

    fun releasesURL(repository: String): String =
        "https://api.github.com/repos/$repository/releases"
}
