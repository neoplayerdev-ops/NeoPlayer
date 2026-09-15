package live.alist.mpv.gp.ui.browser.networkstreaming.clients

import live.alist.mpv.gp.domain.network.NetworkConnection
import live.alist.mpv.gp.domain.network.NetworkProtocol

object NetworkClientFactory {
  fun createClient(connection: NetworkConnection): NetworkClient =
    when (connection.protocol) {
      NetworkProtocol.SMB -> SmbClient(connection)
      NetworkProtocol.FTP -> FtpClient(connection)
      NetworkProtocol.WEBDAV -> WebDavClient(connection)
    }
}
