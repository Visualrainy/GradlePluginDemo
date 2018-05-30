package com.plugin.guild.gradleplugin

class Clock {
    long startTime

    Clock() {
        this(System.currentTimeMillis())
    }

    Clock(long ms) {
        startTime = ms
    }

    long getTimeInMs() {
        return System.currentTimeMillis() - startTime
    }
}