package io.sentry.protocol.profiling;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.profiling.SentrySample;
import io.sentry.protocol.profiling.SentryThreadMetadata;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryProfile implements JsonUnknown, JsonSerializable {

    @Nullable
    private Map<String, Object> unknown;

    @NotNull
    private List<SentrySample> samples = new ArrayList();

    @NotNull
    private List<List<Integer>> stacks = new ArrayList();

    @NotNull
    private List<SentryStackFrame> frames = new ArrayList();

    @NotNull
    private Map<String, SentryThreadMetadata> threadMetadata = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<SentryProfile> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public SentryProfile deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            SentryProfile sentryProfile = new SentryProfile();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "frames":
                        List listNextListOrNull = objectReader.nextListOrNull(iLogger, new SentryStackFrame.Deserializer());
                        if (listNextListOrNull == null) {
                            break;
                        } else {
                            sentryProfile.frames = listNextListOrNull;
                            break;
                        }
                        break;
                    case "stacks":
                        List list = (List) objectReader.nextOrNull(iLogger, new NestedIntegerListDeserializer());
                        if (list == null) {
                            break;
                        } else {
                            sentryProfile.stacks = list;
                            break;
                        }
                        break;
                    case "samples":
                        List listNextListOrNull2 = objectReader.nextListOrNull(iLogger, new SentrySample.Deserializer());
                        if (listNextListOrNull2 == null) {
                            break;
                        } else {
                            sentryProfile.samples = listNextListOrNull2;
                            break;
                        }
                        break;
                    case "thread_metadata":
                        Map mapNextMapOrNull = objectReader.nextMapOrNull(iLogger, new SentryThreadMetadata.Deserializer());
                        if (mapNextMapOrNull == null) {
                            break;
                        } else {
                            sentryProfile.threadMetadata = mapNextMapOrNull;
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            sentryProfile.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return sentryProfile;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String FRAMES = "frames";
        public static final String SAMPLES = "samples";
        public static final String STACKS = "stacks";
        public static final String THREAD_METADATA = "thread_metadata";
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class NestedIntegerListDeserializer implements JsonDeserializer<List<List<Integer>>> {
        private NestedIntegerListDeserializer() {
        }

        @Override // io.sentry.JsonDeserializer
        @NotNull
        public List<List<Integer>> deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            ArrayList arrayList = new ArrayList();
            objectReader.beginArray();
            while (objectReader.hasNext()) {
                ArrayList arrayList2 = new ArrayList();
                objectReader.beginArray();
                while (objectReader.hasNext()) {
                    arrayList2.add(Integer.valueOf(objectReader.nextInt()));
                }
                objectReader.endArray();
                arrayList.add(arrayList2);
            }
            objectReader.endArray();
            return arrayList;
        }
    }

    @NotNull
    public List<SentryStackFrame> getFrames() {
        return this.frames;
    }

    @NotNull
    public List<SentrySample> getSamples() {
        return this.samples;
    }

    @NotNull
    public List<List<Integer>> getStacks() {
        return this.stacks;
    }

    @NotNull
    public Map<String, SentryThreadMetadata> getThreadMetadata() {
        return this.threadMetadata;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name(JsonKeys.SAMPLES).value(iLogger, this.samples);
        objectWriter.name(JsonKeys.STACKS).value(iLogger, this.stacks);
        objectWriter.name("frames").value(iLogger, this.frames);
        objectWriter.name(JsonKeys.THREAD_METADATA).value(iLogger, this.threadMetadata);
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setFrames(@NotNull List<SentryStackFrame> list) {
        this.frames = list;
    }

    public void setSamples(@NotNull List<SentrySample> list) {
        this.samples = list;
    }

    public void setStacks(@NotNull List<List<Integer>> list) {
        this.stacks = list;
    }

    public void setThreadMetadata(@NotNull Map<String, SentryThreadMetadata> map) {
        this.threadMetadata = map;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }
}
