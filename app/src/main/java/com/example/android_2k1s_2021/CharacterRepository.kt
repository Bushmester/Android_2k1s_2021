package com.example.android_2k1s_2021

object CharacterRepository {

    private var id = 0;

    val characters = arrayListOf(
        Character(
            ++id,
            "https://turtlepedia.fandom.com/ru/wiki/%D0%9B%D0%B5%D0%BE%D0%BD%D0%B0%D1%80%D0%B4%D0%BE_(%D0%BC%D1%83%D0%BB%D1%8C%D1%82%D1%81%D0%B5%D1%80%D0%B8%D0%B0%D0%BB_1987)?file=2DLeo.jpg",
            "Леонардо",
            "Xan'ы ща во мне, я ощущаю себя lovely",
            "Лидер команды"
        ),
        Character(
            ++id,
            "https://turtlepedia.fandom.com/ru/wiki/%D0%94%D0%BE%D0%BD%D0%B0%D1%82%D0%B5%D0%BB%D0%BB%D0%BE_(%D0%BC%D1%83%D0%BB%D1%8C%D1%82%D1%81%D0%B5%D1%80%D0%B8%D0%B0%D0%BB_1987)?file=Don3D.jpg",
            "Донателло",
            "Ээ на, я ща палку возьму на. Понял на?",
            "Гений в команде"
        ),
        Character(
            ++id,
            "https://turtlepedia.fandom.com/ru/wiki/%D0%A0%D0%B0%D1%84%D0%B0%D1%8D%D0%BB%D1%8C_(%D0%BC%D1%83%D0%BB%D1%8C%D1%82%D1%81%D0%B5%D1%80%D0%B8%D0%B0%D0%BB_1987)?file=2DRaph.jpg",
            "Рафаэль",
            "А жареных гвоздей не хочешь?",
            "Он \"крутой, но грубый\""
        ),
        Character(
            ++id,
            "https://turtlepedia.fandom.com/ru/wiki/%D0%9C%D0%B8%D0%BA%D0%B5%D0%BB%D0%B0%D0%BD%D0%B4%D0%B6%D0%B5%D0%BB%D0%BE_(%D0%BC%D1%83%D0%BB%D1%8C%D1%82%D1%81%D0%B5%D1%80%D0%B8%D0%B0%D0%BB_1987)?file=392936102039.jpg",
            "Микелянджело",
            "Зацени бассы! БУУУУУУУУУУУУУМ!!!!!!!!",
            "Он самый добрый и весёлый из команды"
        )
    )

    fun getCharacterById(id: Int): Character? {
        for (character in characters)
            if (character.id == id)
                return character
        return null
    }
}