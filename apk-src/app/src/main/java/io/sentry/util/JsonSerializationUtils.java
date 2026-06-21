package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.ISerializer;
import io.sentry.JsonSerializable;
import io.sentry.SentryLevel;
import io.sentry.metrics.MetricsUnit;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class JsonSerializationUtils {
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class ByteCountingWriter extends Writer {
        private long byteCount;

        private ByteCountingWriter() {
            this.byteCount = 0L;
        }

        private static int utf8ByteCount(char c8) {
            if (c8 <= 127) {
                return 1;
            }
            return (c8 > 2047 && !Character.isSurrogate(c8)) ? 3 : 2;
        }

        public long getByteCount() {
            return this.byteCount;
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i10) {
            for (int i11 = i; i11 < i + i10; i11++) {
                this.byteCount += (long) utf8ByteCount(cArr[i11]);
            }
        }

        @Override // java.io.Writer
        public void write(int i) {
            this.byteCount += (long) utf8ByteCount((char) i);
        }

        @Override // java.io.Writer
        public void write(@NotNull String str, int i, int i10) {
            for (int i11 = i; i11 < i + i10; i11++) {
                this.byteCount += (long) utf8ByteCount(str.charAt(i11));
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }

    @NotNull
    public static List<Object> atomicIntegerArrayToList(@NotNull AtomicIntegerArray atomicIntegerArray) {
        int length = atomicIntegerArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(Integer.valueOf(atomicIntegerArray.get(i)));
        }
        return arrayList;
    }

    public static long byteSizeOf(@NotNull ISerializer iSerializer, @NotNull ILogger iLogger, @Nullable JsonSerializable jsonSerializable) {
        if (jsonSerializable == null) {
            return 0L;
        }
        try {
            ByteCountingWriter byteCountingWriter = new ByteCountingWriter();
            iSerializer.serialize(jsonSerializable, byteCountingWriter);
            return byteCountingWriter.getByteCount();
        } catch (Throwable th2) {
            iLogger.log(SentryLevel.ERROR, "Could not calculate size of serializable", th2);
            return 0L;
        }
    }

    @Nullable
    public static byte[] bytesFrom(@NotNull ISerializer iSerializer, @NotNull ILogger iLogger, @NotNull JsonSerializable jsonSerializable) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, UTF_8));
                try {
                    iSerializer.serialize(jsonSerializable, bufferedWriter);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            iLogger.log(SentryLevel.ERROR, "Could not serialize serializable", th2);
            return null;
        }
    }

    @NotNull
    public static Map<String, Object> calendarToMap(@NotNull Calendar calendar) {
        HashMap map = new HashMap();
        map.put("year", Integer.valueOf(calendar.get(1)));
        map.put("month", Integer.valueOf(calendar.get(2)));
        map.put("dayOfMonth", Integer.valueOf(calendar.get(5)));
        map.put("hourOfDay", Integer.valueOf(calendar.get(11)));
        map.put(MetricsUnit.Duration.MINUTE, Integer.valueOf(calendar.get(12)));
        map.put(MetricsUnit.Duration.SECOND, Integer.valueOf(calendar.get(13)));
        return map;
    }
}
