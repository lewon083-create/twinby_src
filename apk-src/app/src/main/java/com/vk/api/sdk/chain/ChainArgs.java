package com.vk.api.sdk.chain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

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
public final class ChainArgs {
    private boolean userConfirmed;
    private String captchaSid = "";
    private String captchaKey = "";

    public final String getCaptchaKey() {
        return this.captchaKey;
    }

    public final String getCaptchaSid() {
        return this.captchaSid;
    }

    public final boolean getUserConfirmed() {
        return this.userConfirmed;
    }

    public final boolean hasCaptcha() {
        return this.captchaSid.length() > 0 && this.captchaKey.length() > 0;
    }

    public final void setCaptchaKey(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.captchaKey = str;
    }

    public final void setCaptchaSid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.captchaSid = str;
    }

    public final void setUserConfirmed(boolean z5) {
        this.userConfirmed = z5;
    }
}
