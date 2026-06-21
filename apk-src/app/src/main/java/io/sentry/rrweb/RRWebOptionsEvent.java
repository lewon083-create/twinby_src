package io.sentry.rrweb;

import gf.a;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.ScreenshotStrategyType;
import io.sentry.SentryMaskingOptions;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayOptions;
import io.sentry.protocol.SdkVersion;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class RRWebOptionsEvent extends RRWebEvent implements JsonSerializable, JsonUnknown {
    public static final String EVENT_TAG = "options";

    @Nullable
    private Map<String, Object> dataUnknown;

    @NotNull
    private Map<String, Object> optionsPayload;

    @NotNull
    private String tag;

    @Nullable
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<RRWebOptionsEvent> {
        private void deserializeData(@NotNull RRWebOptionsEvent rRWebOptionsEvent, @NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("payload")) {
                    deserializePayload(rRWebOptionsEvent, objectReader, iLogger);
                } else if (strNextName.equals("tag")) {
                    String strNextStringOrNull = objectReader.nextStringOrNull();
                    if (strNextStringOrNull == null) {
                        strNextStringOrNull = "";
                    }
                    rRWebOptionsEvent.tag = strNextStringOrNull;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                }
            }
            rRWebOptionsEvent.setDataUnknown(concurrentHashMap);
            objectReader.endObject();
        }

        private void deserializePayload(@NotNull RRWebOptionsEvent rRWebOptionsEvent, @NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            objectReader.beginObject();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                if (map == null) {
                    map = new HashMap();
                }
                objectReader.nextUnknown(iLogger, map, strNextName);
            }
            if (map != null) {
                rRWebOptionsEvent.setOptionsPayload(map);
            }
            objectReader.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public RRWebOptionsEvent deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            objectReader.beginObject();
            RRWebOptionsEvent rRWebOptionsEvent = new RRWebOptionsEvent();
            RRWebEvent.Deserializer deserializer = new RRWebEvent.Deserializer();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("data")) {
                    deserializeData(rRWebOptionsEvent, objectReader, iLogger);
                } else if (!deserializer.deserializeValue(rRWebOptionsEvent, strNextName, objectReader, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            rRWebOptionsEvent.setUnknown(map);
            objectReader.endObject();
            return rRWebOptionsEvent;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String DATA = "data";
        public static final String PAYLOAD = "payload";
    }

    public RRWebOptionsEvent() {
        super(RRWebEventType.Custom);
        this.optionsPayload = new HashMap();
        this.tag = EVENT_TAG;
    }

    private void serializeData(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("tag").value(this.tag);
        objectWriter.name("payload");
        serializePayload(objectWriter, iLogger);
        Map<String, Object> map = this.dataUnknown;
        if (map != null) {
            for (String str : map.keySet()) {
                a.v(this.dataUnknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    private void serializePayload(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        Map<String, Object> map = this.optionsPayload;
        if (map != null) {
            for (String str : map.keySet()) {
                a.v(this.optionsPayload, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    @Nullable
    public Map<String, Object> getDataUnknown() {
        return this.dataUnknown;
    }

    @NotNull
    public Map<String, Object> getOptionsPayload() {
        return this.optionsPayload;
    }

    @NotNull
    public String getTag() {
        return this.tag;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        new RRWebEvent.Serializer().serialize(this, objectWriter, iLogger);
        objectWriter.name("data");
        serializeData(objectWriter, iLogger);
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                a.v(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setDataUnknown(@Nullable Map<String, Object> map) {
        this.dataUnknown = map;
    }

    public void setOptionsPayload(@NotNull Map<String, Object> map) {
        this.optionsPayload = map;
    }

    public void setTag(@NotNull String str) {
        this.tag = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public RRWebOptionsEvent(@NotNull SentryOptions sentryOptions) {
        String str;
        this();
        SdkVersion sdkVersion = sentryOptions.getSdkVersion();
        if (sdkVersion != null) {
            this.optionsPayload.put("nativeSdkName", sdkVersion.getName());
            this.optionsPayload.put("nativeSdkVersion", sdkVersion.getVersion());
        }
        SentryReplayOptions sessionReplay = sentryOptions.getSessionReplay();
        this.optionsPayload.put("errorSampleRate", sessionReplay.getOnErrorSampleRate());
        this.optionsPayload.put("sessionSampleRate", sessionReplay.getSessionSampleRate());
        this.optionsPayload.put("maskAllImages", Boolean.valueOf(sessionReplay.getMaskViewClasses().contains(SentryMaskingOptions.IMAGE_VIEW_CLASS_NAME)));
        this.optionsPayload.put("maskAllText", Boolean.valueOf(sessionReplay.getMaskViewClasses().contains(SentryMaskingOptions.TEXT_VIEW_CLASS_NAME)));
        this.optionsPayload.put("quality", sessionReplay.getQuality().serializedName());
        this.optionsPayload.put("maskedViewClasses", sessionReplay.getMaskViewClasses());
        this.optionsPayload.put("unmaskedViewClasses", sessionReplay.getUnmaskViewClasses());
        if (sessionReplay.getScreenshotStrategy() == ScreenshotStrategyType.PIXEL_COPY) {
            str = "pixelCopy";
        } else {
            str = "canvas";
        }
        this.optionsPayload.put("screenshotStrategy", str);
        this.optionsPayload.put("networkDetailHasUrls", Boolean.valueOf(!sessionReplay.getNetworkDetailAllowUrls().isEmpty()));
        if (sessionReplay.getNetworkDetailAllowUrls().isEmpty()) {
            return;
        }
        this.optionsPayload.put("networkDetailAllowUrls", sessionReplay.getNetworkDetailAllowUrls());
        this.optionsPayload.put("networkRequestHeaders", sessionReplay.getNetworkRequestHeaders());
        this.optionsPayload.put("networkResponseHeaders", sessionReplay.getNetworkResponseHeaders());
        this.optionsPayload.put("networkCaptureBodies", Boolean.valueOf(sessionReplay.isNetworkCaptureBodies()));
        if (sessionReplay.getNetworkDetailDenyUrls().isEmpty()) {
            return;
        }
        this.optionsPayload.put("networkDetailDenyUrls", sessionReplay.getNetworkDetailDenyUrls());
    }
}
