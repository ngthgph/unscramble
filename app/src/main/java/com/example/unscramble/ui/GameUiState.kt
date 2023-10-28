package com.example.unscramble.ui

data class GameUiState(
    val currentScrambledWord: String = "",
    var isGuessWordWrong: Boolean = false,
)
