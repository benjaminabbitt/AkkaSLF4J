package com.github.benjaminAbbitt.akkaSLF4J;

import akka.event.LoggingAdapter;
import org.slf4j.Logger;
import org.slf4j.Marker;


public class Slf4jAkkaLoggingAdapter implements Logger {

    private final LoggingAdapter akkaLog;

    public Slf4jAkkaLoggingAdapter(LoggingAdapter akkaLog) {
        this.akkaLog = akkaLog;
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isTraceEnabled() {
        return false;
    }

    @Override
    public void trace(String msg) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void trace(String format, Object arg) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void trace(String format, Object arg1, Object arg2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void trace(String format, Object[] argArray) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void trace(String msg, Throwable t) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isTraceEnabled(Marker marker) {
        return false;
    }

    @Override
    public void trace(Marker marker, String msg) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void trace(Marker marker, String format, Object arg) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void trace(Marker marker, String format, Object arg1, Object arg2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void trace(Marker marker, String format, Object... argArray) {
        throw new UnsupportedOperationException();
    }


    @Override
    public void trace(Marker marker, String msg, Throwable t) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isDebugEnabled() {
        return false;
    }

    @Override
    public void debug(String msg) {
        akkaLog.debug(msg);
    }

    @Override
    public void debug(String format, Object arg) {
        akkaLog.debug(format, arg);
    }

    @Override
    public void debug(String format, Object arg1, Object arg2) {
        akkaLog.debug(format, arg1, arg2);
    }

    @Override
    public void debug(String format, Object[] argArray) {
        akkaLog.debug(format, argArray);
    }

    @Override
    public void debug(String msg, Throwable t) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isDebugEnabled(Marker marker) {
        return akkaLog.isDebugEnabled();
    }

    @Override
    public void debug(Marker marker, String msg) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void debug(Marker marker, String format, Object arg) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void debug(Marker marker, String format, Object arg1, Object arg2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void debug(Marker marker, String format, Object[] argArray) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void debug(Marker marker, String msg, Throwable t) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isInfoEnabled() {
        return akkaLog.isInfoEnabled();
    }

    @Override
    public void info(String msg) {
        akkaLog.info(msg);
    }

    @Override
    public void info(String format, Object arg) {
        akkaLog.info(format, arg);
    }

    @Override
    public void info(String format, Object arg1, Object arg2) {
        akkaLog.info(format, arg1, arg2);
    }

    @Override
    public void info(String format, Object[] argArray) {
        akkaLog.info(format, argArray);
    }

    @Override
    public void info(String msg, Throwable t) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isInfoEnabled(Marker marker) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void info(Marker marker, String msg) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void info(Marker marker, String format, Object arg) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void info(Marker marker, String format, Object arg1, Object arg2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void info(Marker marker, String format, Object[] argArray) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void info(Marker marker, String msg, Throwable t) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isWarnEnabled() {
        return akkaLog.isWarningEnabled();
    }

    @Override
    public void warn(String msg) {
        akkaLog.warning(msg);
    }

    @Override
    public void warn(String format, Object arg) {
        akkaLog.warning(format, arg);
    }

    @Override
    public void warn(String format, Object[] argArray) {
        akkaLog.warning(format, argArray);
    }

    @Override
    public void warn(String format, Object arg1, Object arg2) {
        akkaLog.warning(format, arg1, arg2);
    }

    @Override
    public void warn(String msg, Throwable t) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isWarnEnabled(Marker marker) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void warn(Marker marker, String msg) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void warn(Marker marker, String format, Object arg) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void warn(Marker marker, String format, Object arg1, Object arg2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void warn(Marker marker, String format, Object[] argArray) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void warn(Marker marker, String msg, Throwable t) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isErrorEnabled() {
        return akkaLog.isErrorEnabled();
    }

    @Override
    public void error(String msg) {
        akkaLog.error(msg);
    }

    @Override
    public void error(String format, Object arg) {
        akkaLog.error(format, arg);
    }

    @Override
    public void error(String format, Object arg1, Object arg2) {
        akkaLog.error(format, arg1, arg2);
    }

    @Override
    public void error(String format, Object[] argArray) {
        akkaLog.error(format, argArray);
    }

    @Override
    public void error(String msg, Throwable t) {
        akkaLog.error(t, msg);
    }

    @Override
    public boolean isErrorEnabled(Marker marker) {
        return akkaLog.isErrorEnabled();
    }

    @Override
    public void error(Marker marker, String msg) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void error(Marker marker, String format, Object arg) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void error(Marker marker, String format, Object arg1, Object arg2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void error(Marker marker, String format, Object[] argArray) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void error(Marker marker, String msg, Throwable t) {
        throw new UnsupportedOperationException();
    }
}
