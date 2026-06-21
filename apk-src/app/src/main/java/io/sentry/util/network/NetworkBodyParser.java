package io.sentry.util.network;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.util.network.NetworkBody;
import io.sentry.vendor.gson.stream.JsonReader;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NetworkBodyParser {

    /* JADX INFO: renamed from: io.sentry.util.network.NetworkBodyParser$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$vendor$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$io$sentry$vendor$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.BEGIN_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private NetworkBodyParser() {
    }

    @Nullable
    public static NetworkBody fromBytes(@Nullable byte[] bArr, @Nullable String str, @Nullable String str2, int i, @NotNull ILogger iLogger) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        if (str != null && isBinaryContentType(str)) {
            return new NetworkBody("[Binary data, " + bArr.length + " bytes, type: " + str + "]");
        }
        if (str2 == null) {
            str2 = "UTF-8";
        }
        try {
            return parse(new String(bArr, 0, Math.min(bArr.length, i), str2), str, bArr.length > i, iLogger);
        } catch (UnsupportedEncodingException e3) {
            iLogger.log(SentryLevel.WARNING, "Failed to decode bytes: " + e3.getMessage(), new Object[0]);
            return new NetworkBody(z.d(bArr.length, " bytes]", new StringBuilder("[Failed to decode bytes, ")), Collections.singletonList(NetworkBody.NetworkBodyWarning.BODY_PARSE_ERROR));
        }
    }

    private static boolean isBinaryContentType(@NotNull String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        return lowerCase.contains("image/") || lowerCase.contains("video/") || lowerCase.contains("audio/") || lowerCase.contains("application/octet-stream") || lowerCase.contains("application/pdf") || lowerCase.contains("application/zip") || lowerCase.contains("application/gzip");
    }

    @Nullable
    private static NetworkBody parse(@Nullable String str, @Nullable String str2, boolean z5, @Nullable ILogger iLogger) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        if (str2 != null) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (lowerCase.contains("application/x-www-form-urlencoded")) {
                return parseFormUrlEncoded(str, z5, iLogger);
            }
            if (lowerCase.contains("application/json")) {
                return parseJson(str, z5, iLogger);
            }
        }
        return new NetworkBody(str, z5 ? Collections.singletonList(NetworkBody.NetworkBodyWarning.TEXT_TRUNCATED) : null);
    }

    @NotNull
    private static NetworkBody parseFormUrlEncoded(@NotNull String str, boolean z5, @Nullable ILogger iLogger) {
        try {
            HashMap map = new HashMap();
            for (String str2 : str.split("&", -1)) {
                int iIndexOf = str2.indexOf("=");
                if (iIndexOf > 0) {
                    String strDecode = URLDecoder.decode(str2.substring(0, iIndexOf), "UTF-8");
                    String strDecode2 = iIndexOf < str2.length() + (-1) ? URLDecoder.decode(str2.substring(iIndexOf + 1), "UTF-8") : "";
                    if (map.containsKey(strDecode)) {
                        Object obj = map.get(strDecode);
                        if (obj instanceof List) {
                            ((List) obj).add(strDecode2);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add((String) obj);
                            arrayList.add(strDecode2);
                            map.put(strDecode, arrayList);
                        }
                    } else {
                        map.put(strDecode, strDecode2);
                    }
                }
            }
            return new NetworkBody(map, z5 ? Collections.singletonList(NetworkBody.NetworkBodyWarning.TEXT_TRUNCATED) : null);
        } catch (UnsupportedEncodingException e3) {
            if (iLogger != null) {
                iLogger.log(SentryLevel.WARNING, "Failed to parse form data: " + e3.getMessage(), new Object[0]);
            }
            return new NetworkBody(null, Collections.singletonList(NetworkBody.NetworkBodyWarning.BODY_PARSE_ERROR));
        }
    }

    @NotNull
    private static NetworkBody parseJson(@NotNull String str, boolean z5, @Nullable ILogger iLogger) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                SaferJsonParser.Result result = SaferJsonParser.parse(jsonReader);
                Object obj = result.data;
                if (obj != null || z5 || result.errored || result.hitMaxDepth) {
                    NetworkBody networkBody = new NetworkBody(obj, (z5 || result.hitMaxDepth) ? Collections.singletonList(NetworkBody.NetworkBodyWarning.JSON_TRUNCATED) : result.errored ? Collections.singletonList(NetworkBody.NetworkBodyWarning.INVALID_JSON) : null);
                    jsonReader.close();
                    return networkBody;
                }
                NetworkBody networkBody2 = new NetworkBody(null);
                jsonReader.close();
                return networkBody2;
            } finally {
            }
        } catch (Exception e3) {
            if (iLogger != null) {
                iLogger.log(SentryLevel.WARNING, "Failed to parse JSON: " + e3.getMessage(), new Object[0]);
            }
            return new NetworkBody(null, Collections.singletonList(NetworkBody.NetworkBodyWarning.INVALID_JSON));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class SaferJsonParser {
        private static final int MAX_DEPTH = 100;
        final Result result = new Result(null);

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static class Result {

            @Nullable
            private Object data;
            private boolean errored;
            private boolean hitMaxDepth;

            private Result() {
            }

            public /* synthetic */ Result(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        private SaferJsonParser() {
        }

        @NotNull
        public static Result parse(@NotNull JsonReader jsonReader) {
            SaferJsonParser saferJsonParser = new SaferJsonParser();
            saferJsonParser.result.data = saferJsonParser.parse(jsonReader, 0);
            return saferJsonParser.result;
        }

        @Nullable
        private Object parse(@NotNull JsonReader jsonReader, int i) {
            if (this.result.errored) {
                return null;
            }
            if (i >= 100) {
                this.result.hitMaxDepth = true;
                return null;
            }
            try {
                switch (AnonymousClass1.$SwitchMap$io$sentry$vendor$gson$stream$JsonToken[jsonReader.peek().ordinal()]) {
                    case 1:
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        try {
                            jsonReader.beginObject();
                            while (jsonReader.hasNext() && !this.result.errored) {
                                linkedHashMap.put(jsonReader.nextName(), parse(jsonReader, i + 1));
                            }
                            jsonReader.endObject();
                            return linkedHashMap;
                        } catch (Exception unused) {
                            this.result.errored = true;
                            return linkedHashMap;
                        }
                    case 2:
                        ArrayList arrayList = new ArrayList();
                        try {
                            jsonReader.beginArray();
                            while (jsonReader.hasNext() && !this.result.errored) {
                                arrayList.add(parse(jsonReader, i + 1));
                            }
                            jsonReader.endArray();
                            return arrayList;
                        } catch (Exception unused2) {
                            this.result.errored = true;
                            return arrayList;
                        }
                    case 3:
                        return jsonReader.nextString();
                    case 4:
                        return Double.valueOf(jsonReader.nextDouble());
                    case 5:
                        return Boolean.valueOf(jsonReader.nextBoolean());
                    case 6:
                        jsonReader.nextNull();
                        return null;
                    default:
                        this.result.errored = true;
                        return null;
                }
            } catch (Exception unused3) {
                this.result.errored = true;
                return null;
            }
            this.result.errored = true;
            return null;
        }
    }
}
