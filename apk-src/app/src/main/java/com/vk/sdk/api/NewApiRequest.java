package com.vk.sdk.api;

import com.google.android.gms.internal.measurement.h5;
import com.vk.api.sdk.VKApiConfig;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.api.sdk.requests.VKRequest;
import com.vk.dto.common.id.UserId;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.protocol.Response;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import me.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class NewApiRequest<T> extends VKRequest<T> implements ApiResponseParser<T> {
    private final /* synthetic */ ApiResponseParser<T> $$delegate_0;

    /* JADX INFO: renamed from: com.vk.sdk.api.NewApiRequest$addParam$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass1 extends r implements Function1<UserId, CharSequence> {
        final /* synthetic */ long $max;
        final /* synthetic */ long $min;
        final /* synthetic */ String $name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j10, long j11, String str) {
            super(1);
            this.$min = j10;
            this.$max = j11;
            this.$name = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final CharSequence invoke(@NotNull UserId it) {
            Intrinsics.checkNotNullParameter(it, "it");
            long value = it.getValue();
            if (this.$min <= value && value <= this.$max) {
                return String.valueOf(it.getValue());
            }
            throw new IllegalArgumentException("Param " + this.$name + " not in " + this.$min + ".." + this.$max);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewApiRequest(@NotNull String methodName, @NotNull ApiResponseParser<T> parser) {
        super(methodName, VKApiConfig.DEFAULT_API_VERSION);
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.$$delegate_0 = parser;
    }

    public static /* synthetic */ void addParam$default(NewApiRequest newApiRequest, String str, String str2, int i, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        newApiRequest.addParam(str, str2, i, i10);
    }

    public final void addParam(@NotNull String name, @Nullable String str, int i, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (str != null) {
            int length = str.length();
            if (i <= length && length <= i10) {
                getParams().put(name, str);
                return;
            }
            throw new IllegalArgumentException("Param " + name + " not in " + i + ".." + i10);
        }
    }

    @Override // com.vk.api.sdk.requests.VKRequest, com.vk.api.sdk.VKApiResponseParser
    public T parse(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        p responseJson = (p) h5.x(response).a().f28895b.get(Response.TYPE);
        Intrinsics.checkNotNullExpressionValue(responseJson, "responseJson");
        return parseResponse(responseJson);
    }

    @Override // com.vk.sdk.api.ApiResponseParser
    public T parseResponse(@NotNull p json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return this.$$delegate_0.parseResponse(json);
    }

    public static /* synthetic */ void addParam$default(NewApiRequest newApiRequest, String str, int i, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        }
        if ((i12 & 8) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        newApiRequest.addParam(str, i, i10, i11);
    }

    public static /* synthetic */ void addParam$default(NewApiRequest newApiRequest, String str, long j10, long j11, long j12, int i, Object obj) {
        if ((i & 4) != 0) {
            j11 = Long.MIN_VALUE;
        }
        newApiRequest.addParam(str, j10, j11, (i & 8) != 0 ? Long.MAX_VALUE : j12);
    }

    public static /* synthetic */ void addParam$default(NewApiRequest newApiRequest, String str, float f10, double d10, double d11, int i, Object obj) {
        if ((i & 4) != 0) {
            d10 = Double.MIN_VALUE;
        }
        double d12 = d10;
        if ((i & 8) != 0) {
            d11 = Double.MAX_VALUE;
        }
        newApiRequest.addParam(str, f10, d12, d11);
    }

    public final void addParam(@NotNull String name, int i, int i10, int i11) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (i10 <= i && i <= i11) {
            getParams().put(name, String.valueOf(i));
            return;
        }
        throw new IllegalArgumentException("Param " + name + " not in " + i10 + ".." + i11);
    }

    public static /* synthetic */ void addParam$default(NewApiRequest newApiRequest, String str, UserId userId, long j10, long j11, int i, Object obj) {
        if ((i & 4) != 0) {
            j10 = Long.MIN_VALUE;
        }
        long j12 = j10;
        if ((i & 8) != 0) {
            j11 = Long.MAX_VALUE;
        }
        newApiRequest.addParam(str, userId, j12, j11);
    }

    public static /* synthetic */ void addParam$default(NewApiRequest newApiRequest, String str, List list, long j10, long j11, int i, Object obj) {
        if ((i & 4) != 0) {
            j10 = Long.MIN_VALUE;
        }
        long j12 = j10;
        if ((i & 8) != 0) {
            j11 = Long.MAX_VALUE;
        }
        newApiRequest.addParam(str, (List<UserId>) list, j12, j11);
    }

    public final void addParam(@NotNull String name, long j10, long j11, long j12) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (j11 <= j10 && j10 <= j12) {
            getParams().put(name, String.valueOf(j10));
            return;
        }
        throw new IllegalArgumentException("Param " + name + " not in " + j11 + ".." + j12);
    }

    public final void addParam(@NotNull String name, float f10, double d10, double d11) {
        Intrinsics.checkNotNullParameter(name, "name");
        double d12 = f10;
        if (d10 <= d12 && d12 <= d11) {
            getParams().put(name, String.valueOf(f10));
            return;
        }
        throw new IllegalArgumentException("Param " + name + " not in " + d10 + ".." + d11);
    }

    public final void addParam(@NotNull String name, @Nullable UserId userId, long j10, long j11) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (userId != null) {
            long value = userId.getValue();
            if (j10 <= value && value <= j11) {
                getParams().put(name, String.valueOf(userId.getValue()));
                return;
            }
            throw new IllegalArgumentException("Param " + name + " not in " + j10 + ".." + j11);
        }
    }

    public final void addParam(@NotNull String name, @NotNull List<UserId> values, long j10, long j11) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        addParam(name, CollectionsKt.I(values, StringUtils.COMMA, null, null, new AnonymousClass1(j10, j11, name), 30));
    }
}
