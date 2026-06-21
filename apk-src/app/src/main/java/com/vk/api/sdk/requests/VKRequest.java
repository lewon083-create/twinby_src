package com.vk.api.sdk.requests;

import com.vk.api.sdk.VKApiConfig;
import com.vk.api.sdk.VKApiManager;
import com.vk.api.sdk.VKApiResponseParser;
import com.vk.api.sdk.VKMethodCall;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.sdk.internal.ApiCommand;
import com.vk.dto.common.id.UserId;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
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
public class VKRequest<T> extends ApiCommand<T> implements VKApiResponseParser<T> {
    public static final Companion Companion = new Companion(null);
    public static final int ERROR_MALFORMED_RESPONSE = -2;
    private volatile boolean allowNoAuth;
    private volatile boolean isAnonymous;
    private String method;
    private final LinkedHashMap<String, String> params;
    private final String requestApiVersion;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.vk.api.sdk.requests.VKRequest$addParam$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass7 extends r implements Function1<UserId, CharSequence> {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        public AnonymousClass7() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(UserId it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return String.valueOf(it.getValue());
        }
    }

    public VKRequest(String method, String str) {
        Intrinsics.checkNotNullParameter(method, "method");
        this.method = method;
        this.requestApiVersion = str;
        this.params = new LinkedHashMap<>();
    }

    public final VKRequest<T> addParam(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (str != null) {
            getParams().put(name, str);
        }
        return this;
    }

    public VKRequest<T> allowNoAuth() {
        setAllowNoAuth(true);
        return this;
    }

    public VKMethodCall.Builder createBaseCallBuilder(VKApiConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return new VKMethodCall.Builder();
    }

    public final boolean getAllowNoAuth() {
        return this.allowNoAuth;
    }

    public final String getMethod() {
        return this.method;
    }

    public final LinkedHashMap<String, String> getParams() {
        return this.params;
    }

    public final String getRequestApiVersion() {
        return this.requestApiVersion;
    }

    public final boolean isAnonymous() {
        return this.isAnonymous;
    }

    @Override // com.vk.api.sdk.internal.ApiCommand
    public T onExecute(VKApiManager manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        VKApiConfig config = manager.getConfig();
        String version = this.requestApiVersion;
        if (version == null) {
            version = config.getVersion();
        }
        this.params.put(VKApiCodes.PARAM_LANG, config.getLang());
        this.params.put(VKApiCodes.PARAM_DEVICE_ID, (String) config.getDeviceId().getValue());
        String str = (String) config.getExternalDeviceId().getValue();
        if (str != null) {
            getParams().put("external_device_id", str);
        }
        this.params.put("v", version);
        return (T) manager.execute(createBaseCallBuilder(config).args(this.params).method(this.method).version(version).setAnonymous(this.isAnonymous).allowNoAuth(this.allowNoAuth).build(), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T parse(JSONObject r8) {
        Intrinsics.checkNotNullParameter(r8, "r");
        return r8;
    }

    public final void setAllowNoAuth(boolean z5) {
        this.allowNoAuth = z5;
    }

    public VKRequest<T> setAnonymous(boolean z5) {
        this.isAnonymous = z5;
        return this;
    }

    public final void setMethod(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.method = str;
    }

    public final VKRequest<T> addParam(String name, boolean z5) {
        Intrinsics.checkNotNullParameter(name, "name");
        getParams().put(name, z5 ? "1" : CommonUrlParts.Values.FALSE_INTEGER);
        return this;
    }

    @Override // com.vk.api.sdk.VKApiResponseParser
    public T parse(String response) throws VKApiExecutionException {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            return parse(new JSONObject(response));
        } catch (Throwable th2) {
            throw new VKApiExecutionException(-2, this.method, true, "[" + this.method + "] " + ((Object) th2.getLocalizedMessage()), null, null, null, null, 0, 496, null);
        }
    }

    public /* synthetic */ VKRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    public final VKRequest<T> addParam(String name, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (i != 0) {
            LinkedHashMap<String, String> params = getParams();
            String string = Integer.toString(i);
            Intrinsics.checkNotNullExpressionValue(string, "toString(value)");
            params.put(name, string);
        }
        return this;
    }

    public final VKRequest<T> addParam(String name, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (j10 != 0) {
            LinkedHashMap<String, String> params = getParams();
            String string = Long.toString(j10);
            Intrinsics.checkNotNullExpressionValue(string, "toString(value)");
            params.put(name, string);
        }
        return this;
    }

    public final VKRequest<T> addParam(String name, float f10) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (f10 == 0.0f) {
            return this;
        }
        LinkedHashMap<String, String> params = getParams();
        String string = Float.toString(f10);
        Intrinsics.checkNotNullExpressionValue(string, "toString(value)");
        params.put(name, string);
        return this;
    }

    public final VKRequest<T> addParam(CharSequence name, Object[] values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        return addParam(name.toString(), p.r(values, StringUtils.COMMA, null, 62));
    }

    public final VKRequest<T> addParam(CharSequence name, Iterable<?> values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        return addParam(name.toString(), CollectionsKt.I(values, StringUtils.COMMA, null, null, null, 62));
    }

    public final VKRequest<T> addParam(CharSequence name, int[] values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        String string = name.toString();
        Intrinsics.checkNotNullParameter(values, "<this>");
        Intrinsics.checkNotNullParameter(StringUtils.COMMA, "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder buffer = new StringBuilder();
        Intrinsics.checkNotNullParameter(values, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(StringUtils.COMMA, "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append((CharSequence) "");
        int i = 0;
        for (int i10 : values) {
            i++;
            if (i > 1) {
                buffer.append((CharSequence) StringUtils.COMMA);
            }
            buffer.append((CharSequence) String.valueOf(i10));
        }
        buffer.append((CharSequence) "");
        return addParam(string, buffer.toString());
    }

    public final VKRequest<T> addParam(String name, UserId userId) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (userId != null) {
            getParams().put(name, String.valueOf(userId.getValue()));
        }
        return this;
    }

    public final VKRequest<T> addParam(CharSequence name, List<UserId> values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        return addParam(name.toString(), CollectionsKt.I(values, StringUtils.COMMA, null, null, AnonymousClass7.INSTANCE, 30));
    }
}
