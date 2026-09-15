package live.alist.mpv.gp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import live.alist.mpv.gp.database.converters.NetworkProtocolConverter
import live.alist.mpv.gp.database.dao.NetworkConnectionDao
import live.alist.mpv.gp.database.dao.PlaybackStateDao
import live.alist.mpv.gp.database.dao.PlaylistDao
import live.alist.mpv.gp.database.dao.RecentlyPlayedDao
import live.alist.mpv.gp.database.dao.VideoMetadataDao
import live.alist.mpv.gp.database.entities.PlaybackStateEntity
import live.alist.mpv.gp.database.entities.PlaylistEntity
import live.alist.mpv.gp.database.entities.PlaylistItemEntity
import live.alist.mpv.gp.database.entities.RecentlyPlayedEntity
import live.alist.mpv.gp.database.entities.VideoMetadataEntity
import live.alist.mpv.gp.domain.network.NetworkConnection

@Database(
  entities = [
    PlaybackStateEntity::class,
    RecentlyPlayedEntity::class,
    VideoMetadataEntity::class,
    NetworkConnection::class,
    PlaylistEntity::class,
    PlaylistItemEntity::class,
  ],
  version = 8,
  exportSchema = true,
)
@TypeConverters(NetworkProtocolConverter::class)
abstract class MpvExDatabase : RoomDatabase() {
  abstract fun videoDataDao(): PlaybackStateDao

  abstract fun recentlyPlayedDao(): RecentlyPlayedDao

  abstract fun videoMetadataDao(): VideoMetadataDao

  abstract fun networkConnectionDao(): NetworkConnectionDao

  abstract fun playlistDao(): PlaylistDao
}
