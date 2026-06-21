package io.appmetrica.analytics.coreutils.internal.parsing;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.sentry.SentryReplayEvent;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class RemoteConfigJsonUtils {

    @NotNull
    public static final RemoteConfigJsonUtils INSTANCE = new RemoteConfigJsonUtils();

    private RemoteConfigJsonUtils() {
    }

    public static final boolean extractFeature(@NotNull JSONObject jSONObject, @NotNull String str, boolean z5) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        try {
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("features");
            if (jSONObjectOptJSONObject3 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("list")) != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(str)) != null) {
                return jSONObjectOptJSONObject2.optBoolean("enabled", z5);
            }
        } catch (Throwable unused) {
        }
        return z5;
    }

    @NotNull
    public static final byte[][] extractHosts(@NotNull JSONObject jSONObject, @NotNull String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("query_hosts");
        if (jSONObjectOptJSONObject3 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("list")) == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(str)) == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray(SentryReplayEvent.JsonKeys.URLS)) == null) {
            return new byte[0][];
        }
        int length = jSONArrayOptJSONArray.length();
        byte[][] bArr = new byte[length][];
        for (int i = 0; i < length; i++) {
            bArr[i] = jSONArrayOptJSONArray.optString(i).getBytes(Charsets.UTF_8);
        }
        return bArr;
    }

    public static final long extractMillisFromSecondsOrDefault(@NotNull JSONObject jSONObject, @NotNull String str, long j10) {
        return extractMillisOrDefault(jSONObject, str, TimeUnit.SECONDS, j10);
    }

    public static final long extractMillisOrDefault(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull TimeUnit timeUnit, long j10) {
        return WrapUtils.getMillisOrDefault(JsonUtils.optLongOrNull(jSONObject, str), timeUnit, j10);
    }

    @Nullable
    public static final String extractQuery(@NotNull JSONObject jSONObject, @NotNull String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        try {
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("queries");
            if (jSONObjectOptJSONObject3 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("list")) != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(str)) != null) {
                RemoteConfigJsonUtils remoteConfigJsonUtils = INSTANCE;
                String strOptString = jSONObjectOptJSONObject2.optString("url", "");
                remoteConfigJsonUtils.getClass();
                if (!Intrinsics.a(strOptString, "")) {
                    return strOptString;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
