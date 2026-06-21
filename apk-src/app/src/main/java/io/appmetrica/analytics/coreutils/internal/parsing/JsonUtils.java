package io.appmetrica.analytics.coreutils.internal.parsing;

import ek.q;
import ek.u;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
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
public final class JsonUtils {

    @NotNull
    public static final JsonUtils INSTANCE = new JsonUtils();

    private JsonUtils() {
    }

    public static final boolean isEqualTo(@NotNull JSONObject jSONObject, @NotNull JSONObject jSONObject2) throws JSONException {
        boolean zEquals;
        if (!Intrinsics.a(u.h(q.a(jSONObject.keys())), u.h(q.a(jSONObject2.keys())))) {
            return false;
        }
        for (String str : q.a(jSONObject.keys())) {
            Object obj = jSONObject.get(str);
            Object obj2 = jSONObject2.get(str);
            if (obj instanceof JSONObject) {
                if (!(obj2 instanceof JSONObject)) {
                    return false;
                }
                zEquals = isEqualTo((JSONObject) obj, (JSONObject) obj2);
            } else if (!(obj instanceof JSONArray)) {
                zEquals = obj.equals(obj2);
            } else {
                if (!(obj2 instanceof JSONArray)) {
                    return false;
                }
                zEquals = isEqualTo((JSONArray) obj, (JSONArray) obj2);
            }
            if (!zEquals) {
                return false;
            }
        }
        return true;
    }

    public static final boolean optBooleanOrDefault(@Nullable JSONObject jSONObject, @NotNull String str, boolean z5) {
        Boolean boolOptBooleanOrNull = optBooleanOrNull(jSONObject, str);
        return boolOptBooleanOrNull != null ? boolOptBooleanOrNull.booleanValue() : z5;
    }

    @Nullable
    public static final Boolean optBooleanOrNull(@Nullable JSONObject jSONObject, @NotNull String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final Boolean optBooleanOrNullable(@Nullable JSONObject jSONObject, @NotNull String str, @Nullable Boolean bool) {
        Boolean boolOptBooleanOrNull = optBooleanOrNull(jSONObject, str);
        return boolOptBooleanOrNull == null ? bool : boolOptBooleanOrNull;
    }

    public static final float optFloatOrDefault(@Nullable JSONObject jSONObject, @NotNull String str, float f10) {
        Float fOptFloatOrNull = optFloatOrNull(jSONObject, str);
        return fOptFloatOrNull != null ? fOptFloatOrNull.floatValue() : f10;
    }

    @Nullable
    public static final Float optFloatOrNull(@Nullable JSONObject jSONObject, @NotNull String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Float.valueOf((float) jSONObject.getDouble(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final byte[] optHexByteArray(@Nullable JSONObject jSONObject, @NotNull String str, @Nullable byte[] bArr) {
        String strOptStringOrNull;
        byte[] bArrHexToBytes;
        if (jSONObject == null || (strOptStringOrNull = optStringOrNull(jSONObject, str)) == null) {
            return bArr;
        }
        try {
            bArrHexToBytes = StringUtils.hexToBytes(strOptStringOrNull);
        } catch (Throwable unused) {
            bArrHexToBytes = null;
        }
        return bArrHexToBytes != null ? bArrHexToBytes : bArr;
    }

    public static /* synthetic */ byte[] optHexByteArray$default(JSONObject jSONObject, String str, byte[] bArr, int i, Object obj) {
        if ((i & 2) != 0) {
            bArr = null;
        }
        return optHexByteArray(jSONObject, str, bArr);
    }

    @Nullable
    public static final Integer optIntOrDefault(@Nullable JSONObject jSONObject, @NotNull String str, @Nullable Integer num) {
        Integer numOptIntOrNull = optIntOrNull(jSONObject, str);
        return numOptIntOrNull == null ? num : numOptIntOrNull;
    }

    @Nullable
    public static final Integer optIntOrNull(@Nullable JSONObject jSONObject, @NotNull String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Integer.valueOf(jSONObject.getInt(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    @NotNull
    public static final JSONObject optJsonObjectOrDefault(@Nullable JSONObject jSONObject, @NotNull String str, @NotNull JSONObject jSONObject2) {
        JSONObject jSONObjectOptJsonObjectOrNull = optJsonObjectOrNull(jSONObject, str);
        return jSONObjectOptJsonObjectOrNull == null ? jSONObject2 : jSONObjectOptJsonObjectOrNull;
    }

    @Nullable
    public static final JSONObject optJsonObjectOrNull(@Nullable JSONObject jSONObject, @NotNull String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    @Nullable
    public static final JSONObject optJsonObjectOrNullable(@Nullable JSONObject jSONObject, @NotNull String str, @Nullable JSONObject jSONObject2) {
        JSONObject jSONObjectOptJsonObjectOrNull = optJsonObjectOrNull(jSONObject, str);
        return jSONObjectOptJsonObjectOrNull == null ? jSONObject2 : jSONObjectOptJsonObjectOrNull;
    }

    @Nullable
    public static final Long optLongOrDefault(@Nullable JSONObject jSONObject, @NotNull String str, @Nullable Long l10) {
        Long lOptLongOrNull = optLongOrNull(jSONObject, str);
        return lOptLongOrNull == null ? l10 : lOptLongOrNull;
    }

    @Nullable
    public static final Long optLongOrNull(@Nullable JSONObject jSONObject, @NotNull String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Long.valueOf(jSONObject.getLong(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final String optStringOrNull(@Nullable JSONObject jSONObject, @NotNull String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return jSONObject.getString(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final String optStringOrNullable(@Nullable JSONObject jSONObject, @NotNull String str, @Nullable String str2) {
        String strOptStringOrNull = optStringOrNull(jSONObject, str);
        return strOptStringOrNull == null ? str2 : strOptStringOrNull;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[LOOP:0: B:11:0x0026->B:35:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean isEqualTo(@org.jetbrains.annotations.NotNull org.json.JSONArray r5, @org.jetbrains.annotations.NotNull org.json.JSONArray r6) throws org.json.JSONException {
        /*
            int r0 = r5.length()
            int r1 = r6.length()
            r2 = 0
            if (r0 == r1) goto Lc
            goto L5e
        Lc:
            int r0 = r5.length()
            kotlin.ranges.IntRange r0 = ck.o.e(r2, r0)
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L22
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L22
            goto L5f
        L22:
            ck.g r0 = r0.iterator()
        L26:
            boolean r1 = r0.f2383d
            if (r1 == 0) goto L5f
            int r1 = r0.nextInt()
            java.lang.Object r3 = r5.get(r1)
            java.lang.Object r1 = r6.get(r1)
            boolean r4 = r3 instanceof org.json.JSONObject
            if (r4 == 0) goto L47
            boolean r4 = r1 instanceof org.json.JSONObject
            if (r4 == 0) goto L5e
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            boolean r1 = isEqualTo(r3, r1)
            goto L5c
        L47:
            boolean r4 = r3 instanceof org.json.JSONArray
            if (r4 == 0) goto L58
            boolean r4 = r1 instanceof org.json.JSONArray
            if (r4 == 0) goto L5e
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            org.json.JSONArray r1 = (org.json.JSONArray) r1
            boolean r1 = isEqualTo(r3, r1)
            goto L5c
        L58:
            boolean r1 = r3.equals(r1)
        L5c:
            if (r1 != 0) goto L26
        L5e:
            return r2
        L5f:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.isEqualTo(org.json.JSONArray, org.json.JSONArray):boolean");
    }
}
