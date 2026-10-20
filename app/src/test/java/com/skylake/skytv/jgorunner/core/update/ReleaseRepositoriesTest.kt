package com.skylake.skytv.jgorunner.core.update

import org.junit.Assert.assertEquals
import org.junit.Test

class ReleaseRepositoriesTest {
    @Test
    fun `builds private server release URLs`() {
        assertEquals(
            "https://api.github.com/repos/krishhari2105/jiotv_go/releases/latest",
            ReleaseRepositories.latestReleaseURL(ReleaseRepositories.SERVER),
        )
        assertEquals(
            "https://api.github.com/repos/krishhari2105/jiotv_go/releases",
            ReleaseRepositories.releasesURL(ReleaseRepositories.SERVER),
        )
    }

    @Test
    fun `builds private app release URL`() {
        assertEquals(
            "https://api.github.com/repos/krishhari2105/jiotv_go_app/releases/latest",
            ReleaseRepositories.latestReleaseURL(ReleaseRepositories.APP),
        )
    }
}
