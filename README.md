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
> This repository is an independently maintained and actively developed fork derived from the original **mpvEx** project.
>
> Original project: https://github.com/marlboro-advance/mpvEx
>
> NeoPlayer continues expanding the ecosystem with new features, active bug fixes, performance optimizations, Android TV adaptation, casting support, enhanced network streaming protocols, and UI refinements.

---

## About

**NeoPlayer** is a modern Android media player application built around the powerful mpv playback engine.

This repository contains the open-source player core and related Android application components used as part of NeoPlayer development.

The project originated from **mpvEx** and continues to build, innovate, and refactor upon that foundation to provide a clean, high-performance, and feature-rich media consumption experience across mobile and Android TV platforms.

---

## Features

### 🎬 Playback
- **MPV-based playback engine** — High-performance audio and video playback with robust hardware decoding
- **Local video playback** — Play videos seamlessly from internal and external Android device storage
- **Network streaming** — Support for various network-based media sources and streaming protocols
- **Subtitle customization** — Flexible subtitle positioning, styling, sync adjustments, and track selection
- **Multi-track audio & subtitles** — Easy toggling between multiple audio languages and embedded/external subtitles
- **Playback history & resume** — Automatically save and resume playback progress across sessions
- **A-B loop playback** — Repeat specific video/audio segments continuously
- **Frame-by-frame navigation** — Precise stepping through video frames
- **HDR & Dolby Vision** — HDR playback and HDR-to-SDR tone mapping, with Dolby Vision support based on device decoders
- **Audio equalizer** — Built-in equalizer and playback customization controls

### 🌐 Network & NAS
- **WebDAV & SMB** — Stream media directly from home NAS and private cloud servers
- **OpenList** — Direct media access and cloud-drive integration
- **M3U & STRM support** — Support for live playlists and STRM media pointer files
- **Network buffering optimizations** — Smart pre-buffering and proxy tuning for low-latency streaming

### ☁️ Cloud & Media Services
Support for self-hosted and third-party media libraries:
- **Plex / Emby / Jellyfin**
- **Subsonic / Navidrome**
- **DLNA / Feiniu Media / Ugreen**

### 🎵 Music Player
- Local & network music browsing and playback
- WebDAV music streaming
- Synchronized lyrics display and album artwork rendering
- Embedded ID3 metadata parsing
- Audio decoder and stream info view

### 📡 Casting & Remote Control
- **Google Cast & DLNA casting** support
- Automatic network device discovery
- Remote media control for supported receiver devices

### 📺 Android TV
Actively adapted for big-screen interfaces:
- D-pad friendly navigation and focus management
- TV-optimized video, music, and network media library interfaces
- Remote-control accessible media controls

---

## Credits & Acknowledgments

NeoPlayer relies on, builds upon, and draws technical or design inspiration from the amazing open-source community. We express our deepest gratitude to the creators and maintainers of the following projects:

### Core Player Engine & Foundations
* **[mpvEx](https://github.com/marlboro-advance/mpvEx)** — The original foundation for this project core.
* **[mpv-android](https://github.com/mpv-android/mpv-android)** — The official Android build and JNI wrapper for mpv.
* **[mpvKt](https://github.com/abdallahmehiz/mpvKt)** — Excellent Kotlin wrapper and reference for mpv integrations on Android.

### UI / UX & Feature Inspirations
* **[mpvRx](https://github.com/Riteshp2001/mpvRx)** — Key functional and UI/UX layout inspirations during early development.
* **[Next Player](https://github.com/anilbeesetti/nextplayer)** — References and UI/UX design concepts for modern Android video players.
* **[Gramophone](https://github.com/FoedusProgramme/Gramophone)** — UI design and architecture inspirations for the local music experience.
* **[APlayer](https://github.com/rRemix/APlayer)** — Functional references for Android player UI and interaction patterns.
* **[FongMi](https://github.com/FongMi)** — Design and structural references for TV/media streaming adaptations.

### Media Protocols & Ecosystem
* **[OpenList](https://github.com/OpenListTeam/OpenList)** — Cloud storage and media indexing integration.
* **[Jellyfin](https://jellyfin.org/)** — Open-source media server ecosystem and protocol reference.

---

## Fork & Architecture

This repository is a maintained fork derived from **mpvEx**, while incorporating original developments, modern Jetpack Compose refactoring, and functional inspirations from the projects credited above.

NeoPlayer is engineered as an independent media player solution. Major custom enhancements include:

- Complete Android TV adaptation with D-pad navigation
- Refactored Jetpack Compose UI architecture
- Advanced network protocol stream handling (WebDAV/SMB/OpenList)
- Expanded media server clients (Plex, Emby, Jellyfin, Subsonic, Navidrome)
- Integrated music engine with synchronized lyrics
- Advanced playback controls (A-B loop, audio EQ, custom gestures)

All original project copyrights, licenses, and design credit belong to their respective authors.

---

## License

Unless otherwise stated, source code original to this repository or derived from mpvEx is distributed under the **Apache License 2.0**. See [`LICENSE`](LICENSE) for full details.

NeoPlayer respects all open-source software licenses. Where specific functional concepts, layout ideas, or code structures were referenced from open-source projects (such as mpvRx, mpvKt, Next Player, etc.), those implementations are written with independent adjustments or managed in compliance with their respective licenses.

Third-party libraries, native dependencies (including `libmpv`), and external packages included or linked in this repository remain subject to their own original open-source licenses (GPL/LGPL, Apache 2.0, MIT, etc.).

---

## Disclaimer

NeoPlayer is an independent open-source software project. It is not affiliated with, officially endorsed by, or directly associated with mpv, mpv-android, or any of the open-source projects listed in the Credits section. All trademarks and brand names belong to their respective owners.
