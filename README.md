# NeoPlayer

<p align="center">
  <b>Feature-rich Android media player engine based on mpv</b>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Platform-Android-brightgreen.svg" />
  <img src="https://img.shields.io/badge/License-Apache--2.0-blue.svg" />
  <img src="https://img.shields.io/badge/Kotlin-2.2.21-purple.svg" />
</p>

> [!NOTE]
> This repository is a maintained fork of the original **mpvEx** project.
>
> Original project: https://github.com/marlboro-advance/mpvEx
>
> NeoPlayer continues development of the project with additional features, bug fixes, performance improvements, Android TV support, casting support, network playback improvements, and other enhancements.

---

## About

**NeoPlayer** is an Android media player built around the mpv playback engine.

This repository contains the open-source player core and related Android components used as part of NeoPlayer development.

The project originated from the open-source **mpvEx** project and continues to build upon that foundation.

The original mpvEx project is no longer actively maintained. NeoPlayer maintains this fork and continues to develop it with new features, fixes, and platform improvements.

---

## Features

### 🎬 Playback

* **MPV-based playback engine** — powerful audio and video playback with hardware decoding support
* **Local video playback** — play videos directly from Android device storage
* **Network playback** — support for network-based media sources
* **Subtitle support** — customizable subtitle appearance and positioning
* **Multiple audio and subtitle tracks**
* **Playback history and resume**
* **Automatic next-item playback**
* **Playback speed control**
* **Aspect ratio and zoom controls**
* **A-B loop playback**
* **Frame-by-frame navigation**
* **HDR playback**
* **HDR-to-SDR tone mapping**
* **Dolby Vision playback support depending on device and decoder capabilities**
* **Audio equalizer and playback customization**

### 🌐 Network & NAS

* **WebDAV**
* **SMB**
* **OpenList**
* **NAS media playback**
* **Direct network playback**
* **Network media browsing**
* **Network playback proxy and buffering optimizations**
* **M3U / media playlist support**
* **STRM media support**
* **Remote media library integration**

### ☁️ Cloud & Media Services

* **OpenList and cloud-drive access**
* **Plex**
* **Emby**
* **Jellyfin**
* **Subsonic**
* **Navidrome**
* **DLNA**
* **Feiniu Media**
* **Ugreen media services**

Availability and supported features may vary depending on the service and server configuration.

### 🎵 Music

* **Local music playback**
* **Network music playback**
* **WebDAV music**
* **Lyrics**
* **Embedded metadata**
* **Album artwork**
* **Playback history**
* **Music playlists**
* **Audio decoder information**

### 📡 Casting

* **DLNA casting**
* **Google Cast**
* **Network device discovery**
* **Media playback control for supported casting devices**

Casting support depends on the target device, protocol, network configuration, and manufacturer implementation.

### 📺 Android TV

NeoPlayer is being actively adapted for Android TV.

TV-specific improvements include:

* TV-optimized navigation
* D-pad focus handling
* Local video browsing
* Local music browsing
* Local network media browsing
* Media library support
* TV playback controls
* Remote-control friendly interfaces

### 📁 File & Media Management

* Local media browser
* Folder navigation
* Video and music organization
* Sorting
* Grid and list layouts
* Multi-selection
* File operations
* Playback records
* Watched/unwatched state
* Media thumbnails
* Network media browsing

### 🎨 Customization

* Material-based Android UI
* Light and dark themes
* Custom playback controls
* Subtitle customization
* Playback gesture customization
* Audio and video decoder information
* Display cutout / notch playback options
* Per-video playback settings

---

## Performance

NeoPlayer focuses on direct playback and efficient network streaming.

Depending on the source and device, the player can provide:

* Hardware-accelerated video decoding
* Direct playback without server-side transcoding
* Network buffering optimizations
* Large-file playback improvements
* WebDAV streaming optimizations
* Reduced unnecessary data transfers
* MPV-based advanced codec support

Actual performance depends on the Android device, decoder, network connection, media format, and server.

---

## Android TV

Android TV support is an ongoing area of development.

The TV version focuses on providing a complete media-player experience for:

* Local storage
* NAS
* WebDAV
* SMB
* OpenList
* Network media libraries
* Local music
* Video playback
* Casting

Additional TV-specific improvements will continue to be added.

---

## Installation

NeoPlayer is distributed through Google Play.

Official application:

https://play.google.com/store/apps/details?id=live.alist.mpv.gp

Development builds and source code are available through the project repositories.

---

## Development

This repository is primarily maintained as part of NeoPlayer development.

The project uses modern Android technologies including:

* Kotlin
* Jetpack Compose
* Coroutines / Flow
* MVVM-based architecture
* MPV playback engine

Build requirements may change as the project evolves.

---

## Credits

NeoPlayer's player core has its roots in the following open-source projects:

### mpvEx

Original project:

https://github.com/marlboro-advance/mpvEx

### mpv-android

https://github.com/mpv-android/mpv-android

We are grateful to the original developers and contributors whose work provides the foundation for this project.

NeoPlayer also makes use of and/or is inspired by various other open-source projects and libraries. Please refer to the corresponding source code, license files, and third-party notices for applicable licensing information.

---

## Fork & Modifications

This repository is a maintained fork of the original mpvEx project.

NeoPlayer has introduced substantial modifications and additional development, including but not limited to:

* Android TV support
* Network playback improvements
* WebDAV and NAS improvements
* Google Cast integration
* DLNA improvements
* Media service integrations
* Local music improvements
* Subtitle improvements
* Playback and buffering optimizations
* HDR and Dolby Vision related improvements
* File and media management improvements
* UI and interaction improvements
* Bug fixes and device compatibility improvements

The original project remains credited to its respective authors.

---

## License

Unless otherwise stated, the source code derived from the original mpvEx project is distributed under the **Apache License 2.0**.

See [`LICENSE`](LICENSE) for the full license text.

Third-party components included in this project may be distributed under their own licenses. Their respective copyright notices and license terms remain applicable.

When redistributing this project or software derived from it, please review and comply with all applicable third-party licenses and notices.

---

## Disclaimer

NeoPlayer is an independent project and is not affiliated with or endorsed by the original mpvEx project, mpv-android, or the developers of those projects.

All trademarks and project names belong to their respective owners.