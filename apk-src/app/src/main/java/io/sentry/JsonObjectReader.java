package io.sentry;

import io.sentry.vendor.gson.stream.JsonReader;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class JsonObjectReader implements ObjectReader {

    @NotNull
    private final JsonReader jsonReader;

    @NotNull
    private final Deque<RecoveryState> recoveryStates = new ArrayDeque();
    private int depth = 0;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class RecoveryState {
        private final int startDepth;

        @NotNull
        private final JsonToken startToken;
        private boolean valueConsumed;

        private RecoveryState(int i, @NotNull JsonToken jsonToken) {
            this.startDepth = i;
            this.startToken = jsonToken;
        }
    }

    public JsonObjectReader(Reader reader) {
        this.jsonReader = new JsonReader(reader);
    }

    @NotNull
    private RecoveryState beginRecovery(@NotNull JsonToken jsonToken) {
        RecoveryState recoveryState = new RecoveryState(this.depth, jsonToken);
        this.recoveryStates.addLast(recoveryState);
        return recoveryState;
    }

    private void endRecovery(@Nullable RecoveryState recoveryState) {
        if (recoveryState == null) {
            return;
        }
        if (this.recoveryStates.isEmpty() || this.recoveryStates.peekLast() != recoveryState) {
            this.recoveryStates.remove(recoveryState);
        } else {
            this.recoveryStates.removeLast();
        }
    }

    private void markValueConsumed() {
        RecoveryState recoveryStatePeekLast = this.recoveryStates.peekLast();
        if (recoveryStatePeekLast != null) {
            recoveryStatePeekLast.valueConsumed = true;
        }
    }

    private boolean recoverAfterValueFailure(@NotNull ILogger iLogger, @NotNull Exception exc, @NotNull String str, @NotNull String str2, @NotNull RecoveryState recoveryState) {
        iLogger.log(SentryLevel.WARNING, str, exc);
        try {
            recoverValue(recoveryState);
            return true;
        } catch (Exception e3) {
            iLogger.log(SentryLevel.ERROR, str2, e3);
            return false;
        }
    }

    private void recoverValue(@NotNull RecoveryState recoveryState) throws IOException {
        while (this.depth > recoveryState.startDepth) {
            JsonToken jsonTokenPeek = peek();
            if (jsonTokenPeek == JsonToken.END_OBJECT) {
                endObject();
            } else if (jsonTokenPeek == JsonToken.END_ARRAY) {
                endArray();
            } else {
                skipValue();
            }
        }
        if (recoveryState.valueConsumed || peek() != recoveryState.startToken) {
            return;
        }
        skipValue();
    }

    @Override // io.sentry.ObjectReader
    public void beginArray() {
        this.jsonReader.beginArray();
        markValueConsumed();
        this.depth++;
    }

    @Override // io.sentry.ObjectReader
    public void beginObject() {
        this.jsonReader.beginObject();
        markValueConsumed();
        this.depth++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.jsonReader.close();
    }

    @Override // io.sentry.ObjectReader
    public void endArray() {
        this.jsonReader.endArray();
        this.depth--;
    }

    @Override // io.sentry.ObjectReader
    public void endObject() {
        this.jsonReader.endObject();
        this.depth--;
    }

    @Override // io.sentry.ObjectReader
    public boolean hasNext() {
        return this.jsonReader.hasNext();
    }

    @Override // io.sentry.ObjectReader
    public boolean nextBoolean() throws IOException {
        boolean zNextBoolean = this.jsonReader.nextBoolean();
        markValueConsumed();
        return zNextBoolean;
    }

    @Override // io.sentry.ObjectReader
    @Nullable
    public Boolean nextBooleanOrNull() {
        if (this.jsonReader.peek() != JsonToken.NULL) {
            return Boolean.valueOf(nextBoolean());
        }
        nextNull();
        return null;
    }

    @Override // io.sentry.ObjectReader
    @Nullable
    public Date nextDateOrNull(ILogger iLogger) {
        if (this.jsonReader.peek() != JsonToken.NULL) {
            return ObjectReader.dateOrNull(nextString(), iLogger);
        }
        nextNull();
        return null;
    }

    @Override // io.sentry.ObjectReader
    public double nextDouble() throws IOException {
        double dNextDouble = this.jsonReader.nextDouble();
        markValueConsumed();
        return dNextDouble;
    }

    @Override // io.sentry.ObjectReader
    @Nullable
    public Double nextDoubleOrNull() {
        if (this.jsonReader.peek() != JsonToken.NULL) {
            return Double.valueOf(nextDouble());
        }
        nextNull();
        return null;
    }

    @Override // io.sentry.ObjectReader
    public float nextFloat() throws IOException {
        double dNextDouble = this.jsonReader.nextDouble();
        markValueConsumed();
        return (float) dNextDouble;
    }

    @Override // io.sentry.ObjectReader
    @Nullable
    public Float nextFloatOrNull() {
        if (this.jsonReader.peek() != JsonToken.NULL) {
            return Float.valueOf(nextFloat());
        }
        nextNull();
        return null;
    }

    @Override // io.sentry.ObjectReader
    public int nextInt() throws IOException {
        int iNextInt = this.jsonReader.nextInt();
        markValueConsumed();
        return iNextInt;
    }

    @Override // io.sentry.ObjectReader
    @Nullable
    public Integer nextIntegerOrNull() {
        if (this.jsonReader.peek() != JsonToken.NULL) {
            return Integer.valueOf(nextInt());
        }
        nextNull();
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // io.sentry.ObjectReader
    @Nullable
    public <T> List<T> nextListOrNull(@NotNull ILogger iLogger, @NotNull JsonDeserializer<T> jsonDeserializer) throws Throwable {
        Throwable th2;
        ILogger iLogger2;
        if (this.jsonReader.peek() == JsonToken.NULL) {
            nextNull();
            return null;
        }
        beginArray();
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (!this.jsonReader.hasNext()) {
                break;
            }
            RecoveryState recoveryStateBeginRecovery = beginRecovery(peek());
            try {
                arrayList.add(jsonDeserializer.deserialize(this, iLogger));
                endRecovery(recoveryStateBeginRecovery);
                iLogger2 = iLogger;
            } catch (Exception e3) {
                iLogger2 = iLogger;
                try {
                    if (!recoverAfterValueFailure(iLogger2, e3, "Failed to deserialize object in list.", "Stream unrecoverable, aborting list deserialization.", recoveryStateBeginRecovery)) {
                        endRecovery(recoveryStateBeginRecovery);
                        endArray();
                        return arrayList;
                    }
                    endRecovery(recoveryStateBeginRecovery);
                } catch (Throwable th3) {
                    th2 = th3;
                    endRecovery(recoveryStateBeginRecovery);
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
                endRecovery(recoveryStateBeginRecovery);
                throw th2;
            }
            iLogger = iLogger2;
        }
        endArray();
        return arrayList;
    }

    @Override // io.sentry.ObjectReader
    public long nextLong() throws IOException {
        long jNextLong = this.jsonReader.nextLong();
        markValueConsumed();
        return jNextLong;
    }

    @Override // io.sentry.ObjectReader
    @Nullable
    public Long nextLongOrNull() {
        if (this.jsonReader.peek() != JsonToken.NULL) {
            return Long.valueOf(nextLong());
        }
        nextNull();
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // io.sentry.ObjectReader
    @Nullable
    public <T> Map<String, List<T>> nextMapOfListOrNull(@NotNull ILogger iLogger, @NotNull JsonDeserializer<T> jsonDeserializer) throws Throwable {
        Throwable th2;
        ILogger iLogger2;
        if (peek() == JsonToken.NULL) {
            nextNull();
            return null;
        }
        HashMap map = new HashMap();
        beginObject();
        if (hasNext()) {
            while (true) {
                String strNextName = nextName();
                RecoveryState recoveryStateBeginRecovery = beginRecovery(peek());
                try {
                    List<T> listNextListOrNull = nextListOrNull(iLogger, jsonDeserializer);
                    if (listNextListOrNull != null) {
                        map.put(strNextName, listNextListOrNull);
                    }
                    endRecovery(recoveryStateBeginRecovery);
                    iLogger2 = iLogger;
                } catch (Exception e3) {
                    iLogger2 = iLogger;
                    try {
                        if (!recoverAfterValueFailure(iLogger2, e3, "Failed to deserialize list in map.", "Stream unrecoverable, aborting map-of-lists deserialization.", recoveryStateBeginRecovery)) {
                            endRecovery(recoveryStateBeginRecovery);
                            endObject();
                            return map;
                        }
                        endRecovery(recoveryStateBeginRecovery);
                    } catch (Throwable th3) {
                        th2 = th3;
                        endRecovery(recoveryStateBeginRecovery);
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    endRecovery(recoveryStateBeginRecovery);
                    throw th2;
                }
                if (peek() != JsonToken.BEGIN_OBJECT && peek() != JsonToken.NAME) {
                    break;
                }
                iLogger = iLogger2;
            }
        }
        endObject();
        return map;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // io.sentry.ObjectReader
    @Nullable
    public <T> Map<String, T> nextMapOrNull(@NotNull ILogger iLogger, @NotNull JsonDeserializer<T> jsonDeserializer) throws Throwable {
        Throwable th2;
        JsonObjectReader jsonObjectReader;
        ILogger iLogger2;
        if (this.jsonReader.peek() == JsonToken.NULL) {
            nextNull();
            return null;
        }
        beginObject();
        HashMap map = new HashMap();
        if (this.jsonReader.hasNext()) {
            while (true) {
                String strNextName = this.jsonReader.nextName();
                RecoveryState recoveryStateBeginRecovery = beginRecovery(peek());
                try {
                    map.put(strNextName, jsonDeserializer.deserialize(this, iLogger));
                    endRecovery(recoveryStateBeginRecovery);
                    jsonObjectReader = this;
                    iLogger2 = iLogger;
                } catch (Exception e3) {
                    jsonObjectReader = this;
                    iLogger2 = iLogger;
                    try {
                        if (!jsonObjectReader.recoverAfterValueFailure(iLogger2, e3, "Failed to deserialize object in map.", "Stream unrecoverable, aborting map deserialization.", recoveryStateBeginRecovery)) {
                            endRecovery(recoveryStateBeginRecovery);
                            endObject();
                            return map;
                        }
                        endRecovery(recoveryStateBeginRecovery);
                    } catch (Throwable th3) {
                        th2 = th3;
                        endRecovery(recoveryStateBeginRecovery);
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    endRecovery(recoveryStateBeginRecovery);
                    throw th2;
                }
                if (jsonObjectReader.jsonReader.peek() != JsonToken.BEGIN_OBJECT && jsonObjectReader.jsonReader.peek() != JsonToken.NAME) {
                    break;
                }
                iLogger = iLogger2;
            }
        }
        endObject();
        return map;
    }

    @Override // io.sentry.ObjectReader
    @NotNull
    public String nextName() {
        return this.jsonReader.nextName();
    }

    @Override // io.sentry.ObjectReader
    public void nextNull() {
        this.jsonReader.nextNull();
        markValueConsumed();
    }

    @Override // io.sentry.ObjectReader
    @Nullable
    public Object nextObjectOrNull() {
        return new JsonObjectDeserializer().deserialize(this);
    }

    @Override // io.sentry.ObjectReader
    @Nullable
    public <T> T nextOrNull(@NotNull ILogger iLogger, @NotNull JsonDeserializer<T> jsonDeserializer) {
        if (this.jsonReader.peek() != JsonToken.NULL) {
            return jsonDeserializer.deserialize(this, iLogger);
        }
        nextNull();
        return null;
    }

    @Override // io.sentry.ObjectReader
    public String nextString() throws IOException {
        String strNextString = this.jsonReader.nextString();
        markValueConsumed();
        return strNextString;
    }

    @Override // io.sentry.ObjectReader
    @Nullable
    public String nextStringOrNull() {
        if (this.jsonReader.peek() != JsonToken.NULL) {
            return nextString();
        }
        nextNull();
        return null;
    }

    @Override // io.sentry.ObjectReader
    @Nullable
    public TimeZone nextTimeZoneOrNull(ILogger iLogger) {
        if (this.jsonReader.peek() == JsonToken.NULL) {
            nextNull();
            return null;
        }
        try {
            return TimeZone.getTimeZone(nextString());
        } catch (Exception e3) {
            iLogger.log(SentryLevel.ERROR, "Error when deserializing TimeZone", e3);
            return null;
        }
    }

    @Override // io.sentry.ObjectReader
    public void nextUnknown(ILogger iLogger, Map<String, Object> map, String str) {
        RecoveryState recoveryStateBeginRecovery = null;
        try {
            try {
                recoveryStateBeginRecovery = beginRecovery(peek());
                map.put(str, nextObjectOrNull());
                endRecovery(recoveryStateBeginRecovery);
            } catch (Exception e3) {
                iLogger.log(SentryLevel.ERROR, e3, "Error deserializing unknown key: %s", str);
                if (recoveryStateBeginRecovery != null) {
                    try {
                        recoverValue(recoveryStateBeginRecovery);
                    } catch (Exception e7) {
                        iLogger.log(SentryLevel.ERROR, "Stream unrecoverable after unknown key deserialization failure.", e7);
                    }
                }
                endRecovery(recoveryStateBeginRecovery);
            }
        } catch (Throwable th2) {
            endRecovery(recoveryStateBeginRecovery);
            throw th2;
        }
    }

    @Override // io.sentry.ObjectReader
    @NotNull
    public JsonToken peek() {
        return this.jsonReader.peek();
    }

    @Override // io.sentry.ObjectReader
    public void setLenient(boolean z5) {
        this.jsonReader.setLenient(z5);
    }

    @Override // io.sentry.ObjectReader
    public void skipValue() throws IOException {
        this.jsonReader.skipValue();
        markValueConsumed();
    }
}
