package io.sentry.util;

import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.JsonSerializable;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class MapObjectWriter implements ObjectWriter {

    @NotNull
    final Map<String, Object> root;

    @NotNull
    final ArrayDeque<Object> stack;

    public MapObjectWriter(@NotNull Map<String, Object> map) {
        this.root = map;
        ArrayDeque<Object> arrayDeque = new ArrayDeque<>();
        this.stack = arrayDeque;
        arrayDeque.addLast(map);
    }

    @NotNull
    private Map<String, Object> peekObject() {
        Object objPeekLast = this.stack.peekLast();
        if (objPeekLast == null) {
            throw new IllegalStateException("Stack is empty.");
        }
        if (objPeekLast instanceof Map) {
            return (Map) objPeekLast;
        }
        throw new IllegalStateException("Stack element is not a Map.");
    }

    private void postValue(@Nullable Object obj) {
        Object objPeekLast = this.stack.peekLast();
        if (objPeekLast instanceof List) {
            ((List) objPeekLast).add(obj);
        } else {
            if (!(objPeekLast instanceof String)) {
                throw new IllegalStateException("Invalid stack state, expected array or string on top");
            }
            peekObject().put((String) this.stack.removeLast(), obj);
        }
    }

    private void serializeCollection(@NotNull ILogger iLogger, @NotNull Collection<?> collection) {
        beginArray();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            value(iLogger, it.next());
        }
        endArray();
    }

    private void serializeDate(@NotNull ILogger iLogger, @NotNull Date date) {
        try {
            value(DateUtils.getTimestamp(date));
        } catch (Exception e3) {
            iLogger.log(SentryLevel.ERROR, "Error when serializing Date", e3);
            nullValue();
        }
    }

    private void serializeMap(@NotNull ILogger iLogger, @NotNull Map<?, ?> map) {
        beginObject();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                name((String) obj);
                value(iLogger, map.get(obj));
            }
        }
        endObject();
    }

    private void serializeTimeZone(@NotNull ILogger iLogger, @NotNull TimeZone timeZone) {
        try {
            value(timeZone.getID());
        } catch (Exception e3) {
            iLogger.log(SentryLevel.ERROR, "Error when serializing TimeZone", e3);
            nullValue();
        }
    }

    @Override // io.sentry.ObjectWriter
    @Nullable
    public String getIndent() {
        return null;
    }

    @Override // io.sentry.ObjectWriter
    public MapObjectWriter beginArray() {
        this.stack.add(new ArrayList());
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public MapObjectWriter beginObject() {
        this.stack.addLast(new HashMap());
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public MapObjectWriter endArray() {
        endObject();
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public MapObjectWriter endObject() {
        postValue(this.stack.removeLast());
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public MapObjectWriter name(@NotNull String str) {
        this.stack.add(str);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public MapObjectWriter nullValue() {
        postValue(null);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public MapObjectWriter value(@NotNull ILogger iLogger, @Nullable Object obj) {
        if (obj == null) {
            nullValue();
            return this;
        }
        if (obj instanceof Character) {
            value(Character.toString(((Character) obj).charValue()));
            return this;
        }
        if (obj instanceof String) {
            value((String) obj);
            return this;
        }
        if (obj instanceof Boolean) {
            value(((Boolean) obj).booleanValue());
            return this;
        }
        if (obj instanceof Number) {
            value((Number) obj);
            return this;
        }
        if (obj instanceof Date) {
            serializeDate(iLogger, (Date) obj);
            return this;
        }
        if (obj instanceof TimeZone) {
            serializeTimeZone(iLogger, (TimeZone) obj);
            return this;
        }
        if (obj instanceof JsonSerializable) {
            ((JsonSerializable) obj).serialize(this, iLogger);
            return this;
        }
        if (obj instanceof Collection) {
            serializeCollection(iLogger, (Collection) obj);
            return this;
        }
        if (obj.getClass().isArray()) {
            serializeCollection(iLogger, Arrays.asList((Object[]) obj));
            return this;
        }
        if (obj instanceof Map) {
            serializeMap(iLogger, (Map) obj);
            return this;
        }
        if (obj instanceof Locale) {
            value(obj.toString());
            return this;
        }
        if (obj instanceof AtomicIntegerArray) {
            serializeCollection(iLogger, JsonSerializationUtils.atomicIntegerArrayToList((AtomicIntegerArray) obj));
            return this;
        }
        if (obj instanceof AtomicBoolean) {
            value(((AtomicBoolean) obj).get());
            return this;
        }
        if (obj instanceof URI) {
            value(obj.toString());
            return this;
        }
        if (obj instanceof InetAddress) {
            value(obj.toString());
            return this;
        }
        if (obj instanceof UUID) {
            value(obj.toString());
            return this;
        }
        if (obj instanceof Currency) {
            value(obj.toString());
            return this;
        }
        if (obj instanceof Calendar) {
            serializeMap(iLogger, JsonSerializationUtils.calendarToMap((Calendar) obj));
            return this;
        }
        if (obj.getClass().isEnum()) {
            value(obj.toString());
            return this;
        }
        iLogger.log(SentryLevel.WARNING, "Failed serializing unknown object.", obj);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public ObjectWriter jsonValue(@Nullable String str) {
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public void setIndent(@Nullable String str) {
    }

    @Override // io.sentry.ObjectWriter
    public void setLenient(boolean z5) {
    }

    @Override // io.sentry.ObjectWriter
    public MapObjectWriter value(@Nullable String str) {
        postValue(str);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public MapObjectWriter value(boolean z5) {
        postValue(Boolean.valueOf(z5));
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public MapObjectWriter value(@Nullable Boolean bool) {
        postValue(bool);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public MapObjectWriter value(double d10) {
        postValue(Double.valueOf(d10));
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public MapObjectWriter value(long j10) {
        postValue(Long.valueOf(j10));
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public MapObjectWriter value(@Nullable Number number) {
        postValue(number);
        return this;
    }
}
