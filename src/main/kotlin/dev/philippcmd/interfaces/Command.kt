package dev.philippcmd.commands

import java.io.File

// Abstract class representing a command
abstract class Command(val name: String, val aliases: List<String> = emptyList()) {
    abstract fun execute(args: List<String>, currentDir: File): String
}
