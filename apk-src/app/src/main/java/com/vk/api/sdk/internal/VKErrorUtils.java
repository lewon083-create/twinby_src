package com.vk.api.sdk.internal;

import android.os.Bundle;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class VKErrorUtils {
    public static final VKErrorUtils INSTANCE = new VKErrorUtils();

    private VKErrorUtils() {
    }

    private final Set<Integer> executeErrorsSet(String str) throws JSONException {
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = new JSONObject(str).getJSONArray(VKApiCodes.PARAM_EXECUTE_ERRORS);
        int length = jSONArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i10 = i + 1;
                hashSet.add(Integer.valueOf(jSONArray.getJSONObject(i).getInt(VKApiCodes.PARAM_ERROR_CODE)));
                if (i10 >= length) {
                    break;
                }
                i = i10;
            }
        }
        return hashSet;
    }

    public static /* synthetic */ VKApiException parseSimpleError$default(VKErrorUtils vKErrorUtils, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return vKErrorUtils.parseSimpleError(str, str2, str3);
    }

    public final boolean hasExecuteError(String response, int[] iArr) throws JSONException {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!JsonUtils.INSTANCE.containsElement(response, VKApiCodes.PARAM_EXECUTE_ERRORS)) {
            return false;
        }
        if (iArr == null) {
            return true;
        }
        Set<Integer> setExecuteErrorsSet = executeErrorsSet(response);
        for (int i : iArr) {
            setExecuteErrorsSet.remove(Integer.valueOf(i));
        }
        return !setExecuteErrorsSet.isEmpty();
    }

    public final boolean hasSimpleError(String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return JsonUtils.INSTANCE.containsElement(response, "error");
    }

    public final VKApiException parseExecuteError(String response, String method, int[] iArr) throws JSONException {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(method, "method");
        JSONArray jSONArray = new JSONObject(response).getJSONArray(VKApiCodes.PARAM_EXECUTE_ERRORS);
        Intrinsics.checkNotNullExpressionValue(jSONArray, "JSONObject(response).get…des.PARAM_EXECUTE_ERRORS)");
        return parseExecuteError(jSONArray, method, iArr);
    }

    public final VKApiException parseSimpleError(String errorStr, String str, String str2) {
        Intrinsics.checkNotNullParameter(errorStr, "errorStr");
        JSONObject jSONObjectOptJSONObject = new JSONObject(errorStr).optJSONObject("error");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject(errorStr);
        }
        return parseSimpleError(jSONObjectOptJSONObject, str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0083, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081 A[LOOP:0: B:6:0x000f->B:47:0x0081, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.vk.api.sdk.exceptions.VKApiException parseExecuteError(org.json.JSONArray r14, java.lang.String r15, int[] r16) {
        /*
            r13 = this;
            r0 = r16
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: org.json.JSONException -> L78
            r6.<init>()     // Catch: org.json.JSONException -> L78
            int r1 = r14.length()     // Catch: org.json.JSONException -> L78
            if (r1 <= 0) goto L84
            r2 = 0
            r3 = r2
        Lf:
            int r4 = r3 + 1
            org.json.JSONObject r8 = r14.getJSONObject(r3)     // Catch: org.json.JSONException -> L78
            java.lang.String r3 = "errorsJson.getJSONObject(i)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r3)     // Catch: org.json.JSONException -> L78
            r11 = 6
            r12 = 0
            r9 = 0
            r10 = 0
            r7 = r13
            com.vk.api.sdk.exceptions.VKApiException r3 = parseSimpleError$default(r7, r8, r9, r10, r11, r12)     // Catch: org.json.JSONException -> L78
            boolean r5 = r3 instanceof com.vk.api.sdk.exceptions.VKApiExecutionException     // Catch: org.json.JSONException -> L78
            if (r5 != 0) goto L28
            return r3
        L28:
            r5 = r3
            com.vk.api.sdk.exceptions.VKApiExecutionException r5 = (com.vk.api.sdk.exceptions.VKApiExecutionException) r5     // Catch: org.json.JSONException -> L78
            int r5 = r5.getCode()     // Catch: org.json.JSONException -> L78
            r7 = 1
            if (r5 == r7) goto L83
            r8 = 14
            if (r5 == r8) goto L83
            r8 = 17
            if (r5 == r8) goto L83
            r8 = 4
            if (r5 == r8) goto L83
            r8 = 5
            if (r5 == r8) goto L83
            r8 = 6
            if (r5 == r8) goto L83
            r8 = 9
            if (r5 == r8) goto L83
            r8 = 10
            if (r5 == r8) goto L83
            r8 = 24
            if (r5 == r8) goto L83
            r8 = 25
            if (r5 == r8) goto L83
            if (r0 == 0) goto L7b
            r5 = r3
            com.vk.api.sdk.exceptions.VKApiExecutionException r5 = (com.vk.api.sdk.exceptions.VKApiExecutionException) r5     // Catch: org.json.JSONException -> L78
            int r5 = r5.getCode()     // Catch: org.json.JSONException -> L78
            java.lang.String r8 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r8)     // Catch: org.json.JSONException -> L78
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r8)     // Catch: org.json.JSONException -> L78
            int r8 = r0.length     // Catch: org.json.JSONException -> L78
            r9 = r2
        L66:
            if (r9 >= r8) goto L70
            r10 = r0[r9]     // Catch: org.json.JSONException -> L78
            if (r5 != r10) goto L6d
            goto L71
        L6d:
            int r9 = r9 + 1
            goto L66
        L70:
            r9 = -1
        L71:
            if (r9 < 0) goto L74
            goto L75
        L74:
            r7 = r2
        L75:
            if (r7 != 0) goto L7e
            goto L7b
        L78:
            r0 = move-exception
            r14 = r0
            goto L97
        L7b:
            r6.add(r3)     // Catch: org.json.JSONException -> L78
        L7e:
            if (r4 < r1) goto L81
            goto L84
        L81:
            r3 = r4
            goto Lf
        L83:
            return r3
        L84:
            com.vk.api.sdk.exceptions.VKApiExecutionException r0 = new com.vk.api.sdk.exceptions.VKApiExecutionException     // Catch: org.json.JSONException -> L78
            java.lang.String r4 = ""
            r10 = 448(0x1c0, float:6.28E-43)
            r11 = 0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: org.json.JSONException -> L78
            return r0
        L97:
            com.vk.api.sdk.exceptions.VKApiIllegalResponseException r15 = new com.vk.api.sdk.exceptions.VKApiIllegalResponseException
            r15.<init>(r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.api.sdk.internal.VKErrorUtils.parseExecuteError(org.json.JSONArray, java.lang.String, int[]):com.vk.api.sdk.exceptions.VKApiException");
    }

    public static /* synthetic */ VKApiException parseSimpleError$default(VKErrorUtils vKErrorUtils, JSONObject jSONObject, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return vKErrorUtils.parseSimpleError(jSONObject, str, str2);
    }

    public final VKApiException parseSimpleError(JSONObject errorJson, String str, String str2) {
        Intrinsics.checkNotNullParameter(errorJson, "errorJson");
        try {
            int iOptInt = errorJson.optInt(VKApiCodes.PARAM_ERROR_CODE);
            Bundle bundle = null;
            if (iOptInt == 5) {
                JSONObject jSONObjectOptJSONObject = errorJson.optJSONObject(VKApiCodes.PARAM_BAN_INFO);
                if (jSONObjectOptJSONObject != null) {
                    bundle = new Bundle();
                    bundle.putString(VKApiCodes.EXTRA_USER_BAN_INFO, jSONObjectOptJSONObject.toString());
                }
            } else if (iOptInt == 14) {
                bundle = new Bundle();
                bundle.putString(VKApiCodes.EXTRA_CAPTCHA_SID, errorJson.getString(VKApiCodes.EXTRA_CAPTCHA_SID));
                bundle.putString(VKApiCodes.EXTRA_CAPTCHA_IMG, errorJson.getString(VKApiCodes.EXTRA_CAPTCHA_IMG));
            } else if (iOptInt == 17) {
                bundle = new Bundle();
                bundle.putString(VKApiCodes.EXTRA_VALIDATION_URL, errorJson.getString(VKApiCodes.PARAM_REDIRECT_URI));
            } else if (iOptInt == 24) {
                bundle = new Bundle();
                bundle.putString("confirmation_text", errorJson.getString("confirmation_text"));
            } else if (iOptInt == 3609) {
                Bundle bundle2 = new Bundle();
                bundle2.putString(VKApiCodes.EXTRA_EXTENSION_HASH, errorJson.optString(VKApiCodes.EXTRA_EXTENSION_HASH, null));
                bundle = bundle2;
            }
            if (str2 != null) {
                if (bundle == null) {
                    bundle = new Bundle(1);
                }
                bundle.putString(VKApiCodes.EXTRA_ACCESS_TOKEN, str2);
            }
            return VKApiExecutionException.Companion.parse(errorJson, str, bundle);
        } catch (Exception e3) {
            String string = errorJson.toString();
            Intrinsics.checkNotNullExpressionValue(string, "errorJson.toString()");
            return new VKApiIllegalResponseException(string, e3);
        }
    }
}
