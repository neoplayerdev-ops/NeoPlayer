package live.alist.mpv.gp.di

import live.alist.mpv.gp.database.MpvExDatabase
import live.alist.mpv.gp.preferences.AdvancedPreferences
import live.alist.mpv.gp.preferences.AppearancePreferences
import live.alist.mpv.gp.preferences.AudioPreferences
import live.alist.mpv.gp.preferences.BrowserPreferences
import live.alist.mpv.gp.preferences.DecoderPreferences
import live.alist.mpv.gp.preferences.FoldersPreferences
import live.alist.mpv.gp.preferences.GesturePreferences
import live.alist.mpv.gp.preferences.PlayerPreferences
import live.alist.mpv.gp.preferences.SettingsManager
import live.alist.mpv.gp.preferences.SubtitlesPreferences
import live.alist.mpv.gp.preferences.preference.AndroidPreferenceStore
import live.alist.mpv.gp.preferences.preference.PreferenceStore
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val PreferencesModule =
  module {
    single { AndroidPreferenceStore(androidContext()) }.bind(PreferenceStore::class)

    single { AppearancePreferences(get()) }
    singleOf(::PlayerPreferences)
    singleOf(::GesturePreferences)
    singleOf(::DecoderPreferences)
    singleOf(::SubtitlesPreferences)
    singleOf(::AudioPreferences)
    singleOf(::AdvancedPreferences)
    single { BrowserPreferences(get(), androidContext()) }
    singleOf(::FoldersPreferences)
    singleOf(::SettingsManager)
  }
