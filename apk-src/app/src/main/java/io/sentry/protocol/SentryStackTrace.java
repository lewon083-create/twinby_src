package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.util.CollectionUtils;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryStackTrace implements JsonUnknown, JsonSerializable {

    @Nullable
    private List<SentryStackFrame> frames;

    @Nullable
    private InstructionAddressAdjustment instructionAddressAdjustment;

    @Nullable
    private Map<String, String> registers;

    @Nullable
    private Boolean snapshot;

    @Nullable
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<SentryStackTrace> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public SentryStackTrace deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            String strNextName;
            SentryStackTrace sentryStackTrace = new SentryStackTrace();
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "frames":
                        sentryStackTrace.frames = objectReader.nextListOrNull(iLogger, new SentryStackFrame.Deserializer());
                        break;
                    case "instruction_addr_adjustment":
                        sentryStackTrace.instructionAddressAdjustment = (InstructionAddressAdjustment) objectReader.nextOrNull(iLogger, new InstructionAddressAdjustment.Deserializer());
                        break;
                    case "registers":
                        sentryStackTrace.registers = CollectionUtils.newConcurrentHashMap((Map) objectReader.nextObjectOrNull());
                        break;
                    case "snapshot":
                        sentryStackTrace.snapshot = objectReader.nextBooleanOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            sentryStackTrace.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return sentryStackTrace;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public enum InstructionAddressAdjustment implements JsonSerializable {
        AUTO,
        ALL,
        ALL_BUT_FIRST,
        NONE;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Deserializer implements JsonDeserializer<InstructionAddressAdjustment> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.sentry.JsonDeserializer
            @NotNull
            public InstructionAddressAdjustment deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
                return InstructionAddressAdjustment.valueOf(objectReader.nextString().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.JsonSerializable
        public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
            objectWriter.value(toString().toLowerCase(Locale.ROOT));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String FRAMES = "frames";
        public static final String INSTRUCTION_ADDRESS_ADJUSTMENT = "instruction_addr_adjustment";
        public static final String REGISTERS = "registers";
        public static final String SNAPSHOT = "snapshot";
    }

    public SentryStackTrace() {
    }

    @Nullable
    public List<SentryStackFrame> getFrames() {
        return this.frames;
    }

    @Nullable
    public InstructionAddressAdjustment getInstructionAddressAdjustment() {
        return this.instructionAddressAdjustment;
    }

    @Nullable
    public Map<String, String> getRegisters() {
        return this.registers;
    }

    @Nullable
    public Boolean getSnapshot() {
        return this.snapshot;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        if (this.frames != null) {
            objectWriter.name("frames").value(iLogger, this.frames);
        }
        if (this.registers != null) {
            objectWriter.name(JsonKeys.REGISTERS).value(iLogger, this.registers);
        }
        if (this.snapshot != null) {
            objectWriter.name(JsonKeys.SNAPSHOT).value(this.snapshot);
        }
        if (this.instructionAddressAdjustment != null) {
            objectWriter.name(JsonKeys.INSTRUCTION_ADDRESS_ADJUSTMENT).value(iLogger, this.instructionAddressAdjustment);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                gf.a.v(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setFrames(@Nullable List<SentryStackFrame> list) {
        this.frames = list;
    }

    public void setInstructionAddressAdjustment(@Nullable InstructionAddressAdjustment instructionAddressAdjustment) {
        this.instructionAddressAdjustment = instructionAddressAdjustment;
    }

    public void setRegisters(@Nullable Map<String, String> map) {
        this.registers = map;
    }

    public void setSnapshot(@Nullable Boolean bool) {
        this.snapshot = bool;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public SentryStackTrace(@Nullable List<SentryStackFrame> list) {
        this.frames = list;
    }
}
