package kr.ac.kumoh.s20160250.mymelon

import kr.ac.kumoh.s20160250.mymelon.service.MusicDto
import kr.ac.kumoh.s20160250.mymelon.service.MusicEntity

fun MusicEntity.mapper(id: Long): MusicModel =
    MusicModel(
        id = id,
        streamUrl = streamUrl,
        coverUrl = coverUrl,
        track = track,
        artist = artist
    )
fun MusicDto.mapper(): PlayerModel=
    PlayerModel(
        playMusicList= musics.mapIndexed { index, musicEntity ->
                musicEntity.mapper(index.toLong())
        }
    )
