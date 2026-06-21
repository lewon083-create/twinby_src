package com.vk.api.sdk.okhttp;

import com.vk.api.sdk.utils.UserAgentProvider;
import el.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import zk.d0;
import zk.n;
import zk.o;
import zk.w;

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
public final class UserAgentInterceptor implements o {
    private final UserAgentProvider userAgent;

    public UserAgentInterceptor(UserAgentProvider userAgent) {
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        this.userAgent = userAgent;
    }

    @Override // zk.o
    public d0 intercept(n chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        f fVar = (f) chain;
        w wVarB = fVar.f16440e.b();
        wVarB.b("User-Agent", this.userAgent.getUserAgent());
        return fVar.b(wVarB.a());
    }
}
