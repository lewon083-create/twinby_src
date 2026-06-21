package com.vk.api.sdk.exceptions;

import a0.u;
import android.os.Bundle;
import ck.o;
import io.sentry.protocol.Request;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.i0;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public class VKApiExecutionException extends VKApiException {
    public static final Companion Companion = new Companion(null);
    public static final long serialVersionUID = 7524047853274172872L;
    private final String apiMethod;
    private final int code;
    private final String detailMessage;
    private final String errorMsg;
    private final List<VKApiExecutionException> executeErrors;
    private final Bundle extra;
    private final boolean hasLocalizedMessage;
    private final Map<String, String> requestParams;
    private final int subcode;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ VKApiExecutionException parse$default(Companion companion, JSONObject jSONObject, String str, Bundle bundle, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                bundle = null;
            }
            return companion.parse(jSONObject, str, bundle);
        }

        public final VKApiExecutionException parse(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return parse$default(this, json, null, null, 6, null);
        }

        private Companion() {
        }

        public final VKApiExecutionException parse(JSONObject json, String str) {
            Intrinsics.checkNotNullParameter(json, "json");
            return parse$default(this, json, str, null, 4, null);
        }

        public final VKApiExecutionException parse(JSONObject json, String str, Bundle bundle) throws JSONException {
            JSONArray jSONArray;
            Intrinsics.checkNotNullParameter(json, "json");
            String strOptString = str == null ? json.optString(Request.JsonKeys.METHOD) : str;
            String str2 = strOptString == null ? "" : strOptString;
            int iOptInt = json.optInt(VKApiCodes.PARAM_ERROR_CODE, 1);
            int iOptInt2 = json.optInt("error_subcode", 1);
            String strOptString2 = json.optString("error_msg");
            String str3 = strOptString2 == null ? "" : strOptString2;
            try {
                jSONArray = json.getJSONArray("request_params");
            } catch (JSONException unused) {
                jSONArray = new JSONArray();
            }
            IntRange intRangeE = o.e(0, jSONArray.length());
            int iB = i0.b(t.j(intRangeE, 10));
            if (iB < 16) {
                iB = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
            Iterator it = intRangeE.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = jSONArray.getJSONObject(((e0) it).nextInt());
                linkedHashMap.put(jSONObject.getString("key"), jSONObject.getString("value"));
            }
            if (json.has("error_text")) {
                String strOptString3 = json.optString("error_text");
                return new VKApiExecutionException(iOptInt, str2, true, strOptString3 == null ? "" : strOptString3, bundle, null, str3, linkedHashMap, iOptInt2, 32, null);
            }
            String strOptString4 = json.optString("error_msg");
            if (strOptString4 == null) {
                strOptString4 = json.toString();
                Intrinsics.checkNotNullExpressionValue(strOptString4, "json.toString()");
            }
            String str4 = strOptString4;
            return new VKApiExecutionException(iOptInt, str2, false, str4 + " | by [" + str2 + ']', bundle, null, str4, linkedHashMap, iOptInt2, 32, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VKApiExecutionException(int i, String apiMethod, boolean z5, String detailMessage) {
        this(i, apiMethod, z5, detailMessage, null, null, null, null, 0, 496, null);
        Intrinsics.checkNotNullParameter(apiMethod, "apiMethod");
        Intrinsics.checkNotNullParameter(detailMessage, "detailMessage");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VKApiExecutionException)) {
            return false;
        }
        VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) obj;
        if (this.code != vKApiExecutionException.code) {
            return false;
        }
        Bundle bundle = this.extra;
        Bundle bundle2 = vKApiExecutionException.extra;
        return bundle == null ? bundle2 == null : Intrinsics.a(bundle, bundle2);
    }

    public final String getAccessToken() {
        Bundle bundle = this.extra;
        if (bundle == null) {
            return null;
        }
        return bundle.getString(VKApiCodes.EXTRA_ACCESS_TOKEN, null);
    }

    public final String getApiMethod() {
        return this.apiMethod;
    }

    public final String getCaptchaImg() {
        String string;
        Bundle bundle = this.extra;
        return (bundle == null || (string = bundle.getString(VKApiCodes.EXTRA_CAPTCHA_IMG, "")) == null) ? "" : string;
    }

    public final String getCaptchaSid() {
        String string;
        Bundle bundle = this.extra;
        return (bundle == null || (string = bundle.getString(VKApiCodes.EXTRA_CAPTCHA_SID, "")) == null) ? "" : string;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDetailMessage() {
        return this.detailMessage;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final List<VKApiExecutionException> getExecuteErrors() {
        return this.executeErrors;
    }

    public final String getExtensionHash() {
        String string;
        Bundle bundle = this.extra;
        return (bundle == null || (string = bundle.getString(VKApiCodes.EXTRA_EXTENSION_HASH, null)) == null) ? "" : string;
    }

    public final Bundle getExtra() {
        return this.extra;
    }

    public final boolean getHasLocalizedMessage() {
        return this.hasLocalizedMessage;
    }

    public final Map<String, String> getRequestParams() {
        return this.requestParams;
    }

    public final int getSubcode() {
        return this.subcode;
    }

    public final JSONObject getUserBanInfo() {
        String string;
        Bundle bundle = this.extra;
        if (bundle == null || (string = bundle.getString(VKApiCodes.EXTRA_USER_BAN_INFO)) == null) {
            return null;
        }
        return new JSONObject(string);
    }

    public final String getUserConfirmText() {
        String string;
        Bundle bundle = this.extra;
        return (bundle == null || (string = bundle.getString("confirmation_text", "")) == null) ? "" : string;
    }

    public final String getValidationUrl() {
        String string;
        Bundle bundle = this.extra;
        return (bundle == null || (string = bundle.getString(VKApiCodes.EXTRA_VALIDATION_URL, "")) == null) ? "" : string;
    }

    public final boolean hasError(int i) {
        if (this.code == i) {
            return true;
        }
        List<VKApiExecutionException> list = this.executeErrors;
        Object obj = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((VKApiExecutionException) next).getCode() == i) {
                    obj = next;
                    break;
                }
            }
            obj = (VKApiExecutionException) obj;
        }
        return obj != null;
    }

    public final boolean hasExtra() {
        Bundle bundle = this.extra;
        return (bundle == null || Intrinsics.a(bundle, Bundle.EMPTY)) ? false : true;
    }

    public int hashCode() {
        int i = this.code * 31;
        Bundle bundle = this.extra;
        return i + (bundle == null ? 0 : bundle.hashCode());
    }

    public final boolean isAccessError() {
        int i = this.code;
        return i == 15 || i == 30 || i == 203 || i == 200 || i == 201;
    }

    public final boolean isAnonymTokenExpired() {
        return this.code == 1114;
    }

    public final boolean isAnonymTokenInvalid() {
        return this.code == 1116;
    }

    public final boolean isAppUpdateNeeded() {
        return this.code == 35;
    }

    public final boolean isCaptchaError() {
        return this.code == 14;
    }

    public final boolean isCompositeError() {
        return this.code == Integer.MIN_VALUE;
    }

    public final boolean isCurrentVersionDeprecated() {
        return this.code == 34;
    }

    public final boolean isInternalServerError() {
        int i = this.code;
        return i == 1 || i == 10 || i == 13;
    }

    public final boolean isInvalidCredentialsError() {
        int i = this.code;
        return i == 4 || i == 5 || i == 3610;
    }

    public final boolean isPasswordConfirmRequired() {
        return this.code == 3609;
    }

    public final boolean isRateLimitReachedError() {
        return this.code == 29;
    }

    public final boolean isTokenConfirmationRequired() {
        return this.code == 25;
    }

    public final boolean isTooManyRequestsError() {
        return this.code == 6;
    }

    public final boolean isUserConfirmRequired() {
        return this.code == 24;
    }

    public final boolean isValidationRequired() {
        return this.code == 17;
    }

    @Override // java.lang.Throwable
    public String toString() {
        Bundle bundle;
        Bundle bundle2 = this.extra;
        if (bundle2 != null && bundle2.containsKey(VKApiCodes.EXTRA_ACCESS_TOKEN)) {
            bundle = new Bundle(this.extra);
            bundle.putString(VKApiCodes.EXTRA_ACCESS_TOKEN, "hidden");
        } else {
            bundle = this.extra;
        }
        StringBuilder sb2 = new StringBuilder("VKApiExecutionException{code=");
        sb2.append(this.code);
        sb2.append(", extra=");
        sb2.append(bundle);
        sb2.append(", method=");
        sb2.append(this.apiMethod);
        sb2.append(", executeErrors=");
        List<VKApiExecutionException> list = this.executeErrors;
        sb2.append((Object) (list == null ? null : CollectionsKt.I(list, null, "[", "]", null, 57)));
        sb2.append(", super=");
        return u.n(sb2, super.toString(), '}');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VKApiExecutionException(int i, String apiMethod, boolean z5, String detailMessage, Bundle bundle) {
        this(i, apiMethod, z5, detailMessage, bundle, null, null, null, 0, 480, null);
        Intrinsics.checkNotNullParameter(apiMethod, "apiMethod");
        Intrinsics.checkNotNullParameter(detailMessage, "detailMessage");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VKApiExecutionException(int i, String apiMethod, boolean z5, String detailMessage, Bundle bundle, List<? extends VKApiExecutionException> list) {
        this(i, apiMethod, z5, detailMessage, bundle, list, null, null, 0, 448, null);
        Intrinsics.checkNotNullParameter(apiMethod, "apiMethod");
        Intrinsics.checkNotNullParameter(detailMessage, "detailMessage");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VKApiExecutionException(int i, String apiMethod, boolean z5, String detailMessage, Bundle bundle, List<? extends VKApiExecutionException> list, String str) {
        this(i, apiMethod, z5, detailMessage, bundle, list, str, null, 0, 384, null);
        Intrinsics.checkNotNullParameter(apiMethod, "apiMethod");
        Intrinsics.checkNotNullParameter(detailMessage, "detailMessage");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VKApiExecutionException(int i, String apiMethod, boolean z5, String detailMessage, Bundle bundle, List<? extends VKApiExecutionException> list, String str, Map<String, String> map) {
        this(i, apiMethod, z5, detailMessage, bundle, list, str, map, 0, 256, null);
        Intrinsics.checkNotNullParameter(apiMethod, "apiMethod");
        Intrinsics.checkNotNullParameter(detailMessage, "detailMessage");
    }

    public /* synthetic */ VKApiExecutionException(int i, String str, boolean z5, String str2, Bundle bundle, List list, String str3, Map map, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, z5, str2, (i11 & 16) != 0 ? Bundle.EMPTY : bundle, (i11 & 32) != 0 ? null : list, (i11 & 64) != 0 ? null : str3, (i11 & 128) != 0 ? null : map, (i11 & 256) != 0 ? -1 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VKApiExecutionException(int i, String apiMethod, boolean z5, String detailMessage, Bundle bundle, List<? extends VKApiExecutionException> list, String str, Map<String, String> map, int i10) {
        super(detailMessage);
        Intrinsics.checkNotNullParameter(apiMethod, "apiMethod");
        Intrinsics.checkNotNullParameter(detailMessage, "detailMessage");
        this.code = i;
        this.apiMethod = apiMethod;
        this.hasLocalizedMessage = z5;
        this.detailMessage = detailMessage;
        this.extra = bundle;
        this.executeErrors = list;
        this.errorMsg = str;
        this.requestParams = map;
        this.subcode = i10;
    }
}
