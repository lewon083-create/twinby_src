package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLockReason;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryStackFrame implements JsonUnknown, JsonSerializable {

    @Nullable
    private Boolean _native;

    @Nullable
    private String _package;

    @Nullable
    private String absPath;

    @Nullable
    private String addrMode;

    @Nullable
    private Integer colno;

    @Nullable
    private String contextLine;

    @Nullable
    private String filename;

    @Nullable
    private List<Integer> framesOmitted;

    @Nullable
    private String function;

    @Nullable
    private String imageAddr;

    @Nullable
    private Boolean inApp;

    @Nullable
    private String instructionAddr;

    @Nullable
    private Integer lineno;

    @Nullable
    private SentryLockReason lock;

    @Nullable
    private String module;

    @Nullable
    private String platform;

    @Nullable
    private List<String> postContext;

    @Nullable
    private List<String> preContext;

    @Nullable
    private String rawFunction;

    @Nullable
    private String symbol;

    @Nullable
    private String symbolAddr;

    @Nullable
    private Map<String, Object> unknown;

    @Nullable
    private Map<String, Object> vars;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<SentryStackFrame> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public SentryStackFrame deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            String strNextName;
            SentryStackFrame sentryStackFrame = new SentryStackFrame();
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "post_context":
                        sentryStackFrame.postContext = (List) objectReader.nextObjectOrNull();
                        break;
                    case "image_addr":
                        sentryStackFrame.imageAddr = objectReader.nextStringOrNull();
                        break;
                    case "in_app":
                        sentryStackFrame.inApp = objectReader.nextBooleanOrNull();
                        break;
                    case "raw_function":
                        sentryStackFrame.rawFunction = objectReader.nextStringOrNull();
                        break;
                    case "lineno":
                        sentryStackFrame.lineno = objectReader.nextIntegerOrNull();
                        break;
                    case "module":
                        sentryStackFrame.module = objectReader.nextStringOrNull();
                        break;
                    case "native":
                        sentryStackFrame._native = objectReader.nextBooleanOrNull();
                        break;
                    case "symbol":
                        sentryStackFrame.symbol = objectReader.nextStringOrNull();
                        break;
                    case "package":
                        sentryStackFrame._package = objectReader.nextStringOrNull();
                        break;
                    case "filename":
                        sentryStackFrame.filename = objectReader.nextStringOrNull();
                        break;
                    case "symbol_addr":
                        sentryStackFrame.symbolAddr = objectReader.nextStringOrNull();
                        break;
                    case "lock":
                        sentryStackFrame.lock = (SentryLockReason) objectReader.nextOrNull(iLogger, new SentryLockReason.Deserializer());
                        break;
                    case "vars":
                        sentryStackFrame.vars = (Map) objectReader.nextObjectOrNull();
                        break;
                    case "colno":
                        sentryStackFrame.colno = objectReader.nextIntegerOrNull();
                        break;
                    case "instruction_addr":
                        sentryStackFrame.instructionAddr = objectReader.nextStringOrNull();
                        break;
                    case "pre_context":
                        sentryStackFrame.preContext = (List) objectReader.nextObjectOrNull();
                        break;
                    case "addr_mode":
                        sentryStackFrame.addrMode = objectReader.nextStringOrNull();
                        break;
                    case "context_line":
                        sentryStackFrame.contextLine = objectReader.nextStringOrNull();
                        break;
                    case "function":
                        sentryStackFrame.function = objectReader.nextStringOrNull();
                        break;
                    case "abs_path":
                        sentryStackFrame.absPath = objectReader.nextStringOrNull();
                        break;
                    case "platform":
                        sentryStackFrame.platform = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            sentryStackFrame.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return sentryStackFrame;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String ABS_PATH = "abs_path";
        public static final String ADDR_MODE = "addr_mode";
        public static final String COLNO = "colno";
        public static final String CONTEXT_LINE = "context_line";
        public static final String FILENAME = "filename";
        public static final String FUNCTION = "function";
        public static final String IMAGE_ADDR = "image_addr";
        public static final String INSTRUCTION_ADDR = "instruction_addr";
        public static final String IN_APP = "in_app";
        public static final String LINENO = "lineno";
        public static final String LOCK = "lock";
        public static final String MODULE = "module";
        public static final String NATIVE = "native";
        public static final String PACKAGE = "package";
        public static final String PLATFORM = "platform";
        public static final String POST_CONTEXT = "post_context";
        public static final String PRE_CONTEXT = "pre_context";
        public static final String RAW_FUNCTION = "raw_function";
        public static final String SYMBOL = "symbol";
        public static final String SYMBOL_ADDR = "symbol_addr";
        public static final String VARS = "vars";
    }

    public boolean equals(Object obj) {
        if (obj != null && SentryStackFrame.class == obj.getClass()) {
            SentryStackFrame sentryStackFrame = (SentryStackFrame) obj;
            if (Objects.equals(this.preContext, sentryStackFrame.preContext) && Objects.equals(this.postContext, sentryStackFrame.postContext) && Objects.equals(this.vars, sentryStackFrame.vars) && Objects.equals(this.framesOmitted, sentryStackFrame.framesOmitted) && Objects.equals(this.filename, sentryStackFrame.filename) && Objects.equals(this.function, sentryStackFrame.function) && Objects.equals(this.module, sentryStackFrame.module) && Objects.equals(this.lineno, sentryStackFrame.lineno) && Objects.equals(this.colno, sentryStackFrame.colno) && Objects.equals(this.absPath, sentryStackFrame.absPath) && Objects.equals(this.contextLine, sentryStackFrame.contextLine) && Objects.equals(this.inApp, sentryStackFrame.inApp) && Objects.equals(this._package, sentryStackFrame._package) && Objects.equals(this._native, sentryStackFrame._native) && Objects.equals(this.platform, sentryStackFrame.platform) && Objects.equals(this.imageAddr, sentryStackFrame.imageAddr) && Objects.equals(this.symbolAddr, sentryStackFrame.symbolAddr) && Objects.equals(this.instructionAddr, sentryStackFrame.instructionAddr) && Objects.equals(this.addrMode, sentryStackFrame.addrMode) && Objects.equals(this.symbol, sentryStackFrame.symbol) && Objects.equals(this.unknown, sentryStackFrame.unknown) && Objects.equals(this.rawFunction, sentryStackFrame.rawFunction) && Objects.equals(this.lock, sentryStackFrame.lock)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public String getAbsPath() {
        return this.absPath;
    }

    @Nullable
    public String getAddrMode() {
        return this.addrMode;
    }

    @Nullable
    public Integer getColno() {
        return this.colno;
    }

    @Nullable
    public String getContextLine() {
        return this.contextLine;
    }

    @Nullable
    public String getFilename() {
        return this.filename;
    }

    @Nullable
    public List<Integer> getFramesOmitted() {
        return this.framesOmitted;
    }

    @Nullable
    public String getFunction() {
        return this.function;
    }

    @Nullable
    public String getImageAddr() {
        return this.imageAddr;
    }

    @Nullable
    public String getInstructionAddr() {
        return this.instructionAddr;
    }

    @Nullable
    public Integer getLineno() {
        return this.lineno;
    }

    @Nullable
    public SentryLockReason getLock() {
        return this.lock;
    }

    @Nullable
    public String getModule() {
        return this.module;
    }

    @Nullable
    public String getPackage() {
        return this._package;
    }

    @Nullable
    public String getPlatform() {
        return this.platform;
    }

    @Nullable
    public List<String> getPostContext() {
        return this.postContext;
    }

    @Nullable
    public List<String> getPreContext() {
        return this.preContext;
    }

    @Nullable
    public String getRawFunction() {
        return this.rawFunction;
    }

    @Nullable
    public String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public String getSymbolAddr() {
        return this.symbolAddr;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Nullable
    public Map<String, Object> getVars() {
        return this.vars;
    }

    public int hashCode() {
        return Objects.hash(this.preContext, this.postContext, this.vars, this.framesOmitted, this.filename, this.function, this.module, this.lineno, this.colno, this.absPath, this.contextLine, this.inApp, this._package, this._native, this.platform, this.imageAddr, this.symbolAddr, this.instructionAddr, this.addrMode, this.symbol, this.unknown, this.rawFunction, this.lock);
    }

    @Nullable
    public Boolean isInApp() {
        return this.inApp;
    }

    @Nullable
    public Boolean isNative() {
        return this._native;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        if (this.filename != null) {
            objectWriter.name("filename").value(this.filename);
        }
        if (this.function != null) {
            objectWriter.name(JsonKeys.FUNCTION).value(this.function);
        }
        if (this.module != null) {
            objectWriter.name("module").value(this.module);
        }
        if (this.lineno != null) {
            objectWriter.name(JsonKeys.LINENO).value(this.lineno);
        }
        if (this.colno != null) {
            objectWriter.name(JsonKeys.COLNO).value(this.colno);
        }
        if (this.absPath != null) {
            objectWriter.name(JsonKeys.ABS_PATH).value(this.absPath);
        }
        if (this.contextLine != null) {
            objectWriter.name(JsonKeys.CONTEXT_LINE).value(this.contextLine);
        }
        if (this.inApp != null) {
            objectWriter.name(JsonKeys.IN_APP).value(this.inApp);
        }
        if (this._package != null) {
            objectWriter.name(JsonKeys.PACKAGE).value(this._package);
        }
        if (this._native != null) {
            objectWriter.name("native").value(this._native);
        }
        if (this.platform != null) {
            objectWriter.name("platform").value(this.platform);
        }
        if (this.imageAddr != null) {
            objectWriter.name("image_addr").value(this.imageAddr);
        }
        if (this.symbolAddr != null) {
            objectWriter.name(JsonKeys.SYMBOL_ADDR).value(this.symbolAddr);
        }
        if (this.instructionAddr != null) {
            objectWriter.name(JsonKeys.INSTRUCTION_ADDR).value(this.instructionAddr);
        }
        if (this.addrMode != null) {
            objectWriter.name(JsonKeys.ADDR_MODE).value(this.addrMode);
        }
        if (this.rawFunction != null) {
            objectWriter.name(JsonKeys.RAW_FUNCTION).value(this.rawFunction);
        }
        if (this.symbol != null) {
            objectWriter.name(JsonKeys.SYMBOL).value(this.symbol);
        }
        if (this.lock != null) {
            objectWriter.name(JsonKeys.LOCK).value(iLogger, this.lock);
        }
        List<String> list = this.preContext;
        if (list != null && !list.isEmpty()) {
            objectWriter.name(JsonKeys.PRE_CONTEXT).value(iLogger, this.preContext);
        }
        List<String> list2 = this.postContext;
        if (list2 != null && !list2.isEmpty()) {
            objectWriter.name(JsonKeys.POST_CONTEXT).value(iLogger, this.postContext);
        }
        Map<String, Object> map = this.vars;
        if (map != null && !map.isEmpty()) {
            objectWriter.name(JsonKeys.VARS).value(iLogger, this.vars);
        }
        Map<String, Object> map2 = this.unknown;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                gf.a.v(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setAbsPath(@Nullable String str) {
        this.absPath = str;
    }

    public void setAddrMode(@Nullable String str) {
        this.addrMode = str;
    }

    public void setColno(@Nullable Integer num) {
        this.colno = num;
    }

    public void setContextLine(@Nullable String str) {
        this.contextLine = str;
    }

    public void setFilename(@Nullable String str) {
        this.filename = str;
    }

    public void setFramesOmitted(@Nullable List<Integer> list) {
        this.framesOmitted = list;
    }

    public void setFunction(@Nullable String str) {
        this.function = str;
    }

    public void setImageAddr(@Nullable String str) {
        this.imageAddr = str;
    }

    public void setInApp(@Nullable Boolean bool) {
        this.inApp = bool;
    }

    public void setInstructionAddr(@Nullable String str) {
        this.instructionAddr = str;
    }

    public void setLineno(@Nullable Integer num) {
        this.lineno = num;
    }

    public void setLock(@Nullable SentryLockReason sentryLockReason) {
        this.lock = sentryLockReason;
    }

    public void setModule(@Nullable String str) {
        this.module = str;
    }

    public void setNative(@Nullable Boolean bool) {
        this._native = bool;
    }

    public void setPackage(@Nullable String str) {
        this._package = str;
    }

    public void setPlatform(@Nullable String str) {
        this.platform = str;
    }

    public void setPostContext(@Nullable List<String> list) {
        this.postContext = list;
    }

    public void setPreContext(@Nullable List<String> list) {
        this.preContext = list;
    }

    public void setRawFunction(@Nullable String str) {
        this.rawFunction = str;
    }

    public void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public void setSymbolAddr(@Nullable String str) {
        this.symbolAddr = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public void setVars(@Nullable Map<String, Object> map) {
        this.vars = map;
    }
}
