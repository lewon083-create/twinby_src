package io.sentry;

import io.sentry.SentryItemType;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryEnvelopeItemHeader implements JsonSerializable, JsonUnknown {

    @Nullable
    private final String attachmentType;

    @Nullable
    private final String contentType;

    @Nullable
    private final String fileName;

    @Nullable
    private final Callable<Integer> getLength;

    @Nullable
    private final Integer itemCount;
    private final int length;

    @Nullable
    private final String platform;

    @NotNull
    private final SentryItemType type;

    @Nullable
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<SentryEnvelopeItemHeader> {
        private Exception missingRequiredFieldException(String str, ILogger iLogger) {
            String strF = pe.a.f("Missing required field \"", str, "\"");
            IllegalStateException illegalStateException = new IllegalStateException(strF);
            iLogger.log(SentryLevel.ERROR, strF, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public SentryEnvelopeItemHeader deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) throws Exception {
            String strNextName;
            objectReader.beginObject();
            HashMap map = null;
            SentryItemType sentryItemType = null;
            String strNextStringOrNull = null;
            String strNextStringOrNull2 = null;
            String strNextStringOrNull3 = null;
            String strNextStringOrNull4 = null;
            Integer numNextIntegerOrNull = null;
            int iNextInt = 0;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "item_count":
                        numNextIntegerOrNull = objectReader.nextIntegerOrNull();
                        break;
                    case "length":
                        iNextInt = objectReader.nextInt();
                        break;
                    case "filename":
                        strNextStringOrNull2 = objectReader.nextStringOrNull();
                        break;
                    case "attachment_type":
                        strNextStringOrNull3 = objectReader.nextStringOrNull();
                        break;
                    case "type":
                        sentryItemType = (SentryItemType) objectReader.nextOrNull(iLogger, new SentryItemType.Deserializer());
                        break;
                    case "content_type":
                        strNextStringOrNull = objectReader.nextStringOrNull();
                        break;
                    case "platform":
                        strNextStringOrNull4 = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        objectReader.nextUnknown(iLogger, map, strNextName);
                        break;
                }
            }
            if (sentryItemType == null) {
                throw missingRequiredFieldException("type", iLogger);
            }
            SentryEnvelopeItemHeader sentryEnvelopeItemHeader = new SentryEnvelopeItemHeader(sentryItemType, iNextInt, strNextStringOrNull, strNextStringOrNull2, strNextStringOrNull3, strNextStringOrNull4, numNextIntegerOrNull);
            sentryEnvelopeItemHeader.setUnknown(map);
            objectReader.endObject();
            return sentryEnvelopeItemHeader;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String ATTACHMENT_TYPE = "attachment_type";
        public static final String CONTENT_TYPE = "content_type";
        public static final String FILENAME = "filename";
        public static final String ITEM_COUNT = "item_count";
        public static final String LENGTH = "length";
        public static final String PLATFORM = "platform";
        public static final String TYPE = "type";
    }

    public SentryEnvelopeItemHeader(@NotNull SentryItemType sentryItemType, int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num) {
        this.type = (SentryItemType) Objects.requireNonNull(sentryItemType, "type is required");
        this.contentType = str;
        this.length = i;
        this.fileName = str2;
        this.getLength = null;
        this.attachmentType = str3;
        this.platform = str4;
        this.itemCount = num;
    }

    @Nullable
    public String getAttachmentType() {
        return this.attachmentType;
    }

    @Nullable
    public String getContentType() {
        return this.contentType;
    }

    @Nullable
    public String getFileName() {
        return this.fileName;
    }

    public int getLength() {
        Callable<Integer> callable = this.getLength;
        if (callable == null) {
            return this.length;
        }
        try {
            return callable.call().intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Nullable
    public String getPlatform() {
        return this.platform;
    }

    @NotNull
    public SentryItemType getType() {
        return this.type;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        if (this.contentType != null) {
            objectWriter.name(JsonKeys.CONTENT_TYPE).value(this.contentType);
        }
        if (this.fileName != null) {
            objectWriter.name("filename").value(this.fileName);
        }
        objectWriter.name("type").value(iLogger, this.type);
        if (this.attachmentType != null) {
            objectWriter.name(JsonKeys.ATTACHMENT_TYPE).value(this.attachmentType);
        }
        if (this.platform != null) {
            objectWriter.name("platform").value(this.platform);
        }
        if (this.itemCount != null) {
            objectWriter.name(JsonKeys.ITEM_COUNT).value(this.itemCount);
        }
        objectWriter.name(JsonKeys.LENGTH).value(getLength());
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                gf.a.v(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public SentryEnvelopeItemHeader(@NotNull SentryItemType sentryItemType, @Nullable Callable<Integer> callable, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this(sentryItemType, callable, str, str2, str3, (String) null, (Integer) null);
    }

    public SentryEnvelopeItemHeader(@NotNull SentryItemType sentryItemType, @Nullable Callable<Integer> callable, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num) {
        this.type = (SentryItemType) Objects.requireNonNull(sentryItemType, "type is required");
        this.contentType = str;
        this.length = -1;
        this.fileName = str2;
        this.getLength = callable;
        this.attachmentType = str3;
        this.platform = str4;
        this.itemCount = num;
    }

    public SentryEnvelopeItemHeader(@NotNull SentryItemType sentryItemType, @Nullable Callable<Integer> callable, @Nullable String str, @Nullable String str2) {
        this(sentryItemType, callable, str, str2, null);
    }
}
